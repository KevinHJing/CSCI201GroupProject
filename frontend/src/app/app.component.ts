import { Component } from '@angular/core';
import { Router } from '@angular/router';

import { AccountService } from './_services';
import { User } from './_models';

@Component({ selector: 'app', templateUrl: 'app.component.html' })
export class AppComponent {
    user: User;

    constructor(
        private router: Router,
        private accountService: AccountService
        ) {
        this.accountService.user.subscribe(x => this.user = x);
        localStorage.clear();
    }

    logout() {
        this.accountService.logout();
    }
    login(){
        this.router.navigate(['login']);
    }
    favorites(){
        this.router.navigate(['favorites']);
    }
}