import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'pipes';
  public name="Welcome";
  public message="Welcome to Pipes";
  todaydate = new Date();
  public person={
     "firstname":"hima",
      "lastname":"laya"
  }

}
