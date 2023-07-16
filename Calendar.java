import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.applet.*;
import javax.swing.table.DefaultTableModel; 
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Calendar extends Frame implements ActionListener
{
 JLabel lbhd = new JLabel("EVENT  CALENDER");
 JLabel lbevid = new JLabel("EVENT ID");
 JLabel lbname = new JLabel("EVENT TYPE");
 JLabel lbdate = new JLabel("EVENT DATE");
 JLabel lbfiamt = new JLabel("FIXED AMOUNT");
 JLabel lbevamt = new JLabel("EVENT AMOUNT");
 JLabel lbenam = new JLabel("ENTER NEW EVENT :-");
 JTextField txtenam = new JTextField();
 JTextField txtevid = new JTextField();
 JTextField txtevty = new JTextField();
 JTextField txtevamt = new JTextField();
 JTextField txtdate = new JTextField();
 JTextField txtfiamt = new JTextField();
 
 JButton btnew = new JButton(new ImageIcon("images/im/btnn.jpg"));
 JButton btsv = new JButton(new ImageIcon("images/im/btnss.jpg"));
 JButton btsr = new JButton(new ImageIcon("images/im/btns.jpg"));
 JButton bted = new JButton(new ImageIcon("images/im/btne.jpg"));
 JButton btcl = new JButton(new ImageIcon("images/im/btnc.jpg"));
 JButton btnad = new JButton(new ImageIcon("images/im/add.jpg"));
 JButton btnre = new JButton(new ImageIcon("images/im/remove.jpg")); 

 String[] col = {"Event List","Event Amount","Fixed Amount"};
 String tena,evamt,fixedamount;
 Object [] []data ={{tena},{evamt},{fixedamount}};
 DefaultTableModel model = new DefaultTableModel(col,0);
 JTable tblen = new JTable(data,col);
 JScrollPane spanel = new JScrollPane(tblen);
 Dimension d1 = Toolkit.getDefaultToolkit().getScreenSize();
 public Calendar ()
 {
	 setTitle("Event Calender");
	SimpleDateFormat sd= new SimpleDateFormat("dd/MM/yyyy");
	 Date dt = new Date();
	 txtdate.setText(sd.format(dt));
  setLocation((int)(d1.getWidth()/2)-575,(int)(d1.getHeight()/2)-475);
  setLayout(null);
  setVisible(true);
 // int x = (int)d1.getWidth();
  //int y = (int)d1.getHeight();
  setResizable(false);
  setSize(1150,950);
  setBackground(new Color(0,0,0));
  lbhd.setBounds(390,60,460,40);
  lbevid.setBounds(400,180,100,20);
  txtevid.setBounds(690,175,100,30);
  lbname.setBounds(400,250,180,20);
  txtevty.setBounds(690,235,200,30);
  lbdate.setBounds(400,320,120,20);
  txtdate.setBounds(690,295,180,30);
  lbfiamt.setBounds(400,390,160,20);
  txtfiamt.setBounds(690,370,120,30);
  btnew.setBounds(100,480,165,50);
  btsv.setBounds(310,480,165,50);
  btsr.setBounds(520,480,165,50);
  bted.setBounds(730,480,165,50);
  btcl.setBounds(940,480,165,50);
  
    lbenam.setBounds(150,620,240,20);
    txtenam.setBounds(160,670,150,20);
    lbevamt.setBounds(150,730,210,20);
    txtevamt.setBounds(160,780,150,20);
    tblen.setModel(model);
    spanel.setBounds(550,600,300,200);
    btnad.setBounds(530,840,150,40);
    btnre.setBounds(730,840,150,40);
    add (spanel);
    txtevid.setEditable(false);
  Font f1 = new Font("Imprint MT Shadow",Font.BOLD,40);
  Font f2 = new Font("Californian FB",Font.BOLD,20);
   Font f3 = new Font("arial",Font.PLAIN,18);
  lbhd.setForeground(new Color(255,192,0));
  lbhd.setFont(f1);
  lbevid.setFont(f2);
  lbname.setFont(f2);
  lbdate.setFont(f2);
  btnew.setFont(f2);
  lbenam.setFont(f2);
  lbfiamt.setFont(f2);
  btsv.setFont(f2);
  btsr.setFont(f2);
  bted.setFont(f2);
  btcl.setFont(f2);
  lbevamt.setFont(f2);
  txtevamt.setFont(f2);
  txtevid.setFont(f3);
  txtenam.setFont(f3);
  txtfiamt.setFont(f3);
  txtevty.setFont(f3);
  bted.setEnabled(false);
  btsv.setEnabled(false);
  btnad.setBackground(new Color(100,0,50));
  btnre.setBackground(new Color(100,0,50));
  btnew.setBackground(new Color(100,0,50));
  btsv.setBackground(new Color(100,0,50));
  btsr.setBackground(new Color(100,0,50));
  bted.setBackground(new Color(100,0,50));
  btcl.setBackground(new Color(100,0,50));
  
  lbevid.setForeground(Color.WHITE);
  lbenam.setForeground(Color.WHITE);
  lbname.setForeground(Color.WHITE);
  lbdate.setForeground(Color.WHITE);
  lbevamt.setForeground(Color.WHITE);
  lbfiamt.setForeground(Color.WHITE); 
  
  btnad.setForeground(new Color(200,250,150));
  btnre.setForeground(new Color(200,250,150));
  btnew.setForeground(new Color(200,250,150));
  btsv.setForeground(new Color(200,250,150));
  btsr.setForeground(new Color(200,250,150));
  bted.setForeground(new Color(200,250,150));
  btcl.setForeground(new Color(200,250,150));
  txtdate.setFont(f3);
  add (lbhd);
  add (lbevid);
  add (lbname);
  add (lbdate);
  add (txtevid);
  add (txtevty);
  add (txtdate);
  add (btnew);
  add (btsv);
  add (btsr);
  add (bted);
  add (lbevamt);
  add (txtevamt);
  add (lbfiamt);
  add (txtfiamt);
  add (btcl); 
  add (btnad);
  add (btnre);
  add (lbenam);
  add (txtenam);
  btnew.addActionListener(this);
  btsv.addActionListener(this);
  btsr.addActionListener(this);
  bted.addActionListener(this);
  btcl.addActionListener(this);
  btnad.addActionListener(this);
  btnre.addActionListener(this);  
repaint();
  }
  public void actionPerformed(ActionEvent e)
 {
   if(e.getSource() == btnad)
   { 
     Vector v=new Vector();
     v.add(txtenam.getText());
     v.add(txtevamt.getText());
	 v.add(txtfiamt.getText());
     model.addRow(v);
   }
   if(e.getSource() == btnre)
   {
     model.removeRow(tblen.getSelectedRow());
   }
   if(e.getSource() == btnew)
   {
  btsv.setEnabled(true);
       txtevid.setText("");
  txtevty.setText("");
       txtdate.setText("");
  txtevamt.setText("");
  txtfiamt.setText("");
  model.setRowCount(0);
    try
    {
     Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
     Statement st = con1.createStatement();
     ResultSet res1 = st.executeQuery("select * from keytable");
     while(res1.next())
    {
    txtevid.setText("E/" + res1.getString(2));
    }
	con1.close();
    }
    catch(Exception ee)
    {
     System.out.println(ee);
     }
    }  
   if(e.getSource() == btsv)
   {
   btsv.setEnabled(false);   
   if(txtdate.getText().length()!=0&&txtenam.getText().length()!=0&&txtfiamt.getText().length()!=0&&txtevamt.getText().length()!=0)
   {
   try
   {
    Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
    String str = "insert into Calendar(EVENTID,EVENTTYPE,EVENTDATE,EVENTNAME,FIXEDAMOUNT,EVENTAMOUNT)values(?,?,?,?,?,?)";
    for(int i=0;i<model.getRowCount();i++)
    {
    PreparedStatement ps = con.prepareStatement(str);
    ps.setString(1,txtevid.getText());
    ps.setString(2,txtevty.getText());
    ps.setString(3,txtdate.getText());
    ps.setString(4,""+model.getValueAt(i,0));
    ps.setString(5,txtfiamt.getText());
    ps.setString(6,""+model.getValueAt(i,1));
    ps.executeUpdate(); 
    }
    Statement st = con.createStatement();
    str = "Update keytable set eventid=eventid+1";
    st.executeUpdate(str);
    JOptionPane.showMessageDialog(null,"SAVED");
	con.close();
    }
    catch(Exception ee)
    {
     System.out.println(ee);
    }
    }
else
JOptionPane.showMessageDialog(null,"Empty Field Cannot be Saved");
   }
   if(e.getSource() == btsr)
    {
	bted.setEnabled(true); 
	txtenam.setText("");
	txtevamt.setText("");
    try
    { 
     Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
     Statement st = con.createStatement();
     String tid = JOptionPane.showInputDialog(null,"Enter Event Id :-");
     ResultSet res = st.executeQuery("select * from calendar where eventid='"+tid+"'");
     model.setRowCount(0);
     while(res.next())
     {     
      txtevid.setText(res.getString(1));
 txtevty.setText(res.getString(2));
      txtdate.setText(res.getString(3));
  txtfiamt.setText(res.getString(5));
  Vector v = new Vector();
  v.add(res.getString(4));
  v.add(res.getString(6));
  model.addRow(v);
     
      }
	  con.close();
    }
    catch(Exception ee)
    {
     System.out.println(ee);
    }
    }
   if(e.getSource() == bted)
   {
bted.setEnabled(false);
if(txtdate.getText().length()!=0&&txtenam.getText().length()!=0&&txtfiamt.getText().length()!=0&&txtevamt.getText().length()!=0)
   {
    try
    { 
      Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
      Statement st1 = con1.createStatement();
 String strevent="";
 for(int i=0;i<model.getRowCount();i++)
 {
 strevent=strevent+model.getValueAt(i,0)+",";
 }
      String str=" Update calendar set eventtype='"+txtevty.getText()+"',eventdate='"+txtdate.getText()+"',eventname='"+strevent+"',fixedamt='"+txtfiamt.getText()+"',eventamt='"+txtevamt.getText()+"' where eventid='"+txtevid.getText()+"'";
      st1.executeUpdate(str);
      JOptionPane.showMessageDialog(null,"UPDATE SAVED");
	  con1.close();
    }
    catch(Exception ee)
    {
     System.out.println(ee);
     } 
     }
else
JOptionPane.showMessageDialog(null,"Empty Field Cannot be Saved");
   }
   if(e.getSource() == btcl)
   {
    this.dispose();
   }
  }
  public static void main(String args[])
  {
   Calendar st = new Calendar();
  }
 }
