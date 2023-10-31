package ex03;
//추상 클래스는 하나 이상의 추상 메서드를 포함하고 있다.
//인터페이스는 모든 메서드들이 추상 메서드이다.

interface A {
    abstract void abc();
}
interface B {
    abstract void bcd();
}

class C {
    void abc() {};
}
class D extends C{} //클래스가 클래스를 상속할 때 오버라이딩은 선택이다.

class E implements A {
    @Override
    public void abc() {
        System.out.println("인터페이스를 상속받은 클래스는 이런 식으로 오버라이딩을 필수로 해 줘야 함.");
    }
}

abstract class F implements B {}

class G extends F {
    @Override
    public void bcd() {
        System.out.println("결국 어떤 자식이 추상 메서드를 오바라이딩 시켰다.");
    }
}

//클래스인 내가 추상 메서드를 상속받았다면 오버라이딩을 시켜줘야 한다. -> 오버라이딩을 시킴
//왜? 일반 클래스는 추상 메서드를 가지고 있을 수 없으니까.
//오버라이딩 시키기 귀찮아서 자식한테 넘기고 싶으면 추상 클래스로 전환해야 한다. -> 나 자신을 추상 클래스로 전환

public class Interface {

}