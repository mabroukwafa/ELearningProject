import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Attribute } from '../model/attribute';


const httpOptions = {
  headers: new HttpHeaders( {'Content-Type': 'application/json'} )
  };
  

@Injectable({
  providedIn: 'root'
})
export class AttributeService {

  apiURL: string = "http://localhost:8080/formations/attribution/";
  constructor(private http :HttpClient ) { }
  listeAttribut(): Observable<Attribute[]>{
  return this.http.get<Attribute[]>(this.apiURL+"all");
  }

  ajouterAttribution( att: Attribute):Observable<Attribute>{
    return this.http.post<Attribute>("http://localhost:8080/formations/attribution/add", att, httpOptions);
    }

}
