import { Component, OnInit } from '@angular/core';

import {AuthentificationService} from '../../service/authentification.service';

@Component({
  selector: 'app-side-bar',
  templateUrl: './side-bar.component.html',
  styleUrls: ['./side-bar.component.css']
})
export class SideBarComponent implements OnInit {
  result_user;
  role ;
  constructor( private authService:AuthentificationService) { }

  ngOnInit() {
    this.role= JSON.parse(localStorage.getItem("user")).role;
   // this.get_user;
  }
  get_user(){
   
    let userObj = JSON.parse(localStorage.getItem("user"));
    let role = userObj.role;
    console.log(role); 
  }
  isAdmin() {
    //return this.authService.isAdmin();
  }
  isConducteur(){
    //return this.authService.isConducteur();
  }

}
