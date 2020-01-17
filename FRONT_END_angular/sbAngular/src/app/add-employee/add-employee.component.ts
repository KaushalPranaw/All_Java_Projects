import { Observable } from 'rxjs/internal/Rx';
import { Address } from './../address';
import { EmployeeService } from '../employee.service';
import { Course } from './../course';
import { Contact } from '../contact';
import { Employee } from './../employee';
import { Component, Input, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

  public userFile: any = File;
  public employee: Employee;
  public address: Address;
  public contact: Contact;
  public course: Course;

  constructor(private service: EmployeeService,
    private router: Router) {
    this.employee = new Employee();
    this.address = new Address();
    this.course = new Course();
    this.contact = new Contact();
    this.employee.address = this.address;
    this.employee.contacts.push(this.contact);
    this.employee.courses.push(this.course);

  }

  ngOnInit() {
  }


  addEmployee() {

    this.service.addEmployee(this.employee).subscribe(result => { this.gotoList(); });

  }

  gotoList() {
    this.router.navigate(['/app-employee-list']);
  }
}
