package com.sb.suppliermanagement.model;


import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
@Table(name="supplierproductv1", schema="APP_M_PROV_SELECC")
public class SupplierProductv1 {
    @Id
	@JoinColumn(name = "supplierid")
    private Long supplierid;
    
    @Id
    @JoinColumn(name = "productid")
    private Long productid;

}
