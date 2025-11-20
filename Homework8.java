//202010857 남궁환
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        //저장된 아이디 - 비밀번호
        Map<String, String> loginInfo = new HashMap<>();
        loginInfo.put("myId", "myPass");
        loginInfo.put("myId2", "myPass2");
        loginInfo.put("myId3", "myPass3");

        Scanner sc = new Scanner(System.in);

        String id;
        String pw;

        // ID입력시 까지 반복해서 입력받음
        while (true) {
            System.out.print("ID를 입력하세요: ");
            id = sc.nextLine().trim();   // 공백 제거

            // ID 존재 여부 확인
            if (!loginInfo.containsKey(id)) {
                System.out.println("존재하지 않는 ID입니다. 다시 입력하세요.\n");
            } else {
                break;  // ID가 존재하면 탈출
            }
        }

        System.out.print("비밀번호를 입력하세요: ");
        pw = sc.nextLine().trim();        // 공백 제거

        // 비밀번호 확인
        if (loginInfo.get(id).equals(pw)) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }

        sc.close();
    }
}
