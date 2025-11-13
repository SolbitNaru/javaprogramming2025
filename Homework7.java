public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

// 추상 클래스 Printer
abstract class Printer {
    protected String model;          // 모델명
    protected int printedCount;      // 현재까지 출력 매수
    protected int availableCount;    // 출력 가능 매수

    public Printer(String model, int availableCount) {
        this.model = model;
        this.availableCount = availableCount;
        this.printedCount = 0;
    }

    // 추상 메서드
    public abstract boolean print();
}

class InkjetPrinter extends Printer {

    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            int nextPage = printedCount + 1;
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", model, nextPage);
            return false;
        }
        printedCount++;
        availableCount--;
        return true;
    }
}

class LaserPrinter extends Printer {

    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            int nextPage = printedCount + 1;
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", model, nextPage);
            return false;
        }
        printedCount++;
        availableCount--;
        return true;
    }
}

class TestPrinter {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("HP-1234", 7500);
        LaserPrinter laser = new LaserPrinter("Canon-5678", 1500);

        inkjet.print();  // 성공
        inkjet.print();  // 성공
        inkjet.print();  // 실패 - 잉크 부족

        laser.print();   // 성공
        laser.print();   // 실패 - 토너 부족
    }
}