import java.util.Scanner;

class Student {
    private int studentId;   // 학번
    private String name;     // 이름
    private String major;    // 전공
    private long phone;      // 전화번호 (앞자리 0 제외, 숫자만 저장)

    // 생성자
    public Student(int studentId, String name, String major, long phone) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    // Getter & Setter
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    // 전화번호 출력 형식 변환 메소드
    public String getFormattedPhone() {
        // 전화번호는 저장 시 앞자리 0이 없으므로 출력 시 복구
        String phoneStr = Long.toString(phone);
        if (!phoneStr.startsWith("10")) {
            phoneStr = "10" + phoneStr;
        }
        String first = "010";
        String mid = phoneStr.substring(2, 6);
        String last = phoneStr.substring(6);
        return first + "-" + mid + "-" + last;
    }

    // 학생 정보 출력
    public void printInfo() {
        System.out.println("학번: " + studentId
                + ", 이름: " + name
                + ", 전공: " + major
                + ", 전화번호: " + getFormattedPhone());
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        System.out.println("학생의 학번, 이름, 전공, 전화번호를 입력하세요.: ");

        for (int i = 0; i < 3; i++) {
            int studentId = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong(); // 입력 시 '-' 없이, 앞자리 0 없이 저장
            students[i] = new Student(studentId, name, major, phone);
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < students.length; i++) {
            String prefix = "";
            if (i == 0) prefix = "첫번째 학생은 ";
            else if (i == 1) prefix = "두번째 학생은 ";
            else if (i == 2) prefix = "세번째 학생은 ";

            System.out.print(prefix);
            students[i].printInfo();
        }

        sc.close();
    }
}

