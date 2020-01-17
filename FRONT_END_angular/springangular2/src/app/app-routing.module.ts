import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ViewVendorListComponent} from './view-vendor-list/view-vendor-list.component';
import {AddVendorComponent} from './add-vendor/add-vendor.component';
import {HttpClient,HttpHeaders} from '@angular/common/http'
import {UpdateVendorComponent} from './update-vendor/update-vendor.component'

const routes: Routes = [
  {path : '',redirectTo:'view-vendor-list',pathMatch:'full'},
  {path : 'view-vendor-list',component:ViewVendorListComponent},
  {path: 'add-vendor',component:AddVendorComponent},
  {path: 'update-vendor/:id/:name/:salary',component:UpdateVendorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
