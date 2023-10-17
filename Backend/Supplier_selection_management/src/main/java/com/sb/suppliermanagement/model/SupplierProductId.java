package com.sb.suppliermanagement.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class SupplierProductId implements Serializable{
	
	private Supplier supplierid;
	private Product productid;
	

}
