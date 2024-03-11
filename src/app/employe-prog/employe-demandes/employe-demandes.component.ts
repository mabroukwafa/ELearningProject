import { Attribute } from 'src/app/model/attribute';
import { Component, OnInit } from '@angular/core';
import { AuthentificationService } from 'src/app/service';
import { AttributeService } from 'src/app/service/attribute.service';

@Component({
  selector: 'app-employe-demandes',
  templateUrl: './employe-demandes.component.html',
  styleUrls: ['./employe-demandes.component.css']
})
export class EmployeDemandesComponent implements OnInit {
  demandes : Attribute[];
  currentDemande: Attribute;
  id:number; 

  constructor(private attribuService:AttributeService ,private authservice:AuthentificationService) { }

  ngOnInit() {
    this.chargerDemandes();
  }

  chargerDemandes(){
    this.attribuService.listeDemandesByEmplye(this.authservice.id).subscribe(res => {
      console.log(res);
      this.demandes = res;
      });
}


}
