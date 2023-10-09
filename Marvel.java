package com.hibernate.MCU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Marvel_Heros")
public class Marvel 
{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private long id;
	@Column(name="Heros_Name")
	private String name;
	@Column(name="Heros_weapons")
	private String weapons;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setNmae(String name) {
		this.name = name;
	}

	public String getweapons() {
		return weapons;
	}

	public void setweapons(String weapons) {
		this.weapons = weapons;
	}

	@Override
	public String toString() {
		return "Marvel [id=" + id + ", title=" + name + ", weapons=" + weapons + "]";
	}

	public Marvel(String title, String weapons) {
		super();
		this.name = title;
		this.weapons = weapons;
	}

	public Marvel() {
		super();
	}
	
}
