// Monitor 클래스
class Monitor {
    private String size;
    private String color;
    private String powerUsage;

    public Monitor(String size, String color, String powerUsage) {
        this.size = size;
        this.color = color;
        this.powerUsage = powerUsage;
    }

    public void printInfo() {
        System.out.println("[Monitor Info]");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Power Usage: " + powerUsage);
    }
}

// Computer 클래스
class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String cooler;
    private String powerSupply;

    public Computer(String cpu, String memory, String hdd, String cooler, String powerSupply) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd == null ? "N/A" : hdd;
        this.cooler = cooler;
        this.powerSupply = powerSupply;
    }

    public void printInfo() {
        System.out.println("[Computer Info]");
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hdd);
        System.out.println("Cooler: " + cooler);
        System.out.println("Power: " + powerSupply);
    }
}

// PersonalComputer 클래스
class PersonalComputer {
    private Monitor monitor;
    private Computer computer;

    public PersonalComputer(Monitor monitor, Computer computer) {
        this.monitor = monitor;
        this.computer = computer;
    }

    public void turnOn() {
        System.out.println("PC가 켜졌습니다!");
    }

    public void printInfo() {
        System.out.println("=== Personal Computer Info ===");
        monitor.printInfo();
        computer.printInfo();
    }
}

// 실행 테스트
public class Homework5 {
    public static void main(String[] args) {
        Monitor monitor = new Monitor("32인치", "검은색", "45W");
        Computer computer = new Computer("Core i7", "32GB", "2TB", "흰색", "700W");

        PersonalComputer pc = new PersonalComputer(monitor, computer);

        pc.turnOn();
        pc.printInfo();
    }
}
