import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AdminloginService } from '../services/adminlogin.service';
import { Router } from '@angular/router';
import { Adminlogin } from '../models/adminlogin';

@Component({
  selector: 'app-admin-login',
  imports: [FormsModule],
  templateUrl: './admin-login.component.html',
  styleUrl: './admin-login.component.css'
})
export class AdminLoginComponent {
adm:Adminlogin=new Adminlogin()

constructor(private admserv:AdminloginService,private router:Router)
{

}

submitdata(){
this.admserv.login(this.adm.username,this.adm.password).subscribe(data=>{
  if(data.length>0)
    {
      localStorage.setItem("usertype","admin")
      this.router.navigate(["/"])
    }
  
})
}
}
