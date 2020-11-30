import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { error } from 'protractor';
import { YearUpStudent } from 'src/app/models/YearUpStudent';
import { YearUpStudentService } from 'src/app/services/year-up-student.service';

@Component({
  selector: 'app-create-yearupstudent',
  templateUrl: './create-yearupstudent.component.html',
  styleUrls: ['./create-yearupstudent.component.css']
})
export class CreateYearupstudentComponent implements OnInit {

  yearUpStudent: YearUpStudent = new YearUpStudent();

  id: number;
  constructor(private yearUpStudentService:YearUpStudentService, private router: Router, private formBuilder: FormBuilder, private activatedRoute: ActivatedRoute) { }
  fileRaw: File;
  imageRaw: File;

  YearUpProfileForm = this.formBuilder.group({
    firstName: [''],
    lastName: [''],
    nickName:[''],
    bio: [''],
  }
  );

  

  ngOnInit(): void {
   
  }
  yus: YearUpStudent;

  createYearUp(){
    this.id = this.activatedRoute.snapshot.params[`id`];
    this.yearUpStudent = this.YearUpProfileForm.value;
    this.yearUpStudent.accountId = this.id;
    console.log(this.YearUpProfileForm.value)
    this.yearUpStudentService.createYearUpStudent(this.YearUpProfileForm.value).subscribe(
      data =>{ 
        this.yearUpStudent = data;
        console.log("Yearup Customer created: " + this.yearUpStudent.id);
        this.uploadFile(this.yearUpStudent.id);
        this.uploadPicture(this.yearUpStudent.id);
        this.router.navigate([`home/${this.yearUpStudent.accountId}`])
      }
    )
  }

  handleFile(files:FileList){
    this.fileRaw = files.item(0);
  }

  handleImage(files:FileList){
    this.imageRaw = files.item(0);
  }


  uploadFile(id:number){
    console.log("upload commence for resume")
    if(this.fileRaw == null){
      console.log("file is empty")
    }
    else{
      this.yearUpStudentService.uploadFileByYearUpStudentId(id, this.fileRaw).subscribe(
        data => {
          console.log("Success file uploaded")
        },
        error => {
          console.log(error);
        }
      )
    }
  };
  uploadPicture(id: number){
    if(this.imageRaw == null){
      console.log("no picture")
    }
    else{
    console.log("upload commence for profile picture")
    this.yearUpStudentService.uploadPictureByYearUpStudentId(id, this.imageRaw).subscribe(
      data => {
        console.log("Success picture uploaded")
      },
      error =>{
        console.log(error);
      }
    )
    }
  };

}
