import { Component, OnInit } from '@angular/core';
import {Room} from "../room";
import {Router} from "@angular/router";
import {RoomServiceService} from "../room-service.service";

@Component({
  selector: 'app-room-create',
  templateUrl: './room-create.component.html',
  styleUrls: ['./room-create.component.css']
})
export class RoomCreateComponent implements OnInit {

  room: Room = new Room();
  submitted = false;

  constructor(private roomService: RoomServiceService,
              private router: Router) { }

  ngOnInit() {
  }

  newRoom(): void {
    this.submitted = false;
    this.room = new Room();
  }

  save() {
    this.roomService.createRoom(this.room)
      .subscribe(data => console.log(data), error => console.log(error));
    this.room = new Room();
    this.gotoList();
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/rooms']);
  }

}
