package ex01;

//클래스가 클래스를 구현하고 싶으면 -> extends
//클래스가 인터페이스를 구현하고 싶으면 -> implements

interface A {}
interface B {}

class C implements A {}
class D implements A,B {} //다중 인터페이스 상속은 지원한다.
//class E extends C, D {}//다중 상속을 지원하지 않기 때문입니다.

//클래스 C도 상속하고 싶고 인터페이스 A,B도 다중 인터페이스 상속하고 싶다.
class F extends C implements A,B {}

public class InheritanceOfInterface {
}
