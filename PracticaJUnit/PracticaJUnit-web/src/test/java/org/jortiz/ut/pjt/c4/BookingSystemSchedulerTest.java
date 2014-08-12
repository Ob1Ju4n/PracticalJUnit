/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c4;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 *
 * @author juan.ortiz
 */
@RunWith(JUnitParamsRunner.class)
public class BookingSystemSchedulerTest {

    protected Bookable bookable;

    @Rule
    public ExpectedException exception;

    @Before
    public void setUp(){

        bookable = new Bookable();
        exception = ExpectedException.none();
    }

    @Test
    public void shouldCreateResourceToBookTo(){
        assertTrue(bookable != null);
    }

    private Object[] getInvalidHours(){
        return new Object[]{"6", "254.89", "0", "19", "abc", "Juan", "7:30", "22:50", "13:30"};
    }

    /**
     * A regular hour is:
     * - Any hour between the interval [7-18]
     * - It should be an integer
     */
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidHours")
    public void shouldThrowExceptionForInvalidHours(String hour){

        exception.expect(IllegalArgumentException.class);
        exception.expectMessage("La hora ingresada es invalida.");
        bookable.validateHour(hour);

    }

    private Object[] getValidHours(){
        return new Object[]{"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17"};
    }

    @Test
    @Parameters(method = "getValidHours")
    public void shouldBookAGivenHour(String hour){

        bookable.bookHour(hour);
        assertTrue(bookable.isBooked(hour));

    }

    @Test
    public void shouldReturnAListOfBookedHours(){

        bookable.bookHour("7");
        bookable.bookHour("8");
        bookable.bookHour("9");

        List<String> bookedHours = bookable.getBookedHours();

        assertTrue(bookedHours.contains("7"));
        assertTrue(bookedHours.contains("8"));
        assertTrue(bookedHours.contains("9"));

    }
    
    public void shouldRestrictDoubleBookingForAGivenHour(){}
    
}
