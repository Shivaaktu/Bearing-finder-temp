package com.shiva.Bearing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="nbc-price")
public class NbcBearing {
	@Id
	private int size;
	private String name;
	@Column(name="Commonuse", columnDefinition="varchar(250)")
	private String application;
	private int mrp;
	@Column(name="discounnt%")
	private int discount;

}
