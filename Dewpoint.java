import java.util.Scanner;
public class Dewpoint {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("이슬점 계산을 합니다.");
        System.out.print("온도를 입력하세요: ");
        double T=sc.nextDouble();
        System.out.print("습도를 입력하세요: ");
        double RH=sc.nextDouble();
        double sum= (243.12 * ((Math.log(RH/100))+(17.62*T)/(243.12+T))) / (17.62 - ((Math.log(RH/100))+(17.62*T)/(243.12+T)));
        System.out.printf("이슬점 온도는: %.1f도 입니다.",sum);

    }
}

