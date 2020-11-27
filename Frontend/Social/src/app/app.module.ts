import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { CreateYearupstudentComponent } from './components/create-yearupstudent/create-yearupstudent.component';

@NgModule({
  declarations: [
    AppComponent,
    CreateYearupstudentComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
