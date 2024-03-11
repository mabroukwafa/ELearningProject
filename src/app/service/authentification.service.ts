import { User } from './../model/user';
import {Injectable} from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {JwtHelperService} from '@auth0/angular-jwt';
import {Observable} from 'rxjs';
import {Admin} from '../model/admin';

@Injectable({
  providedIn: 'root'
})
export class AuthentificationService {


   isAuthenticated: boolean = false;
   role:any;
   user : User ;
   public id:any;
  constructor(private http : HttpClient){}

 login(user:User ): Observable<any>{
  return this.http.post("http://localhost:8080/formations/login", user);

 }

  isObjectInLocalStorage(key) {
  const value = localStorage.getItem(key);
  return value !== null;
}



 isLoggedIn(): boolean {
  if (this.isObjectInLocalStorage("user")) {
    console.log('L\'objet existe dans le localStorage.');
    let userObj = JSON.parse(localStorage.getItem("user"));
    this.id = userObj.user.id;
    this.role = userObj.role;
    console.log( this.role ); 
    console.log( this.id ); 



    this.isAuthenticated=true;
  } else {
    console.log('L\'objet n\'existe pas dans le localStorage.');
  }
  return this.isAuthenticated;
}


}
