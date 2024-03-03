import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {first} from 'rxjs/operators';
import {User} from '../model/user';
import {el} from '@angular/platform-browser/testing/src/browser_util';
import Swal from 'sweetalert2';
import { AlertService } from '../service/alert.service';
import { AuthentificationService } from '../service/authentification.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  message: string;
  user = new User;
  loginForm: FormGroup;
  submitted = false;
  erreur: number= 0;
  result_user :any;
  role_user;
  
  constructor(
    private formBuilder: FormBuilder,
    private route: ActivatedRoute,
    private router: Router,
    private authenService: AuthentificationService,
    private alertService: AlertService) {


  }

  /*onLoggedin()
  {  let isValidUser: Boolean

    this.authenService.login(this.user).subscribe(res=>{
      console.log(res);
      if(res != "Échec de la connexion"){
        isValidUser =true
        if (isValidUser)
        this.router.navigate(['/home']);
       else
          //alert('Login ou mot de passe incorrecte!');
       this.erreur=1;
      }
    })

  }*/


   ngOnInit() {
    this.loginForm = this.formBuilder.group({
      username: ['', Validators.required],
      password: ['', Validators.required]
    });
   
  }

  // convenience getter for easy access to form fields
  get f() {
    return this.loginForm.controls;
  }


  onlogin() {

    this.submitted = true;

    const data = {
      username: this.loginForm.value["username"],

      password: this.loginForm.value["password"],
    }
  this.user.username = data.username;
  this.user.password = data.password;
  this.authenService.login(this.user).subscribe(
    res => {
      console.log(res);
      const responseString = JSON.stringify(res);
   
  
    
        this.router.navigate(['/home']);
        localStorage.setItem('user',responseString);
        this.authenService.isLoggedIn();
      
    },
    err => {
      // Gérer les erreurs ici
      console.log("Erreur lors de l'authentification:", err);
      if (err.status === 401) {
        // Gérer spécifiquement l'erreur 401
        Swal.fire(
          'OPPs',
          'Vérifier vos coordonnées :)',
          'error'
        );
      } else {
        // Gérer les autres types d'erreurs
        Swal.fire(
          'Erreur',
          'Une erreur s\'est produite lors de la connexion.',
          'error'
        );
      }
    }
  );
  
  }

  get_user(){
    console.log("lee role est");
  }
}
