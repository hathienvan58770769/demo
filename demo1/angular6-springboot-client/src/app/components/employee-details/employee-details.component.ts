import { Component, OnInit, Input } from '@angular/core';
import { Employee } from 'src/app/model/employee';
import { EmployeeService } from 'src/app/services/employee.service';
import { Router, ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent implements OnInit {

  public employee : Employee;
  constructor(private employeeService : EmployeeService,
    public routerService: Router,
    public routerActivatedService: ActivatedRoute) { }

  ngOnInit() {
    this.routerActivatedService.params.subscribe((data: Params) => {
      let id = data.id;
      this.employeeService.getEmployee(id).subscribe((data : Employee) =>{
        this.employee = data;
      });
    });
  }

}
