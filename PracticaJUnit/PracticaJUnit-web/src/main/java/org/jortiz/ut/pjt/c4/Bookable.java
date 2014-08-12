package org.jortiz.ut.pjt.c4;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Juan Pablo Ortiz on 10/08/2014.
 */
public class Bookable {

    private static final int MIN_BOOKABLE_HOUR = 7;
    private static final int MAX_BOOKABLE_HOUR = 17;
    private static final int MAX_BOOKABLE_HOURS = 11;

    private boolean[] dailySchedule;

    public Bookable() {
        dailySchedule = new boolean[MAX_BOOKABLE_HOURS];
    }

    public void validateHour(String hour) throws IllegalArgumentException{

        String exceptionMessage = "La hora ingresada es invalida.";
        try{

            int bookableHour = Integer.parseInt(hour);
            if( bookableHour < MIN_BOOKABLE_HOUR || bookableHour > MAX_BOOKABLE_HOUR )
                illegalArgumentExceptionHelper(exceptionMessage);

        }catch (NumberFormatException nfex){
            illegalArgumentExceptionHelper(exceptionMessage);
        }

    }

    public void bookHour(String hour) throws IllegalArgumentException{

        validateHour(hour);
        int bookableHour = Integer.parseInt(hour);
        dailySchedule[bookableHour - MIN_BOOKABLE_HOUR] = true;
    }

    public boolean isBooked(String hour){

        validateHour(hour);
        int bookableHour = Integer.parseInt(hour);
        return dailySchedule[bookableHour - MIN_BOOKABLE_HOUR];

    }

    public List<String> getBookedHours(){

        List<String> bookedHours = new ArrayList<>();
        for(int i = 0; i < MAX_BOOKABLE_HOURS; i++){

            if (dailySchedule[i])
                bookedHours.add(String.valueOf(i + MIN_BOOKABLE_HOUR));

        }

        return bookedHours;

    }

    private void illegalArgumentExceptionHelper(String exceptionMessage) throws IllegalArgumentException{
        throw new IllegalArgumentException(exceptionMessage);
    }

}
