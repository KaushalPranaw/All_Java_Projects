import { Address } from './address';
import { Contact } from './contact';
import { Course } from './course';
export class Employee {

  //public image: File;
  public id: number;
  public name: string;
  public salary: number;
  public address: Address;
  public contacts: Contact[] = [];
  public courses: Course[] = [];

  // constructor(id: number, name: string, salary: number, address: Address, contacts: Contact[], courses: Course[]) {
  //   this.id = id;
  //   this.name = name;
  //   this.salary = salary;
  //   this.address = address;
  //   this.contacts = contacts;
  //   this.courses = courses;
  // }

}
