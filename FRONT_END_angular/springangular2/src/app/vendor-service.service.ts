import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders,HttpClientModule} from '@angular/common/http'
import {Observable} from 'rxjs';
import {Vendor} from './vendor'
@Injectable({
  providedIn: 'root'
})
export class VendorServiceService {

  constructor(private http:HttpClient) {
    this.http=http;
   }

   getAllVendors():Observable<any>
   {
     return this.http.get("http://localhost:8081/yash_day9_spring_angular/allVendor");
   }

   createVendor(vendor:object):Observable<object>
   {
      return this.http.post("http://localhost:8081/yash_day9_spring_angular/saveVendor",vendor);
   }

   deleteVendor(id:number):Observable<any>
   {
     return this.http.delete(`http://localhost:8081/yash_day9_spring_angular/deleteVendor/${id}`);
   }
   updateVendor(vendor:Vendor):Observable<object>
   {
     return this.http.put(`http://localhost:8081/yash_day9_spring_angular/updateVendor/${vendor.id}`,vendor);
   }
}