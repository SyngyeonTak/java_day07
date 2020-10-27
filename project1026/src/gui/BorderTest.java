/*
���� ������Ʈ�� �÷����� ����, � ������� �÷��������� �����ϴ� ���� ��ġ��� �ϸ�
AWT���� �����ϴ� ��ġ�� ������ ���� 5���� ������ �ִ�.
1) FlowLayout: �� �������� �ü��� ��ġ���, ���� ������ �����ϸ� ���� ������ 
					��������. �����̳��� ũ�⿡ ���� �帣�� ��ġ�� �ǹǷ� flow
					��� ���� �ο��Ǿ���.
2) BorderLayout: ��, ��, ��, ��, �߾� �̶�� ������ ���� ��ġ���
3) GridLayout: ���� �����  ��ġ���
4) CardLayout: ī��ó�� �ϳ��� ī�尡 ���� ���� �ٸ� ī�尡 �� ���̴� ����� ��ġ
5) GridBagLayout: GridLayout�� �ȼ������� ���ϰ� ������ �� �ִ� ��ġ���

��ǻ� 1, 2, 3�������ε� ����� ������ �����ϴ�. 

*/
package gui;
import java.awt.Frame;
import java.awt.Button;
import java.awt.BorderLayout;
class BorderTest{
	public static void main(String[] args){
		//BorderLayout �н�
		Frame frame = new Frame();

		Button bt_north = new Button("North");
		Button bt_south = new Button("South");
		Button bt_west = new Button("West");
		Button bt_east = new Button("East");
		Button bt_center = new Button("Center");

		//��ġ ����� ��������
		//1.BorderLayout ����
		frame.setLayout(new BorderLayout());

		//��ư�� �����ӿ� ���̱�
		//���(public static final)�� �빮�ڷ� ���� ���� ��Ģ
		//frame.add(bt_north, BorderLayout.NORTH);//���ʿ� ��ư ����
		frame.add(bt_south, BorderLayout.SOUTH);//���ʿ� ��ư ����
		//frame.add(bt_west, BorderLayout.WEST);//���ʿ� ��ư ����
		frame.add(bt_east, BorderLayout.EAST);//���ʿ� ��ư ����
		frame.add(bt_center);//����� ��ư ����, ������ ������� ������ center�̴�

		//������ ����
		frame.setSize(250, 200);
		frame.setVisible(true);
	}
}
