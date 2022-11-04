package com.github.antonioticelso.salaReuniao.controller;

import com.github.antonioticelso.salaReuniao.exception.ResourceNotFoundException;
import com.github.antonioticelso.salaReuniao.model.Room;
import com.github.antonioticelso.salaReuniao.repository.RoomRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class RoomController {

    private RoomRepository repository;

    public RoomController(RoomRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/rooms")
    public List<Room> getAllRooms() {
        return repository.findAll();
    }

    @GetMapping("/rooms/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable(value = "id") long roomId) throws ResourceNotFoundException {
        Room room = repository.findById(roomId).orElseThrow(() -> new ResourceNotFoundException("Room not found: " + roomId));
        return ResponseEntity.ok().body(room);
    }

    @PostMapping("/rooms")
    public Room createRoom(@Valid @RequestBody Room room) {
        return repository.save(room);

    }

    @PutMapping("/rooms/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable(value = "id") Long roomId, @Valid @RequestBody Room roomDetails) throws ResourceNotFoundException {
        Room room = repository.findById(roomId).orElseThrow(() -> new ResourceNotFoundException("Room not found for this id: " + roomId));
        room.setName(roomDetails.getName());
        room.setDate(roomDetails.getDate());
        room.setStartHour(roomDetails.getStartHour());
        room.setEndHour(roomDetails.getEndHour());
        final Room updateRoom = repository.save(room);
        return ResponseEntity.ok(updateRoom);

    }

    @DeleteMapping("/rooms/{id}")
    public Map<String, Boolean> deleteRoom(@PathVariable(value = "id") long roomId) throws ResourceNotFoundException {
        Room room = repository.findById(roomId).orElseThrow(() -> new ResourceNotFoundException("Room not found for this id: " + roomId));
        repository.delete(room);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;

    }

}
