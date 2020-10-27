package event;
import java.awt.Frame;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.Choice;

class MyWin extends Frame{
					/*MyWin is a Frame*/
	Button bt ;//MyWin has a bt
	TextField t;
	Choice ch;
	public MyWin(){
		bt = new Button("�� ������");
		t = new TextField(15);
		ch = new Choice();
		ch.add("Java Programming");
		ch.add("JSP Programming");
		ch.add("Android Programming");
		ch.add("Spring Programming");
		ch.add("Mybatis Programming");
		ch.addItemListener(new MyItem());

		this.setLayout(new FlowLayout());
		this.add(bt); //�������� ����Ʈ�� BorderLayout�̹Ƿ� ���� ������ ũ�� ���� ����
		this.add(t);
		
		this.addMouseListener(new MyMouse());
		this.addWindowListener(new MyWindowListener());
		bt.addActionListener(new MyListener());//��ư�� ������ ���� !!!
		t.addKeyListener(new MyKey());
		this.add(ch);
		this.setSize(300, 400);
		this.setVisible(true);

	}
	
	public static void main(String[] args){
		new MyWin();
	}
}
