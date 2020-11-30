import { Component, OnInit } from '@angular/core';
import {YearUpStudent} from "../../models/YearUpStudent";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-resource-list',
  templateUrl: './resource-list.component.html',
  styleUrls: ['./resource-list.component.css']
})
export class ResourceListComponent implements OnInit {

  items = [];

  numTimesLeft = 10;

  yearUpStudent: YearUpStudent = new YearUpStudent();
  yearUpStudents: YearUpStudent[];
  emptyArray: YearUpStudent[];
  id: number;

  constructor(private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
  }

  loadData(event) {
    setTimeout(() =>{
      console.log("Done");
      this.addMoreResources();
      this.numTimesLeft -= 1;
      event.target.complete();
    }, 500);
  }

  addMoreResources(){
    for (let i = 0; i < 15; i ++)
      this.items.push(i);
  }

  goToResourceListPage(){
    this.id = this.activatedRoute.snapshot.params[`id`];
    this.router.navigate(['resource/'+ this.id]);
  }

  goToHomePage(){
    this.id = this.activatedRoute.snapshot.params[`id`];
    this.router.navigate(['home/'+ this.id]);
  }

  goToProfilePage(){
    this.id = this.activatedRoute.snapshot.params[`id`];
    this.router.navigate(['view-profile/'+ this.id]);
  }
}
