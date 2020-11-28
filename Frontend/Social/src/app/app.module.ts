import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { Post } from './post.create/post.create.component';
import { PostListComponent } from './post-list/post-list.component';
import { PostCreateComponent } from './post-create/post-create.component';
import { ResourceListComponent } from './resource-list/resource-list.component';
import { YearUpStudentsListComponent } from './year-up-students-list/year-up-students-list.component';
import { AccountListComponent } from './account-list/account-list.component';
import { HomeComponent } from './home/home.component';
import { DevelopersComponent } from './developers/developers.component';

@NgModule({
  declarations: [
    AppComponent,
    Post.CreateComponent,
    PostListComponent,
    PostCreateComponent,
    ResourceListComponent,
    YearUpStudentsListComponent,
    AccountListComponent,
    HomeComponent,
    DevelopersComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
