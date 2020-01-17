import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { NewCmpComponent } from './new-cmp/new-cmp.component';
import { ViewComponent } from './view/view.component';
import { TestComponent } from './test/test.component';

import { NewDirDirective } from './new-dir.directive';

import { MyserviceService} from './myservice.service';
import { EmployeeService} from './employee.service';

import { HttpClientModule } from '@angular/common/http';

import { Test1Component } from './test1/test1.component';
import { LoginComponent } from './login/login.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { EmployeeDetailComponent } from './employee-detail/employee-detail.component';


@NgModule({
  declarations: [
    AppComponent,
    NewCmpComponent,
    NewDirDirective,
    ViewComponent,
    TestComponent,
    Test1Component,
    LoginComponent,
    EmployeeListComponent,
    EmployeeDetailComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [MyserviceService,
              EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
