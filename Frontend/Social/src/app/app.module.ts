import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PostListComponent } from './post-list/post-list.component';
import { PostCreateComponent } from './post-create/post-create.component';
import { ResourceListComponent } from './resource-list/resource-list.component';
import { YearUpStudentsListComponent } from './year-up-students-list/year-up-students-list.component';
import { AccountListComponent } from './account-list/account-list.component';
import { HomeComponent } from './home/home.component';
import { DevelopersComponent } from './developers/developers.component';
import { AppRoutingModule } from './app-routing.module';
import { CreateYearupstudentComponent } from './components/create-yearupstudent/create-yearupstudent.component';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';
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
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
