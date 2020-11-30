import { Component, OnInit } from '@angular/core';
import {YearUpStudent} from "../../models/YearUpStudent";

@Component({
  selector: 'app-resource-list',
  templateUrl: './resource-list.component.html',
  styleUrls: ['./resource-list.component.css']
})
export class ResourceListComponent implements OnInit {

  items = [];

  numTimesLeft = 10;

  yearUpStudents: YearUpStudent[];

  constructor() { }

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
}
