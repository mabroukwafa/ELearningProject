import {Conducteur} from './conducteur';

export class Annoce {
  id:string;
   date_depart:Date;
 date_arrivee:Date;
lieu_depart:string;
  lieu_arrive:string;
  acseptationauto:boolean;
 nbrplacesdisponible:string;
   prix:string;
 heurDepart:string;
  heurArrive:string;
 aller_retour:boolean;
 description:string;
  regulier:boolean;
  chauffeur:Conducteur;

  idconducteur:string;
}


