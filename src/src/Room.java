package src;

public class Room {
    private double apartmentArea;
    private String floorType;
    private String wallColor;
    private int doorCount;
    private int windowCount;

    public Room(double apartmentArea, String floorType, String wallColor, int doorCount, int windowCount) {
        this.apartmentArea = apartmentArea;
        this.floorType = floorType;
        this.wallColor = wallColor;
        this.doorCount = doorCount;
        this.windowCount = windowCount;
    }

    public double getApartmentArea(){
        return this.apartmentArea;
    }

    public void setApartmentArea(double apartmentArea){
     this.apartmentArea = apartmentArea;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType){
        this.floorType = floorType;
    }

    public String getWallColor() {
        return wallColor;
    }

    public void setWallColor(String wallColor){
        this.wallColor = wallColor;
    }

    public int getDoorCount(){
        return this.doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public int getWindowCount(){
        return this.windowCount;
    }

    public void setWindowCount(int windowCount){
        this.windowCount = windowCount;
    }

    public boolean equals(Room room) {
        if (room != null){
           return (this.apartmentArea == room.apartmentArea && this.floorType.equals(room.floorType) && this.wallColor.equals(room.wallColor) && this.doorCount == room.doorCount && this.windowCount == room.windowCount);
        }
        return false;
    }

    public void addStuff(double area){
        if (area < apartmentArea ){
            apartmentArea -= area;
            System.out.println("Можешь еще накидать своего хлама, осталось свободных кв.м. " + apartmentArea);
        }else {
            System.out.println("На голову себе поставь, баламут!");
        }
    }

    public void printRoomInfo(){
        System.out.println("Инофрмация о комнате:\n Площадь: " + apartmentArea + " кв.м.\n Пол сделан из: " + floorType + "\n Цвет стен: " + wallColor + "\n Кол-во дверей: " + doorCount + "\n Кол-во окон: " + windowCount);
    }


}
