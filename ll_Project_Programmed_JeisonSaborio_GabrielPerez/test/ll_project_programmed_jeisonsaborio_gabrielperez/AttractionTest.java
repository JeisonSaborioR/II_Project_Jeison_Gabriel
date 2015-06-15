/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll_project_programmed_jeisonsaborio_gabrielperez;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jeison
 */
public class AttractionTest {
    private Attraction attraction;
    public AttractionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        attraction = new Attraction();
    }
    
    @After
    public void tearDown() {
        attraction = null;
        
    }

    /**
     * Test of getCode method, of class Attraction.
     */
    @Test
    public void testGetCode() {
        System.out.println("GetCode");
        String expResult = "123C";
        attraction.setCode(expResult);
        String result = attraction.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCode method, of class Attraction.
     */
    @Test
    public void testSetCode() {
        System.out.println("SetCode");
        String expResult = "abc12";
        attraction.setCode(expResult);
        String result = attraction.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getName method, of class Attraction.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        String expResult = "Seaview";
        attraction.setName(expResult);
        String result = attraction.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Attraction.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String expResult = "National parks";
        attraction.setName(expResult);
        String result = attraction.getName();
        assertEquals(expResult, result);
    }
    
}
