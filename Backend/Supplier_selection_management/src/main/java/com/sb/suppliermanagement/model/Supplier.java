package com.sb.suppliermanagement.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="supplier", schema="APP_M_PROV_SELECC")
public class Supplier {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplier_secuence")
	@SequenceGenerator(name = "supplier_secuence", sequenceName = "supplier_secuence", allocationSize = 1)
	@Column(name="supplierid")
	Long supplierid;
	
	@Column(name="companyname")
	String companyname;
	
	@Column(name="contact")
	String contact;
	
	@Column(name="celphone")
	String celphone;
	
	@Column(name="email")
	String email;
	
	@Column(name="score")
	String score;
	
	@Column(name="city")
	String city;
	
	
	@OneToMany(mappedBy = "supplierid")
	private List<SupplierProductv1> supplier;
	
	@OneToMany(mappedBy = "supplierid")
	private List<Contract> contract;

}
