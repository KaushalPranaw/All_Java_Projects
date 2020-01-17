import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { IEmployee } from "src/app/employee";
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
import {Observable, Subject, asapScheduler, pipe, of, from, interval, merge, fromEvent, throwError} from 'rxjs';
import {catchError} from "rxjs/internal/operators";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

private _url: string="/assets/data/employees.json";
  constructor(private http: HttpClient) { }
  getEmployees():Observable<IEmployee[]>
  {
    // return [
    //   {"id":1,"name":"pranaw1","age":30 },
    //   {"id":2,"name":"pranaw2","age":40 },
    //   {"id":3,"name":"pranaw3","age":20 }
    // ];

    return this.http.get<IEmployee[]>(this._url).pipe(catchError(this.errorHandler));
               // .catch(this.errorHandler);
  }

  errorHandler(error : HttpErrorResponse)
  {
    return Observable.throw(error.message||'server error');
  }
}
