import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  // templateUrl: './test.component.html',
  template:`
           
           <input [id]="myId" type="text" value="Pranaw">
            <input [disabled]="false" id="{{myId}}" type="text" value="Pranaw">
            <h2 [style.color]="hasError ? 'red':'green'">{{"Welcome "+name}}</h2>
             <h2 [ngStyle]="titleStyles">{{"Welcome "+name}}</h2>
            <!--
            {{2+2}}
            {{2*2}}
            {{"Welcome "+name}}
            <h2>{{name.length}}</h2>
            <h2>{{name.toUpperCase()}}</h2>
            <h2>{{greetUser()}}</h2>
            {{siteUrl}}

            <!-- yaha error ayegi 
            <h2>{{a=2+2}}</h2>
            {{window.location.href}}
            -->
            <h2 class="text-success">Code Evaluation</h2>
            <h2 [class]="successClass">Code Evaluation</h2>
            
            <h2 [ngClass]="ngClass" >Code Multi</h2>  <!-- for muticlass or fo rapplying condition-->
        `,
  // styleUrls: ['./test.component.css']
  styles:[`
        div{
          color:red
          
        }
        .text-success
        {
          color:green
        }
        .text-danger
        {
          color:red
        }
        .text-special
        {
          font-style:italic
        }
  `]
})
export class TestComponent implements OnInit {
  name="pranaw";
  myId="testId";
  siteUrl=window.location.href;
  hasError=true;
  titleStyles=
    {
      color:"blue",
      fontStyle:"italic"
    }
  //class binding
  successClass="text-success";
  dangerClass="text-danger";
  specialClass="text-special"

ngClass={
  "text-success":this.successClass,
  "text-special":this.specialClass
}


  constructor() { }

  ngOnInit() {
  }
  greetUser()
  {
    return "Hello "+this.name;
  }

}
