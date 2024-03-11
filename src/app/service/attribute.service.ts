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
  return this.http.get<Attribute[]>(this.apiURL+"attributions");
  }
  listeDemande(): Observable<Attribute[]>{
    return this.http.get<Attribute[]>(this.apiURL+"demandes");
    }
 
  
  ajouterAttribution( att: Attribute):Observable<Attribute>{
    return this.http.post<Attribute>("http://localhost:8080/formations/attribution/add", att, httpOptions);
    }
  ajouterDemande( att: Attribute):Observable<Attribute>{
      return this.http.post<Attribute>("http://localhost:8080/formations/attribution/addDemande", att, httpOptions);
      }
  
    listeDemandesByEmplye(id: number): Observable<Attribute[]> {
        const url = `${this.apiURL+"DemandesByEmploye"}/${id}`;
        return this.http.get<Attribute[]>(url);
      }
    
    listeAttributionByEmplye(id: number): Observable<Attribute[]> {
        const url = `${this.apiURL+"AttributionsByEmploye"}/${id}`;
        return this.http.get<Attribute[]>(url);
      }
    
    updateForm(attribute :Attribute) : Observable<Attribute>
      {
          return this.http.put<Attribute>(this.apiURL+"update", attribute, httpOptions);
      }

}
