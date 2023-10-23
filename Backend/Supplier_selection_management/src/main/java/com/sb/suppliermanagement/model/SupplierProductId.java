package com.sb.suppliermanagement.model;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;




@Embeddable
public class SupplierProductId implements Serializable{

	@Column(name = "supplierid")
	private Supplier supplierid;
	
	@Column(name = "productid")
	private Product productid;
	

}
