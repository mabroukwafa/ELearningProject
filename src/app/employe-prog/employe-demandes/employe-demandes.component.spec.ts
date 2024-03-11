import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeDemandesComponent } from './employe-demandes.component';

describe('EmployeDemandesComponent', () => {
  let component: EmployeDemandesComponent;
  let fixture: ComponentFixture<EmployeDemandesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeDemandesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeDemandesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
