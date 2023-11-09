import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs'
import { Supplier } from './supplier';

@Injectable({
  providedIn: 'root'
})
export class SupplierService {
  
  //Esta URL retorna el listado de todos los proveedores
  private baseURL = "http://localhost:8080/api/v1/Supplier/all"

  constructor(private httpClient: HttpClient) { }


  //Este método nos sirve para obtener la lista de proveedores
  getSupplierList(): Observable<Supplier[]>{
    return this.httpClient.get<Supplier[]>(`${this.baseURL}`)
  }
  
}
