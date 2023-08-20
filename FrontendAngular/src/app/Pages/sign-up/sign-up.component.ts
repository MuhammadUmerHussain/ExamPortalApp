import { Component } from '@angular/core';
import { UserService } from 'src/Services/user.service';
import Swal from 'sweetalert2'
@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent {
  constructor(private userService:UserService){}
  user={
    username:'',
    firstName:"",
    lastName:"",
    email:'',
    phone:'',
    password:''
  }
  ngOnInit(
    
  ){

  }
  formSubmit(){
if(this.user.username==""|| this.user.username==null)
{
  alert("Please Enter Username!");
  return;
}
this.userService.addUser(this.user).subscribe(
  (data:any)  =>{
    //sucess
    console.log(data);
    // Swal.fire('Success ','User id is '+data.id+' succses')
    Swal.fire({
  icon: 'success',
  title: 'User id is'+data.id,
  timer: 15000
})
    

  },(error)=>{
    //error
    console.log(error)
     Swal.fire('Error ',+error+' Faild')

  }
)
  }

}
