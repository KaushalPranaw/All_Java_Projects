import { Component, OnInit } from '@angular/core';
import {VendorServiceService} from '../vendor-service.service';
import { Routes, RouterModule,Router ,ParamMap,Route} from '@angular/router';
import {Observable } from 'rxjs';
import {Vendor} from '../vendor';
@Component({
  selector: 'app-view-vendor-list',
  templateUrl: './view-vendor-list.component.html',
  styleUrls: ['./view-vendor-list.component.css']
})
export class ViewVendorListComponent implements OnInit {

  constructor(private service:VendorServiceService,
  private router:Router) { }

  public vendors:any=[];
  public  vendor:Vendor;

   updateVendor(vendor:any)
   {
     this.vendor=vendor;
     console.log(vendor.id+" "+vendor.name+ " "+vendor.salary)
    this.router.navigate(['/update-vendor',vendor.id,vendor.name,vendor.salary]);


   }
  
  deleteVendor(id:number)
  {
    this.service.deleteVendor(id).subscribe(data=>console.log(data),
    err=>console.log(err));
    this.getData();
    this.router.navigate(["/view-vendor-list"]);

  }
  getData(){
this.service.getAllVendors().subscribe(
      data=>{this.vendors=data
      
    },
      err=>{
        console.log(err)
      }
    );
  }
  ngOnInit() {
    this.getData();
  }

}
