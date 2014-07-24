/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c4;

import org.junit.Before;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 * @date Jul 24, 2014
 * @author Jortizp
 * @mail <jortizp@intergrupo.com>
 */
public class PasswordValidatorTest {

    /**
     * Exercise 4.10.1.
     * We defined that the password should:
     * - Have a minimum of 8 characters
     * - Have a maximum of 16 characters
     * - Have at least one uppercase letter
     * - Have at least one lowercase letter
     * - Have at least one number
     * - Have at least one symbol
     * - Not have a whitespace character
     */
    @Before
    public void setUp(){
        exception.expect(IllegalArgumentException.class);
    }
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Test
    public void passwordShouldHaveAMinimumOfEightCharacters(){
        
        exception.expectMessage("Password should have a minimum of 8 characters.");
        PasswordValidator.validateMinimumLenght("lock");
    }
    
    @Test
    public void passwordShouldHaveAMaximumOfSixteenCharacters(){
        
        exception.expectMessage("Password should have a maximum of 16 characters.");
        PasswordValidator.validateMaximumLenght("esternocleidomastoideo");
    }
    
    @Test
    public void passwordShouldHaveAtLeastOneUppercaseLetter(){
    
        exception.expectMessage("Password should have at least one uppercase letter.");
        PasswordValidator.validateUppercaseLetter("lowercase");
    }
    
    @Test
    public void passwordShouldHaveAtLeastOneLowercaseLetter(){
    
        exception.expectMessage("Password should have at least one lowercase letter.");
        PasswordValidator.validateLowercaseLetter("UPPERCASE");
    }
    
    @Test
    public void passwordShouldHaveAtLeastOneNumber(){
    
        exception.expectMessage("Password should have at least one number.");
        PasswordValidator.validateNumber("charactesOnly_.:$#%&°¨^{}");
    }
    
    @Test
    public void passwordShouldHaveAtLeastOneSymbol(){
    
        exception.expectMessage("Password should have at least one symbol.");
        PasswordValidator.validateSymbol("numbersOnly1234567890");
    }
    
    @Test
    public void passwordShouldNotHaveAWhiteSpaceCharacter(){
    
        exception.expectMessage("Password should not have whitespace.");
        PasswordValidator.validateWhitespace("   ");
    }

}