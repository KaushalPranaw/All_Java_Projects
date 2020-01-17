import { Question } from './../model/question';


import { Observable } from 'rxjs';
import { Injectable } from '@angular/core';
import {HttpClient,HttpClientModule, HttpHeaders} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  constructor(private http:HttpClient) {
    this.http=http;
   }

  getAllQuestionByTID(tid:number):Observable<any>
   {
     const headers = new HttpHeaders({ Authorization: sessionStorage.getItem('token')});
     return this.http.get(`http://localhost:8080/question/all/${tid}`,{headers});
   }
   addQuestion(question:Question,tid:number):Observable<any>
   {
     const headers = new HttpHeaders({ Authorization: sessionStorage.getItem('token')});
    return this.http.post(`http://localhost:8080/question/saveQuestion/${tid}`,question,{headers});
   }

   deleteQuestion(qid:number,tid:number):Observable<any>
   {
     const headers = new HttpHeaders({ Authorization: sessionStorage.getItem('token')});
     return this.http.delete(`http://localhost:8080/question/deleteQuestion/${tid}/${qid}`,{headers});
   }
   updateQuestion(question:Question,qid:number,tid:number):Observable<any>
   {
     const headers = new HttpHeaders({ Authorization: sessionStorage.getItem('token')});
     return this.http.put(`http://localhost:8080/question/updateQuestion/${tid}/${qid}`,question,{headers});
   }
}
