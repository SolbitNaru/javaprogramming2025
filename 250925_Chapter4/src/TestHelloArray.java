public class TestHelloArray {
    public static void main(String[] args){
        Hello[] hArr1 = new Hello[3];
        hArr1[0] = new Hello();
        hArr1[1] = new Hello("홍길동");
        hArr1[2] = new Hello("허균");

        hArr1[0].sayHello();
        hArr1[1].sayHello();
        hArr1[2].sayHello();
    }
}
