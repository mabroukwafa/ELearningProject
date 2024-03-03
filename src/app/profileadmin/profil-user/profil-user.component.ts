import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';


@Component({
  selector: 'app-profil-user',
  templateUrl: './profil-user.component.html',
  styleUrls: ['./profil-user.component.css']
})
export class ProfilUserComponent implements OnInit {
id;
ispassager=true;
isconducteur=true;
user;
  constructor( private activaterout:ActivatedRoute) {
    this.id=this.activaterout.params['_value']['id'];


  }

  ngOnInit() {
  }
}
