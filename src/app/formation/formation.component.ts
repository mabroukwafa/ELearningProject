import { CategorieService } from './../service/categorie.service';
import { Categorie } from './../model/categorie';
import { EmployeService } from './../service/employe.service';
import { FormationService } from './../service/formation.service';
import { Component, OnInit, ViewChild } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';

import Swal from "sweetalert2";
import { Formation } from '../model/formation';
import { Employe } from '../model/employe';
import { AttributeService } from '../service/attribute.service';
import { Attribute } from '../model/attribute';
import { Admin } from '../model/admin';
import { Formateur } from '../model/formateur';

@Component({
  selector: 'app-formation',
  templateUrl: './formation.component.html',
  styleUrls: ['./formation.component.css']
})
export class FormationComponent implements OnInit {

  formations : Formation[];
  employes : Employe[];
  categories:Categorie[];

  selectedEmployeIds: Employe[] = [];
  selectedCategorie:any;
  selectedFormation: any;
  titre:String ; 
  description:String ; 
  attribute = new  Attribute() ;
  formation= new Formation();
  admin = new Admin();
  formateur=new Formateur();

  @ViewChild('exampleModal') myModal;
 
  constructor(private formationService: FormationService , private employeService:EmployeService,
     private attribuService:AttributeService, private categorieService:CategorieService) {

     }

  ngOnInit() {
    
    this.chargerServices();
    this.chargerEmployes();
    this.chargerCategories();
  }

  chargerServices(){
  this.formationService.listeFormation().subscribe(res => {
    console.log(res);
    this.formations = res;
    });
  }

  chargerEmployes(){
    this.employeService.listeEmploye().subscribe(res => {
      console.log(res);
      this.employes = res;
      });

  }

  selectFormation(formation: Formation) { 
    this.selectedFormation = formation;
}
closeModal() {
  this.myModal.nativeElement.modal('hide');
  this.selectedEmployeIds = [];
}

onCheckboxChange(emp: Employe, isChecked: boolean) {
    if (isChecked) {
        // Ajouter l'ID de l'employé à la liste des sélectionnés
        this.selectedEmployeIds.push(emp);
        console.log(this.selectedEmployeIds);
    } else {
        // Retirer l'ID de l'employé de la liste des sélectionnés
        this.selectedEmployeIds = this.selectedEmployeIds.filter(id => id !== emp.id);
         console.log(this.selectedEmployeIds);
    }
}

affecterformation(){
      
  this.admin.id =11; 
  this.admin.username ="admin";
  this.admin.email ="admin@gmail.com";
  this.attribute.admin  = this.admin;
   this.attribute.formation = this.selectedFormation;
   this.attribute.employes = this.selectedEmployeIds;
   console.log(this.attribute);
   if(this.attribute != undefined){
    this.attribuService.ajouterAttribution(this.attribute).subscribe(res=>{
      console.log(res);
      this.closeModal();
     
      })
   }
 
}
onInputChange(event: any) {
  this.description = event.target.value; 
  console.log(this.description);


}

  onInputChangetitre(event: any) {
    this.titre = event.target.value; 
    console.log(this.titre);
    
  }

chargerCategories(){
  this.categorieService.listeCategorie().subscribe(res => {
    console.log(res);
    this.categories = res;
    });

}
onCategorieChange() {
  console.log(this.selectedCategorie); // Pour déboguer
  // Autres actions à effectuer lorsque la catégorie change
}
ajouterformation(){
      
  this.formateur.id=1; 
  this.formateur.username ="formateur2024";
  this.formateur.email ="formateur2024@gmail.com";
  this.formation.formateur  = this.formateur;

   this.formation.titre = this.titre;
   this.formation.description = this.description;
   console.log(this.formation);
    if(this.formation != undefined){
    this.formationService.ajouterFormation(this.formation).subscribe(res=>{
      console.log(res);
      this.closeModal();
     
      })
   } 
 
  
}

}

 







