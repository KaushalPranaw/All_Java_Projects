import { Router } from '@angular/router';
import { Observable } from 'rxjs/internal/Rx';
import { EmployeeService } from './../employee.service';
import { Component, OnDestroy, OnInit } from '@angular/core';
import { Employee } from '../employee';
@Component({
  // tslint:disable-next-line:component-selector
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employeeList: any = [];
  constructor(private service: EmployeeService,
    private router: Router) { }

  ngOnInit() {
    this.getAllList();
  }

  //  ngOnDestroy(): void {
  //   this.employeeList.next();
  //   this.employeeList.complete();
  // }

  getAllList() {
    this.service.getAllList().subscribe(
      data => {
        this.employeeList = data;
      },
      err => {
        console.log(err);
      }
    );
  }
  deleteEmployee(id: number) {

    this.service.deleteEmployee(id).subscribe(result => this.getAllList());
  }

  updateEmployee(id: number) {
   // this.service.updateEmployee(employee).subscribe(result => this.updatePage());
   this.router.navigate(['/update-emp', id]);
  }


}
