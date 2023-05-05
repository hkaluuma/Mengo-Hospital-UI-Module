package org.openmrs.module.covidsymptom.api.dao;

import java.util.List;

import org.openmrs.module.covidsymptom.Covidsymptom;
import org.springframework.stereotype.Repository;

@Repository("covidsymptom.CovidsymptomDao")
public interface CovidsymptomDao {
	
	List<Covidsymptom> getAllSymptoms();
	
	Covidsymptom getSymptom(Integer symptomId);
	
	Covidsymptom saveSymptom(Covidsymptom symptom);
	
	void purgeSymptom(Covidsymptom symptom);
	
}
