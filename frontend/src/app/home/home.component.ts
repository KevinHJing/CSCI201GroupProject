import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '@app/_models';
import { AccountService } from '@app/_services';
import { environment } from '@environments/environment';
import { first, Observable } from 'rxjs';
import { of } from 'rxjs';
import { async } from 'rxjs';
import testData from './test.json';
import { Listing } from '@app/_models';


@Component({ templateUrl: 'home.component.html' })
export class HomeComponent {
    user: User;
    val: Observable<String>;
    newVal: String;
    
    data: Listing[] = testData;

    constructor(private accountService: AccountService, private http: HttpClient) {
        this.user = this.accountService.userValue;
    }


    checkedfunc(l: Listing){
        alert(l.listingAddress);
        this.accountService.update(this.user.id, {favs: l}).pipe(first())
        .subscribe(
            data => {
                
            },
            error => {
            });
    }
    
}

