import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-landing-page',
  templateUrl: './landing-page.component.html',
  styleUrls: ['./landing-page.component.css']
})
export class LandingPageComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private router:Router) { }

  accountForm = this.formBuilder.group(
    {
      userName:[''],
      password:['']

    }
  )

  ngOnInit(): void {
  }

  signIn(){
      this.router.navigate([`/create-account`])
  }

}
