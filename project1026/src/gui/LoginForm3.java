package gui;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextField;

class LoginForm3 extends Frame{
		Panel p_center = new Panel();
		Panel p_south = new Panel();
		Label la_id = new Label("ID");
		Label la_pass = new Label("Password");
		TextField t_id = new TextField(15);
		TextField t_pass = new TextField(15);
		Button bt_login = new Button("로그인");
		Button bt_regist = new Button("가입");

	public LoginForm3(){

		p_center.setBackground(Color.green);
		p_center.setLayout(new GridLayout(2, 2));
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);


		p_south.setBackground(Color.yellow);
		p_south.add(bt_login);
		p_south.add(bt_regist);

		add(p_center, BorderLayout.CENTER);
		add(p_south, BorderLayout.SOUTH);				


		setSize(400, 150);
		setVisible(true);
	}

	public static void main(String[] args){
		new LoginForm3();
	}

}
