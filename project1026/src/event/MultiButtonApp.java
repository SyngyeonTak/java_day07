/*
������ ������ ������Ʈ�� 2���̻��� ��, ������ ���� ���
*/
package event;
import java.awt.*;
import java.awt.event.*;
class MultiButtonApp extends Frame{
	Button bt1, bt2;

	public MultiButtonApp(){
		bt1 = new Button("��ư1");
		bt2 = new Button("��ư2");

		bt1.addActionListener(new MultiActionListener());
		bt2.addActionListener(new MultiActionListener());
		add(bt1);
		add(bt2);
		setLayout(new FlowLayout()); //��ư�� ũ�⸦ ������ ũ���...
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args){
		new MultiButtonApp();
	}
}
