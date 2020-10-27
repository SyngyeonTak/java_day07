/*
윈도우에 들어갈 수 있는 여러 컴포넌트 알아보기
ex) 버튼, 텍스트필드, 라디오 박스, 체크박스, 초이스, 이미지, textarea....
*/
package gui;
import java.awt.Frame; //사용하려는 클래스의 위치 등록
									//어딘가에 .class로 존재하기 때문에 사용가는할 것이다.
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
		/*윈도우 생성*/
		
		/* 난생 처음 보는 클래스를 만났을 때 대처법 
		 대응, 대처자세0) 사용하려는 클래스가 대충 어떤 목적으로 지원되는 것인지 그 용도를 파악
		 대응, 대처자세1) 자바의 모든 객체는 결국 3가지 유형밖에 없다
		 대응, 대처자세2) 클래스는 쓰라고 만든 것이다. 따라서 메모리에 올리는 법을 알면 된다.
	
			 1) 일반 클래스: new하면 된다!! new 뒤의 생성자조사(API문서를 통해)
			 2) 추상 클래스: new가 불가하므로, 자식을 정의해서 new하거나 이미 존재하는 
			 				인스턴스를 지원해준다.(API 문서 통해)
			 3) 인터페이스 : new 불가하므로, 자식을 정의해서 new하거나 이미 구현한 
			 				인스턴스를 사용하면 된다.(API 문서 통해)

			깨알) 수평선 -> 클래스에 대한 정의부(일반, 추상, 인터페이스를 구분...)
		*/

		//처음보지만, 일반이기때문에 new 다음에 오는 생성자를 조사해서 사용하면 된다.
		Frame frame = new Frame();//자바 윈도우 프로그램에서의 윈도우를 표현
		//프레임은 default가 눈에 보이지 않는다. 따라서 보이도록 메서드를 호출해야 된다.
		frame.setVisible(true);//window객체로 부터 상속받은 메서드
		//매개변수로는 논리값을 사용할 수 있다.
		frame.setSize(300, 400);//api 찾아보기

		//윈도우가 생성되었으므로, 윈도우 안에 배치할 각종 컴포넌트를 올려놓아보자!
		//버튼 Button(일반, 추상, 인터조사 후, 일반 new 생성자조사)

		Button button = new Button("나버튼");

		//버튼을 부착하기 전에, 레이아웃 스타일을 정해야하는데, 레이아웃은 추후에 알려줌
		//일단 FLowLayout을 사용해보자
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);//윈도우에 플로우 방식의 배치적용

		frame.add(button);//add메서드의 매개변수는 Componenet형이므로,
		//Button도 Component의 자식이기 때문에 같은 자료형에 해당하여, add() 메서드의
		//인수로 올 수 있다!!

		//html 에서의 input type = "text" 자바에서는 TestField라 한다.
		TextField tf = new TextField("자바 awt",30);
		frame.add(tf);
		//Checkbox도 등장
		Checkbox cb = new Checkbox();
		frame.add(cb);

		//TextArea등장
		TextArea ta = new TextArea("java");
		frame.add(ta);

		Label la = new Label("회원가입 양식입니다.");;
		frame.add(la);

		//이미지 넣기
		//Image는 추상클래스이며, 플랫폼(win, mac, linux....)이 지정한 방식으로 얻을 수 있다.
		//플랫폼에 맞게 가져오려면, Toolkit 클래스로부터 경로를 얻어야 한다.
		Toolkit kit = Toolkit.getDefaultToolkit();//static 메서드!! 따라서 클래스명으로
																	//접근할 수 있다.
		//Toolkit은 이미지를 로컬상의 경로로 부터 얻어올 수 있다.
		//C:/공부/ETC/학원/workspace/java_workspace/project1026/src/res/hamburgur.png
		//경로 사용 시 중의할 점: 역 슬래시는 윈도우 os에서만 사용하는 표기이므로
		// os가 실행되려면, 사실 중립적인 경로로 가야한다.
		Image img = kit.getImage("C:/공부/ETC/학원/workspace/java_workspace/project1026/src/res/hamburgur.png");
		System.out.println("이미지 주소값은"+img);
		//화면에 출력하는 수업은 오늘 불가.. 왜?? 지금까지 html 에서는 이미지를 
		//html 문서에 덧붙여서 구현했으나, 자바와 같은 일반적인 컴파일 기반의 프로그래밍 언어에서는
		//렌더링(직접 그리는 작업)을 해야 하기 때문이다.

	}
}
