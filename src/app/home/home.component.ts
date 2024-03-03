import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import {AuthentificationService} from '../service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
role;
  constructor(private authservice:AuthentificationService,private router:Router) {

  }

  ngOnInit() {
this.role=this.authservice.role;
  }

}
