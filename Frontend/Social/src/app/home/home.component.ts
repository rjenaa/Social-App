import { Component, OnInit } from '@angular/core';
import {Router} from "@angular/router";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  goToAccountListPage(){
    this.router.navigate(['/accounts']);
  }

  goToResourceListPage(){
    this.router.navigate(['/resource']);
  }

  goToProfilePage(){
    this.router.navigate(['/accounts']);
  }
}
