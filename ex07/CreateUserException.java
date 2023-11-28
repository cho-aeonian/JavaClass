package ex07;
//예외처리 : 사용자가 직접 만드는 예외
//ex) int age = -1; 실행 시 -> 예외가 발생 하도록(내가 원하는 예외 메시지를 터미널에 띄울 수 있다.)
//                         -> make exception(can text what I want exception message in Teminal)

class MyException extends Exception {
  //1.기본 생성자 / basic constructor
  public MyException() {
    super(); //부모생성자를 함께 호출 / call with parents constructor
  }
  //2.매개변수 생성자 / parameter constructor
  public MyException(String message) {//메세지에는 원하는 예외 메세지가 담긴다 / message include what i want exception message
    super(message);
  }
}

class A {
  void abc_1(int a) throws MyException {
    if(a>70)
      System.out.println("정상 작동");
    else
      throw new MyException("숫자가 70보다 커야합니다.");
  }
  void bcd_1(){
    try {
      abc_1(67);
    } catch (MyException e) {
      throw new RuntimeException(e);
    }
  }


}


public class CreateUserException {
  public static void main(String[] args) {
    A a = new A();
    a.bcd_1();
  }
}
