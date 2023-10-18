import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SupplierListComponent } from './supplier-list/supplier-list.component';

const routes: Routes = [
  {path:'suppliers',component:SupplierListComponent},
  {path:'suppliers/all',component:SupplierListComponent},
  {path:'',redirectTo:'suppliers',pathMatch:'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
