package test.gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class FlowLayoutTest extends JFrame implements ActionListener {
	JPanel jp = new JPanel(); // 패널 초기화
	
	JButton jb1 = new JButton("버튼1");
	JButton jb2 = new JButton("버튼2");
	JButton jb3 = new JButton("버튼3");
	JButton jb4 = new JButton("버튼4");
	JButton jb5 = new JButton("버튼5");
	JButton jb6 = new JButton("버튼6");
	
	public FlowLayoutTest() {
		super("FlowLayout"); // setTitle과 동일
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		jb6.addActionListener(this);
		
		jp.setLayout(new FlowLayout());
		add(jp);
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new FlowLayoutTest();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //오버라이드를 안하면 에러
		if(e.getSource() == jb1) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인1");
		}
		
		if(e.getSource() == jb2) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인2");
		}
		
		if(e.getSource() == jb3) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인3");
		}
		
		if(e.getSource() == jb4) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인4");
		}
		
		if(e.getSource() == jb5) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인5");
		}
		
		if(e.getSource() == jb6) { // e.getSource 는 이벤트가 발생한 오브젝트를 반환
			JOptionPane.showMessageDialog(this, "확인6");
		}
	}
}
