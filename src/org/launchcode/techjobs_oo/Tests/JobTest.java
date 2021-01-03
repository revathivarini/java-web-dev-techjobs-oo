package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

     Job test_job;
      Job newJob;


    @Test
    public void testSettingJobId(){
         test_job = new Job();//Empty Constructor
         newJob = new Job();
         assertTrue(newJob.getId() - test_job.getId() == 1);
        assertFalse(newJob.getId() == test_job.getId());
        assertEquals(1, newJob.getId()- test_job.getId(),.001);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        //assertTrue(test_job.getName() == "Product tester");
        assertTrue(test_job.getEmployer() instanceof Employer);
    }

    @Test
    public void testsJobForEquality(){
        newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        test_job = new Job("Product ", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        assertFalse(newJob.equals(test_job));
    }

//    @Test
//    public void testsJobToString(){
//        newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
//        test_job = new Job("Product ", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
//        //System.out.println(newJob.toString());
//        //String expected = "";
//        assertEquals("ID: 1\n" +
//                "Name: Product tester\n" +
//                "Employer: ACME\n" +
//                "Location: Desert\n" +
//                "PositionType: Quality Control\n" +
//                "CoreCompetency: Persistence", newJob.toString());
//    }
        @Test
        public void testsJobFirstTestToString(){
          newJob = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"),new CoreCompetency("Persistence"));
          assertTrue(newJob.toString().startsWith("\n"));
          assertTrue(newJob.toString().endsWith("\n"));
        }

        @Test
        public void testsJobSecTestToString(){
            newJob = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"),new CoreCompetency("Persistence"));
            assertTrue(newJob.toString().contains("ID: "+ newJob.getId()));
            }

        @Test
        public void testsThirdJobToString(){
            newJob = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"),new CoreCompetency("Persistence"));
            assertEquals("\n"+"ID: 1\n" +
                "Name: Product tester\n" +
                "Employer: ACME\n" +
                "Location: Desert\n" +
                "PositionType: Quality Control\n" +
                "CoreCompetency: Persistence"+"\n", newJob.toString());
        }
}

