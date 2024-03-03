import { Component, OnInit } from '@angular/core';
import {AuthentificationService} from '../../service';
import {ActivatedRoute, Router} from '@angular/router';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  result_user;

  constructor(private authenService:AuthentificationService, private route: ActivatedRoute,
              private router: Router,) { }

  ngOnInit() {
  }
    
  get_user(){
    const storedResponseString = localStorage.getItem('user');
    const storedResponse = JSON.parse(storedResponseString);
    this.result_user = storedResponse;
    console.log(this.result_user);
  }
  deconecter() {
 localStorage.clear();
this.router.navigate(['/login'])



  }


}
