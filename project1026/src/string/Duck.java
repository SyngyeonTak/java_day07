package string;

/*
�ڹ��� ��� ��ü�� ���� ���� �� ���� �ֻ��� ��ü�� �ΰ� �ִ�.
Object ��ü�̴�. �����ڰ� ����� ������� �ʴ��� ����Ʈ�� �̹� ��ӵǾ� �ִ�...
*/
class Duck{
	String name = "����";

	/*�Ʒ��� �޼���� ObjectŬ�����κ��� ��ӹ��� �޼����̸�
	�� �޼���� ��ü�� ��Ʈ������ ��ȯ�ϰ��� �� �� �����Ѵ�.
	�� �Ʒ��� �޼���� , ��ü�� ����ϰ��� �� �� � �ڵ����� �����Ѵ�.
	�Ʒ��� �޼���� Object�� toString()�� �������̵� �� ���̴�.
	*/
	public String toString(){
		System.out.println("toString() �޼��� �����մϴ�.");
		return "";
	}
	public static void main(String[] args){
		Duck d = new Duck();
		//System.out.println(d); //���� ��ü�� �ƴ϶�, ������ �ּҰ�: string.Duck@15db9742
		//System.out.println(new Duck());//���� ��ü�� ���
	}
}
