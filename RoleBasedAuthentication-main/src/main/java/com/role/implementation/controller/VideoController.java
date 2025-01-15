package com.role.implementation.controller;

import com.role.implementation.model.Video;
import com.role.implementation.repository.VideoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class VideoController {

    private final VideoRepository videoRepository;

    public VideoController(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @GetMapping("/video")
    public String video(Model model) {
        model.addAttribute("videoMetadata", new Video());
        return "video"; // Maps to video.html
    }

    @PostMapping("/submit-youtube")
    public String submitYouTubeLink(
            @RequestParam String youtubeLink,
            @RequestParam String title,
            @RequestParam String description,
            Model model) {
        // Process the YouTube link and metadata
        System.out.println("YouTube Link: " + youtubeLink);
        System.out.println("Title: " + title);
        System.out.println("Description: " + description);

        // Save the YouTube metadata to the database
        Video video = new Video();
        video.setTitle(title);
        video.setDescription(description);
        video.setYoutubeLink(youtubeLink);
        videoRepository.save(video);

        // Add the metadata to the model to display on the page
        model.addAttribute("youtubeLink", youtubeLink);
        model.addAttribute("title", title);
        model.addAttribute("description", description);

        return "video"; // Redirect back to the video page
    }

    @PostMapping("/submit-video")
    public String submitVideoFile(
            @RequestParam MultipartFile videoFile,
            @RequestParam String title,
            @RequestParam String description,
            Model model) {
        // Process the video file and metadata
        if (!videoFile.isEmpty()) {
            System.out.println("Video File Name: " + videoFile.getOriginalFilename());
            System.out.println("Title: " + title);
            System.out.println("Description: " + description);

            // Save the video metadata to the database
            Video video = new Video();
            video.setTitle(title);
            video.setDescription(description);
            video.setYoutubeLink("N/A"); // Set a default value or handle accordingly
            videoRepository.save(video);

            // Add the metadata to the model to display on the page
            model.addAttribute("videoFileName", videoFile.getOriginalFilename());
            model.addAttribute("title", title);
            model.addAttribute("description", description);
        } else {
            System.out.println("No video file uploaded.");
        }

        return "video"; // Redirect back to the video page
    }
}