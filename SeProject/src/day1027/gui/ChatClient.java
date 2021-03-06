package day1027.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ChatClient extends JFrame implements KeyListener{
								/* is a 						is a*/
	JPanel p_center, p_south;
	JTextArea area;
	JScrollPane scroll;
	TextField field;
	JButton bt;
	
	public ChatClient() {
		//생성
		area = new JTextArea();
		scroll = new JScrollPane(area);
		p_south = new JPanel();
		field = new TextField(25);
		bt = new JButton("send");

		//조립(패널은 디폴트가 FlowLayout)

		p_south.add(field);
		p_south.add(bt);
		
		
		add(scroll);//센터에 스크롤 부착
		add(p_south, BorderLayout.SOUTH);//남쪽에 패널 부착
		
		//스타일 적용
		area.setBackground(Color.YELLOW);
		field.setBackground(Color.BLUE);
		field.setForeground(Color.WHITE);
		bt.setForeground(Color.WHITE);
		bt.setBackground(Color.BLACK);
		
		field.setPreferredSize(new Dimension(285, 30));
		
		//보여주기 전에 미리 연결하자(컴포넌트와 리스너 연결)
		bt.addActionListener(new MyActionListener(bt, area, field));
		field.addKeyListener(this);
		setSize(300, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	//어노테이션이다.. java5부터 지원되는 일종의 주석... 일반적인 주석은 프로그램에 관여하지 않지만
	//어노테이션 프로그래밍에서 어떤 표시를 하기 위함이므로, 자주 사용됨...
	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		
	}
	
	public void keyReleased(KeyEvent e) {//눌렀다 떼는 것
		//엔터키를 누르면, area에 입력데이터를 반영하자~!(누적 시키자)
		int key = e.getKeyCode(); //키 코드 값 반환
		if(key == 10) {
			String msg = field.getText();//텍스트 필드 값을 구하자
			area.append(msg+"\n");
			field.setText("");
		}
	}
	
	public static void main(String[] args) {
		new ChatClient();
	}

}










