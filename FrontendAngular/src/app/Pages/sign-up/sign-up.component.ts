import { Component } from '@angular/core';

@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent {
  user={
    username:'',
    fname:"",
    lname:"",
    email:'',
    phone:'',
    password:''
  }
  ngOnInit(){

  }
  formSubmit(){

  }

}
