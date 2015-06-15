/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll_project_programmed_jeisonsaborio_gabrielperez;

import java.util.ArrayList;
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
public class ReservationTest {
    private Reservation reservation;
    Customer customer = new Customer("Colon","Costa Rica", 756, "Jeison","Saborio",'F', "j", "asd1", "asd1",6345);
    private PersonFactory tf;
    private ArrayList<Room> roomList;
    private ArrayList<String> hostedList;
    
    public ReservationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        reservation = new Reservation();
        roomList = new ArrayList();
        hostedList = new ArrayList();
        tf = new PersonFactory();
       
    }
    
    @After
    public void tearDown() {
        reservation = null;
        tf = null;
        roomList.add(new Room (1,new TypeRoom("Suite",2,12,"asd",true,false,true,false),1233));
        roomList.add(new Room (2,new TypeRoom("Suite",2,12,"asd",true,false,true,false),5500));
        roomList.add(new Room (5,new TypeRoom("Double",2,12,"lol",true,false,true,false),3500));
        hostedList.add("Carlos");
        hostedList.add("Jeison");
        hostedList.add("Gabriel");
        
       
    }

    /**
     * Test of getEntryDate method, of class Reservation.
     */
    @Test
    public void testGetEntryDate() {
        System.out.println("GetEntryDate");
        String expResult = "12/05/2015";
        reservation.setEntryDate(expResult);
        String result = reservation.getEntryDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEntryDate method, of class Reservation.
     */
    @Test
    public void testSetEntryDate() {
        System.out.println("SetEntryDate");
        String expResult = "10/02/2015";
        reservation.setEntryDate(expResult);
        String result = reservation.getEntryDate();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getDepartureDate method, of class Reservation.
     */
    @Test
    public void testGetDepartureDate() {
        System.out.println("GetDepartureDate");
        String expResult = "29/12/2015";
        reservation.setDepartureDate(expResult);
        String result = reservation.getDepartureDate();
        assertEquals(expResult, result);    
    }

    /**
     * Test of setDepartureDate method, of class Reservation.
     */
    @Test
    public void testSetDepartureDate() {
        System.out.println("SetDepartureDate");
        String expResult = "15/10/2010";
        reservation.setDepartureDate(expResult);
        String result = reservation.getDepartureDate();
        assertEquals(expResult, result);  
    }

    /**
     * Test of getNightsDuration method, of class Reservation.
     */
    @Test
    public void testGetNightsDuration() {
        System.out.println("GetNightsDuration");
        int expResult = 3;
        reservation.setNightsDuration(expResult);
        int result = reservation.getNightsDuration();
        assertEquals(expResult, result); 
    }

    /**
     * Test of setNightsDuration method, of class Reservation.
     */
    @Test
    public void testSetNightsDuration() {
        System.out.println("SetNightsDuration");
        int expResult = 3;
        reservation.setNightsDuration(expResult);
        int result = reservation.getNightsDuration();
        assertEquals(expResult, result); 
    }

    /**
     * Test of getRoomsList method, of class Reservation.
     */
    @Test
    public void testGetRoomsList() {
        System.out.println("GetRoomsList");
        reservation.setRoomsList(roomList);
        ArrayList result = reservation.getRoomsList();
        assertEquals(roomList, result); 
    }

    /**
     * Test of setRoomsList method, of class Reservation.
     */
    @Test
    public void testSetRoomsList() {
        System.out.println("SetRoomsList");
        reservation.setRoomsList(roomList);
        ArrayList result = reservation.getRoomsList();
        assertEquals(roomList, result); 
    }

    /**
     * Test of getHostedList method, of class Reservation.
     */
    @Test
    public void testGetHostedList() {
        System.out.println("GetHostedList");
        reservation.setHostedList(hostedList);
        ArrayList result = reservation.getHostedList();
        assertEquals(roomList, result); 
    }

    /**
     * Test of setHostedList method, of class Reservation.
     */
    @Test
    public void testSetHostedList() {
        System.out.println("SetHostedList");
        reservation.setHostedList(hostedList);
        ArrayList result = reservation.getHostedList();
        assertEquals(roomList, result); 
    }

    /**
     * Test of getAmountChildren method, of class Reservation.
     */
    @Test
    public void testGetAmountChildren() {
        System.out.println("GetAmountChildren");
        int expResult = 3;
        reservation.setAmountChildren(expResult);
        int result = reservation.getAmountChildren();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmountChildren method, of class Reservation.
     */
    @Test
    public void testSetAmountChildren() {
        System.out.println("GetAmountChildren");
        int expResult = 3;
        reservation.setAmountChildren(expResult);
        int result = reservation.getAmountChildren();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmountAdults method, of class Reservation.
     */
    @Test
    public void testGetAmountAdults() {
        System.out.println("GetAmountAdults");
        int expResult = 2;
        reservation.setAmountAdults(expResult);
        int result = reservation.getAmountAdults();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAmountAdults method, of class Reservation.
     */
    @Test
    public void testSetAmountAdults() {
        System.out.println("GetAmountAdults");
        int expResult = 2;
        reservation.setAmountAdults(expResult);
        int result = reservation.getAmountAdults();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCustomer method, of class Reservation.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("GetCustomer"); 
        
        reservation.setCustomer(customer);
        Person result = reservation.getCustomer();
        assertEquals(customer, result);
    }

    /**
     * Test of setCustomer method, of class Reservation.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("SetCustomer"); 
       
        reservation.setCustomer(customer);
        Person result = reservation.getCustomer();
        assertEquals(customer, result);
    }

    /**
     * Test of isPaid method, of class Reservation.
     */
    @Test
    public void testIsPaid() {
        System.out.println("IsPaid");
        boolean expResult = false;
        reservation.setPaid(expResult);
        boolean result = reservation.isPaid();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPaid method, of class Reservation.
     */
    @Test
    public void testSetPaid() {
        System.out.println("SetPaid");
        boolean expResult = false;
        reservation.setPaid(expResult);
        boolean result = reservation.isPaid();
        assertEquals(expResult, result);
    }

 
}
