import {Component, OnInit} from '@angular/core';
import {AuthentificationService} from './service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
})
export class AppComponent implements OnInit{
  title = 'partieweb';

  constructor(private authservice:AuthentificationService){

  }


  ngOnInit(): void {

   // return this.authservice.loadToken();

  }

}
