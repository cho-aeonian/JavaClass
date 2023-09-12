package ch02;

class A {
    //다양한 필드 정의(초기화는 안 시켰다. 과연 어떤 값들이 들어가있을까?)
    boolean m1;
    int m2;
    double m3;
    String m4;

    //초기화 안 시킨 필드들을 출력해주는 메서드
    void printFieldValue() {
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

    void printLocalVariable(){
        //얘는 필드가 아니라 지역 변수다.
        int k=10;
        System.out.println(k);
    }
}

public class InitialValue {

    public static void main(String[] args){
        A a = new A();
        a.printFieldValue();
        //어라? 출력이 잘 되네?
        //아하 필드는 컴파일러가 자동으로 초기화 시켜주는구나!
        a.printLocalVariable();
        //지역 변수는 출력이 안되네?
        //아하 지역변수는 필드와 다르게 초기화를 반드시 시켜줘야 하구나!
    }
}