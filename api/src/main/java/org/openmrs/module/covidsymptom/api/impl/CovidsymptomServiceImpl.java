package org.openmrs.module.covidsymptom.api.impl;

import java.util.List;
import org.openmrs.api.UserService;
import org.openmrs.api.impl.BaseOpenmrsService;
import org.openmrs.module.covidsymptom.Covidsymptom;
import org.openmrs.module.covidsymptom.api.CovidsymptomService;
import org.openmrs.module.covidsymptom.api.dao.CovidsymptomDao;

public class CovidsymptomServiceImpl extends BaseOpenmrsService implements CovidsymptomService {
	
	CovidsymptomDao dao;
	
	UserService userService;
	
	/**
	 * Injected in moduleApplicationContext.xml
	 */
	public void setDao(CovidsymptomDao dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Covidsymptom> getAllSymptoms() {
		return dao.getAllSymptoms();
	}
	
	@Override
	public Covidsymptom getSymptom(Integer symptomId) {
		return dao.getSymptom(symptomId);
	}
	
	@Override
	public Covidsymptom saveSymptom(Covidsymptom symptom) {
		return dao.saveSymptom(symptom);
	}
	
	@Override
	public void purgeSymptom(Covidsymptom symptom) {
		dao.purgeSymptom(symptom);
	}
	
}
