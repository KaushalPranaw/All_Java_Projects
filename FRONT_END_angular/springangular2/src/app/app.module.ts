import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import {RouterModule } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ViewVendorListComponent } from './view-vendor-list/view-vendor-list.component';
import {HttpClient,HttpHeaders,HttpClientModule} from '@angular/common/http';


import {VendorServiceService} from './vendor-service.service';
import { AddVendorComponent } from './add-vendor/add-vendor.component';
import { UpdateVendorComponent } from './update-vendor/update-vendor.component';

@NgModule({
  declarations: [
    AppComponent,
    ViewVendorListComponent,
    AddVendorComponent,
    UpdateVendorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    RouterModule
  ],
  providers: [VendorServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
