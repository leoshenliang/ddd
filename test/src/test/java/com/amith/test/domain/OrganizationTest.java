package com.amith.test.domain;

import static org.junit.Assert.*;

import org.junit.Test;

import com.amith.test.AbstractIntegrationTest;

public class OrganizationTest extends AbstractIntegrationTest {

	@Test
	public void testFindAll() {
		Organization organization = instanceOrganization();
		assertEquals(1, Organization.findAll().size());
		removeOrganization(organization);
	}
	
	@Test
	public void testFindByName() {
		Organization organization = instanceOrganization();
		assertEquals(1, Organization.findByName(ORGANIZATION_NAME).size());
		removeOrganization(organization);
	}
	
	@Test
	public void testFindByName2() {
		Organization organization = instanceOrganization();
		assertEquals(1, Organization.findByName2(ORGANIZATION_NAME).size());
		removeOrganization(organization);
	}
	
	@Test
	public void testCreateChild() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertEquals(child.getParent(), organization);
		assertTrue(organization.getChildRen().contains(child));
		assertEquals(2, getOrganizationDataQuantity());
		removeOrganization(organization, child);
	}
	
	@Test
	public void testCreateChild2() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild2(child);
		assertEquals(child.getParent(), organization);
		assertTrue(organization.getChildRen().contains(child));
		assertEquals(2, getOrganizationDataQuantity());
		removeOrganization(organization, child);
	}
	
	@Test
	public void testHaveChildren() {
		Organization organization = instanceOrganization();
		assertFalse(organization.haveChildren());
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertTrue(organization.haveChildren());
		removeOrganization(organization, child);
	}
	
	@Test
	public void testgetParent() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertEquals(child.getParent(), organization);
		removeOrganization(organization, child);
	}
	
	@Test
	public void testgetParent2() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertEquals(child.getParent2(), organization);
		removeOrganization(organization, child);
	}
	
	@Test
	public void testgetAllParent() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertEquals(1, child.getAllParent().size());
		Organization child2 = new Organization(ORGANIZATION_NAME2);
		child.createChild(child2);
		assertEquals(2, child2.getAllParent().size());
		removeOrganization(organization, child, child2);
	}
	
	@Test
	public void testgetAllParent2() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertEquals(1, child.getAllParent2().size());
		Organization child2 = new Organization(ORGANIZATION_NAME2);
		child.createChild(child2);
		assertEquals(2, child2.getAllParent2().size());
		removeOrganization(organization, child, child2);
	}
	
	@Test
	public void testgetChildRen() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertTrue(organization.getChildRen().contains(child));
		assertEquals(1, organization.getChildRen().size());
		Organization child2 = new Organization(ORGANIZATION_NAME2);
		child.createChild(child2);
		assertFalse(organization.getChildRen().contains(child2));
		removeOrganization(organization, child, child2);
	}
	
	@Test
	public void testgetChildRen2() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertTrue(organization.getChildRen2().contains(child));
		assertEquals(1, organization.getChildRen2().size());
		Organization child2 = new Organization(ORGANIZATION_NAME2);
		child.createChild(child2);
		assertFalse(organization.getChildRen2().contains(child2));
		removeOrganization(organization, child, child2);
	}
	
	@Test
	public void testgetAllChildRen() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertTrue(organization.getAllChildRen().contains(child));
		assertEquals(1, organization.getAllChildRen().size());
		Organization child2 = new Organization(ORGANIZATION_NAME2);
		child.createChild(child2);
		assertTrue(organization.getAllChildRen().contains(child2));
		assertEquals(2, organization.getAllChildRen().size());
		removeOrganization(organization, child, child2);
	}
	
	@Test
	public void testgetAllChildRen2() {
		Organization organization = instanceOrganization();
		Organization child = new Organization(ORGANIZATION_NAME2);
		organization.createChild(child);
		assertTrue(organization.getAllChildRen2().contains(child));
		assertEquals(1, organization.getAllChildRen2().size());
		Organization child2 = new Organization(ORGANIZATION_NAME2);
		child.createChild(child2);
		assertTrue(organization.getAllChildRen2().contains(child2));
		assertEquals(2, organization.getAllChildRen2().size());
		removeOrganization(organization, child, child2);
	}
	
}
