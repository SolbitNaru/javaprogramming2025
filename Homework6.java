// 부모 클래스 강의
class Course {
    protected String code;
    protected String name;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name;
    }
}

// 오프라인 강의
class OfflineCourse extends Course {

    public OfflineCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}

// 온라인 강의
class OnlineCourse extends Course {

    public OnlineCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");

        System.out.println(course1);
        System.out.println(course2);
    }
}
