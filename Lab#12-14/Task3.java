import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Task3 extends JFrame implements ActionListener{
	
	Container c=getContentPane();
	String[] arr={"MALE","FEMALE"};
	JLabel name=new JLabel("NAME ");
	JLabel gender=new JLabel("GENDER ");
	JLabel fathername=new JLabel("FATHER NAME ");
	JLabel password=new JLabel("PASSWORD ");
        JLabel Cpassword=new JLabel("CONFIRM PASSWORD ");
	JLabel city=new JLabel("CITY ");
	JLabel email=new JLabel("EMAIL ");
	JTextField nameT=new JTextField();
	JTextField fatherT=new JTextField();
	JPasswordField passwordT=new JPasswordField();
        JPasswordField CpasswordT=new JPasswordField();
        JTextField cityT=new JTextField();
	JTextField emailT=new JTextField();
	JComboBox genderBox=new JComboBox(arr);
	JButton reg=new JButton("REGISTER ");
	JButton reset=new JButton("RESET ");
//        JDialog d=new JDialog(this,"Dialog");

        public Task3(){
            super("Registration Form");
	c.setLayout(null);
        c.setBackground(Color.PINK);
	sizeOfComponents();	
	addComponentToContainer();
        //actions();
	
	}	

	public void sizeOfComponents(){
		name.setBounds(50,150,100,40);
		gender.setBounds(50,190,120,40);
		fathername.setBounds(50,230,140,40);
		password.setBounds(50,270,160,40);
                Cpassword.setBounds(50,310,180,40);
		city.setBounds(50,350,200,40);
		email.setBounds(50,390,220,40);
		nameT.setBounds(200,150,200,30);
		genderBox.setBounds(200,190,200,30);
		fatherT.setBounds(200,230,200,30);
		passwordT.setBounds(200,270,200,30);
                CpasswordT.setBounds(200, 310, 200, 30);
		cityT.setBounds(200,350,200,30);
		emailT.setBounds(200,390,200,30);
		reg.setBounds(80,440,110,45);
		reset.setBounds(260,440,110,45);
                reg.addActionListener(this);
                reset.addActionListener(this);
            
        }
        
    @Override
                public void actionPerformed(ActionEvent e){
                if(e.getSource()==reg){
                    int d=genderBox.getSelectedIndex();
                    
                 
                    String [] s={"Name = "+ nameT.getText(),"Father Name = " +fatherT.getText(),"Gender = "+ genderBox.getSelectedItem().toString(),"Password = " +new String(CpasswordT.getPassword())  ,"City = "+cityT.getText(),"Email = "+emailT.getText()};
                     JOptionPane.showConfirmDialog(this,s, "Confirmation Message",JOptionPane.PLAIN_MESSAGE);
                }
                else if(e.getSource()==reset){
                nameT.setText("   ");
                    fatherT.setText("   ");
                   genderBox.setSelectedIndex(0);
                    passwordT.setText("   ");
                    CpasswordT.setText("   ");
                    cityT.setText("   ");
                    emailT.setText("   ");}
                }    
        

	public void addComponentToContainer(){
		c.add(name);
		c.add(gender);
		c.add(fathername);
		c.add(password);
                c.add(Cpassword);
                c.add(city);
		c.add(email);
		c.add(nameT);
		c.add(genderBox);
		c.add(fatherT);
		c.add(passwordT);
                c.add(CpasswordT);
                c.add(cityT);
		c.add(emailT);
		c.add(reg);
		c.add(reset);
	}
        
             

	public static void main(String[] args) throws Exception {
		Task3 a=new Task3();
		a.setVisible(true);
		a.setBounds(30,30,570,700);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setResizable(true);

}}