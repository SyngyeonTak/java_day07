/*
�����쿡 �� �� �ִ� ���� ������Ʈ �˾ƺ���
ex) ��ư, �ؽ�Ʈ�ʵ�, ���� �ڽ�, üũ�ڽ�, ���̽�, �̹���, textarea....
*/
package gui;
import java.awt.Frame; //����Ϸ��� Ŭ������ ��ġ ���
									//��򰡿� .class�� �����ϱ� ������ ��밡���� ���̴�.
import java.awt.Button;								
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Checkbox;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.Image;
import java.awt.Toolkit;
class App1{
	public static void main(String[] args){
		/*������ ����*/
		
		/* ���� ó�� ���� Ŭ������ ������ �� ��ó�� 
		 ����, ��ó�ڼ�0) ����Ϸ��� Ŭ������ ���� � �������� �����Ǵ� ������ �� �뵵�� �ľ�
		 ����, ��ó�ڼ�1) �ڹ��� ��� ��ü�� �ᱹ 3���� �����ۿ� ����
		 ����, ��ó�ڼ�2) Ŭ������ ����� ���� ���̴�. ���� �޸𸮿� �ø��� ���� �˸� �ȴ�.
	
			 1) �Ϲ� Ŭ����: new�ϸ� �ȴ�!! new ���� ����������(API������ ����)
			 2) �߻� Ŭ����: new�� �Ұ��ϹǷ�, �ڽ��� �����ؼ� new�ϰų� �̹� �����ϴ� 
			 				�ν��Ͻ��� �������ش�.(API ���� ����)
			 3) �������̽� : new �Ұ��ϹǷ�, �ڽ��� �����ؼ� new�ϰų� �̹� ������ 
			 				�ν��Ͻ��� ����ϸ� �ȴ�.(API ���� ����)

			����) ���� -> Ŭ������ ���� ���Ǻ�(�Ϲ�, �߻�, �������̽��� ����...)
		*/

		//ó��������, �Ϲ��̱⶧���� new ������ ���� �����ڸ� �����ؼ� ����ϸ� �ȴ�.
		Frame frame = new Frame();//�ڹ� ������ ���α׷������� �����츦 ǥ��
		//�������� default�� ���� ������ �ʴ´�. ���� ���̵��� �޼��带 ȣ���ؾ� �ȴ�.
		frame.setVisible(true);//window��ü�� ���� ��ӹ��� �޼���
		//�Ű������δ� ������ ����� �� �ִ�.
		frame.setSize(300, 400);//api ã�ƺ���

		//�����찡 �����Ǿ����Ƿ�, ������ �ȿ� ��ġ�� ���� ������Ʈ�� �÷����ƺ���!
		//��ư Button(�Ϲ�, �߻�, �������� ��, �Ϲ� new ����������)

		Button button = new Button("����ư");

		//��ư�� �����ϱ� ����, ���̾ƿ� ��Ÿ���� ���ؾ��ϴµ�, ���̾ƿ��� ���Ŀ� �˷���
		//�ϴ� FLowLayout�� ����غ���
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);//�����쿡 �÷ο� ����� ��ġ����

		frame.add(button);//add�޼����� �Ű������� Componenet���̹Ƿ�,
		//Button�� Component�� �ڽ��̱� ������ ���� �ڷ����� �ش��Ͽ�, add() �޼�����
		//�μ��� �� �� �ִ�!!

		//html ������ input type = "text" �ڹٿ����� TestField�� �Ѵ�.
		TextField tf = new TextField("�ڹ� awt",30);
		frame.add(tf);
		//Checkbox�� ����
		Checkbox cb = new Checkbox();
		frame.add(cb);

		//TextArea����
		TextArea ta = new TextArea("java");
		frame.add(ta);

		Label la = new Label("ȸ������ ����Դϴ�.");;
		frame.add(la);

		//�̹��� �ֱ�
		//Image�� �߻�Ŭ�����̸�, �÷���(win, mac, linux....)�� ������ ������� ���� �� �ִ�.
		//�÷����� �°� ����������, Toolkit Ŭ�����κ��� ��θ� ���� �Ѵ�.
		Toolkit kit = Toolkit.getDefaultToolkit();//static �޼���!! ���� Ŭ����������
																	//������ �� �ִ�.
		//Toolkit�� �̹����� ���û��� ��η� ���� ���� �� �ִ�.
		//C:/����/ETC/�п�/workspace/java_workspace/project1026/src/res/hamburgur.png
		//��� ��� �� ������ ��: �� �����ô� ������ os������ ����ϴ� ǥ���̹Ƿ�
		// os�� ����Ƿ���, ��� �߸����� ��η� �����Ѵ�.
		Image img = kit.getImage("C:/����/ETC/�п�/workspace/java_workspace/project1026/src/res/hamburgur.png");
		System.out.println("�̹��� �ּҰ���"+img);
		//ȭ�鿡 ����ϴ� ������ ���� �Ұ�.. ��?? ���ݱ��� html ������ �̹����� 
		//html ������ ���ٿ��� ����������, �ڹٿ� ���� �Ϲ����� ������ ����� ���α׷��� ������
		//������(���� �׸��� �۾�)�� �ؾ� �ϱ� �����̴�.

	}
}
