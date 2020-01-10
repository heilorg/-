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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // x��ư ������ ����
		setTitle("My Frame"); // ����
		setLayout(new FlowLayout()); // ���̾ƿ� ���� flow�� �������
		button = new JButton("��ư"); // ��ư ����
		button.addActionListener(this); // �̺�Ʈ ���
		add(button); // ���̾ƿ��� ��ư �߰�
		setVisible(true); // ȭ�鿡 ���̱�
	}
	
	@Override
	public void actionPerformed(ActionEvent e) { //�������̵带 ���ϸ� ����
		if(e.getSource() == button) { // e.getSource �� �̺�Ʈ�� �߻��� ������Ʈ�� ��ȯ
			JOptionPane.showMessageDialog(this, "Ȯ��");
		}
	}
}
