import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditComponent } from './pages/employees/edit/edit.component';
import { EmployeesComponent } from './pages/employees/employees.component';
import { DepartmentListComponent } from './department-list/department-list.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';


const routes: Routes = [

  {path:'departments',component:DepartmentListComponent},
  {path:'employees',component:EmployeeListComponent},
  {path:'departments/:id',component:EmployeesComponent},
  {
    path: "",
    component: EmployeesComponent
  },
  {
    path: "employee/add/:id",
    component: EditComponent
  },
  {
    path: "employee/edit/:id",
    component: EditComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

export const RoutingComponents=[
  EmployeesComponent,
  EditComponent,
  DepartmentListComponent,
  EmployeeListComponent,
];
