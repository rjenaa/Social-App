import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateYearupstudentComponent } from './create-yearupstudent.component';

describe('CreateYearupstudentComponent', () => {
  let component: CreateYearupstudentComponent;
  let fixture: ComponentFixture<CreateYearupstudentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreateYearupstudentComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateYearupstudentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
