package com.sb.suppliermanagement.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
public class Product implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 91834862309904618L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_secuence")
	@SequenceGenerator(name = "product_secuence", sequenceName = "product_secuence", allocationSize = 1)
	@Column(name="productid")
	Long productid;
	
	@Column(name="productname")
	String productname;
	
	@Column(name="averageprice")
	int averageprice;
	

    @ManyToOne
    @JoinColumn(name = "activityid")
	private SelectionActivity activityid;


    @ManyToOne
    @JoinColumn(name = "selectioncriteriaid")
	private SelectionCriteria selectioncriteriaid;

    @JsonIgnore
	@OneToMany(mappedBy = "productid", cascade=CascadeType.PERSIST)
	private List<Contract> product;
	
}
