package com.sb.suppliermanagement.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import com.sb.suppliermanagement.model.Product;
import com.sb.suppliermanagement.model.Supplier;
import com.sb.suppliermanagement.model.SupplierProductv1;



@Data
public class SupplierProductv1DTO implements Serializable{
	
	private SupplierProductv1 supplierid;
	private SupplierProductv1 productid;
	
}
