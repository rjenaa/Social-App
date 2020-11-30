import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { error } from 'protractor';
import { YearUpStudent } from 'src/app/models/YearUpStudent';
import { YearUpStudentService } from 'src/app/services/year-up-student.service';

@Component({
  selector: 'app-view-profile',
  templateUrl: './view-profile.component.html',
  styleUrls: ['./view-profile.component.css']
})
export class ViewProfileComponent implements OnInit {

  constructor(private studentService: YearUpStudentService, private activatedRouter: ActivatedRoute) { }
  student: YearUpStudent;
  fileRaw: File;

  ngOnInit(): void {
    const id = this.activatedRouter.snapshot.params[`id`];
    this.refreshStudent(id);
  };

  refreshStudent(id: number){
    this.studentService.fetchYearUpStudentById(id).subscribe(
      data => this.student = data,
      error => console.log(error)
    )
  }

  handleFile(files:FileList){
    this.fileRaw = files.item(0);
  }

  showFile(){
    window.open(this.student.resume.url);
  }

  uploadFile(){
    console.log("upload commence for resume")
    if(this.fileRaw == null){
      console.log("file is empty")
    }
    else{
      this.studentService.uploadFileByYearUpStudentId(this.student.id, this.fileRaw).subscribe(
        data => {
          console.log("Success file uploaded")
        },
        error => {
          console.log(error);
        },
        ()=> this.refreshStudent(this.student.id)
      )
    }
  };



}
