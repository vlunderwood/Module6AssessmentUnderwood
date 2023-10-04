package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "animals")
@Table(name = "animals")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowId;
	
	//instance variables
	private String animalName;
	private double weight;
	private double length;
	@ManyToOne
	@JoinColumn(name = "ZOOID", nullable=false)
	private Zoo zoo = new Zoo();
	//default no arg constructor
		public Animal() {}
	
	//getters and setters
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public int getRowId() {
		return rowId;
	}
	public void setRowId(int rowId) {
		this.rowId = rowId;
	}
	
	public Zoo getZoo() {
		return zoo;
	}

	public void setZoo(Zoo zoo) {
		this.zoo = zoo;
	}
}