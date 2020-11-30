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
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { CreateAccountComponent } from './components/create-account/create-account.component';

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
    CreateAccountComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
