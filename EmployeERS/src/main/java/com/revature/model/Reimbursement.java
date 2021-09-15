package com.revature.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "reimbursement")

public class Reimbursement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private double amount;
	@Column
	private Date submitedDate;
	@Column
	private Date resolvedDate;
	@Column
	private String description;
	@Column
	private Long author;
	@Column
	private Long resolver;
	@Enumerated(EnumType.STRING)
	private ReimbursementStatus status;
	@Enumerated(EnumType.STRING)
	private ReimbursementType type;
	
	

}
