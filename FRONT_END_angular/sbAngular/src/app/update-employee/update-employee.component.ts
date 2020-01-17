import { Course } from '../course';
import { Contact } from '../contact';
import { Observable } from 'rxjs';
import { Employee } from '../employee';
import { ActivatedRoute, Router } from '@angular/router';
import { EmployeeService } from './../employee.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
  id: number;
  employee: Employee;
  contact: Contact;
  course: Course;
  constructor(
    private service: EmployeeService,
    private route: ActivatedRoute,
    private router: Router

  ) { }

  ngOnInit() {
    this.id = +this.route.snapshot.paramMap.get('id');
    this.service.getAllList().subscribe(
      data => {
        for (const i in data) {
          if (data[i].id === this.id) {
            this.employee = data[i];
          }
        }
      },
      err => {
        console.log(err);
      }
    );
    // this.course = this.employee.courses.values().next().value;
    // this.contact = this.employee.contacts.values().next().value;
  }

  updateEmployee(employee: Employee) {
    console.log(employee.courses[0]);
    return this.service.updateEmployee(employee).subscribe(result => this.gotoList());
  }
  gotoList() {
    this.router.navigate(['/app-employee-list']);
  }

}
