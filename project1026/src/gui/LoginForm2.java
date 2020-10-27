package gui;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

class LoginForm2 extends Frame{//loginForm�� �ø��� ���� Frame�� ���� ���̴�.
	/*has a ����� ��������� ��ü���� ���� �ǹ��Ѵ�.*/
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_regist;
	Panel p_center;//���Ϳ� �׸��带 ������ �г�
	Panel p_south; //���ʿ� ���� �г�(���⿡ ��ư 2�� ���� ����)	

	public LoginForm2(){
		//��ǰ����� ������ �������� ��� �ʱ�ȭ ��Ű��
		//Ư�� ��ǰ��, �� ��ü�� �¾ �� ���� �Բ� �¾�� �ϹǷ� ,�������� Ÿ�̹��� ��ġ�� ����.
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField(15);
		t_pass = new TextField(15);
		bt_login= new Button("Login");
		bt_regist = new Button("Sign up");
		p_center = new Panel();
		p_south = new Panel();

		//������ �� �����̰�, ���� �����̳� ��Ÿ���� �ο����� �ʾ���...
		//Frame�� �����ڰ� ���̾ƿ��� �������� ������ ����Ʈ�� BorderLayout�̴�.
		//this.setLayout(new BorderLayout());//�ʿ� ����!! ��? ����Ʈ�� �̹� Borderlayout�̴�

		p_center.setBackground(new Color(153, 255, 0));
		this.add(p_center, BorderLayout.CENTER);

		//����� �������� �ο��� �������̴�. final�� ���̻� ���� ������ �� ������, stati���� �ν��Ͻ���
		//������ �����ϸ�, public���� �����Ͽ�, ��� ��ü�� ������ �� �ֵ��� ���������� Ǯ�� ���� ������
		p_south.setBackground(Color.YELLOW);//Color�� �ΰ��� ����ϱ� ���� �����ͷ� ����غ���
		this.add(p_south, BorderLayout.SOUTH);

		//p_center���ٰ� �׸��� ����

		p_center.setLayout(new GridLayout(2, 2));
		p_center.add(la_id);//id �� ����
		p_center.add(t_id);//id �ؽ�Ʈ�ڽ� ����

		p_center.add(la_pass);//pass �� ����
		p_center.add(t_pass);//pass �ؽ�Ʈ�ڽ� ����
        
		//Panel�� �ƹ��� ��ġ�����ڸ� �������� ������ ����Ʈ�� FlowLayout�̴�.
		p_south.add(bt_login);
		p_south.add(bt_regist);
		/*this�� ��Ȯ�� �ǹ� : ���۷��� �����̴�. ��, �� �ڽ��� �ν��Ͻ��� �ּҰ��� ����
		�ش� �ν��Ͻ��� �ڱ� �ڽ��� ����ų ��... this�� heap�� ����Ǿ�����
		(heap ������ �ö� �ν��Ͻ� ��ü�� ����Ŵ)
		this�� ������ �ƴϴ� (Ź�¿��� stack�� ����ǰ� ��(this)�� heap�� ����Ǵ� ���۷��� �����̴�.)
		super���� heap�� ����Ǵ� ���۷��� �����̴�.
		this�� �ν��Ͻ��� �����ǰ� ������ �� �� �ְ� �ν��Ͻ� �������� �� �� �ִ�.
		(�ֳ��ϸ� heap������ �ö󰡾� �� �� �ֱ� �����̴�.)
		*/
		this.setSize(400, 150);	//���� �������� (this.�� ������)
		this.setVisible(true);
	}

	public static void main(String[] args){
		new LoginForm2();
	}
}
