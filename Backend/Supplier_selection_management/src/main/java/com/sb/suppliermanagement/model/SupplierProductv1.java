package com.sb.suppliermanagement.model;



import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class SupplierProductv1 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5851923799558160947L;

	@Id
	@JsonIgnore
	@ManyToOne(optional=false)
	@JoinColumn(name = "supplierid")
	@ToString.Exclude
	private Supplier supplierid;
	
	@Id
	@JsonIgnore
	@ManyToOne(optional=false)
	@JoinColumn(name = "productid")
	@ToString.Exclude
	private Product productid;

}

