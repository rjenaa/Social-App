import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs";
import {Resources} from "../models/Resources";

@Injectable({
  providedIn: 'root'
})
export class ResourcesService {

  private URL = 'http://localhost:8080';

  constructor(private http: HttpClient ) { }

  //Will fetch all resources shared.
  fetchAllResources(): Observable<any> {
    return this.http.get<any>(this.URL+`/resources`);
  }
  //Will find a single resource by its id.
  fetchResourceById(id: number): Observable<any> {
    return this.http.get<any>(this.URL+`/resources/${id}`);
  }
  //Will allow someone to see all of the resources a single person has shared.
  fetchResourcesByAccountId(accountId: number): Observable<any>{
    return this.http.get<any>(this.URL+`/resources/${accountId}`);
  }

  createResource(resources: Resources): Observable<any>{
    return this.http.post<any>(this.URL+`/resources`,resources);
  }

  deleteAResource(id: number): Observable<any>{
    return this.http.delete<any>(this.URL+`/resources/${id}`);
  }

}
