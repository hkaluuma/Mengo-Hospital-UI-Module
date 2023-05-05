package org.openmrs.module.covidsymptom;

import java.io.Serializable;

import org.openmrs.BaseOpenmrsObject;

public class Covidsymptom extends BaseOpenmrsObject implements Serializable {
	
	//variables below
	private static final long serialVersionUID = 1L;
	
	private Integer symptomId;
	
	private String name;
	
	private String description;
	
	@Override
	public Integer getId() {
		throw new UnsupportedOperationException("Unimplemented method 'getId'");
	}
	
	@Override
	public void setId(Integer arg0) {
		
		throw new UnsupportedOperationException("Unimplemented method 'setId'");
	}
	
	public Integer getSymptomId() {
		return symptomId;
	}
	
	public void setSymptomId(Integer symptomId) {
		this.symptomId = symptomId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
}
