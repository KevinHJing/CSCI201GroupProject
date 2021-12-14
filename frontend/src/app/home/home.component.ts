import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '@app/_models';
import { AccountService } from '@app/_services';
import { environment } from '@environments/environment';
import { Observable } from 'rxjs';
import { of } from 'rxjs';
import { async } from 'rxjs';

@Component({ templateUrl: 'home.component.html' })
export class HomeComponent {
    user: User;
    val: Observable<String>;
    newVal: String;

    constructor(private accountService: AccountService, private http: HttpClient) {
        this.user = this.accountService.userValue;
    }

    test(){
        this.val = this.http.get<String>('localhost:8080/user/');
        if (typeof this.val === 'string'){
            alert("val is string");
        }
        if (typeof this.val === 'object'){
            alert("val is object");
        }
        this.http.get<String>('localhost:8080/user/').subscribe(data => this.newVal = data);
        if (typeof this.newVal === 'string'){
            alert("newval is string");
        }
        else{
            alert("newval not string");
        }
    }

    
}