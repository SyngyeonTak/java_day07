package event;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//Ű����� ������ �̺�Ʈ�� �߻��ϸ�, �ڹ� ����ӽ��� KetListener���� KeyEvent
//�ν��Ͻ��� �����Ѵ�..
//�� ���޵� �ν��Ͻ��� KeyListener�� ������ �߻� �޼��鿡 ���޵Ǿ����Ƿ�,
//�����ڴ� �߻�޼��带 �������ϸ鼭 ���ϴ� ������ �ۼ��ϸ� ��!!
public class MyKey implements KeyListener{
	public void keyPressed(KeyEvent e){
	}

	public void keyReleased(KeyEvent e){
		System.out.println("������?");
		
	}

	public void keyTyped(KeyEvent e){
		
	}
}
