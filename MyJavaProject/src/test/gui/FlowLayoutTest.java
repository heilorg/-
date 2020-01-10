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
	JPanel jp = new JPanel(); // �г� �ʱ�ȭ
	
	JButton jb1 = new JButton("��ư1");
	JButton jb2 = new JButton("��ư2");
	JButton jb3 = new JButton("��ư3");
	JButton jb4 = new JButton("��ư4");
	JButton jb5 = new JButton("��ư5");
	JButton jb6 = new JButton("��ư6");
	
	public FlowLayoutTest() {
		super("FlowLayout"); // setTitle�� ����
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
	public void actionPerformed(ActionEvent e) { //�������̵带 ���ϸ� ����
		if(e.getSource() == jb1) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��1");
		}
		
		if(e.getSource() == jb2) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��2");
		}
		
		if(e.getSource() == jb3) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��3");
		}
		
		if(e.getSource() == jb4) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��4");
		}
		
		if(e.getSource() == jb5) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��5");
		}
		
		if(e.getSource() == jb6) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��6");
		}
	}
}
