import { Component, OnInit, Input,Output, EventEmitter} from '@angular/core';

@Component({
  selector: 'app-login',
  template: `
    <!--  <input [(ngModel)]="name" type="text">  <!--Banana Model [()]
      {{name}}
-->
 <!-- 
      <div [ngSwitch]="color">
        <div *ngSwitchCase="'red'">You picked red</div>
        <div *ngSwitchCase="'blue'">You picked blue</div>
        <div *ngSwitchCase="'green'">You picked green</div>
        <div *ngSwitchDefault>picked again</div>
      </div>
     {{"odd"}} {{"last"}} {{"first"}} {{"index"}} {{"color"}}<br>
       <div *ngFor="let color of colors; index as i;first as f;last as l;odd as o">
        
        {{o}} {{l}} {{f}} {{i+1}} {{color}}
        </div>
      -->
      {{colors|json}}
      <br>
      {{"Hello "+name }}
      {{5.678 |number:'1.2-3'}}<br>
      {{5.678 |number:'2.4-5'}}<br>
      {{5.678 |number:'3.1-2'}}<br>

      {{0.25 |percent}}<br>
      {{0.25 |currency}}<br>
      {{5.678 |currency:'EUR'}}<br>

      <button (click)="fireEvent()">Send Event</button>

  `,
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {


color ="black";
colors=["red","blue","green"];

//public date=new Date();

  constructor() { }
  
  //@Input() public parentData;
  @Input('parentData') public name;

  @Output()
  public childEvent=new EventEmitter();

  ngOnInit() {
  }

  fireEvent()
  {
    this.childEvent.emit('Hey rahul');
  }

  

}
