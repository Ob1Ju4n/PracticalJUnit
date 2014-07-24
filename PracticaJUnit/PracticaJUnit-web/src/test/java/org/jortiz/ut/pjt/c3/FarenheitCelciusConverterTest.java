/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import static org.junit.Assert.*;
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
        
        Object[] objects = new Object[3];
        objects[0] = new Object[]{new Object[]{32,0}};
        objects[1] = new Object[]{new Object[]{98,37}};
        objects[2] = new Object[]{new Object[]{212,100}};
        return objects;
        
    }
    
    @Test
    @Parameters(method = "getToFarenheitValues")
    public void shouldConvertCelciusToFarenheit(Object[] values){
        assertEquals(values[0], FarenheitCelciusConverter.toFarenheit((Integer)values[1]));
    }
    
    public Object[] getToCelciusValues(){
        
        Object[] objects = new Object[3];
        objects[0] = new Object[]{new Object[]{0,32}};
        objects[1] = new Object[]{new Object[]{37,100}};
        objects[2] = new Object[]{new Object[]{100,212}};
        return objects;
        
    }
    
    @Test
    @Parameters(method = "getToCelciusValues")
    public void shouldConvertFarenheitToCelcius(Object[] values){
        assertEquals(values[0], FarenheitCelciusConverter.toCelcius((Integer)values[1]));
    }
    
}