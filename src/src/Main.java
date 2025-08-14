package src;


public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(18.2, "Wood", "White", 2, 1);
        room1.addStuff(3.1);
        room1.printRoomInfo();

        Table table1 = new Table(1.5, "Glass", true);
        table1.printTableInfo();

        Computer computer1 = new Computer(3.5, "CoolerMaster", false);
        computer1.printComputerInfo();
        computer1.turnOnOff();
        computer1.printComputerInfo();

        Sofa sofa1 = new Sofa(3.1, "leather", true);
        sofa1.openCloseSofa();
        sofa1.printSofaInfo();
    }
}