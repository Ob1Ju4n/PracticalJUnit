/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt;

import java.math.BigDecimal;
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

    public static final Object[] getValores(){
        return $(1);
    }
    
    @Test
    @Parameters(method = "getValores" )
    public void calcularPromedioDebeSerUno(Integer... args){
        
        int expectedResult = args.length;
        assertEquals(expectedResult, StatisticsUtils.calcularPromedio(args));
    
    }
    
    public static final Object[] getValoresInvalidos(){
        return new Object[]{new Object[]{}, null};
    }
    
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getValoresInvalidos")
    public void calcularPromedioDebeLanzarIAECuandoValoresDeEntradaInvalidos(Integer... args){
        StatisticsUtils.calcularPromedio(args);
    }
    
}
