import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SupplierListComponent } from './supplier-list/supplier-list.component';
import { ProductListComponent } from './product-list/product-list.component';
import { ContractListComponent } from './contract-list/contract-list.component';

const routes: Routes = [
  {path:'suppliers', component: SupplierListComponent},
  {path: 'products', component: ProductListComponent},
  {path: 'contracts', component: ContractListComponent},
  { path: '**', redirectTo: '' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

