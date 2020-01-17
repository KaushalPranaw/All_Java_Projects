import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test1',
  template:`
    <h2>Welcome {{name}}</h2>
   <!-- <button (click)="onClick($event)">Greet User</button>-->
    <br>
    {{greeting}}
    <input #myInput type="text">
    <button (click)="logMessage(myInput.value)">Log</button>
  `,
  styleUrls: ['./test1.component.css']
})
export class Test1Component implements OnInit {

  constructor() { }
  name="pranaw";
  greeting=""
  ngOnInit() {
  }
  onClick(event)//for dom parameter event is passed
  {
    alert("Welcome to code evaluation")
    this.greeting="Welcome to code evaluation";
  }

  logMessage(value)
  {
    alert(value)
  }

}
