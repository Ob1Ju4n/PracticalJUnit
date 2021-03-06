/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c3;

/**
 *
 * @date Jul 17, 2014
 * @author Jortizp 
 * @mail <jortizp@intergrupo.com>
 */
public class Money {

    private final int amount;
    private final String currency;

    public Money(int amount, String currency) {
        
        if(amount < 0){
            throw new IllegalArgumentException("Illegal amount:[" +amount+ "]");
        }
        
        if(currency == null || currency.isEmpty()){
            throw new IllegalArgumentException("Illegal currency:[" +currency+ "]");
        }
        
        this.amount = amount;
        this.currency = currency;
        
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object anObject) {

        if (anObject instanceof Money){
        
            Money money = (Money)anObject;
            return money.getCurrency().equals(getCurrency()) && getAmount() == money.getAmount();
            
        }
        return false;
        
    }
    
}
