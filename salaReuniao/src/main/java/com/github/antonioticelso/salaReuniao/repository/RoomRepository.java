package com.github.antonioticelso.salaReuniao.repository;

import com.github.antonioticelso.salaReuniao.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, String> {
}
