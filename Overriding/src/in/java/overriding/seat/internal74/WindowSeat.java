package in.java.overriding.seat.internal74;
public class WindowSeat extends Seat {

    @Override
    public void sit() {
        System.out.println("running the sit in WindowSeat");
    }

    public void view() {
        System.out.println("running the view in WindowSeat");
    }
}
