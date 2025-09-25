import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("prime, standard, economy 중 한 가지를 입력하시오 : ");
        String zone = scanner.next();

        if (zone.compareTo("prime") == 0){
            System.out.println("prime존 표 값은 11000원 입니다.");
        }
        else if (zone.compareTo("standard") == 0){
            System.out.println("standard존 표 값은 10000원 입니다.");
        }

        else if(zone.compareTo("economy") == 0){
            System.out.println("economy존 표 값은 9000원 입니다.");
        }
        else{
            System.out.println("좌석을 잘못 입력하셨습니다.");
        }
    }
}
