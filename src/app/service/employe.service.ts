import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Employe } from '../model/employe';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeService {

  apiURL: string = "http://localhost:8080/formations/employe/";

  constructor(private http :HttpClient) {}
  listeEmploye(): Observable<Employe[]>{
  return this.http.get<Employe[]>(this.apiURL+"all");
  }
}
