import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Listing, User } from '@app/_models';
import { AccountService } from '@app/_services';

@Component({
  selector: 'app-favorites',
  templateUrl: './favorites.component.html',
  styleUrls: ['./favorites.component.less']
})
export class FavoritesComponent implements OnInit {
  user: User;
  favorites: Listing;

  constructor(private accountService: AccountService, private http: HttpClient) {
    this.user = this.accountService.userValue;
  } 

  ngOnInit(): void {
    this.favorites = this.user.favs;
  }

  

}
