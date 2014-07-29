/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c4;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.jortiz.ut.pjt.c3.RegexUtils;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @date Jul 29, 2014
 * 
 * @author Jortizp
 * @mail <jortizp@intergrupo.com>
 */
@RunWith(JUnitParamsRunner.class)
public class RegexUtilsTest {

    private Object[] getStringsWithThreeDigitsNumber(){
        return new Object[]{"cdefg 345 12bb23", "cdefg 345 12bbb33 678tt"};
    }
    
    private Object[] getStringsForEmptyResults(){
        return new Object[]{"abc12", "juan", "1 12 34 56 9"};
    }
    
    @Test
    @Parameters(method = "getStringsWithThreeDigitsNumber")
    public void shouldReturnThreeDigitsNumber(String str){
        
        for(String result: RegexUtils.evaluateThreeDigitsInString(str)){
            
            assertFalse("Expected a string, but result is empty.", result.isEmpty());
            assertTrue("Expected a string with 3 chars, but received string with "+result.length()+" chars.", result.length() == 3);
            
        }
        
    }
    
    @Test
    @Parameters(method = "getStringsForEmptyResults")
    public void shouldReturnEmptyResults(String str){
        assertTrue("Expected empty result list but found values.", RegexUtils.evaluateThreeDigitsInString(str).isEmpty());
    }

}