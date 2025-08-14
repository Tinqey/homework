package src;

public class Table {
    private double area;
    private String materialType;
    private boolean isEmpty;

    public Table(double area, String materialType, boolean isEmpty) {
        this.area = area;
        this.materialType = materialType;
        this.isEmpty = isEmpty;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean equals(Table table) {
        if (table != null){
            return (this.area == table.area && this.materialType.equals(table.materialType) && this.isEmpty == table.isEmpty);
        }
        return false;
    }

    public void printTableInfo(){
        String isEmptyInfo = (isEmpty? "На столе что-то есть" : "Стол пусть");
        System.out.println("Информация о столе: \n Занимаемая площадь в кв.м. " + area + "\n Тип материала: " + materialType + "\n " + isEmptyInfo );
    }
}
