import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { ServiceComponent } from './service/service.component';
import { FeedbackComponent } from './feedback/feedback.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { CosmeticsComponent } from './cosmetics/cosmetics.component';
export const routes: Routes = [
{path:'',component:HomeComponent},
{path:'service',component:ServiceComponent},
{path:'feedback',component:FeedbackComponent},
{path:'registration',component:RegistrationComponent},
{path:'login',component:LoginComponent},
{path:'adminlogin',component:AdminLoginComponent},
{path:'cosmetics',component:CosmeticsComponent}

];