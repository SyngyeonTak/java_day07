/*
동일한 종류의 컴포넌트가 2개이상일 때, 리스너 연결 방법
*/
package event;
import java.awt.*;
import java.awt.event.*;
class MultiButtonApp extends Frame{
	Button bt1, bt2;

	public MultiButtonApp(){
		bt1 = new Button("버튼1");
		bt2 = new Button("버튼2");

		bt1.addActionListener(new MultiActionListener());
		bt2.addActionListener(new MultiActionListener());
		add(bt1);
		add(bt2);
		setLayout(new FlowLayout()); //버튼의 크기를 본연의 크기로...
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args){
		new MultiButtonApp();
	}
}
