import { Component, OnInit } from '@angular/core';
import { AttributeService } from '../service/attribute.service';
import { Attribute } from './../model/attribute';


@Component({
  selector: 'app-validation-demande',
  templateUrl: './validation-demande.component.html',
  styleUrls: ['./validation-demande.component.css']
})
export class ValidationDemandeComponent implements OnInit {

  demandes : Attribute[];
  currentDemande: Attribute;
  

  constructor( private attributeService:AttributeService) { }

  ngOnInit() {
    this.chargerdemandes();
  }

  chargerdemandes(){
    this.attributeService.listeDemande().subscribe(res => {
      console.log(res);
      this.demandes = res;
      });
    }
    
  selectDemande(demande: Attribute) { 
    this.currentDemande = demande;
    console.log(this.currentDemande);        

}
    updateProduit() {
     
      if(this.currentDemande != undefined){
        this.attributeService.updateForm(this.currentDemande).subscribe(res=>{
          console.log(res);        
          })
}
}
}
