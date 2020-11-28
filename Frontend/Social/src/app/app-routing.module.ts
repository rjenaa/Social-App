import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { CreateAccountComponent } from './components/create-account/create-account.component';
import { CreateYearupstudentComponent } from './components/create-yearupstudent/create-yearupstudent.component';



const routes: Routes = [
  {path: '' , component: CreateAccountComponent},
  {path: 'create-yearup/:id', component: CreateYearupstudentComponent}
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
