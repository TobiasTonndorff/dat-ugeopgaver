import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
Room r1 = new Room(3, 10,5);
Room r2 = new Room(5, 15,10);
Room r3 = new Room(6, 2, 4);
ArrayList<Room> rooms = new ArrayList<>();
rooms.add(r1);
rooms.add(r2);
rooms.add(r3);
Building b1 = new Building(rooms, 3, 4, true);

    }
    public static int lampetæller(){

    }
}