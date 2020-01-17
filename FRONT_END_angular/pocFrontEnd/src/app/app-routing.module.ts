import { LogoutComponent } from './logout/logout/logout.component';
import { LoginComponent } from './login/login/login.component';
import { AppComponent } from './app.component';
import { AuthGuard } from './login/auth.guard';
import { AddQuestionComponent } from './add-question/add-question.component';
import { ViewAllComponent } from './view-all/view-all.component';
import { NgModule } from '@angular/core';
import { CanActivate, RouterModule, Routes } from '@angular/router';
import { UploadComponent } from './upload/upload/upload.component';


const routes: Routes = [
  { path: '*', component: AppComponent, canActivate: [AuthGuard] },
  { path: 'view', component: ViewAllComponent, canActivate: [AuthGuard] },
  { path: 'testDetail/:testId', component: ViewAllComponent },
  { path: 'add-question/:tid', component: AddQuestionComponent },
  { path: 'upload', component: UploadComponent, canActivate: [AuthGuard] },
  { path: 'login', component: LoginComponent },
  { path: 'logout', component: LogoutComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
