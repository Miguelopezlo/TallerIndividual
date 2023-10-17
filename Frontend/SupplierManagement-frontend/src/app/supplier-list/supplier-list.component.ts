import { Component, OnInit } from '@angular/core';
import { Supplier } from '../supplier';
import { SupplierService } from '../supplier.service';

@Component({
  selector: 'app-supplier-list',
  templateUrl: './supplier-list.component.html',
  styleUrls: ['./supplier-list.component.css']
})
export class SupplierListComponent implements OnInit{
  suppliers: Supplier[];

  constructor(private supplierService:SupplierService){}

  ngOnInit(): void{
    this.getSuppliers()

  }
  private getSuppliers(){
    this.supplierService.getSupplierList().subscribe(dato =>{
      this.suppliers = dato
    })
  }

}
