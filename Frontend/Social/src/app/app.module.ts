import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PostListComponent } from './components/post-list/post-list.component';
import { PostCreateComponent } from './components/post-create/post-create.component';
import { ResourceListComponent } from './components/resource-list/resource-list.component';
import { YearUpStudentsListComponent } from './components/year-up-students-list/year-up-students-list.component';
import { AccountListComponent } from './components/account-list/account-list.component';
import { HomeComponent } from './components/home/home.component';
import { DevelopersComponent } from './components/developers/developers.component';
import { AppRoutingModule } from './app-routing.module';
import { CreateYearupstudentComponent } from './components/create-yearupstudent/create-yearupstudent.component';
import { HttpClientModule } from '@angular/common/http';
<<<<<<< HEAD
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
=======
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
>>>>>>> 3b4f520a06398a31577983fe20e4e43e0947e01b
import { CreateAccountComponent } from './components/create-account/create-account.component';
import { LandingPageComponent } from './components/landing-page/landing-page.component';
import { EditYearupstudentComponent } from './components/edit-yearupstudent/edit-yearupstudent.component';
import { EditResourceComponent } from './components/edit-resource/edit-resource.component';
import { CreateResourceComponent } from './components/create-resource/create-resource.component';

@NgModule({
  declarations: [
    AppComponent,
    PostListComponent,
    PostCreateComponent,
    ResourceListComponent,
    YearUpStudentsListComponent,
    AccountListComponent,
    HomeComponent,
    DevelopersComponent,
    CreateYearupstudentComponent,
    CreateAccountComponent,
    LandingPageComponent,
    EditYearupstudentComponent,
    EditResourceComponent,
    CreateResourceComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
<<<<<<< HEAD
    FormsModule
=======
    FormsModule 
>>>>>>> 3b4f520a06398a31577983fe20e4e43e0947e01b
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
