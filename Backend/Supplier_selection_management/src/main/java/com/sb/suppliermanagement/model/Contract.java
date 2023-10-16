package com.sb.suppliermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="contract", schema="APP_M_PROV_SELECC")
public class Contract {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contracts_secuence")
	@SequenceGenerator(name = "contracts_secuence", sequenceName = "contracts_secuence", allocationSize = 1)
	@Column(name="contractid")
	int contractid;
	

}
