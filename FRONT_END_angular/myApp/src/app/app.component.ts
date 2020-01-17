import { Component } from '@angular/core';
import { MyserviceService} from './myservice.service';

//decorator
@Component({
  selector: 'app-root',//custom html tag
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  name;
  constructor(private myservice: MyserviceService)
  {

  }
  title = 'app';
  public names="pranaw";
  message="";
  ngOnInit()
  {
    this.name=this.myservice.showName();
  }
}
