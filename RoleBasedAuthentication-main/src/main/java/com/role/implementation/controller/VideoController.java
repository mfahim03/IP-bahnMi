package com.role.implementation.controller;

import com.role.implementation.model.Video;
import com.role.implementation.repository.VideoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
public class VideoController {

    private final VideoRepository videoRepository;

    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @GetMapping("/video")
    public String video(Model model) {
        // Fetch all videos from the database
        List<Video> videos = videoRepository.findAll();
        model.addAttribute("videos", videos); // Pass videos to the template
        model.addAttribute("videoMetadata", new Video()); // Keep this line for the form
        return "video"; // Maps to video.html
    }

    @PostMapping("/submit-youtube")
    public String submitYouTubeLink(
            @RequestParam String youtubeLink,
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam int year,
            Model model) {
        Video video = new Video();
        video.setTitle(title);
        video.setDescription(description);
        video.setYoutubeLink(youtubeLink);
        video.setYear(year);
        videoRepository.save(video);

        // Add attributes to the model for display (optional)
        model.addAttribute("youtubeLink", youtubeLink);
        model.addAttribute("title", title);
        model.addAttribute("description", description);
        model.addAttribute("year", year);

        // Redirect to the video page to show the updated list
        return "redirect:/video";
    }

    @PostMapping("/submit-video")
    public String submitVideoFile(
            @RequestParam MultipartFile videoFile,
            @RequestParam String title,
            @RequestParam String description,
            @RequestParam int year,
            Model model) {
        if (!videoFile.isEmpty()) {
            Video video = new Video();
            video.setTitle(title);
            video.setDescription(description);
            video.setYoutubeLink("N/A"); // Set a default value for YouTube link
            video.setFileName(videoFile.getOriginalFilename()); // Save the file name
            video.setYear(year);
            videoRepository.save(video);

            // Add attributes to the model for display (optional)
            model.addAttribute("videoFileName", videoFile.getOriginalFilename());
            model.addAttribute("title", title);
            model.addAttribute("description", description);
            model.addAttribute("year", year);
        } else {
            System.out.println("No video file uploaded.");
        }

        // Redirect to the video page to show the updated list
        return "redirect:/video";
    }

    @PostMapping("/delete-video")
    public String deleteVideo(@RequestParam Long id) {
        videoRepository.deleteById(id); // Delete the video by ID
        return "redirect:/video"; // Redirect to refresh the list
    }

    @GetMapping("/activity")
    public String getVideos(Model model) {
        List<Video> videos = videoRepository.findAll();
        Map<Integer, List<Video>> videosByYear = videos.stream()
                .collect(Collectors.groupingBy(Video::getYear));

        List<Integer> years = videos.stream()
                .map(Video::getYear)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        model.addAttribute("videosByYear", videosByYear);
        model.addAttribute("years", years);

        return "activity";
    }
}