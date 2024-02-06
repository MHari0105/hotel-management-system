package com.myproject.hotelmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myproject.hotelmanagementsystem.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    List<Room> findByIsOccupiedFalse();

    List<Room> findByRoomTypeAndIsOccupiedFalse(String roomType);
}
