import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ResourcesService {

  private URL = 'http://localhost:8080';

  constructor(private http: HttpClient ) { }

  fetchAllResources(): Observable<any>{
    return this.http.get<any>(this.URL+`/`)
  }

}
