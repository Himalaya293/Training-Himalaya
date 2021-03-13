import { Component } from '@angular/core';
import { FormBuilder,Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'reactive-forms';

  constructor(private fb: FormBuilder ) {}

    enrollmentForm = this.fb.group({
      userName:[' ', Validators.required],
      Password:[''],
      ConfirmPassword:[''],
      address: this.fb.group({
        city:[''],
        state:[''],
        postalcode:['']
      })
  });
  loadApiData(){
    this.enrollmentForm.patchValue({
      userName: 'Laya',
    Password: 'test',
    ConfirmPassword: 'test',
    address:{
      city: 'city',
      state: 'state',
      postalcode: '12345'
    }
    });
  }
}
