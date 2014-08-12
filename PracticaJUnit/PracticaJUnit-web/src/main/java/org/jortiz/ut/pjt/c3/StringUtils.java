/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jortizp
 */
public class StringUtils {
    
    public static String reverse(String s){
    
        List<String> tempArray =  new ArrayList<String>(s.length());
        
        for(int i = 0; i < s.length(); i++){
            tempArray.add(s.substring(i, i+1));
        }
        
        StringBuilder reversedString = new StringBuilder(s.length());
        
        for(int i =  tempArray.size()-1; i >= 0; i-- ){
            reversedString.append(tempArray.get(i));
        }
        
        return reversedString.toString();
    }
    
}
