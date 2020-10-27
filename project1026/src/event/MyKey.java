package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//키보드와 관련한 이베트가 발생하면, 자바 가상머신이 KetListener에게 KeyEvent
//인스턴스를 전달한다..
//이 전달된 인스턴스는 KeyListener가 보유한 추상 메서들에 전달되어지므로,
//개발자는 추상메서드를 재정의하면서 원하는 로직을 작성하면 됨!!
public class MyKey implements KeyListener{
	public void keyPressed(KeyEvent e){
	}

	public void keyReleased(KeyEvent e){
		System.out.println("눌렀어?");
		
	}

	public void keyTyped(KeyEvent e){
		
	}
}
