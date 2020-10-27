/*1) �۾� ũ�� ���� ctrl + (-+)Ű
 * 2) window > preferences > General > Appearence > Colors and Fonts > Basic
 * 		Verdana ü ��å
 * 3) ����� ��� ���� ctrl + shift + L
 * 4) �ڵ� ����Ʈ: ctrl + shift + o
 * 5) �ڵ� ����: ctrl + shift + f
 * 6) �ش� ��ü�� api ���� �ٷΰ���: �ش� Ŭ���� Ŀ�� �ø��� shift +F2(���Ű)
 * 		���ͳ� ���� ��
 * 7) ��� sout �̶�� ����ܾ� �Է°� ���ÿ� ctrl + space
 * 8) �� ���� �� Alt + ����Ű (�ڵ� �� �̵��ϱ�)
 * 9) �� ���� �� ctrl + alt +����Ű �Ʒ�(����)
 * */
package day1027.gui;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class RadioTest extends Frame{
	// �ڹٿ����� üũ�ڽ��� ������ �����
	CheckboxGroup group;
	
	
	public RadioTest() {
		group = new CheckboxGroup(); 
		setLayout(new FlowLayout());
		this.add(new Checkbox("운동", group, false));
		this.add(new Checkbox("독서", group, false));
		this.add(new Checkbox("컴퓨터", group, false));
		this.add(new Checkbox("요리", group, false));
		this.add(new Checkbox("애견돌보기", group, true));

		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.println("안깨짐");
		new RadioTest();
		
	}

}













