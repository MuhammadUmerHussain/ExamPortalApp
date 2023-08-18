import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignUpComponent } from './Pages/sign-up/sign-up.component';

const routes: Routes = [
  {
    path:"signup",
    component:SignUpComponent,
    pathMatch:"full"

  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
