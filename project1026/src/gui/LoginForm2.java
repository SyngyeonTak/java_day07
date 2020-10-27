package gui;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Panel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Color;

class LoginForm2 extends Frame{//loginForm을 올리는 것이 Frame을 띄우는 것이다.
	/*has a 관계는 멤버변수가 객체형일 때를 의미한다.*/
	Label la_id;
	Label la_pass;
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_regist;
	Panel p_center;//센터에 그리드를 적용할 패널
	Panel p_south; //남쪽에 붙일 패널(여기에 버튼 2개 붙일 예정)	

	public LoginForm2(){
		//부품관계로 보유한 변수들을 모두 초기화 시키자
		//특히 부품은, 이 객체가 태어날 때 같이 함께 태어나야 하므로 ,생성자의 타이밍을 놓치지 말자.
		la_id = new Label("ID");
		la_pass = new Label("Password");
		t_id = new TextField(15);
		t_pass = new TextField(15);
		bt_login= new Button("Login");
		bt_regist = new Button("Sign up");
		p_center = new Panel();
		p_south = new Panel();

		//생성만 한 상태이고, 아직 조립이나 스타일은 부여하지 않았음...
		//Frame은 개발자가 레이아웃을 지정하지 않으면 디폴트가 BorderLayout이다.
		//this.setLayout(new BorderLayout());//필요 없다!! 왜? 디폴트가 이미 Borderlayout이다

		p_center.setBackground(new Color(153, 255, 0));
		this.add(p_center, BorderLayout.CENTER);

		//상수는 직관성을 부여한 데이터이다. final로 더이상 값을 변경할 수 없으며, stati으로 인스턴스간
		//공유가 가능하며, public으로 선언하여, 모든 객체가 접근할 수 있도록 접근제한을 풀어 놓은 데이터
		p_south.setBackground(Color.YELLOW);//Color를 인간이 사용하기 쉬운 데이터로 사용해보자
		this.add(p_south, BorderLayout.SOUTH);

		//p_center에다가 그리드 적용

		p_center.setLayout(new GridLayout(2, 2));
		p_center.add(la_id);//id 라벨 부착
		p_center.add(t_id);//id 텍스트박스 부착

		p_center.add(la_pass);//pass 라벨 부착
		p_center.add(t_pass);//pass 텍스트박스 부착
        
		//Panel은 아무런 배치관리자를 적용하지 않으면 디폴트가 FlowLayout이다.
		p_south.add(bt_login);
		p_south.add(bt_regist);
		/*this의 정확한 의미 : 래퍼런스 변수이다. 단, 나 자신의 인스턴스의 주소값을 가짐
		해당 인스턴스가 자기 자신을 가리킬 때... this는 heap에 저장되어있음
		(heap 영역에 올라간 인스턴스 자체를 가리킴)
		this는 스택이 아니다 (탁승연은 stack에 저장되고 나(this)는 heap에 저장되는 레퍼런스 변수이다.)
		super또한 heap에 저장되는 레퍼런스 변수이다.
		this는 인스턴스가 생성되고 나서야 쓸 수 있고 인스턴스 내에서만 쓸 수 있다.
		(왜냐하면 heap영역에 올라가야 쓸 수 있기 때문이다.)
		*/
		this.setSize(400, 150);	//내가 프레임임 (this.도 가능함)
		this.setVisible(true);
	}

	public static void main(String[] args){
		new LoginForm2();
	}
}
