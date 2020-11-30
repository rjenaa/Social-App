import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Post} from "../models/Post";

@Injectable({
  providedIn: 'root'
})
export class PostService {

  private URL = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  getAllPost(): Observable<any>{
    return this.http.get<any>(this.URL+`/post/`);
  }

  getPostById(id: number): Observable<any>{
    return this.http.get<any>(this.URL+`/post/${id}`);
  }

  getAllPostByAccountId(accountId: number): Observable<any>{
    return this.http.get<any>(this.URL+`/post/YearUpStudent/${accountId}`);
  }

  createAPost(accountId: number, post: Post): Observable<any>{
    return this.http.post<any>(this.URL+`/${accountId}/post`, post)
  }

  deleteAPost(id: number): Observable<any>{
    return this.http.delete<any>(this.URL+`/post/${id}`);
  }
}
