import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EmployeProgComponent } from './employe-prog.component';

describe('EmployeProgComponent', () => {
  let component: EmployeProgComponent;
  let fixture: ComponentFixture<EmployeProgComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EmployeProgComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EmployeProgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
