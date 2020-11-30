import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { CreateAccountComponent } from './components/create-account/create-account.component';
import { CreateYearupstudentComponent } from './components/create-yearupstudent/create-yearupstudent.component';
import { LandingPageComponent } from './components/landing-page/landing-page.component';
import { EditYearupstudentComponent } from './components/edit-yearupstudent/edit-yearupstudent.component';
import { EditResourceComponent } from './components/edit-resource/edit-resource.component';
import { CreateResourceComponent } from './components/create-resource/create-resource.component';
import {HomeComponent} from "./components/home/home.component";
import { ViewProfileComponent } from './components/view-profile/view-profile.component';

const routes: Routes = [
  {path: "", component: LandingPageComponent},
  {path: "create-account", component: CreateAccountComponent},
  {path: "create-yearup/:id", component: CreateYearupstudentComponent},
  {path: "home/:id", component: HomeComponent},
  {path: "edit-yearup/:id", component: EditYearupstudentComponent},
  {path: "edit-resource/:id", component: EditResourceComponent},
  {path: "create-resource/:id", component: CreateResourceComponent},
  {path: "view-profile/:id", component: ViewProfileComponent}
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule, [RouterModule.forRoot(routes)]
  ],
  exports: [
    RouterModule
  ]
})
export class AppRoutingModule { }
