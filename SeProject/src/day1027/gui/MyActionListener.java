package day1027.gui;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

/*버튼에는 클릭이벤트 감지 해보자*/
public class MyActionListener implements ActionListener{
	JButton bt;
	JTextArea area;
	TextField field;
	public MyActionListener(JButton bt, JTextArea area, TextField field) {
		this.bt = bt;
		this.area = area;
		this.field = field;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bt) {
			System.out.println("성공");
			String msg = this.field.getText();//텍스트 필드 값을 구하자
			
			if(msg.equals("")) {
				this.area.append("");
				this.field.setText("");				
			}else {
				this.area.append(msg+"\n");
				this.field.setText("");								
			}
			
		}else{
			System.out.println("실패");
			
		}
	}
}
