/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @date Jul 18, 2014
 * @author Jortizp 
 * @mail <jortizp@intergrupo.com>
 */

@RunWith(JUnitParamsRunner.class)
public class StatisticsUtilsParameterizedTest {

    private static Object[] getValores(){
    
        Object[] objects = new Object[5];
        objects[0] = new Object[]{new Integer[]{1}};
        objects[1] = new Object[]{new Integer[]{1,1}};
        objects[2] = new Object[]{new Integer[]{1,1,1}};
        objects[3] = new Object[]{new Integer[]{1,1,1,1}};
        objects[4] = new Object[]{new Integer[]{1,1,1,1,1}};
        
        return objects;
        
    }
    
    @Test
    @Parameters(method = "getValores" )
    public void calcularPromedioDebeSerUno(Integer... args){
        
        int expectedResult = 1;
        assertEquals(expectedResult, StatisticsUtils.calcularPromedio(args));
    
    }
    
    public static final Object getValoresInvalidos(){
        return new Object[]{null, new Object[]{new Integer[]{}}};
    }
    
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getValoresInvalidos")
    public void calcularPromedioDebeLanzarIAECuandoValoresDeEntradaInvalidos(Integer... args){
        StatisticsUtils.calcularPromedio(args);
    }
    
}
