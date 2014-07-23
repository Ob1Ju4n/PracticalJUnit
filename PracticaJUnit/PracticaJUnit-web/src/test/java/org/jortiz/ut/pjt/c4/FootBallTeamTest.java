/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jortiz.ut.pjt.c4;

import junitparams.JUnitParamsRunner;
import static org.junit.Assert.*;
import static junitparams.JUnitParamsRunner.$;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @date Jul 22, 2014
 * @author Jortizp
 * @mail <jortizp@intergrupo.com>
 */
@RunWith(JUnitParamsRunner.class)
public class FootBallTeamTest {

    private static final int ANY_NUMBER = 123;
    
    private Object[] getGamesWon(){
        return $(1, 2, 3, 4);
    }
    
    private Object[] getNegativeValuesForGamesWon(){
        return $(-10, -11);
    }
    
    @Test
    @Parameters(method = "getGamesWon")
    public void constructorShouldSetGamesWon(int gamesWon){
    
        FootBallTeam team = new FootBallTeam(gamesWon);
        
        assertEquals(gamesWon+" games passed to constructor, but returned "+team.getGamesWon()+".\n", 
                    gamesWon, 
                    team.getGamesWon());
        
    }
    
    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "getNegativeValuesForGamesWon")
    public void constructorShouldThrowIAEWhenNumberOfGamesWonIsNegative(int gamesWon){
        new FootBallTeam(gamesWon);
    }
    
    @Test
    public void shouldBePossibleToCompareTeams(){
        
        FootBallTeam team = new FootBallTeam(ANY_NUMBER);
        assertTrue("Football team should be comparable.", 
                    team instanceof Comparable);
                
    }
    
    @Test
    public void teamsWithMoreMatchesWonShouldBeGreater(){
    
        FootBallTeam team1 = new FootBallTeam(5);
        FootBallTeam team2 = new FootBallTeam(3);
        
        assertTrue("Teams with more matches won should be greater.", team1.compareTo(team2) > 0);
        
    }
    
    @Test
    public void teamsWithLessMatchesWonShouldBeLesser(){
    
        FootBallTeam team1 = new FootBallTeam(3);
        FootBallTeam team2 = new FootBallTeam(5);
        
        assertTrue("Teams with less matches won should be lesser.", team1.compareTo(team2) < 0);
        
    }
    
    @Test
    public void teamsWithSameMatchesWonShouldBeEquals(){
    
        FootBallTeam team1 = new FootBallTeam(5);
        FootBallTeam team2 = new FootBallTeam(5);
        
        assertTrue("Teams should be equals.", team1.compareTo(team2) == 0);
        
    }
}