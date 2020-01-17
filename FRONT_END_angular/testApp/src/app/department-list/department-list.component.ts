import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute, ParamMap } from '@angular/router';
@Component({
  selector: 'app-department-list',
  template: `
  
      <h3>Department-list !</h3>
      <ul>
        <li (click)="onSelect(d)"  *ngFor="let d of departments">{{d.id}} {{d.name}}</li>
      </ul>

   
  `,
  styles: []
})
export class DepartmentListComponent implements OnInit {

public selectedId;
  departments=[
    {"id":1,"name":"Angular"},
    {"id":2,"name":"Node"},
    {"id":3,"name":"Java"},
    {"id":4,"name":"Ruby"},
    {"id":5,"name":"JS"}
  ]

  constructor(private router:Router,
              private route:ActivatedRoute) { }

  ngOnInit() {
    this.route.paramMap.subscribe((params:ParamMap)=>
    {
      let id=+(params.get('id'));
      this.selectedId=id;
    });
  }

  onSelect(d)
  {
    this.router.navigate(['/departments',d.id]);
  }

  // isSelected(d)
  // {
  //     return d.id=this.selectedId;
  // }
}
