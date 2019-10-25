import { Component, OnInit } from '@angular/core';
import { Employee } from 'src/app/model/employee';
import { EmployeeService } from 'src/app/services/employee.service';
import { Router, ActivatedRoute, Params } from '@angular/router';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  public employee : Employee;
  public submitted = false;
  constructor( private employeeService : EmployeeService,
    public routerService: Router,
    public activatedRouteService: ActivatedRoute) { }

  ngOnInit() {
    this.employee = new Employee();
    this.reLoadData();
  }
  reLoadData(){
    this.activatedRouteService.params.subscribe((data: Params) => {
      let id = data.id;
      this.employeeService.getEmployee(id).subscribe((data : Employee) =>{
        this.employee = data;
      });
    });
  }
  onSubmit(){
    this.submitted = true;
    this.employeeService.editEmployee(this.employee).subscribe((data : Employee ) => {
        this.routerService.navigate(['/employees']);
    });

  }

}
