import { Component, OnInit } from '@angular/core';
import { Supplier } from '../supplier';

@Component({
  selector: 'app-supplier-list',
  templateUrl: './supplier-list.component.html',
  styleUrls: ['./supplier-list.component.css']
})
export class SupplierListComponent implements OnInit{
  suppliers: Supplier[];

  constructor(){}

  ngOnInit(): void{

    this.suppliers = [
      {
      "supplierId":1,
      "companyName":"ColFachadas",
      "contact":"Miguel Lopez",
      "address": "Cra 49H #56g-21",
      "celphone":"3196529849",
      "email":"colfachadas@gmail.com",
      "score":7.7,
      "city":"Cali"

    },
    {
      "supplierId":2,
      "companyName":"ColFachadas2",
      "contact":"Miguel Lopez Lopez",
      "address": "Cra 49H #56g-22",
      "celphone":"3196529850",
      "email":"colfachadas@hotmail.com",
      "score":9,
      "city":"Cali"

    }
  ];
  }

}
