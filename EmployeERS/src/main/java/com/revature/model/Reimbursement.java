package com.revature.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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


public class Reimbursement {
	
	private Long id;
	private double amount;
	private Date submitedDate;
	private Date resolvedDate;
	private String description;
	private Long author;
	private Long resolver;
	private ReimbursementStatus status;
	private ReimbursementType type;
	
	

}
