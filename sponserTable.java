import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.sql.*;
public class sponserTable extends Frame implements ActionListener
{
	
Dimension di =Toolkit.getDefaultToolkit().getScreenSize();
JLabel lblimg = new JLabel(new ImageIcon("images/black.jpg"));
 JLabel lbhead = new JLabel("SPONSER DETAILS");
 JLabel lbspid = new JLabel("SPONSER ID");
 JLabel lbna = new JLabel("NAME");
 JLabel lbphon = new JLabel("PHONE NO");
 JLabel lbemail = new JLabel("EMAIL ID");
 JLabel lbadd = new JLabel("ADDRESS");
 JTextField txtspid = new JTextField();
 JTextField txtna = new JTextField(); 
 JTextField txtphon = new JTextField();
 JTextField txtemail = new JTextField();
 JTextField txtadd = new JTextField();
 JButton btnew = new JButton(new ImageIcon("images/im/btnn.jpg"));
 JButton btsave = new JButton(new ImageIcon("images/im/btnss.jpg"));
 JButton btser = new JButton(new ImageIcon("images/im/btns.jpg"));
 JButton btedit = new JButton(new ImageIcon("images/im/btne.jpg"));
 JButton btcan = new JButton(new ImageIcon("images/im/btnc.jpg"));
 public sponserTable()
 {
setTitle("Sponser Form");
  setLocation((int)(di.getWidth()/2)-400,(int)(di.getHeight()/2)-350);
  setLayout(null);
  setVisible(true);
  setSize(800,700);
  setBackground(new Color(0,0,0));
  setResizable(false);
  lblimg.setBounds(-2,-100,1000,1000);
  lbhead.setBounds(200,90,450,40);
  lbspid.setBounds(100,190,130,20);
  txtspid.setBounds(330,190,100,40);
  lbna.setBounds(100,250,100,20);
  txtna.setBounds(330,250,200,40);
  lbphon.setBounds(100,310,150,20);
  txtphon.setBounds(330,310,230,40);
  lbemail.setBounds(100,370,100,20);
  txtemail.setBounds(330,370,200,40);
  lbadd.setBounds(100,430,100,20);
  txtadd.setBounds(330,430,250,40);
  btnew.setBounds(10,525,140,50);
  btsave.setBounds(170,525,140,50);
  btser.setBounds(330,525,140,50);
  btedit.setBounds(490,525,140,50);
  btcan.setBounds(650,525,140,50);
  txtspid.setEditable(false);
  Font f1 = new Font("Imprint MT Shadow",Font.BOLD,40);
  Font f2 = new Font("Californian FB",Font.BOLD,20);
  lbadd.setFont(f2);
  lbemail.setFont(f2);
  lbhead.setFont(f2);
  lbna.setFont(f2);
  lbphon.setFont(f2);
  lbspid.setFont(f2);
  Font f3 = new Font("arial",Font.PLAIN,18);
  txtadd.setFont(f3);
  txtemail.setFont(f3);
  txtna.setFont(f3);
  txtphon.setFont(f3);
  txtspid.setFont(f3);
  lbhead.setForeground(new Color(255,192,0));
  btsave.setEnabled(false);
  btedit.setEnabled(false);
  lbhead.setFont(f1);
  add(lbhead);
  add(lbspid);
  add(txtspid);
  add(lbna);
  add(txtna);
  add(lbphon);
  add(txtphon);
  add(lbemail);
  add(txtemail);
  lbna.setForeground(Color.WHITE);
  lbspid.setForeground(Color.WHITE);
  lbemail.setForeground(Color.WHITE);
  lbadd.setForeground(Color.WHITE);
  lbphon.setForeground(Color.WHITE);
  /*lbname.setForeground(Color.WHITE);
  lbphn.setForeground(Color.WHITE);
  lbdp.setForeground(Color.WHITE);
  lbad.setForeground(Color.WHITE);*/
  //add(lblimg);
  add(lbadd);
  add(txtadd);
  add(btnew);
  add(btsave);
  add(btser);
  add(btedit);
  add(btcan);
  
  btnew.addActionListener(this);
  btsave.addActionListener(this);
  btser.addActionListener(this);
  btedit.addActionListener(this);
  btcan.addActionListener(this);
 }
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource() == btnew)
  {
   btsave.setEnabled(true);
   txtspid.setText("");
   txtna.setText("");
   txtphon.setText("");
   txtemail.setText("");
   txtadd.setText("");
   try
   {
   Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
   Statement st = con1.createStatement();
   String str1 = "insert into sponsertbl(SPONSERID,SPONSERNAME,PHONENO,EMAILID,ADDRESS)values(?,?,?,?,?)";
   ResultSet res1 = st.executeQuery("select * from keytable");
   while(res1.next())
   {
    txtspid.setText("S/" + res1.getString(1));
    }
   }
   catch(Exception ee)
   {
       System.out.println(ee);
   }
  }
  if(e.getSource() == btsave)
  {
	  btsave.setEnabled(false);
try
{
   Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
   String str = "insert into sponsertbl(SPONSERID,SPONSERNAME,PHONENO,EMAILID,ADDRESS)values(?,?,?,?,?)";
   PreparedStatement ps = con.prepareStatement(str);

   ps.setString(1,txtspid.getText());
   ps.setString(2,txtna.getText());
   ps.setString(3,txtphon.getText());
   ps.setString(4,txtemail.getText());
   ps.setString(5,txtadd.getText());
   ps.executeUpdate();
   Statement st = con.createStatement();
   str = "update keytable set sponserid=sponserid+1";
   st.executeUpdate(str);
   JOptionPane.showMessageDialog(null,"SAVED");
  }
catch(Exception ee)
{
System.out.println(ee);
}
}
  if(e.getSource() == btser)
  {
	  btedit.setEnabled(true);
try
{ 
    Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
    Statement st = con.createStatement();
    String s=JOptionPane.showInputDialog(null,"Enter Event Id");
    ResultSet res = st.executeQuery("select * from Sponsertbl where sponserid='"+s+"'");
    while(res.next())
    {
     txtspid.setText(res.getString(1));
     txtna.setText(res.getString(2));
     txtphon.setText(res.getString(3));
     txtemail.setText(res.getString(4));
     txtadd.setText(res.getString(5));
    }
}
catch(Exception ee)
{
System.out.println(ee);
}
   }
  if(e.getSource() == btedit)
  { 
    btedit.setEnabled(false);
try
{
    Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
    Statement st = con.createStatement();
    String Str="Update sponsertbl set sponsername='"+txtna.getText()+"',phoneno='"+txtphon.getText()+"',emailid='"+txtemail.getText()+"',address='"+txtadd.getText()+"'where sponserid='"+txtspid.getText()+"'";
    st.executeUpdate(Str);
    JOptionPane.showMessageDialog(null,"Edited");
	}  
  catch(Exception ee)
{
System.out.println(ee);
}
}
  if(e.getSource() == btcan)
  {
   this.dispose();
  }
 }
 public static void main(String args[])
 {
 sponserTable sp = new sponserTable();
 }
}

 