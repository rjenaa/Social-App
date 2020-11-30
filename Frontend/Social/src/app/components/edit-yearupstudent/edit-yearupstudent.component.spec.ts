import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditYearupstudentComponent } from './edit-yearupstudent.component';

describe('EditYearupstudentComponent', () => {
  let component: EditYearupstudentComponent;
  let fixture: ComponentFixture<EditYearupstudentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditYearupstudentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditYearupstudentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
