/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jortizp
 */
public class Persona {

    private String nombre;
    private String numDocumento;
    private List<InformacionContacto> informacionContacto;

    public Persona() {
        this.informacionContacto = new ArrayList<InformacionContacto>();
    }
    
    public Persona(String nombre, String numDocumento) {
        this();
        this.nombre = nombre;
        this.numDocumento = numDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public List<InformacionContacto> getInformacionContacto() {
        return informacionContacto;
    }

    public void addinformacionContacto(InformacionContacto... info){
        
        if(this.informacionContacto == null)
            this.informacionContacto = new ArrayList<InformacionContacto>();
        
        this.informacionContacto.addAll(Arrays.asList(info));
        
    }
    
}
