/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt;

import junitparams.JUnitParamsRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.Parameters;
import static org.junit.Assert.assertEquals;
import static junitparams.JUnitParamsRunner.$;

/**
 *
 * @date Jul 17, 2014
 * @author Jortizp 
 * @mail <jortizp@intergrupo.com>
 */

@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {

    /**
     * Data providing method.
     * An Object array is always expected as return value in this type of 
     * method.
     * @return Object[]
     */
    public static final Object[] getMoney(){
        return new Object[]{new Object[]{10, "USD"}, new Object[]{15, "EUR"}};
    } 
    
    /**
     * Dollar sign ($) data providing method.
     * No acepta null values
     * @return Object[]
     */
    public static final Object[] getMoneyLessVerbose(){
        return $($(80, "COL"), $(22, "YEN"));
    }
    
    /**
     * Parameterized method.
     * Includes @Parameters annotation.
     * @param amount
     * @param currency 
     */
    @Test
    @Parameters(method = "getMoneyLessVerbose")
    public void constructorDebeEstablecerValorYMoneda(int amount, String currency){
    
        Money money = new Money(amount, currency);
        
        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }
    
}
