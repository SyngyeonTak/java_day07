package string;
class StringTest{
	public static void main(String[] args){
		/*
		String은 클래스다!!!
		하지만 인간은 스트링을 너무 많이 사용하기때문에,
		new 연산자에 의해 스트링을 생성하는 것은 너무 불편하다.
		따라서 String에 한해서는 마치 일반 데이터타입처럼 new를 쓰지 않는 표기를 지원해준다.
		이러한 String의 생성 방법을 암시적, 묵시적(implicit) 생성법이라고 한다.
		묵시적 생성법에 의한 String은 상수풀에의해 관리된다.
		상수풀에 한 번 저장된 값은 추후에 같은 값이 들어오면 원래 저장된 값을 재활용한다.
					a						a'							a
		*/
		/*아래 코드의 수행결과 예측해보기*/
		String s1 = "apple";
		String s2 = "apple";
		System.out.println(s1==s2);//결과는 뭐가 나올까

		/*
		s1를 출력하면 apple이 나오는데 그 이유는
		자동으로 String 내에 있는 toString() 메서드가 출력될 때 호출돼서 문자열이 출력됨
		원래는 객체 특성상 주소값이 출력되어야 하는데 문자열이 출력되는 것임
		*/

		//String은 시작문자가 대문자이므로 분명 객체형이다.
		//우리의 개발환경에서 String.class가 어딘가에 있어야 하는데, 보이지 않는다..

		//명시적(explicit) 생성법이며
		//명시적 생성법은 상수풀에 생성되지 않으므로, new할 때마다 중복 여부를 따지지 않고
		//무조건 생성된다!!
		String s3 = new String("korea");
		String s4 = new String("korea");
		System.out.println(s3==s4);//결과는 뭐가 나올까?

		//주소비교가 아닌, 객체 동일성 비교한는 법
		String k1 = "orange";
		String k2 = "orange";
		System.out.println(k1==k2);//주소
		System.out.println(k1.equals(k2));//내용 비교


	}
}
