import { Component, OnInit } from '@angular/core';
import {Vendor} from '../vendor'
import {ParamMap,Route,ActivatedRoute} from '@angular/router'
import {VendorServiceService} from '../vendor-service.service'
@Component({
  selector: 'app-update-vendor',
  templateUrl: './update-vendor.component.html',
  styleUrls: ['./update-vendor.component.css']
})
export class UpdateVendorComponent implements OnInit {
vendor:Vendor;
  constructor(private route:ActivatedRoute,private service:VendorServiceService) { }


  ngOnInit() {
   // console.log(this.vendor.id)
    this.route.paramMap.subscribe((params:ParamMap)=>
    {
     let id=+params.get("id");
       let name=params.get("name");
       let salary=+params.get("salary");
      this.vendor=new Vendor(id,name,salary);
    })
    console.log(this.vendor.id)
  }

  update()
  {
    this.service.updateVendor(this.vendor).subscribe(
      data=>{console.log(data);
             
          },
    err=>console.log(err))
    
  }

}
