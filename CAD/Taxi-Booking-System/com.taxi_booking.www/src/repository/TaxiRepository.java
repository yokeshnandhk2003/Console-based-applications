package repository;

import model.Taxi;
import java.util.*;

public class TaxiRepository {
    private static final List<Taxi> taxis = new ArrayList<>();

    static {
        for (int i = 1; i <= 4; i++) {
            taxis.add(new Taxi(i));
        }
    }

    public static List<Taxi> getAllTaxis() {
        return taxis;
    }
}
