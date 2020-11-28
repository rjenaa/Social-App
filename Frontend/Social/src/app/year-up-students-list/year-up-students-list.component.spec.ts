import { ComponentFixture, TestBed } from '@angular/core/testing';

import { YearUpStudentsListComponent } from './year-up-students-list.component';

describe('YearUpStudentsListComponent', () => {
  let component: YearUpStudentsListComponent;
  let fixture: ComponentFixture<YearUpStudentsListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ YearUpStudentsListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(YearUpStudentsListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
