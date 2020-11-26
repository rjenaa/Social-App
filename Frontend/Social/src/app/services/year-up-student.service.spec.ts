import { TestBed } from '@angular/core/testing';

import { YearUpStudentService } from './year-up-student.service';

describe('YearUpStudentService', () => {
  let service: YearUpStudentService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(YearUpStudentService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
