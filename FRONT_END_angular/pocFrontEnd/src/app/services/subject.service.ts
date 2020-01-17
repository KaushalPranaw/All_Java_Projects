import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient, HttpClientModule, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class SubjectService {

  constructor(private http: HttpClient) {
    this.http = http;
  }

  getAllSubject(): Observable<any> {
    const headers = new HttpHeaders({ Authorization: sessionStorage.getItem('token')});
    return this.http.get(`http://localhost:8080/subject/all`, { headers });
  }

  getSubjectBySID(sid: number): Observable<any> {

    const headers = new HttpHeaders({ Authorization: sessionStorage.getItem('token')});
    return this.http.get(`http://localhost:8080/subject/${sid}`, { headers })
  }
}
