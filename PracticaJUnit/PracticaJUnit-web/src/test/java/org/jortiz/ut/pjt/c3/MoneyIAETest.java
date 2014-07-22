/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @date Jul 18, 2014
 * @author Jortizp 
 * @mail <jortizp@intergrupo.com>
 */
@RunWith(JUnitParamsRunner.class)
public class MoneyIAETest {

    private final static int VALID_AMOUNT = 5;
    private final static String VALID_CURRENCY = "USD";
    
    private static final Object[] getInvalidAmount(){
        return new Integer[][]{{-2},{-15},{-4}};
    }
    
    /**
     * Parameterized test that checks for expected exceptions.
     * @param invalidAmount 
     */
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidAmount")
    public void constructorDebeLanzarIAEParaAmountInvalido(int invalidAmount){
        new Money(invalidAmount, VALID_CURRENCY);
    }
    
    private static final Object[] getInvalidCurrency(){
        return new String[][]{{null},{""}};
    }
    
    /**
     * Parameterized test that checks for expected exceptions.
     * @param invalidCurrency 
     */
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getInvalidCurrency")
    public void constructorDebeLanzarIAEParaCurrencyInvalida(String invalidCurrency){
        new Money(VALID_AMOUNT, invalidCurrency);
    }
    
}
