import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from '../model/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  public baseUrl = 'http://localhost:8080/api/v1/employees';
  constructor( public http : HttpClient) { }
  getAllEmployee() : Observable<Employee[]>{
    return this.http.get<Employee[]>(`${this.baseUrl}`);
  }
  getEmployee(id : number) : Observable<Employee>{
    return this.http.get<Employee>(`${this.baseUrl}/${id}`);
  }
  createEmployee(employee : Employee) : Observable<Employee> {
    return this.http.post<Employee>(`${this.baseUrl}`, employee);
  }
  editEmployee(employee:Employee):Observable<Employee>{
    return this.http.put<Employee>(`${this.baseUrl}/${employee.id}`,employee)
  }
  deleteEmployee(id : number) : Observable<Employee>{
    return this.http.delete<Employee>(`${this.baseUrl}/${id}`);
  }
}
