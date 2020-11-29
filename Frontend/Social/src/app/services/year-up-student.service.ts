import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { YearUpStudent } from '../models/YearUpStudent';

@Injectable({
  providedIn: 'root'
})
export class YearUpStudentService {

  private URL = 'http://localhost:8080';

  constructor(private http: HttpClient) {  }

  fetchAllYearUpStudents(): Observable<any> {
    return this.http.get<any>(this.URL+`/YearUpStudents`);
  }

  fetchYearUpStudentById(id:number): Observable<any> {
    return this.http.get<any>(this.URL+`/YearUpStudents/${id}`);
  }

  fetchYearUpStudentByFirstName(): Observable<any> {
    return this.http.get<any>(this.URL+`/YearUpStudents/fname`);
  }

  fetchYearUpStudentByLastName(): Observable<any> {
    return this.http.get<any>(this.URL+`/YearUpStudents`);
  }

  fetchYearUpStudentByAccountId(id: number): Observable<any> {
    return this.http.get<any>(this.URL+`/YearUpStudents/account/${id}`);
  }

  createYearUpStudent(yus: YearUpStudent): Observable<any> {
    return this.http.post<any>(this.URL+`/YearUpStudents`, yus);
  }

  updateYearUpStudentById(id:number, yus: YearUpStudent): Observable<any> {
    return this.http.put<any>(this.URL+`/YearUpStudents/${id}`, yus);
  }

  deleteYearUpStudentById(id:number): Observable<any> {
    return this.http.delete<any>(this.URL+`/YearUpStudents/${id}`);
  }

  uploadFileByYearUpStudentId(id: number, file: any){
    console.log(1)
    const formData :FormData = new FormData();
    console.log(2)
    formData.append("file", file);
    console.log(3)
    return this.http.post<any>(this.URL+`/upload/resume/${id}`, formData)
  }
  

  uploadPictureByYearUpStudentId(id: number, file: File){
    const formData = new FormData();
    let student: YearUpStudent = new YearUpStudent();
    this.fetchYearUpStudentById(id).subscribe(
      data =>  student = data
    );
    formData.append("file", file);
    return this.http.post<any>(this.URL+`/upload/photo/${id}`, formData);
  }

}
