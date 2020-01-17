import { QuestionService } from './services/question.service';
import { TestService } from './services/test.service';
import { SubjectService } from './services/subject.service';
import { LoginComponent } from './login/login/login.component';
import { LoginModule } from './login/login.module';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { ViewAllComponent } from './view-all/view-all.component';
import { TestListComponent } from './view-all/test-list/test-list.component';
import { TestDetailComponent } from './view-all/test-list/test-detail/test-detail.component';
import { AddQuestionComponent } from './add-question/add-question.component';
import { UploadComponent } from './upload/upload/upload.component';
import { LogoutComponent } from './logout/logout/logout.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ViewAllComponent,
    TestListComponent,
    TestDetailComponent,
    AddQuestionComponent,
    UploadComponent,
    LogoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule,
    FormsModule,
    LoginModule
  ],
  providers: [
    SubjectService,
    TestService,
    QuestionService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
