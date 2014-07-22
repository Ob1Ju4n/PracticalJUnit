/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @date Jul 18, 2014
 * @author Jortizp 
 * @mail <jortizp@intergrupo.com>
 */
public class StatisticsUtils {

    public static int calcularPromedio(Integer... args) throws IllegalArgumentException{
        
        if(args == null || args.length == 0){
            throw new IllegalArgumentException("Parameter list is invalid.");
        }

        int sumatoria = 0;
        int counter = 0;
        
        for(int number : args){
        
            sumatoria += number;
            counter++;
            
        }
        
        return sumatoria/counter;
        
    }
    
}
