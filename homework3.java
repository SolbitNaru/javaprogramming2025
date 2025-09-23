import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 몇 개의 정수를 입력받을 것인지 먼저 입력
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        // 정수 입력받아 배열에 저장
        System.out.println("수를 입력하세요:"+ n);
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 최소값과 최대값 구하기
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 결과
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        sc.close();
    }
}