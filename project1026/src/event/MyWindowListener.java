package event;

import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;

/*������â�� ������� �߻��� �� �ִ� �̺�Ʈ�� �����ϴ� ������ �����ϱ�*/
public class MyWindowListener implements WindowListener{

	//���� â�� Ȱ��ȭ ��ų��..(�� Ŀ���� ���� â�� �ö�� ������� ��)
	public void windowActivated(WindowEvent e){
		System.out.println("Activated");
	}

	//â�� ������
	public void windowClosed(WindowEvent e){
		System.out.println("Closed");
	}

	//�ݱ� ��ư�� ���� ��(â�� �������� ����)
	public void windowClosing(WindowEvent e){
		System.out.println("Closing");
	}

	//â�� ��Ȱ��ȭ �� ��
	public void windowDeactivated(WindowEvent e){
		System.out.println("Deactived");
	}


	//������ȭ�� �ݴ�
	public void windowDeiconified(WindowEvent e){
		System.out.println("Deiconified");
	}

	//�ּ�ȭ ��ư�� ���� ������ȭ ��ų ��
	public void windowIconified(WindowEvent e){
		System.out.println("Iconified");
	}

	//â�� �� ��
	public void windowOpened(WindowEvent e){
		System.out.println("Opened");
	}

}
