
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {HttpClient,HttpClientModule,HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TestService {

  constructor(private http:HttpClient) {
    this.http=http;
   }
   getTestByTID(tid:number):Observable<any>
   {
     const headers = new HttpHeaders({ Authorization: sessionStorage.getItem('token')});
     return this.http.get(`http://localhost:8080/test/findTest/${tid}`,{headers});
   }

   getAllTestBySid(sid:number):Observable<any>
   {
     const headers = new HttpHeaders({ Authorization: sessionStorage.getItem('token')});
     return this.http.get(`http://localhost:8080/test/all/${sid}`,{headers});
   }

}
