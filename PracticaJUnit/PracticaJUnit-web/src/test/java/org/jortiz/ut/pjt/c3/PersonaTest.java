/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Jortizp
 */
public class PersonaTest {
    
    //<editor-fold defaultstate="collapsed" desc="Arrange">
    private InformacionContacto infoA;
    private InformacionContacto infoB;
    private Persona persona;
    
    @Before //This method executes before any other test method annotated with @Test
    public void setUp(){
        persona = new Persona("Juan Perez", "1'015.869.521");
    }
    //</editor-fold>
    
    @Test
    public void afterCreationShouldnotHaveAddress(){
        assertEquals(0, persona.getInformacionContacto().size());
    }
    
    @Test
    public void shouldAllowToAddContactInfo(){
        
        persona.addinformacionContacto(infoA);
        assertTrue(persona.getInformacionContacto().size() > 0);
        
    }
    
    @Test
    public void shouldAllowToAddMultipleContactInfo(){
        
        //<editor-fold defaultstate="collapsed" desc="Act">
        persona.addinformacionContacto(infoA);
        persona.addinformacionContacto(infoB);
        //</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="Assert">
        assertTrue(persona.getInformacionContacto().size() > 1);
        //</editor-fold>
        
    }
    
}
