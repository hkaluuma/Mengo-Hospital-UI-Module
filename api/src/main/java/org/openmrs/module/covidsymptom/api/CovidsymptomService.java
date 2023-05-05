package org.openmrs.module.covidsymptom.api;

import java.util.List;
import org.openmrs.api.OpenmrsService;
import org.openmrs.module.covidsymptom.Covidsymptom;
import org.springframework.transaction.annotation.Transactional;

public interface CovidsymptomService extends OpenmrsService {
	
	@Transactional(readOnly = true)
	List<Covidsymptom> getAllSymptoms();
	
	@Transactional(readOnly = true)
	Covidsymptom getSymptom(Integer symptomId);
	
	Covidsymptom saveSymptom(Covidsymptom symptom);
	
	void purgeSymptom(Covidsymptom symptom);
}
