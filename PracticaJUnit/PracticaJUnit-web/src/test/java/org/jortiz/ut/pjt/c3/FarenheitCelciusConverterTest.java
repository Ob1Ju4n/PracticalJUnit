/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import java.util.Map;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.*;
import static junitparams.JUnitParamsRunner.$;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @date Jul 23, 2014
 * @author Jortizp
 * @mail <jortizp@intergrupo.com>
 */
@RunWith(JUnitParamsRunner.class)
public class FarenheitCelciusConverterTest {

    public Object[] getToFarenheitValues(){
        return $($(32,0),$(98,37),$(212,100));
    }
    
    @Test
    @Parameters(method = "getToFarenheitValues")
    public void shouldConvertCelciusToFarenheit(Object[] values){
        assertEquals(values[0], FarenheitCelciusConverter.toFarenheit((Integer)values[1]));
    }
    
    public Object[] getToCelciusValues(){
        return $($(0,32),$(37,100),$(100,212));
    }
    
    @Test
    @Parameters(method = "getToCelciusValues")
    public void shouldConvertFarenheitToCelcius(Object[] values){
        assertEquals(values[1], FarenheitCelciusConverter.toCelcius((Integer)values[0]));
    }
    
}