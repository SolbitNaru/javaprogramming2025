import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {

        // 저장된 아이디 - 비밀번호 (db.txt에서 입력받음)
        Map<String, String> loginInfo = new HashMap<>();
        String fileName = "db.txt"; // 상대 경로 사용

        // ===== 1) db.txt 파일에서 ID/비밀번호 읽어오기 =====
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNext()) {
                String id = fileScanner.next().trim();
                if (!fileScanner.hasNext()) break;
                String pw = fileScanner.next().trim();
                loginInfo.put(id, pw);
            }
        } catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }

        //로그인
        Scanner sc = new Scanner(System.in);
        String id;
        String pw;

        // ID 입력 반복
        while (true) {
            System.out.print("ID를 입력하세요: ");
            id = sc.nextLine().trim(); // 공백 제거

            if (!loginInfo.containsKey(id)) {
                System.out.println("존재하지 않는 ID입니다. 다시 입력하세요.\n");
            } else {
                break;
            }
        }

        // 비밀번호 입력
        System.out.print("비밀번호를 입력하세요: ");
        pw = sc.nextLine().trim();

        // 비밀번호 일치 여부
        if (loginInfo.get(id).equals(pw)) {
            System.out.println("로그인 성공!");
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }
}
