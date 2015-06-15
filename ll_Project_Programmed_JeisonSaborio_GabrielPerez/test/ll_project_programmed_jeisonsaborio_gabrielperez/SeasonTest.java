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
public class SeasonTest {
    private Season season;
    public SeasonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        season = new Season(); 
    }
    
    @After
    public void tearDown() {
        season = null;
    }

    /**
     * Test of getName method, of class Season.
     */
    @Test
    public void testGetName() {
        System.out.println("GetName");
        String expResult = "Green season";
        season.setName(expResult);
        String result = season.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Season.
     */
    @Test
    public void testSetName() {
        System.out.println("SetName");
        String expResult = "Green season";
        season.setName(expResult);
        String result = season.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCode method, of class Season.
     */
    @Test
    public void testGetCode() {
        System.out.println("GetCode");
        String expResult = "123AC";
        season.setCode(expResult);
        String result = season.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCode method, of class Season.
     */
    @Test
    public void testSetCode() {
        System.out.println("SetCode");
        String expResult = "123AC";
        season.setCode(expResult);
        String result = season.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStartDate method, of class Season.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("GetStartDate");
        String expResult = "10/06/2015";
        season.setStartDate(expResult);
        String result = season.getStartDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStartDate method, of class Season.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("SetStartDate");
        String expResult = "10/06/2015";
        season.setStartDate(expResult);
        String result = season.getStartDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFinalDate method, of class Season.
     */
    @Test
    public void testGetFinalDate() {
        System.out.println("GetFinalDate");
        String expResult = "08/07/2015";
        season.setFinalDate(expResult);
        String result = season.getFinalDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFinalDate method, of class Season.
     */
    @Test
    public void testSetFinalDate() {
        System.out.println("SetFinalDate");
        String expResult = "08/07/2015";
        season.setFinalDate(expResult);
        String result = season.getFinalDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmount method, of class Season.
     */
    @Test
    public void testGetAmount() {
        System.out.println("GetAmount");
        int expResult = 50;
        season.setAmount(expResult);
        int result = season.getAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmount method, of class Season.
     */
    @Test
    public void testSetAmount() {
         System.out.println("SetAmount");
        int expResult = 50;
        season.setAmount(expResult);
        int result = season.getAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTypeRoom method, of class Season.
     */
    @Test
    public void testGetTypeRoom() {
        System.out.println("GetTypeRoom");
        String expResult = "Individual";
        season.setTypeRoom(expResult);
        String result = season.getTypeRoom();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTypeRoom method, of class Season.
     */
    @Test
    public void testSetTypeRoom() {
        System.out.println("SetTypeRoom");
        String expResult = "Suite";
        season.setTypeRoom(expResult);
        String result = season.getTypeRoom();
        assertEquals(expResult, result);
    }
    
}
