package com.sb.suppliermanagement.model;


import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@IdClass(SupplierProductId.class)
@Table(name="supplierproductv1", schema="APP_M_PROV_SELECC")
public class SupplierProductv1{
	
	@Id
	@ManyToOne(optional=false)
	@JoinColumn(name = "supplierid")
	@ToString.Exclude
	private Supplier supplierid;
	@Id
	@ManyToOne(optional=false)
	@JoinColumn(name = "productid")
	@ToString.Exclude
	private Product productid;

}

