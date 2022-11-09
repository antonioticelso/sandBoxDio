import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import {Room} from "../room";
import {Router} from "@angular/router";
import {RoomServiceService} from "../room-service.service";

@Component({
  selector: 'app-room-list',
  templateUrl: './room-list.component.html',
  styleUrls: ['./room-list.component.css']
})
export class RoomListComponent implements OnInit {

  rooms!: Observable<Room[]>;

  constructor(private roomService: RoomServiceService,
              private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.rooms = this.roomService.getRoomsList();
  }

  deleteRoom(id: string) {
    this.roomService.deleteRoom(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }

  roomDetails(id: string){
    this.router.navigate(['details', id]);
  }

  updateRoom(id: string){
    this.router.navigate(['update', id]);
  }

}
