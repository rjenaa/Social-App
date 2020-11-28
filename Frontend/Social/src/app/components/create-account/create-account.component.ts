import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { Router } from '@angular/router';
import { Account } from 'src/app/models/Account';
import { AccountService } from 'src/app/services/account.service';

@Component({
  selector: 'app-create-account',
  templateUrl: './create-account.component.html',
  styleUrls: ['./create-account.component.css']
})
export class CreateAccountComponent implements OnInit {

  constructor(private accountService: AccountService, private formBuilder: FormBuilder, private router: Router, ) { }

  account: Account = new Account();

  ngOnInit(): void {

  }

  accountForm = this.formBuilder.group({
      userName: [''],
      password: [''],
      email: [''],
      phoneNumber: [''],
    }
  );

  createAccount(){
    this.accountService.createAccount(this.accountForm.value).subscribe(
      data => {
        this.account = data;
        console.log("Account created");
      },
      error => {
        console.log(error)
      },
      () => {
        this.router.navigate([`/create-yearup/`+this.account.id]);
      }
    )
  };

  
}
