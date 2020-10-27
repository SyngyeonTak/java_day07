package day1027.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MemoApp extends JFrame{
	JMenuBar bar;//메뉴들을 올려놓을 막대
	JMenu m_file, m_edit, m_style, m_view, m_help;
	JMenuItem[] items; // m_file 메뉴의 하위 메뉴로 총 8개의 아이템을 추가해본다!!
	String[] item_name = {"새로만들기", "새 창", "열기", "저장", "다른 이름으로 저장", "페이지 설정", "인쇄", "끝내기"};
	JTextArea area;
	JScrollPane scroll; //area에 붙여질 스크롤
	
	public MemoApp() {
		bar = new JMenuBar();//바 생성
		//메뉴들 생성
		m_file = new JMenu("파일");
		m_edit = new JMenu("편집");
		m_style = new JMenu("서식");
		m_view = new JMenu("보기");
		m_help = new JMenu("도움말");
		
		items = new JMenuItem[item_name.length];
		
		
		for(int i =0; i< items.length; i++) {
			items[i] = new JMenuItem(item_name[i]); 
			//5번째에 도달하면 구분선 추가
			if(i==5 || i==7){
				m_file.addSeparator();
			}
			m_file.add(items[i]);
		}
		
		area = new JTextArea();
		scroll = new JScrollPane(area);//스크롤 달고 싶은 컴포넌트를 생성자 매개변수로 넣는다.
		
		//bar에 메뉴 붙이기
		bar.add(m_file);
		bar.add(m_edit);
		bar.add(m_style);
		bar.add(m_view);
		bar.add(m_help);
		
		//바는 워낙 특수성이 있기 때문에 배치관리자와 상관없이 언제나 윈도우에 상단 영역에 붙여진다.
		this.setJMenuBar(bar);//JFrame에 bar 부착!!
		add(scroll);
		
		//bar 스타일 적용
		bar.setBackground(Color.BLACK);
		m_file.setForeground(Color.WHITE);
		m_edit.setForeground(Color.WHITE);
		m_style.setForeground(Color.WHITE);
		m_view.setForeground(Color.WHITE);
		m_help.setForeground(Color.WHITE);
		
		//메뉴의 크기 조정
		m_file.setPreferredSize(new Dimension(100, 45));
		m_edit.setPreferredSize(new Dimension(100, 45));
		m_style.setPreferredSize(new Dimension(100, 45));
		m_view.setPreferredSize(new Dimension(100, 45));
		m_help.setPreferredSize(new Dimension(100, 45));
		
		//스타일 적용
		area.setBackground(Color.YELLOW);//area배경색 바꾸기
		area.setFont(new Font("돋움체", Font.ITALIC|Font.BOLD, 20));
		area.setForeground(Color.RED);
		
		setSize(700, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MemoApp();
	}
}









