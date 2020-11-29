import { Component, OnInit } from '@angular/core';
import {Post} from "../models/Post";
import {YearUpStudent} from "../models/YearUpStudent";
import {PostService} from "../services/post.service";
import {ActivatedRoute, Router} from "@angular/router";
import {YearUpStudentService} from "../services/year-up-student.service";

@Component({
  selector: 'app-post-create',
  templateUrl: './post-create.component.html',
  styleUrls: ['./post-create.component.css']
})
export class PostCreateComponent implements OnInit {
  post = new Post();
  yearUpStudent: YearUpStudent;
  id: number = this.activatedRoute.snapshot.params[`id`];

  constructor(private postService: PostService, private router: Router, private activatedRoute: ActivatedRoute, private yearUpStudentService: YearUpStudentService) { }

  ngOnInit(): void {
    this.getYearUpStudent();
  }

  getYearUpStudent(){
    this.yearUpStudentService.fetchYearUpStudentById(this.id).subscribe(
      response => this.yearUpStudent = response.data
    )
  }

  submitNewPost(){
    const id = this.activatedRoute.snapshot.params[`id`];
    this.post.message = "";
    this.postService.createAPost(id, this.post).subscribe(
      data => {
        this.router.navigate(['/home/'+ id]);
        console.log("Made a new post")
      }
    )
  }

}
