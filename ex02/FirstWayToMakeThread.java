package ex02;
//자막을 출력하는 쓰레드
class SMIFileThread extends Thread {
  @Override
  public void run() {
    //내가 넣고자 하는 자막의 흐름 (하나~다섯)
    String[] subtitle={"하나","둘","셋","넷","다섯"};

    for(int i=0; i<subtitle.length; i++) {
      System.out.println(" - (자막 번호) "+subtitle[i]);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      try {
        Thread.sleep(200);
      } catch(InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
//비디오 프레임을 출력하는 쓰레드
class VideoFileThread extends Thread {
  @Override
  public void run() {
    int[] frame = {1,2,3,4,5};

    for(int i=0; i<frame.length; i++) {
      System.out.println("(비디오 프레임) " + frame[i]);
      try {
        Thread.sleep(200);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}

public class FirstWayToMakeThread {
  //두 개의 쓰레드를 객체 생성해서 동시에 실행
  public static void main(String[] args) {
    Thread videoFileThread = new VideoFileThread();
    //VideoFileThread videoFileThread = new VideoFileThread(); -> 이렇게 적어도 됨

    //생성된 객체로 쓰레드를 실행
    videoFileThread.start();

    //쓰레드 객체를 생성
    Thread smiFileThread = new SMIFileThread();
    //SMIFileThread smiFileThread = new SMIFileThread(); -> 이렇게 적어도 됨

    //생성된 객체로 쓰레드를 실행
    smiFileThread.start();
  }
}
