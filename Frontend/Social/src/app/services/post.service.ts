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

  fetchAllPost(): Observable<any>{
    return this.http.get<any>(this.URL+`/post/`);
  }

  fetchPostById(id: number): Observable<any>{
    return this.http.get<any>(this.URL+`/post/${id}`);
  }

  fetchPostByAccountId(accountId: number): Observable<any>{
    return this.http.get<any>(this.URL+`/post/${accountId}`);
  }

  createAPost(post: Post): Observable<any>{
    return this.http.post<any>(this.URL+`/post/`, post)
  }

  deleteAPost(id: number): Observable<any>{
    return this.http.delete<any>(this.URL+`/post/${id}`);
  }
}
