import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-cmp',
  templateUrl: './new-cmp.component.html',
  styleUrls: ['./new-cmp.component.css']
})
export class NewCmpComponent implements OnInit {
  title="My First Angular Project";
  month=["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"];
  isAvailable=true;
  constructor() { }
  newcomponent="Entered into new component";
  ngOnInit() {
 
}
fun(event)
{
  alert("button is clicked");
  console.log(event)
}
changeMonth(event)
{
  alert("month is changed")
  console.log(event);
}

}
