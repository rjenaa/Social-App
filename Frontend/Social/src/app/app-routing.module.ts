import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { CreateAccountComponent } from './components/create-account/create-account.component';
import { CreateYearupstudentComponent } from './components/create-yearupstudent/create-yearupstudent.component';

<<<<<<< HEAD
=======


const routes: Routes = [
  {path: '' , component: CreateAccountComponent},
  {path: 'create-yearup/:id', component: CreateYearupstudentComponent}
]

>>>>>>> bb171f1eecc7fd3aa5b79ed41cb14ab51197f4fe
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
