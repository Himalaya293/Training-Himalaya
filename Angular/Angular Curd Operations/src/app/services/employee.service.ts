import { Injectable } from '@angular/core';
import { Employee } from '../model/employee.model'
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  employees: Employee[] = [
    {
      id:1,
      name:"hima",
      email: "hima@gmail.com",
      phone: 9128456378
    },
    {
      id:2,
      name:"swathi",
      email: "swathi@gmail.com",
      phone: 9745632817
    },
    {
      id:3,
      name:"hema",
      email: "hema@gmail.com",
      phone: 9742365812
    }
  ];
  emp: any;
  latestid : number = this.employees.length;

  constructor() { }

  onGet(){
    return this.employees;
  }

  onAdd(employee: Employee){
    this.employees.push(employee);
    this.latestid=employee.id;

  }

  onDelete(id: number){
    let emp = <Employee>this.employees.find(x=>x.id === id);
    let index = this.employees.indexOf(emp,0)
    this.employees.splice(index,1);

  }

  onGetEmployee(id: number){
    return this.employees.find(x=>x.id === id);
  }

  onUpdate(employee: Employee){
    let oemployee = <Employee>this.employees.find(x=> x.id === employee.id);
    oemployee.name = employee.name;
    oemployee.email = employee.email;
    oemployee.phone = employee.phone;
  }

  onSearch(name : string)
  {
    let emp : Employee[] =[];
    emp=this.employees.filter(x=>x.name === name);
    console.log(emp);
    return emp;

  }
}
