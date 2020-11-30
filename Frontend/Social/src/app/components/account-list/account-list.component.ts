import { Component, OnInit } from '@angular/core';
import {Account} from "../../models/Account";
import {AccountService} from "../../services/account.service";

@Component({
  selector: 'app-account-list',
  templateUrl: './account-list.component.html',
  styleUrls: ['./account-list.component.css']
})
export class AccountListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
