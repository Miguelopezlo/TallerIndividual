package com.sb.suppliermanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="selectionactivity", schema="APP_M_PROV_SELECC")
public class SelectionActivity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "selectionactivity_secuence")
	@SequenceGenerator(name = "selectionactivity_secuence", sequenceName = "selectionactivity_secuence", allocationSize = 1)
	@Column(name="activityid")
	Long activityid;
	
	@Column(name="activityname")
	String activityname;
	
    @ManyToOne
    @JoinColumn(name = "responsibleareaid")
	private ResponsibleArea responsibleareaid;
	
}
