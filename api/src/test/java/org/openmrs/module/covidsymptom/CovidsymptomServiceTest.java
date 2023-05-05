/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.covidsymptom;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.openmrs.User;
import org.openmrs.api.UserService;
// import org.openmrs.module.covidsymptom.Item;
import org.openmrs.module.covidsymptom.api.dao.CovidsymptomDao;
import org.openmrs.module.covidsymptom.api.impl.CovidsymptomServiceImpl;
import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * This is a unit test, which verifies logic in CovidsymptomService. It doesn't extend
 * BaseModuleContextSensitiveTest, thus it is run without the in-memory DB and Spring context.
 */
public class CovidsymptomServiceTest {
	
	@InjectMocks
	CovidsymptomServiceImpl basicModuleService;
	
	@Mock
	CovidsymptomDao dao;
	
	@Mock
	UserService userService;
	
	@Before
	public void setupMocks() {
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void saveItem_shouldSetOwnerIfNotSet() {
		//Given
		Item item = new Item();
		item.setDescription("some description");
		
		User user = new User();
		when(userService.getUser(1)).thenReturn(user);
		
		//Then
		assertThat(item, hasProperty("owner", is(user)));
	}
}
