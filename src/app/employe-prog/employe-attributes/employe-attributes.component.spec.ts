import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeAttributesComponent } from './employe-attributes.component';

describe('EmployeAttributesComponent', () => {
  let component: EmployeAttributesComponent;
  let fixture: ComponentFixture<EmployeAttributesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeAttributesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeAttributesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
