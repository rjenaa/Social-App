import { Component, OnInit } from '@angular/core';
import {Post} from "../../models/Post";
import {PostService} from "../../services/post.service";
import {ActivatedRoute, Router} from "@angular/router";
import {YearUpStudentService} from "../../services/year-up-student.service";
import {YearUpStudent} from "../../models/YearUpStudent";

@Component({
  selector: 'app-post-list',
  templateUrl: './post-list.component.html',
  styleUrls: ['./post-list.component.css']
})
export class PostListComponent implements OnInit {

  constructor(private postService: PostService) {

  }

  ngOnInit(): void {

  }

  loadData(event) {
    setTimeout(() =>{
      console.log("Done");
      event.target.complete();
    }, 500);
  }
}
