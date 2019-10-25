import { Component, OnInit } from '@angular/core';
import { EmployeeService } from 'src/app/services/employee.service';
import { Employee } from 'src/app/model/employee';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  public employees : Employee[];
  constructor(public employeeService : EmployeeService) { }

  ngOnInit() {
    this.reLoadData();
  }
  reLoadData(){
    this.employeeService.getAllEmployee().subscribe(data => {
      this.employees = data;
    });
  }
  deleteEmployee(id : number){
  this.employeeService.deleteEmployee(id).subscribe(data => {
    this.reLoadData();
  })
  }
}
