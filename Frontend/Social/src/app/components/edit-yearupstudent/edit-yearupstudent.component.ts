import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { YearUpStudent } from 'src/app/models/YearUpStudent';
import { YearUpStudentService } from 'src/app/services/year-up-student.service';

@Component({
  selector: 'app-edit-yearupstudent',
  templateUrl: './edit-yearupstudent.component.html',
  styleUrls: ['./edit-yearupstudent.component.css']
})
export class EditYearupstudentComponent implements OnInit {

  constructor(private activatedRoute: ActivatedRoute, private yearupstudentService: YearUpStudentService) { }

  fileRaw: File;
  imageRaw: File;

  yus: YearUpStudent = new YearUpStudent();

  handleFile(files:FileList){
    this.fileRaw = files.item(0);
  }

  handleImage(files:FileList){
    this.imageRaw = files.item(0);
  }

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params[`id`];
    this.yearupstudentService.fetchYearUpStudentById(id).subscribe(
      data => {
        this.yus = data;
        console.log("year up info acquired");
        console.log(this.yus.picture.url)
      }
    )
  }

  editYearUp(){
    this.yearupstudentService.updateYearUpStudentById(this.yus.id, this.yus).subscribe(
      () => console.log("edit complete")
    )
  }


}
