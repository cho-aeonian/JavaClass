package ex01;
//Button 클래스 안에는 onClick()과 같은 메서드가 존재한다.
//onClick()을 실행했을 때 어떤 동작을 실행할 것인지는 때에 따라 다르다. (추상 메서드로 만든다.)
//귀를 기울이고 있다가(이벤트 리스너) 누군가가 setOnClickListener를 호출했을 때
//onClick()메서드의 역할이 확실히 정해지게 되고 누군가가 정의한 오버라이딩 대로 실행된다.

class Button{
  OnclickListener ocl;
  void setOnClickListener(OnclickListener ocl) { //구현된 OnClickListener 인터페이스를 외부에서 받아와서 집어 넣겠다.
    this.ocl = ocl;
  }
  interface OnclickListener{ //클릭 버튼이 어떤 역할을 할지 모르기 때문에 추상 메서드로 만듦
    void onClick();
  }
  void onClick(){
    ocl.onClick();
  }
}

public class ButtonAPIExample {
  public static void main(String[] args) {
    //첫번째 예시: 클릭하면 음악 재생
    Button btn1 = new Button(); //첫번째 버튼 객체 생성
    //빈껍데기(interface)를 new해서 바로 줄 수는 없다.
    //빈껍데기를 구현한(implements) 어떤 자식클래스를 new로 넘겨주거나
    //아니면 빈껍데기(interface)를 넘겨줄 때 중괄호 안에 동시에 구현시키면(Override) 가능하다.
    btn1.setOnClickListener(new Button.OnclickListener() {
      @Override
      public void onClick() {
        System.out.println("음악 재생 중");
      }
    });
    btn1.onClick();

    Button btn2 = new Button();
    btn2.setOnClickListener(new Button.OnclickListener() {
      @Override
      public void onClick() {
        System.out.println("네이버 실행");
      }
    });
    btn2.onClick();
  }
}