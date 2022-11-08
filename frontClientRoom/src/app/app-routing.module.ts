import { NgModule } from '@angular/core';
import { RoomDetailsComponent } from './room-details/room-details.component';
import { Routes, RouterModule } from '@angular/router';
import { RoomListComponent } from './room-list/room-list.component';
import { RoomUpdateComponent } from "./room-update/room-update.component";
import { RoomCreateComponent } from "./room-create/room-create.component";

const routes: Routes = [
  { path: '', redirectTo: 'rooms', pathMatch: 'full' },
  { path: 'rooms', component: RoomListComponent },
  { path: 'add', component: RoomCreateComponent },
  { path: 'update/:id', component: RoomUpdateComponent },
  { path: 'details/:id', component: RoomDetailsComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
