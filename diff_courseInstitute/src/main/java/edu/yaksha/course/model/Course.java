package edu.yaksha.course.model;

public class Course {
	
	private Integer id;
	private String name;
	private Integer monthDuration;
	private Double fee;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(Integer id, String name, Integer monthDuration, Double fee) {
		super();
		this.id = id;
		this.name = name;
		this.monthDuration = monthDuration;
		this.fee = fee;
	}
	
	public Course(String name, Integer monthDuration, Double fee) {
		super();
		this.name = name;
		this.monthDuration = monthDuration;
		this.fee = fee;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMonthDuration() {
		return monthDuration;
	}
	public void setMonthDuration(Integer monthDuration) {
		this.monthDuration = monthDuration;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}

  
}
