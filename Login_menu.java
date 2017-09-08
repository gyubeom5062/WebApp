package dbTerm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Login_menu implements ActionListener {

	private JMenuBar menubar = new JMenuBar();	// ¸Þ´º
	private JMenu menu = new JMenu("Menu");
	private JMenuItem openMenu= new JMenuItem("Open");
	private JMenuItem loginMenu= new JMenuItem("Login");
	private String name;
	private String password;
	StaffLogin LOGIN;
	private OpenFile OPEN_FILE;
	int staffState= 0;
	String staffNN = "";
	
	SelectMenu SM;
	
	public Login_menu(PosSys Pos) {	
		menubar.setBounds(0, 0, 560, 25);
		Pos.POS_FRAME.panel.add(menubar);
		menu.add(openMenu);
		menu.add(loginMenu);
		menubar.add(menu);
		
		loginMenu.addActionListener(this);
		openMenu.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == loginMenu) {			
			LOGIN = new StaffLogin(this);
		}
		else if (ae.getSource() == openMenu) {
			try {
				OPEN_FILE = new OpenFile(SM);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
