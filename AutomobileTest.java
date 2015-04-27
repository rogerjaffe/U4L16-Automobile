

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AutomobileTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AutomobileTest
{
    /**
     * Default constructor for test class Tester
     */
    public AutomobileTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testConstructor()
    {
        Automobile automobi1 = new Automobile(10, 100);
        assertEquals("testConstructor: mpg", 10.0, automobi1.mpg, 0.1);
        assertEquals("testConstructor: gallons", 0, automobi1.gallons, 0.1);
        assertEquals("testConstructor: capacity", 100.0, automobi1.capacity, 0.1);
    }

    @Test
    public void testReportFuel()
    {
        Automobile automobi1 = new Automobile(10, 20);
        assertEquals("testReportFuel1: empty tank", 0, automobi1.reportFuel(), 0.1);
        automobi1.addFuel(2.8);
        assertEquals("testReportFuel2: added fuel", 2.8, automobi1.reportFuel(), 0.1);
    }

    @Test
    public void testAddFuel()
    {
        Automobile automobi1 = new Automobile(10, 20);
        automobi1.addFuel(15);
        assertEquals("testAddFuel: positive", 15, automobi1.reportFuel(), 0.1);
        automobi1.addFuel(-5);
        assertEquals("testAddFuel: negative", 15, automobi1.reportFuel(), 0.1);
    }

    @Test
    public void testTakeTrip()
    {
        Automobile automobi1 = new Automobile(10, 20);
        automobi1.fillUp();
        assertEquals("testTakeTrip1: 50 mile trip, drive 50 miles", 50, automobi1.takeTrip(50), 0.1);
        assertEquals("testTakeTrip2: partial tank left", 15, automobi1.reportFuel(), 0.1);
        assertEquals("testTakeTrip3: partial trip taken", 150, automobi1.takeTrip(1000), 0.1);
        assertEquals("testTakeTrip4: ran it dry", 0, automobi1.reportFuel(), 0.1);
    }

    @Test
    public void testFillUp1()
    {
        Automobile automobi1 = new Automobile(10, 20);
        assertEquals("testFillUp1: empty tank", 20, automobi1.fillUp(), 0.1);
        Automobile automobi2 = new Automobile(10, 20);
        automobi2.addFuel(5.3);
        assertEquals("testFillUp2: part-empty tank", 14.7, automobi2.fillUp(), 0.1);
    }

}








