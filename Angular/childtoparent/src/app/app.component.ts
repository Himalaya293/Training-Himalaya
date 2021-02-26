import { CloneVisitor } from '@angular/compiler/src/i18n/i18n_ast';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'childtoparent';
  name: any;
  department: any;
  departments(data: any){
    console.warn(data)
    this.name=data.name;
    this.department=data.department;
  }
}
