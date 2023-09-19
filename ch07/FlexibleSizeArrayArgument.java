package ch07;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

    public static void main(String[] args) {
        //메서드 오버로딩을 이용해서 동일한 이름의 메서드를 다양하게 호출
        method1(1,2);
        method1(1,2,3);
        method1();

        method2("안녕","방가");
        method2("땡큐","베리","감사");
        method2();
    }
    //와 만약에.. 1개짜리부터 100개까지 다 있다면..
    //총 100가지의 시그니처를 만들어야 하는 거야?? 겁나 불편하네?
    //어떤 개발자가 새로운 문법을 하나 만들었습니다. 이름하여 '가변길이 배열 매개변수'
    public static void method1(int...array) {
        for(int k:array) {
            System.out.print(k+" ");
        }
        System.out.println();
    }

    //지역변수라서 위랑 똑같이 array 써도 됨
    public static void method2(String...array) {
            System.out.print(Arrays.toString(array));
            System.out.println();
    }
}
