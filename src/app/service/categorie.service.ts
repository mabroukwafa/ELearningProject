import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Categorie } from '../model/categorie';
import { Formation } from '../model/formation';

@Injectable({
  providedIn: 'root'
})
export class CategorieService {
  apiURL: string = "http://localhost:8080/formations/categorie/";


  constructor(private http :HttpClient) { }
  listeCategorie(): Observable<Categorie[]>{
    return this.http.get<Categorie[]>(this.apiURL+"all");
  }

  
}
