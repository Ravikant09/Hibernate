package com.kantravi.hibernate;

import java.util.Set;

public class Course {

	private Integer cid;
	private String cName;
	private Integer duration;
	private Double cost;

	private Set<Student> students;

	
	public Course() {}
	
	
	public Course(Integer cid, String cName, Integer duration, Double cost) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.duration = duration;
		this.cost = cost;
	}
	public Course(String cName, Integer duration, Double cost) {
		this.cName = cName;
		this.duration = duration;
		this.cost = cost;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cName=" + cName + ", duration=" + duration + ", cost=" + cost + "]";
	}
	
	
}
