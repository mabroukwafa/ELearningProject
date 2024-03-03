import { Component, OnInit } from '@angular/core';
import {Reclamation} from '../model/reclamation';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {Mail} from '../model/mail';
import {$COLON} from 'codelyzer/angular/styles/chars';

@Component({
  selector: 'app-question',
  templateUrl: './question.component.html',
  styleUrls: ['./question.component.css']
})
export class QuestionComponent {
}