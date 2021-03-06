import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';

@Component({
  selector: 'app-department-detail',
  template: `
    <h3>You selected department with id= {{departmentId}}</h3>
    <a (click)="goPrevious()">Previous</a>
    <br>
     <a (click)="goNext()">Next</a>
     <div>
        <button (click)="gotoDepartemnt()">Back</button>
     </div>
  `,
  styles: []
})
export class DepartmentDetailComponent implements OnInit {

public departmentId;
  constructor(private route:ActivatedRoute,
  private router:Router) { }

  ngOnInit() {

   // let id=this.route.snapshot.paramMap.get('id');
   // this.departmentId=id;
   this.route.paramMap.subscribe((params:ParamMap)=>{
     let id=params.get('id');
     this.departmentId=+id
   });
  }
  goPrevious()
  {
      let pId=+(this.departmentId)-1;
      this.router.navigate(['/departments',pId]);
  }
  goNext()
  {
    let nId=+(this.departmentId)+1;
    this.router.navigate(['/departments',nId]);
  }
  gotoDepartemnt()
  {
    let selectedId= this.departmentId?this.departmentId:null;
    this.router.navigate(['/departments',{id:selectedId}]);
  }

}
