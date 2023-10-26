//package com.sb.suppliermanagement.services;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.sb.suppliermanagement.dto.SupplierProductv1DTO;
//import com.sb.suppliermanagement.model.SupplierProductv1;
//import com.sb.suppliermanagement.repository.SupplierProductv1Repository;
//
//@Service
//public class SupplierProductServiceImpl implements SupplierProductService {
//	
//	
//	@Autowired
//	private SupplierProductv1Repository repositorio;
//	
//	
//	@Transactional(readOnly=true)
//	public List<Long> findIdByProductid(Long productid) {
//		return (List<Long>) repositorio.findIdByProductid(productid);
//	}
//
//}
