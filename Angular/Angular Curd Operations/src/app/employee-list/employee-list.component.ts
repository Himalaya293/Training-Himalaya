import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-employee-list',
  template: `
  <style>
  li {
    background-color: #00BFFF;
    border: 1px solid #777;
    padding: 0 6px 0 6px;
    margin: 10px 8px 10px 8px;
    min-width: 50px;
    border-radius: 20px;
    font-size: 14px;
    text-align: center;
    text-decoration:none;
    outline: none;
    line-height: 2rem;
    width: 8rem;
    height: 2rem;
    color: white;
  }
</style>

<h3>Employee List</h3>
<ul>
<li (click)="onSelect(department)" *ngFor="let department of departments">
<span class="badge"> {{department.id}} </span>{{department.name}}
</li>
</ul>

  `,
  styles: [

  ]
})
export class EmployeeListComponent implements OnInit {

  departments=[
    {"id":1,"name":"employees-list"}
  ]
  constructor(private router: Router ) { }

  ngOnInit(): void {
  }

  onSelect(department: { id: any; }){
    this.router.navigate(['/departments',department.id]);
  }

}
