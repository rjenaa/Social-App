import { Component, OnInit } from '@angular/core';
import {ActivatedRoute, Router} from "@angular/router";
import {YearUpStudent} from "../../models/YearUpStudent";
import {YearUpStudentService} from "../../services/year-up-student.service";
import {Subscription} from "rxjs";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  yearUpStudent: YearUpStudent = new YearUpStudent();
  items = [];
  numTimesLeft = 5;
  yearUpStudents: YearUpStudent[];
  emptyArray: YearUpStudent[];
  id: number;

  private routeSub: Subscription;

  constructor(private router: Router, private yearUpStudentService: YearUpStudentService, private activatedRoute: ActivatedRoute) { }

  filteredStudents: YearUpStudent[];

  private _listFilter: string;

  get listFilter(): string{
    return this._listFilter;
  }

  set listFilter(value: string){
    this._listFilter = value;
    if(this._listFilter === ""){
      this.refreshStudentList();
    }
    this.yearUpStudents = this.listFilter ? this.performFilter(this.listFilter): this.yearUpStudents;
  }

  performFilter(filterBy: string){
    filterBy = filterBy.toLocaleLowerCase();
    return this.yearUpStudents.filter((yearUpStudent:YearUpStudent) =>
      yearUpStudent.firstName.toLocaleLowerCase().indexOf(filterBy) !== -1);
  }

  ngOnInit(): void {
    // this.refreshStudentList();
    this.addMorePost();
  }

  refreshStudentList(){
    this.yearUpStudentService.fetchAllYearUpStudents().subscribe(
      data => {
        this.yearUpStudents = data.data;
        console.log(data)
      }
    )
  }

  loadData(event) {
    setTimeout(() =>{
      console.log("Done");
      this.addMorePost();
      this.numTimesLeft -= 1;
      event.target.complete();
    }, 500);
  }

  addMorePost(){
    for (let i = 0; i < 20; i ++)
      this.items.push(i);
  }

  goToResourceListPage(){
    this.id = this.activatedRoute.snapshot.params[`id`];
    this.router.navigate(['resource/'+ this.id]);
  }

  goToProfilePage(){
    this.id = this.activatedRoute.snapshot.params[`id`];
    this.router.navigate(['view-profile/'+ this.id]);
  }

  goToHomePage(){
    this.id = this.activatedRoute.snapshot.params[`id`];
    this.router.navigate(['home/'+ this.id]);
  }
}
