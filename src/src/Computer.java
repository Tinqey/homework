package src;

public class Computer {
    private double processorSpeed;
    private String manufacturer;
    private boolean isOn;

    public Computer(double processorSpeed, String manufacturer, boolean isTurnedOn) {
        this.processorSpeed = processorSpeed;
        this.manufacturer = manufacturer;
        this.isOn = isTurnedOn;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean on) {
        isOn = on;
    }

    public boolean equals(Computer computer) {
        if (computer != null) {
            return (this.processorSpeed == computer.processorSpeed && this.manufacturer.equals(computer.manufacturer) && this.isOn == computer.isOn);
        }
        return false;
    }

    public void turnOnOff() {
        if (isOn) {
            isOn = false;
        } else {
            isOn = true;
        }
        System.out.println("Компьютер " + (isOn ? "включен" : "выключен"));
    }

    public void printComputerInfo() {
        String powerStatus = isOn ? "Компьютер включен" : "Компьютер выключен";
        System.out.println("Информация о компьютере: \n " + "Скорость процессора: " + processorSpeed + " GHz\n " + "Производитель: " + manufacturer + "\n " + "Статус: " + powerStatus);
    }
}
