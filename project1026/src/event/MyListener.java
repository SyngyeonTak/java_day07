/*
jvm�� ������κ���, �̺�Ʈ ������ ������, �ش� ������ ������ ���� �˸´�
�̺�Ʈ ��ü�� �ν��Ͻ��� �޸𸮿� �ø���, �� �÷��� �ν��Ͻ� ������
�����Ͷ�� �Ҹ��� , �̺�Ʈ ���� ��ü���� ���޵Ǿ�����.
�� �� �����ʺz ��ü�� �ҿ����� �������̽��� �����Ǵµ�, �� ������ Ŭ������ ������ ��
���� ��� ó���� ���� ���� �����ڰ� ������� �ϱ� �����̴�.
��) Ŭ�� �̺�Ʈ�� �ڹٿ����� �׼��̺�Ʈ��� �ϰ� �ش� ��ü�� ActionEvent�̴�.
�� ActionEvent�� �ν��Ͻ��� ����ڰ� Ŭ���� �� ������ �����Ϳ��� ���޵Ǿ�����
�����ڴ� �� �������� �߻�޼��带 �����������ν�, �ϰ� ���� ������ �ϼ������� �ȴ�..
*/
package event;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyListener implements ActionListener{
	/*MyListener is a ActionListener*/

	public void actionPerformed(ActionEvent e){
		System.out.println("�� ������?");
	}
}
