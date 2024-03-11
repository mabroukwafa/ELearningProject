import { Component, OnInit } from '@angular/core';
import { Attribute } from 'src/app/model/attribute';
import { AuthentificationService } from 'src/app/service';
import { AttributeService } from 'src/app/service/attribute.service';

@Component({
  selector: 'app-employe-attributes',
  templateUrl: './employe-attributes.component.html',
  styleUrls: ['./employe-attributes.component.css']
})
export class EmployeAttributesComponent implements OnInit {

  private attributes : Attribute[];
  id : number ;
  

  constructor(private attribuService : AttributeService, private authservice : AuthentificationService) { }

  ngOnInit() {
    let userObj = JSON.parse(localStorage.getItem("user"));
    this.id =userObj.user.id;
    this.chargerDemandes();
  }
  
  chargerDemandes(){
    this.attribuService.listeDemandesByEmplye(this.id).subscribe(res => {
      
      console.log(res);
      this.attributes = res;
      });
}

}
