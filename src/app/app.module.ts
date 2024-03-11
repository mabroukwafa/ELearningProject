import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { FooterComponent } from './home/footer/footer.component';
import { ContainerComponent } from './home/container/container.component';
import { SideBarComponent } from './home/side-bar/side-bar.component';

import { LoginComponent } from './login/login.component';
import { NavbarComponent } from './home/navbar/navbar.component';
import { Erreur404Component } from './erreur404/erreur404.component';
import {NgxPaginationModule} from 'ngx-pagination';
import {FormGroup, FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MustMatchDirective} from './helpes/must-match-directive';

import { BsDatepickerModule } from 'ngx-bootstrap/datepicker';
import {CommonModule} from '@angular/common';
import {RouterModule} from '@angular/router';
import { ChartsModule } from 'ng2-charts';
import {HttpClientModule} from '@angular/common/http';
import { DatePickerModule } from '@syncfusion/ej2-angular-calendars';
import {QuestionComponent} from './reclamation/question.component';



import { ProfileadminComponent } from './profileadmin/profileadmin.component';

import { ProfilUserComponent } from './profileadmin/profil-user/profil-user.component';
import {StarRatingModule} from 'angular-star-rating';
import {CalendarModule, DateAdapter} from 'angular-calendar';
import {adapterFactory} from 'angular-calendar/date-adapters/date-fns';
import {FlatpickrModule} from 'angularx-flatpickr';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {NgbModalModule} from '@ng-bootstrap/ng-bootstrap';
import {FormationComponent} from "./formation/formation.component";
import { ValidationDemandeComponent } from './validation-demande/validation-demande.component';
import { DevFormationComponent } from './dev-formation/dev-formation.component';
import { EmployeProgComponent } from './employe-prog/employe-prog.component';
import { AuthGuard } from './auth.guard';
import { EmployeDemandesComponent } from './employe-prog/employe-demandes/employe-demandes.component';
import { EmployeAttributesComponent } from './employe-prog/employe-attributes/employe-attributes.component';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FooterComponent,
    ContainerComponent,
    SideBarComponent,
    LoginComponent,
    NavbarComponent,
    Erreur404Component,
    MustMatchDirective,
   FormationComponent,
    QuestionComponent,
    
    ProfileadminComponent,



    ProfilUserComponent,


    ValidationDemandeComponent,

    DevFormationComponent,

    EmployeProgComponent,

    EmployeDemandesComponent,

    EmployeAttributesComponent



  ],
  imports: [NgbModalModule,
   BrowserAnimationsModule,  FlatpickrModule.forRoot(),CalendarModule.forRoot({
    provide: DateAdapter,
    useFactory: adapterFactory
  }),NgxPaginationModule,ChartsModule,StarRatingModule.forRoot(),
    RouterModule,  BrowserModule, DatePickerModule,
   AppRoutingModule,FormsModule,HttpClientModule,ReactiveFormsModule, BsDatepickerModule.forRoot()

  ],
  providers: [AuthGuard],
  bootstrap: [AppComponent]
})
export class AppModule { }
