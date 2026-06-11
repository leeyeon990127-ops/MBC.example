package d1_p62;

public class OperatorExample {
    public static void main(String[] args) {
        short s = 100;
//        short result = -s;   -> short result = (short)-s; 강제로 타입캐스팅(short)
        int result2 = -s;

        System.out.println(s);
        System.out.println(result2);
    }
}
