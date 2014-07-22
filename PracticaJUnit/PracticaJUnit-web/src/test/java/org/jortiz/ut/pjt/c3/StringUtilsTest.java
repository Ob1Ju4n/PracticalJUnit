/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import junitparams.JUnitParamsRunner;
import org.junit.runner.RunWith;

/**
 *
 * @date Jul 22, 2014
 * @author Jortizp 
 * @mail <jortizp@intergrupo.com>
 */

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.Parameters;
import org.junit.Test;

@RunWith(JUnitParamsRunner.class)
public class StringUtilsTest {
    
    public static final Object[] getTestValues(){
        return $($("nauJ"), $("olimaC"), $("ogeiD"), $("araS"), $("diseY"), $("airaM"), $("olimaC nauJ"));
    }
    
    @Test
    @Parameters(method = "getTestValues")
    public void shouldOrderStringsInProperOrder(String s){
        
        String startChar = s.substring(s.length()-1);
        String endChar = s.substring(0,1);
        
        assertTrue(StringUtils.reverse(s).startsWith(startChar));
        assertTrue(StringUtils.reverse(s).endsWith(endChar));
        
    }
    
}
