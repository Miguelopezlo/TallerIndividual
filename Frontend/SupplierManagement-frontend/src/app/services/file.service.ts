import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FileService {

    //Esta URL retorna el listado de todos los proveedores
    private baseURL = "http://localhost:8080/api/v1/Supplier/create/many"

    constructor(private httpClient: HttpClient) { }
  
  
    //Este método nos sirve para obtener la lista de proveedores
    postSupplierList(suppliers: File): Observable<any>{
      const formData: FormData = new FormData();
      formData.append("suppliers",suppliers);
      return this.httpClient.post(`${this.baseURL}`, formData)
    }
    
}
