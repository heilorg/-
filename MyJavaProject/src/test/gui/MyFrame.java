package test.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class MyFrame extends JFrame implements ActionListener {
	JButton button;
	
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x버튼 누르면 종료
		setTitle("My Frame"); // 제목
		setLayout(new FlowLayout()); // 레이아웃 설정 flow는 순서대로
		button = new JButton("버튼"); // 버튼 생성
		button.addActionListener(this); // 이벤트 등록
		add(button); // 레이아웃에 버튼 추가
		setVisible(true); // 화면에 보이기
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //오버라이드를 안하면 에러
		if(e.getSource() == button) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인");
		}
	}
}
