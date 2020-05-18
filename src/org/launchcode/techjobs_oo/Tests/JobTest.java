package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.launchcode.techjobs_oo.*;
import org.junit.Before;

import java.awt.datatransfer.DataFlavor;

import static org.junit.Assert.*;

public class JobTest {

    //Test the Empty Constructor
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertEquals(job1.getId() + 1, job2.getId());
    }

    //Test the Full Constructor
    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    @Test
    public void testJobConstructorSetsAllFields() {// public Job(int id, String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency)
        //Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", testJob.getName());
        //assertTrue(testJob.getEmployer().equals(new Employer("ACME")));
        assertEquals("ACME", testJob.getEmployer().getValue());
        assertEquals("Desert", testJob.getLocation().getValue());
        assertEquals("Quality control", testJob.getPositionType().getValue());
        assertEquals("Persistence", testJob.getCoreCompetency().getValue());
    }

    //Test the equals Method
    @Test
    public void testJobsForEquality() {
        Job testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //Both of the following statements instantiate variables that are assigned using "expressions":
        //int expressionTharReturnsInt = testJobOne.getId(); //this returns an int, so it's not a "condition"
        //boolean expressionThatReturnsTrueOrFalse = testJobOne.equals(testJobTwo); //This returns boolean, so it's called a "condition".
        //The assertFalse() methods takes a "condition", which is an expression that expresses a true-or-false boolean value.
        //NOTE: We expect the id field to be different, so the equals() method should return false.
        assertFalse(testJobOne.equals(testJobTwo)); //What property is different? (When I say "property", I mean any field returned by a getter.)
    }

    //5) Use TDD to Build The toString Method
    //Create First Test for toString
    @Test
    public void testToString() {
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expectedString = "ID: " + testJob.getId()
                + "\nName: " + testJob.getName()
                + "\nEmployer: " + testJob.getEmployer()
                + "\nLocation: " + testJob.getLocation()
                + "\nPosition Type: " + testJob.getPositionType()
                + "\nCore Competency: " + testJob.getCoreCompetency();
        assertEquals(expectedString, testJob.toString());
    }

    @Test
    public void testToStringMissingName() {
        //3. Use a setter method on the Job object to change the name, making it empty:
        testJob.setName(null); //This is a different way, perhaps what they mean by "empty".
        //Now change expectedString to reflect what we expect to see:
        String expectedStringTwo =  "ID: " + testJob.getId()
                + "\nName: " + "Data not available"
                + "\nEmployer: " + testJob.getEmployer()
                + "\nLocation: " + testJob.getLocation()
                + "\nPosition Type: " + testJob.getPositionType()
                + "\nCore Competency: " + testJob.getCoreCompetency();
        assertEquals(expectedStringTwo, testJob.toString());
    }

    @Test
    public void testToStringMissingEmployer() {
        testJob.setEmployer(null); //This is a different way, perhaps what they mean by "empty".
        //Now change expectedString to reflect what we expect to see:
        String expectedStringTwo =  "ID: " + testJob.getId()
                + "\nName: " + testJob.getName()
                + "\nEmployer: " + "Data not available"
                + "\nLocation: " + testJob.getLocation()
                + "\nPosition Type: " + testJob.getPositionType()
                + "\nCore Competency: " + testJob.getCoreCompetency();
        assertEquals(expectedStringTwo, testJob.toString());
    }

    @Test
    public void testToStringMissingLocation() {
        testJob.setLocation(null);
        //Now change expectedString to reflect what we expect to see:
        String expectedStringTwo =  "ID: " + testJob.getId()
                + "\nName: " + testJob.getName()
                + "\nEmployer: " + testJob.getEmployer()
                + "\nLocation: " + "Data not available"
                + "\nPosition Type: " + testJob.getPositionType()
                + "\nCore Competency: " + testJob.getCoreCompetency();
        assertEquals(expectedStringTwo, testJob.toString());
    }

    @Test
    public void testToStringMissingPositionType() {
        testJob.setPositionType(null);
        //Now change expectedString to reflect what we expect to see:
        String expectedStringTwo =  "ID: " + testJob.getId()
                + "\nName: " + testJob.getName()
                + "\nEmployer: " + testJob.getEmployer()
                + "\nLocation: " + testJob.getLocation()
                + "\nPosition Type: " + "Data not available"
                + "\nCore Competency: " + testJob.getCoreCompetency();
        assertEquals(expectedStringTwo, testJob.toString());
    }

    @Test
    public void testToStringMissingCoreCompetency() {
        testJob.setCoreCompetency(null);
        //Now change expectedString to reflect what we expect to see:
        String expectedStringTwo =  "ID: " + testJob.getId()
                + "\nName: " + testJob.getName()
                + "\nEmployer: " + testJob.getEmployer()
                + "\nLocation: " + testJob.getLocation()
                + "\nPosition Type: " + testJob.getPositionType()
                + "\nCore Competency: " + "Data not available";
        assertEquals(expectedStringTwo, testJob.toString());
    }
}