package gui;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.Dimension;

class LoginForm{
	public static  void main(String[] args){
		Frame frame = new Frame();
		Panel p1 = new Panel();
		Panel p2 = new Panel();

		BorderLayout layout1 = new BorderLayout();
		GridLayout layout2 = new GridLayout(2, 2);
		
		//p1 영역
		p1.setLayout(layout2);
		Label label1 = new Label("ID");
		Label label2 = new Label("PW");
		TextArea area1 = new TextArea();
		area1.setPreferredSize(new Dimension(20,20));
		TextArea area2 = new TextArea();
		area2.setPreferredSize(new Dimension(20,20));
		p1.add(label1);
		p1.add(area1);
		p1.add(label2);
		p1.add(area2);

		//p2 영역
		Button b1 = new Button("제출");
		Button b2 = new Button("초기화");
		p2.add(b1);
		p2.add(b2);

		frame.setLayout(layout1);
		frame.add(p1, BorderLayout.NORTH);
		frame.add(p2, BorderLayout.SOUTH);

		frame.setSize(400, 150);
		frame.setVisible(true);

		//Label label1 = new Label();
		

	}
}
