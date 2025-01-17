package com.role.implementation.repository;

import com.role.implementation.model.ShootingEquipment;
import com.role.implementation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShootingEquipmentRepository extends JpaRepository<ShootingEquipment, Long> {

    /**
     * Find shooting equipment by the associated user.
     *
     * @param user The user associated with the shooting equipment.
     * @return The shooting equipment associated with the user, or null if not found.
     */
    ShootingEquipment findByUser(User user);

    /**
     * Delete shooting equipment by the associated user.
     *
     * @param user The user associated with the shooting equipment.
     */
    void deleteByUser(User user);
}