/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @date Jul 29, 2014
 * @author Jortizp
 * @mail <jortizp@intergrupo.com>
 */
public class RegexUtils {

    public static List<String> evaluateThreeDigitsInString(String str){
    
        Pattern pattern = Pattern.compile("(\\d\\d\\d)+");
        Matcher matcher = pattern.matcher(str);
        List<String> results = new ArrayList<String>();
        
        while(matcher.find()){
            results.add(matcher.group());
        }
        
        return results;
    }
    
}