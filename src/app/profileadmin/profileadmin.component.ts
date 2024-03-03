import { Component, OnInit } from '@angular/core';
import {Admin} from '../model/admin';
import {AuthentificationService} from '../service';
import {Router} from '@angular/router';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-profileadmin',
  templateUrl: './profileadmin.component.html',
  styleUrls: ['./profileadmin.component.css']
})
export class ProfileadminComponent implements OnInit {
admin=new Admin();
form:FormGroup;
  constructor(private authenService:AuthentificationService) { }

  ngOnInit() {
    this.form = new FormGroup({
      myRatingControl: new FormControl('')
    });
    this.getprofileadmine();
  }

  getprofileadmine(){
   /* this.authenService.getprofile().subscribe(res=>{
      console.log(res);




     this.admin=res;
    })*/
  }
}
