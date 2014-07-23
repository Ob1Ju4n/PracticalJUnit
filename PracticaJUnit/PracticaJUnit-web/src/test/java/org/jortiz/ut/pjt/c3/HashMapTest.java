/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import java.util.HashMap;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.Parameters;

/**
 * @date Jul 23, 2014
 * @author Jortizp
 * @mail <jortizp@intergrupo.com>
 */
@RunWith(JUnitParamsRunner.class)
public class HashMapTest {

    private HashMap map;
    private static final int KEY = 1;
    private static final String SOME_VALUE_1 = "Dog";
    private static final String SOME_VALUE_2 = "Cat";
    
    @Before
    public void setUp(){
        map = new HashMap();
    }
     
    @Test
    public void putMethodShouldStoreElement(){
    
        map.put(KEY, SOME_VALUE_1);
        assertTrue(map.size() > 0);
        
    }
    
    @Test
    public void getMethodShouldRetrieveElement(){
    
        map.put(KEY, SOME_VALUE_1);
        assertTrue(map.get(KEY) != null);
        
    }
    
    @Test
    public void putSecondElementWithSameKeyShouldReplacePreviousElement(){
    
        map.put(KEY, SOME_VALUE_1);
        Object object1 = map.get(KEY);
        
        map.put(KEY, SOME_VALUE_2);
        Object object2 = map.get(KEY);
        
        
        assertNotEquals(object1, object2);
        assertTrue(map.size()== 1);
        
    }
    
    public Object[] getObjects(){
        
        Object[] objects = new Object[5];
        
        objects[0] = new Object[]{new String[]{"Juan", "Juan", "Juan", "Juan"}};
        objects[1] = new Object[]{new String[]{"Juan", "Juan", "Juan", "Juan"}};
        objects[2] = new Object[]{new String[]{"Juan", "Juan", "Juan", "Juan"}};
        objects[3] = new Object[]{new String[]{"Juan", "Juan", "Juan", "Juan"}};
        objects[4] = new Object[]{new String[]{"Juan", "Juan", "Juan", "Juan"}};
        
        
        return objects;
        
    }
    
    @Test
    @Parameters(method = "getObjects")
    public void afterClearMethodMapShouldBeEmpty(String... objects){
    
        int i = 0;
        for(String str : objects){
            
            map.put(i, str);
            i++;
            
        }
        
        assertTrue(map.size() > 0);
        map.clear();
        assertTrue(map.isEmpty());
        
    }
    
    @Test
    public void nullKeyShouldBeAcceptedAsAValidKey(){
    
        map.put(null, SOME_VALUE_1);
        assertFalse(map.isEmpty());
        assertTrue(map.get(null) != null);
        
    }
    
}