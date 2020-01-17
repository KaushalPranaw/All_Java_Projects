import { Employee } from './employee';
import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class EmployeeService {



  constructor(private http: HttpClient) {
    this.http = http;
  }

  getAllList(): Observable<any> {
    return this.http.get(`http://localhost:8080/list`);
  }

  // addEmployee(employee: object): Observable<object> {
  //   return this.http.post(`http://localhost:8080/add`, employee);
  // }

  addEmployee(employee: object): Observable<any> {
    return this.http.post(`http://localhost:8080/add`, employee);
  }

  deleteEmployee(id: number): Observable<any> {

    return this.http.delete(`http://localhost:8080/delete/${id}`);
  }
  updateEmployee(employee: object): Observable<object> {
    return this.http.put(`http://localhost:8080/update`, employee);
  }
}
