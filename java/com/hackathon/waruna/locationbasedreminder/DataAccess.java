package com.hackathon.waruna.locationbasedreminder;

import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by waruna on 7/12/2015.
 */
public class DataAccess {

    static List<Reminder> rem = new ArrayList<Reminder>();

    public DataAccess(){
        Reminder reminder1 = new Reminder("Lecture", "Morning leture at 8 A.M", "University of Peradeniya", 1433122534, 321524523);
        rem.add(reminder1);

        Reminder reminder2 = new Reminder("Movie", "Jurassic World", "Katugasthota", 1433122534, 321524523);
        rem.add(reminder2);

        Reminder reminder3 = new Reminder("Mobile", "pick the repaired mobile", "Peradeniya", 1433122534, 321524523);
        rem.add(reminder3);

        Reminder reminder4 = new Reminder("Lap top", "Get a new charger", "Kandy", 1433122534, 321524523);
        rem.add(reminder4);

        Reminder reminder5 = new Reminder("Bording", "Pay Bording rent", "Peradeniya", 1433122534, 321524523);
        rem.add(reminder5);

        Reminder reminder6 = new Reminder("Vaccine", "Get the vaccination", "Peradeniya Hospital", 1433122534, 321524523);
        rem.add(reminder6);

        Reminder reminder7 = new Reminder("Birth Day", "Get a present for mom", "Nugegoda", 1433122534, 321524523);
        rem.add(reminder7);

        Reminder reminder9 = new Reminder("Bread", "Buy Bread from food city", "Peradeniya food city", 1433122534, 321524523);
        rem.add(reminder9);
    }

    public static List<Reminder> getAllReminders(){
        return rem;
    }

}
