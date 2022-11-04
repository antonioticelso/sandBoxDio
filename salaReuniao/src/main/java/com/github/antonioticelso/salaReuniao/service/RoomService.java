package com.github.antonioticelso.salaReuniao.service;

import com.github.antonioticelso.salaReuniao.exception.ResourceNotFoundException;
import com.github.antonioticelso.salaReuniao.model.Room;
import com.github.antonioticelso.salaReuniao.repository.RoomRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
public class RoomService {

    private final RoomRepository repository;

    public RoomService(RoomRepository repository) {
        this.repository = repository;
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<Room> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public Room findById(String roomId) throws ResourceNotFoundException {
        Room room = repository.findById(roomId).orElseThrow(() -> new ResourceNotFoundException("Room not found: " + roomId));
        return room;
    }

    public Room createRoom(Room room) {
        String id = getUUID();
        room.setId(id);
        repository.save(room);
        return room;
    }

    private static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
