//package com.sb.suppliermanagement.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import com.sb.suppliermanagement.model.SupplierProductv1;
//import com.sb.suppliermanagement.services.SupplierProductService;
//
//@RestController
//@RequestMapping("/api/v1/")
//@CrossOrigin(origins = "http://localhost:4200")
//public class SupplierProductv1Controller {
//
//	@Autowired
//	private SupplierProductService service;
//	
//	@GetMapping("/Supplier/Productid/{productid}")
//	public ResponseEntity<?> listSupplierByProductid(@PathVariable Long productid){
//		List<Long> o = service.findIdByProductid(productid);
//		if (o.isEmpty()) {
//			return ResponseEntity.notFound().build();
//		}
//			
//		return ResponseEntity.ok(o);
//	}
//	
//
//}
