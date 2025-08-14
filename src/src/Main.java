package src;


public class Main {
    public static void main(String[] args) {
    Room room1 = new Room(13.2, "wood", "Blue", 2, 1);
        room1.printRoomInfo();
        room1.addStuff(11);
        room1.printRoomInfo();
        Table table1 = new Table(2.3, "wooden", true);
        table1.printTableInfo();
        Sofa livingRoomSofa = new Sofa(3.2, "текстиль", false);
        livingRoomSofa.printSofaInfo();
        livingRoomSofa.openCloseSofa();
        livingRoomSofa.printSofaInfo();
    }
}