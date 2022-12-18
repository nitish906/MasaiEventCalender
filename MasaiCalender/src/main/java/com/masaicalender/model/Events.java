package com.masaicalender.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Events {

	
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private Integer id;
	
	private LocalDate start_Date;
	private LocalDate end_Date;
	private String message;
	

//	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;

	
}
