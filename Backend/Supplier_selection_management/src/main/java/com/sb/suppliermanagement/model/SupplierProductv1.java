package com.sb.suppliermanagement.model;



import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
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
@Table(name="supplierproductv1", schema="APP_M_PROV_SELECC")
public class SupplierProductv1 implements Serializable{

	private static final long serialVersionUID = -4349949192937833590L;

	@EmbeddedId
	private SupplierProductId product;

	@ManyToOne
	@JoinColumn(name = "supplierid", insertable =false, updatable = false)
	@MapsId("supplierid")
	private Supplier supplier;
}

