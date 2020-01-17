import { Component, OnInit } from '@angular/core';
import{VendorServiceService} from '../vendor-service.service';
import{Vendor} from '../vendor';

@Component({
  selector: 'app-add-vendor',
  templateUrl: './add-vendor.component.html',
  styleUrls: ['./add-vendor.component.css']
})
export class AddVendorComponent implements OnInit {

  constructor(private service:VendorServiceService) { 

  }

    public name :String;
public salary:number;


add()
{
  console.log(this.name+" "+this.salary)
  this.vendor=new Vendor(0,this.name,this.salary);
  // console.log(this.vendor.name+" "+this.vendor.salary)
this.service.createVendor(this.vendor).subscribe(data=>console.log(data),
           err=>console.log(err))
}
vendor:Vendor;
  ngOnInit() {
    //console.log(this.vendor.name+" "+this.vendor.salary)
      
      
  }

}
