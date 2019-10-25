import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeeListComponent } from './components/employee-list/employee-list.component';
import { CreateEmployeeComponent } from './components/create-employee/create-employee.component';
import { EmployeeDetailsComponent } from './components/employee-details/employee-details.component';
import { UpdateEmployeeComponent } from './components/update-employee/update-employee.component';


const routes: Routes = [
  {
    path:'',
    redirectTo : 'employees',
    pathMatch: 'full'
  },
  {
    path: 'employees',
    component: EmployeeListComponent
  },
  {
    path: 'add',
    component: CreateEmployeeComponent
  },
  {
    path: 'employees/:id',
    component: EmployeeDetailsComponent
  },
  {
    path: 'employees/update/:id',
    component: UpdateEmployeeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
