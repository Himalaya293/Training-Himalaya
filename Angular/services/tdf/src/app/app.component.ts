import { Component } from '@angular/core';
import{ User }from './user';
import{EnrollmentService } from './enrollment.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Valiadations';
  topics=['Angular','React','Javascript','Html','CSS'];
  topicHasError=true;
  submitted=false;


  userModel = new User('seema','seema@gmail.com',89745621,'','evening',true);

  constructor(private _enrollmentService:EnrollmentService){}

  onSubmit(){
    this.submitted=true;
    this._enrollmentService.enroll(this.userModel)
    .subscribe(
      data => console.log('Success!',data),
      error => console.error('Error!',error)
    )

  }
}
