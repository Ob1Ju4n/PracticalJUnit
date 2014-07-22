/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @date Jul 17, 2014
 * @author Jortizp 
 * @mail <jortizp@intergrupo.com>
 */
public class MoneyTest {

    @Test //Indicates that this is a test method
    public void constructorDebeEstablecerValorYMoneda(){

        /**
         * Concepcion de un test.
         * 1. Declarar las entradas del SUT
         * 2. Poner a prueba el SUT
         * 3. Evaluar las respuestas
         */
        
        //1.
        int amount = 10;
        String currency = "USD";
        
        //2.
        Money money = new Money(amount, currency);
        
        //3.
        assertEquals(10, money.getAmount());
        assertEquals("USD", money.getCurrency());
        
    }
    
}
