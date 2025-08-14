package src;

public class Sofa {
    private double area;
    private String material;
    private boolean isOpen;

    public Sofa(double area, String material, boolean isOpen) {
        this.area = area;
        this.material = material;
        this.isOpen = isOpen;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean equals(Sofa sofa) {
        if (sofa != null) {
            return (this.area == sofa.area && this.material.equals(sofa.material) && this.isOpen == sofa.isOpen);
        }
        return false;
    }

    public void printSofaInfo() {
        String openStatus = isOpen ? "Диван раскрыт" : "Диван закрыт";
        System.out.println("Информация о диване: \n" + "Площадь: " + area + " кв.м.\n" + "Материал: " + material + "\n" + "Состояние: " + openStatus);
    }

    public void openCloseSofa() {
        if (isOpen) {
            isOpen = false;
        } else {
            isOpen = true;
        }
        System.out.println("Диван теперь " + (isOpen ? "раскрыт" : "закрыт"));
    }
}
