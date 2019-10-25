import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/model/employee';
import { EmployeeService } from 'src/app/services/employee.service';
import { error } from 'util';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {

  public employee : Employee;
  public submitted = false;
  constructor( private employeeService : EmployeeService,
    public routerService: Router) { }

  ngOnInit() {
    this.employee = new Employee();
  }
  onSubmit(){
    this.submitted = true;
    this.employeeService.createEmployee(this.employee).subscribe(data => {
      if (data.id && data) {
        this.routerService.navigate(['/employees']);
      }
    });

  }
  

}
