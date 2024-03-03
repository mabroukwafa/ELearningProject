import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomeComponent} from './home/home.component';

import {FooterComponent} from './home/footer/footer.component';
import {SideBarComponent} from './home/side-bar/side-bar.component';
import {ContainerComponent} from './home/container/container.component';
import {NavbarComponent} from './home/navbar/navbar.component';
import {LoginComponent} from './login/login.component';
import {Erreur404Component} from './erreur404/erreur404.component';
import {FormationComponent} from './formation/formation.component';

import {QuestionComponent} from './reclamation/question.component';

import {ProfileadminComponent} from './profileadmin/profileadmin.component';
import {ProfilUserComponent} from './profileadmin/profil-user/profil-user.component';
import { ValidationDemandeComponent } from './validation-demande/validation-demande.component';
import { DevFormationComponent } from './dev-formation/dev-formation.component';
import { EmployeProgComponent } from './employe-prog/employe-prog.component';
import { AuthGuard } from './auth.guard';



const routes: Routes = [
  {path:'login',component:LoginComponent },
  

  { path: 'home', component: HomeComponent,children:[
    {path:'',component:ContainerComponent},
      {path:'question',component: QuestionComponent},
      {path:'employeProg',component: EmployeProgComponent},
      {path:'formation',component:FormationComponent },
      {path:'devFormations',component:DevFormationComponent },
      {path:'profileadmin',component:ProfileadminComponent},
      {path:'profiluser/:id',component:ProfilUserComponent},
      
      {path:'demandes',component:ValidationDemandeComponent},

      ]
    ,canActivate:[AuthGuard] 
  },
  { path:"**",component:Erreur404Component }


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
