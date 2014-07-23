/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c4;

/**
 * @date Jul 22, 2014
 * @author Jortizp
 * @mail <jortizp@intergrupo.com>
 */
public class FootBallTeam implements Comparable<FootBallTeam>{

    private int gamesWon;

    public FootBallTeam(int gamesWon) throws IllegalArgumentException {
        if(gamesWon < 0)
            throw new IllegalArgumentException();
        this.gamesWon = gamesWon;
    }

    public int getGamesWon() {
        return gamesWon;
    }

    @Override
    public int compareTo(FootBallTeam otherTeam) {
        return this.gamesWon - otherTeam.getGamesWon();
    }
    
}