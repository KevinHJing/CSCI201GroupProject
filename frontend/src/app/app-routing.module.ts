import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AccountRoutingModule } from './account/account-routing.module';
import { LoginComponent } from './account/login.component';
import { RegisterComponent } from './account/register.component';

import { HomeComponent } from './home';
import { AuthGuard } from './_helpers';

const accountModule = () => import('./account/account.module').then(x => x.AccountModule);
const usersModule = () => import('./users/users.module').then(x => x.UsersModule);

const routes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'home', component: HomeComponent },
    { path: 'login', component: LoginComponent },
    { path: 'users', loadChildren: usersModule, canActivate: [AuthGuard] },
    { path: 'signup', component: RegisterComponent },
    { path: 'account', loadChildren: accountModule },

    // otherwise redirect to home
    { path: '**', redirectTo: '' }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule { }