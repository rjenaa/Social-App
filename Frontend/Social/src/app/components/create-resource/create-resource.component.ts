import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { YearUpStudent } from 'src/app/models/YearUpStudent';
import { ResourcesService } from 'src/app/services/resources.service';
import { YearUpStudentService } from 'src/app/services/year-up-student.service';

@Component({
  selector: 'app-create-resource',
  templateUrl: './create-resource.component.html',
  styleUrls: ['./create-resource.component.css']
})
export class CreateResourceComponent implements OnInit {

  constructor(private router: Router, private formBuilder: FormBuilder, private resourceService: ResourcesService, private activatedRoute: ActivatedRoute, private studentService: YearUpStudentService) { }

  resourceForm = this.formBuilder.group({
    message: ['']
  }
  );

  imageToUpload: File;

  handleImage(files: FileList){
    this.imageToUpload = files.item[0];
  }

  yus : YearUpStudent;
  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params[`id`];
    this.studentService.fetchYearUpStudentById(id).subscribe(
      data => this.yus = data,
      error => console.log(error)
    )
  }

  createResource(){
    this.resourceService.createResource(this.resourceForm.value).subscribe(
      () => {
        this.uploadPicture(this.yus.id);
        this.router.navigate([``])
      }
    )
  }

  uploadPicture(id: number){
    if(this.imageToUpload == null){
      console.log("no picture")
    }
    else{
    console.log("upload commence for profile picture")
    this.studentService.uploadPictureByYearUpStudentId(id, this.imageToUpload).subscribe(
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
