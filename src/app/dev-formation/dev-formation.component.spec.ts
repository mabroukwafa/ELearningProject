import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DevFormationComponent } from './dev-formation.component';

describe('DevFormationComponent', () => {
  let component: DevFormationComponent;
  let fixture: ComponentFixture<DevFormationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DevFormationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DevFormationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
