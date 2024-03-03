import { Formation } from './../model/formation';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

const httpOptions = {
headers: new HttpHeaders( {'Content-Type': 'application/json'} )
};
@Injectable({
  providedIn: 'root'
})
export class FormationService {

  apiURL: string = "http://localhost:8080/formations/formation/";

  constructor(private http : HttpClient) {}
  listeFormation(): Observable<Formation[]>{
    return this.http.get<Formation[]>(this.apiURL+"all");
  }
  ajouterFormation( formation: Formation):Observable<Formation>{
    return this.http.post<Formation>(this.apiURL+"add", formation, httpOptions);
  }

  consulterFormationByTitre(titre: String): Observable<Formation> {
    const url = `${this.apiURL+"findByTitre"}/${titre}`;
    return this.http.get<Formation>(url);
  }
  
  consulterFormationByFormateur(username: String): Observable<Formation> {
    const url = `${this.apiURL+"findByForUsername"}/${username}`;
    return this.http.get<Formation>(url);
  }

  supprimerFormation(id : number) {
    const url = `${this.apiURL+"delete"}/${id}`;
    return this.http.delete(url, httpOptions);
  }

  updateProduit(formation :Formation) : Observable<Formation>
  {
      return this.http.put<Formation>(this.apiURL+"update", formation, httpOptions);
  }
  
  consulterFormationByCateg(id: number): Observable<Formation> {
    const url = `${this.apiURL+"findByCateg"}/${id}`;
    return this.http.get<Formation>(url);
    }
}
