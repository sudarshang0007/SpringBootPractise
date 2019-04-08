package com.sud.firstJunit.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class RestTemplateApplicationTest {

	@Test
	public void testGetTemplate() {
		RestTemplateApplication applicaation1 = new RestTemplateApplication();
		RestTemplateApplication applicaation2 = new RestTemplateApplication();
		assertNotEquals(applicaation1.getTemplate(),applicaation2.getTemplate());
	}

}
