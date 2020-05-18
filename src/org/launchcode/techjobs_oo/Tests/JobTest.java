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
}


    //5) Use TDD to Build The toString Method
    //Create First Test for toString




    //Test the Empty Constructor
//    Job test_job_one;
//    Job test_job_two;
//    Job test_job_three;
//
//    @BeforeEach
//    public void setUp() {
//         test_job_one = new Job("Bob", new Employer("Hardies"), new Location("Dallas"), new PositionType("NightShift"), new CoreCompetency("Sweeping"));
//         test_job_two = new Job("Bob", new Employer("Hardies"), new Location("Dallas"), new PositionType("NightShift"), new CoreCompetency("Sweeping"));
//         test_job_three = new Job("Bob", new Employer(), new Location("Dallas"), new PositionType(), new CoreCompetency("Sweeping"));
//    }
//    @AfterEach
//    void tearDown() {
//    }
//    @Test
//    public void IdShouldIncrement() {
//
//
//        assertFalse(test_job_one.getId() == test_job_two.getId());
//        assertTrue(test_job_two.getId() == test_job_one.getId() + 1);
//    }
//    @Test
//    public void testJobsForEquality() {
//
//        assertFalse(test_job_one.equals(test_job_two));
//    }
//    @Test
//    public void testJobConstructorSetsAllFields() {
//
//        assertEquals("Bob" ,test_job_one.getName());
//        assertEquals("Hardies" , test_job_one.getEmployer().getValue());
//        assertEquals("Dallas" , test_job_one.getLocation().getValue());
//        assertEquals("NightShift" ,test_job_one.getPositionType().getValue());
//        assertEquals("Sweeping", test_job_one.getCoreCompetency().getValue());
//    }




