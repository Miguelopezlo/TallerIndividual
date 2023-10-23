package com.sb.suppliermanagement.model;


import java.io.Serializable;
import java.time.LocalTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="contract", schema="APP_M_PROV_SELECC")
public class Contract implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2814708347276000292L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contracts_secuence")
	@SequenceGenerator(name = "contracts_secuence", sequenceName = "contracts_secuence", allocationSize = 1)
	@Column(name="contractid")
	Long contractid;
	
	@Column(name="contractdescription")
	String contractdescription;
	
	@Column(name="startdate")
	LocalTime startdate;
	
	@Column(name="finishdate")
	LocalTime finishdate;
	
	@Column(name="contractstate")
	String contractstate;
	
	@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "productid")
	private Product productid;
    
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "supplierid")
	private Supplier supplierid;

}
