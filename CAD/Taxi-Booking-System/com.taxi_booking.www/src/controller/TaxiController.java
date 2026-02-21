package controller;
import service.TaxiService;

public class TaxiController {
    private TaxiService service = new TaxiService();

    public String bookTaxi(int customerId, char pickup, char drop, int pickupTime) {
        return service.bookTaxi(customerId, pickup, drop, pickupTime);
    }
}
