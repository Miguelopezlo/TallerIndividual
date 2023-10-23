package com.sb.suppliermanagement.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter @Setter
@AllArgsConstructor
@Table(name="product", schema="APP_M_PROV_SELECC")
public class Product{


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_secuence")
	@SequenceGenerator(name = "product_secuence", sequenceName = "product_secuence", allocationSize = 1)
	@Column(name="productid")
	Long productid;
	
	@Column(name="productname")
	String productname;
	
	@Column(name="averageprice")
	Number averageprice;
	
	@JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activityid")
	private SelectionActivity activityid;
	
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "selectioncriteriaid")
	private SelectionCriteria selectioncriteriaid;

    @JsonIgnore
	@OneToMany(mappedBy = "productid")
	private List<Contract> product;
	
	@JsonIgnore
	@OneToMany(mappedBy = "productid")
	private List<SupplierProductv1> productsupplier;

	
	
    
}
