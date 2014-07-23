/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

/**
 * @date Jul 23, 2014
 * @author Jortizp
 * @mail <jortizp@intergrupo.com>
 */
public class FarenheitCelciusConverter {

    
    private static final int SCALE_DIFF = 32;
    private static final double MULTIPLICAND = 1.8;
    
    public static int toCelcius(int degrees){
        
        Double result = (degrees-SCALE_DIFF)/MULTIPLICAND;
        return result.intValue();
        
    }
    
    public static int toFarenheit(int degrees){
        
        Double result = (degrees*MULTIPLICAND)+SCALE_DIFF;
        return result.intValue();
        
    }
    
}