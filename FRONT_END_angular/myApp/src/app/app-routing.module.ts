import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { NewCmpComponent } from './new-cmp/new-cmp.component';
import { ViewComponent } from './view/view.component';

const routes: Routes = [
  {
    path:"app-new-cmp",
    component: NewCmpComponent
  },
  {
    path:"app-new-cmp/app-view",
    component: ViewComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
