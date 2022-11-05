package com.github.antonioticelso.salaReuniao.controller;

import com.github.antonioticelso.salaReuniao.exception.ResourceNotFoundException;
import com.github.antonioticelso.salaReuniao.model.Room;
import com.github.antonioticelso.salaReuniao.service.RoomService;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
@Api(tags = "Room Controller")
public class RoomController {

    private final RoomService service;

    public RoomController(RoomService service) {
        this.service = service;
    }

    @GetMapping("/rooms")
    public ResponseEntity<List<Room>> getAllRooms() {
        List<Room> roomList = service.findAll();
        return ResponseEntity.ok(roomList);

    }

    @GetMapping("/rooms/{id}")
    public ResponseEntity<Room> getRoomById(@PathVariable(value = "id") String roomId) throws ResourceNotFoundException {
        Room room = service.findById(roomId);
        return ResponseEntity.ok().body(room);

    }

    @PostMapping("/rooms")
    public ResponseEntity<Room> createRoom(@Valid @RequestBody Room room) {
        Room newRoom = service.createRoom(room);
        return ResponseEntity.status(HttpStatus.CREATED).body(newRoom);

    }

    @PutMapping("/rooms/{id}")
    public ResponseEntity<Room> updateRoom(@PathVariable(value = "id") String roomId, @Valid @RequestBody Room roomDetails) throws ResourceNotFoundException {
        Room room = service.updateRoom(roomId, roomDetails);
        return ResponseEntity.status(HttpStatus.OK).body(room);

    }

    @DeleteMapping("/rooms/{id}")
    public ResponseEntity deleteRoom(@PathVariable(value = "id") String roomId) throws ResourceNotFoundException {
        service.deleteRoom(roomId);
        return ResponseEntity.noContent().build();

    }

}
