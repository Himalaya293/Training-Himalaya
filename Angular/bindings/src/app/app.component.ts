import { Component } from '@angular/core';
import{ User }from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'bindings';
  topics=['Angular','React','Javascript','Html','CSS'];

  userModel = new User('seema','seema@gmail.com',89745621,'','evening',true);
}
