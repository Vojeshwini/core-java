package in.java.overriding.seat.external74;
import in.java.overriding.seat.internal74.*;

public class SeatTest {
    public void testSeat(Seat seat) {
        if (seat != null) {
            seat.sit();
            if (seat instanceof WindowSeat) {
                WindowSeat ref = (WindowSeat) seat;
                ref.view();
            } else {
                System.err.println("view is not available for this Seat");
            }
        } else {
            System.err.println("null");
        }
    }
}
