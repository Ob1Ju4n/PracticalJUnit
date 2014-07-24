/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c4;

/**
 * @date Jul 24, 2014
 * @author Jortizp
 * @mail <jortizp@intergrupo.com>
 */
public class PasswordValidator {

    public static void validateMinimumLenght(final String password) throws IllegalArgumentException{
    
        if(password.length() < 8)
            throw new IllegalArgumentException("Password should have a minimum of 8 characters.");
        
    }
    
    public static void validateMaximumLenght(final String password) throws IllegalArgumentException{
    
        if(password.length() > 16)
            throw new IllegalArgumentException("Password should have a maximum of 16 characters.");
        
    }
    
    public static void validateUppercaseLetter(final String password) throws IllegalArgumentException{
    
        char[] chars = password.toCharArray();
        
        for(char c : chars){
            
            if(Character.isUpperCase(c))
                return;
        }
        
        throw new IllegalArgumentException("Password should have at least one uppercase letter.");
    }
    
    public static void validateLowercaseLetter(final String password) throws IllegalArgumentException{
    
        char[] chars = password.toCharArray();
        
        for(char c : chars){
            
            if(!Character.isUpperCase(c))
                return;
        }
        
        throw new IllegalArgumentException("Password should have at least one lowercase letter.");
    }
    
    public static void validateNumber(final String password) throws IllegalArgumentException{
    
        char[] chars = password.toCharArray();
        
        for(char c: chars){
        
            if(Character.isDigit(c))
                return;
        }
        
        throw new IllegalArgumentException("Password should have at least one number.");
    }
    
    public static void validateSymbol(final String password) throws IllegalArgumentException{
    
        char[] chars = password.toCharArray();
        
        for(char c: chars){
        
            if(!Character.isLetterOrDigit(c))
                return;
        }
        
        throw new IllegalArgumentException("Password should have at least one symbol.");
    }
    
    public static void validateWhitespace(final String password) throws IllegalArgumentException{
    
        char[] chars = password.toCharArray();
        
        for(char c: chars){
        
            if(Character.isWhitespace(c))
                throw new IllegalArgumentException("Password should not have whitespace.");
        }
    }
    
}