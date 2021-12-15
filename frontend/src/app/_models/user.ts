import { ListComponent } from "@app/users/list.component";
import { Listing } from '@app/_models';

export class User {
    id: string;
    username: string;
    password: string;
    firstName: string;
    lastName: string;
    token: string;
    favs: Listing;
}