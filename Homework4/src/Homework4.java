import java.util.Scanner;

public class Homework4 {



    static int gcd(int a, int b) {
        if (a == b) { return a; }
        else if (a > b) { return gcd(a - b, b); }
        else { return gcd(a, b - a); }
    }




    public static void main(String[] args){
        int num1, num2;
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요.");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.printf("최대 공약수는 %d입니다",gcd(num1, num2));
    }


}
