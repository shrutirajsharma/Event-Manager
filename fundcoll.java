import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.applet.*;
import java.util.*;
import java.io.*; 
import javax.swing.table.DefaultTableModel;
public class fundcoll extends JFrame implements ActionListener,FocusListener,ItemListener
{
JLabel lbhd = new JLabel("Fund  Collection");
JLabel lbrec = new JLabel("RECEIPT  No");
JLabel lbreg = new JLabel("REGISTRATION  NUMBER");
JLabel lbsna = new JLabel("NAME");
JButton btn1 = new JButton(">>");
JButton btn2 = new JButton("<<");
JLabel lbdate = new JLabel("DATE");
JLabel lbamt = new JLabel("AMOUNT");
JLabel lbevt = new JLabel("EVENT TYPE");
ButtonGroup bg =  new ButtonGroup(); 
JRadioButton rbtpa = new JRadioButton("PARTICIPANTS");
JRadioButton rbtnpa = new JRadioButton("STAFFS");
JRadioButton rbtsp = new JRadioButton("SPONSERS");
JTextField txtrec =new JTextField();
JTextField txtreg = new JTextField();
JTextField txtsna = new JTextField();
//JComboBox cbevna = new JComboBox();
//JComboBox cbevty = new JComboBox();
JComboBox cbevt = new JComboBox();
JTextField txtdt = new JTextField();
JTextField txtamt = new JTextField();
     JButton btnnew = new JButton("NEW");
JButton btnsv = new JButton("SAVE");
JButton btnsr = new JButton("SEARCH");
JButton btned = new JButton("EDIT");
JButton btncn = new JButton("CANCEL");
JButton btn3=new JButton("ook");
Dimension d1 = Toolkit.getDefaultToolkit().getScreenSize();
String[] col={"EVENT TYPE","EVENT NAME","AMOUNT"};
String evty,evna,amt;
Object [] []data ={{evty},{evna},{amt}};
DefaultTableModel model = new DefaultTableModel(col,0); 
JTable sttbl=new JTable(data,col);
JScrollPane spanel = new JScrollPane(sttbl);
String[] col1={"EVENT TYPE","EVENT NAME","AMOUNT"};
String evty1,evna1,amt1;
Object [] []data1 ={{evty1},{evna1},{amt1}};
DefaultTableModel model1 = new DefaultTableModel(col1,0); 
JTable sttbl1=new JTable(data1,col1);
JScrollPane spanel1 = new JScrollPane(sttbl1);

public fundcoll(){
setLayout(null);
setVisible(true);
int x = (int)d1.getWidth();
int y = (int)d1.getHeight();
setResizable(false);
setSize(1200,1200);
setTitle("Fund Collection"); 
lbhd.setBounds(350,40,400,40);
rbtpa.setBounds(50,170,170,20);
rbtnpa.setBounds(270,170,200,20);
rbtsp.setBounds(440,170,200,20);
lbrec.setBounds(20,230,140,20);
txtrec.setBounds(240,230,80,40);
sttbl.setModel(model);
spanel.setBounds(470,200,270,350);
add (spanel);
btn1.setBounds(750,280,50,15);
btn2.setBounds(750,310,50,15);
btn3.setBounds(750,340,50,15);
sttbl1.setModel(model1);
spanel1.setBounds(820,200,270,350);
add (spanel1);
lbreg.setBounds(20,295,230,20);
txtreg.setBounds(240,290,100,40);
lbsna.setBounds(20,355,160,20);
txtsna.setBounds(240,350,130,40);
lbdate.setBounds(20,415,100,20);
txtdt.setBounds(240,410,100,40);
lbamt.setBounds(20,475,130,20);
txtamt.setBounds(240,470,100,40);
lbevt.setBounds(20,535,150,20);
cbevt.setBounds(240,530,100,40);
btnnew.setBounds(50,740,140,40);
btnsv.setBounds(210,740,140,40);
btnsr.setBounds(370,740,140,40);
btned.setBounds(530,740,140,40);
btncn.setBounds(690,740,140,40);
btnsv.setEnabled(false);
btned.setEnabled(false);
Font f1 = new Font("Imprint MT Shadow",Font.BOLD,35);
Font f2 = new Font("Californian FB",Font.BOLD,18);
Font f3 = new Font("Berlin Sans FB",Font.PLAIN,16);
lbhd.setForeground(new Color(100,0,60));
lbhd.setFont(f1);
lbrec.setFont(f2);
//lbevty.setFont(f2);
//lbevna.setFont(f2);
lbreg.setFont(f2);
lbsna.setFont(f2);
lbdate.setFont(f2);
lbamt.setFont(f2);
btnnew.setFont(f2);
lbevt.setFont(f2);
btnsv.setFont(f2);
btnsr.setFont(f2);
rbtnpa.setFont(f2);
rbtpa.setFont(f2);
rbtsp.setFont(f2);
btned.setFont(f2);
btncn.setFont(f2);
txtrec.setFont(f3);
cbevt.setFont(f3);
    //txtevty.setFont(f3);
    txtreg.setFont(f3);
    txtsna.setFont(f3);
txtdt.setFont(f3);
txtamt.setFont(f3);
         //cbevna.setFont(f3);
//cbevty.setFont(f3);
//txtevna.setFont(f3);
    txtrec.setEditable(false);
txtsna.setEditable(false);
btnnew.setBackground(new Color(100,0,50));
btn1.setBackground(new Color(100,0,50));
btn2.setBackground(new Color(100,0,50));
btnsr.setBackground(new Color(100,0,50));
btnsv.setBackground(new Color(100,0,50));
btncn.setBackground(new Color(100,0,50));
btned.setBackground(new Color(100,0,50));
btnnew.setForeground(new Color(200,250,150));
btn1.setForeground(new Color(200,250,150));
btn2.setForeground(new Color(200,250,150));
btnsr.setForeground(new Color(200,250,150));
    btnsv.setForeground(new Color(200,250,150));
btned.setForeground(new Color(200,250,150));
    btncn.setForeground(new Color(200,250,150));
add (lbhd);
add (lbrec);
add (lbamt);
add (lbdate);
//add (lbevna);
//add (lbevty);
add (lbreg);
add (lbevt);
add (cbevt);
add (lbsna);
add (txtamt);
add (txtrec);
add (txtdt);
//add (cbevna);
add (rbtnpa);
add (rbtpa);
add(rbtsp);
add (txtreg);
//add (cbevty);
add (txtsna);
add (btncn);
add (btned);
add (btnnew);
add (btnsr);
add (btn1);
add (btn2);
add(btn3);
add (btnsv);
bg.add (rbtnpa);
bg.add (rbtpa);
bg.add (rbtsp);
btnnew.setMnemonic('N');
btnsv.setMnemonic('S');
btnsr.setMnemonic('R');
btned.setMnemonic('E');
btncn.setMnemonic('C');
cbevt.addItem("--Select--");
try
        {
    Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
Statement st1 = con1.createStatement();
ResultSet res1 = st1.executeQuery("select distinct eventtype from Calendar");
while(res1.next())
    {
cbevt.addItem(res1.getString(1));
    }
         con1.close(); 
   }
   catch(Exception ee)
   {
System.out.println(ee);
        }
txtreg.addFocusListener(this);
btnnew.addActionListener(this);
btn1.addActionListener(this);
btn2.addActionListener(this);
btn3.addActionListener(this);
btnsr.addActionListener(this);
btnsv.addActionListener(this);
btned.addActionListener(this);
btncn.addActionListener(this);
rbtpa.addItemListener(this);
rbtnpa.addItemListener(this);
rbtsp.addItemListener(this);
repaint();
}
public void itemStateChanged(ItemEvent ie)
{
if(rbtnpa.isSelected())
{
spanel.setVisible(false);
spanel1.setVisible(false);

btn1.setVisible(false);
btn2.setVisible(false);
 lbevt.setVisible(true);
cbevt.setVisible(true);
}
if(rbtpa.isSelected())
{  
        spanel.setVisible(true);
 spanel1.setVisible(true);
  btn1.setVisible(true);
btn2.setVisible(true);
lbevt.setVisible(false);
cbevt.setVisible(false);
}
if(rbtsp.isSelected())
{
spanel.setVisible(false);
 spanel1.setVisible(false);
  btn1.setVisible(false);
btn2.setVisible(false);
 lbevt.setVisible(true);
cbevt.setVisible(true);
}

}
public void focusLost(FocusEvent fe)
{   
    
    if(fe.getSource()==txtreg)
{
		txtsna.setText("");
        model.setRowCount(0);
try
{
String tevty="",tevna="";
Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
    Statement st = con.createStatement();
    Statement st1 = con.createStatement();
    
String str;

if(rbtnpa.isSelected())
{
  str="select sname from teachertbl where staffid='"+txtreg.getText()+"'";
                   sttbl.setVisible(false);
                   sttbl1.setVisible(false);
  ResultSet res = st.executeQuery(str);
  while(res.next())
 {
 txtsna.setText(res.getString(1));
 }
}
if(rbtsp.isSelected())
{
str="select sponsername from sponsertbl  where sponserid='"+txtreg.getText()+"'"; 
sttbl.setVisible(false);
                  sttbl1.setVisible(false);
 ResultSet res = st.executeQuery(str);
 while(res.next())
 {
 txtsna.setText(res.getString(1));
 }
}
if(rbtpa.isSelected())
{
                  str="Select * from assignmenttbl where regno='"+txtreg.getText()+"' and paidstatus='N/A'";
                  sttbl.setVisible(true);
                  sttbl1.setVisible(true); 
                  ResultSet res = st.executeQuery(str);  
 int s=0,ts=0,tst=0;
while(res.next())
{   
        tevty=res.getString(3);
        tevna=res.getString(4);
        //cbevty.addItem(tevty);
txtsna.setText(res.getString(2));
//cbevna.addItem(tevna);
Vector v = new Vector();
v.add(tevty);
v.add(tevna);

ResultSet res1 = st1.executeQuery("select eventamount,fixedamount from Calendar where eventtype='"+tevty+"' and eventname='"+tevna+"'"); 
while(res1.next())
{
   
v.add(res1.getString(1));
}
model.addRow(v);
  }
for(int i=0;i<model.getRowCount();i++)
{
tst=tst+Integer.parseInt(model.getValueAt(i,2).toString());
}
ts=0;
Statement st3=con.createStatement();
ResultSet res3=st3.executeQuery("select distinct eventtype from assignmenttbl where regno='"+txtreg.getText()+"' and paidstatus='N/A'");
while(res3.next())
{
Statement st2 = con.createStatement();
ResultSet res2 = st2.executeQuery("select distinct eventtype,fixedamount from Calendar where eventtype='"+res3.getString(1)+"'");
while(res2.next())
{
ts=ts+Integer.parseInt(res2.getString(2));
}
}
s=tst+ts;
  
 JOptionPane.showMessageDialog(null,""+s);
}
con.close();
}
catch(Exception ee)
{
System.out.println(ee);
}
}
}
public void focusGained(FocusEvent fe)
{

}
public void actionPerformed(ActionEvent e)
{
if (e.getSource() == btnnew)
         {   
        model.setRowCount(0);
        model1.setRowCount(0);
        //txtevna.setText("");
//cbevna.removeAllItems();
//cbevty.removeAllItems();
        btnsv.setEnabled(true);
//txtevty.setText("");
             txtamt.setText("");
             txtdt.setText("");
             txtreg.setText("");
txtsna.setText("");
try
{
Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
Statement st = con.createStatement();
ResultSet res1 = st.executeQuery("select * from keytable");
                 while(res1.next())
                 {
                      txtrec.setText("R/" + res1.getString(4));
                 }
              con.close();
}
             catch(Exception ee)
             {
                 System.out.println(ee);
             }
}
if(e.getSource()==btn3)
{
	String str="";
    for(int i=0;i<model1.getRowCount();i++)
    {
	   str=str+model1.getValueAt(i,0)+"-";
    }
    String arrevent[]=str.split("-");
    for(int i=0;i<arrevent.length-1;i++)
    {
	   for(int j=i+1;j<arrevent.length;j++)
	   {
	     if(arrevent[i].equals(arrevent[j]))
		 {
		 arrevent[j]="-";
		 }
	 }
    }
	
    int s=0;
    for(int i=0;i<arrevent.length;i++)
    {
	 String eamt="";
	 if(arrevent[i].equals("-"))
	 {
		 }
	 else
	 {

		 try
		{
		Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
		Statement st2 = con.createStatement();
        ResultSet res2=st2.executeQuery("select distinct(eventtype),fixedamount from Calendar where eventtype='"+arrevent[i]+"'");
		while(res2.next())
		{
			eamt=res2.getString(2);
		    s=s+Integer.parseInt(eamt);
		}	
	    }		
	    catch(Exception ee)
	    {
	       System.out.println(ee);
        }
      }
	  if(arrevent[i]!="-")
	  {
	  JOptionPane.showMessageDialog(null,arrevent[i]+" : "+eamt);
     }
	}
	s=0;
     txtamt.setText(""+(s+Integer.parseInt(txtamt.getText())));
 }


if (e.getSource() == btn1)
{
    Vector v = new Vector();
    for(int i=0;i<3;i++)
    {
        v.add(model.getValueAt(sttbl.getSelectedRow(),i));
    }
    model1.addRow(v);
    int k=0;
    for(int j=0;j<model1.getRowCount();j++)
    {
        k=k+Integer.parseInt(sttbl1.getValueAt(j,2).toString());
    }
    txtamt.setText(""+k);
    model.removeRow(sttbl.getSelectedRow());
//////////////////////////
    
///////////////
}

if (e.getSource() == btn2)
{
 Vector v=new Vector();
  
    for(int i=0;i<3;i++)
{
v.add(model1.getValueAt(sttbl1.getSelectedRow(),i));
}
model.addRow(v);
model1.removeRow(sttbl1.getSelectedRow());
int p=0;
for(int j=0;j<model1.getRowCount();j++)
{
p=p+Integer.parseInt(sttbl1.getValueAt(j,2).toString());
}
txtamt.setText(""+p);
}
if (e.getSource() == btnsv)
{
btnsv.setEnabled(false);
if(rbtpa.isSelected())
{
       if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0)
       { 
                 try
                 {
                     Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                     String str = "insert into fundcolltbl(RECEIPTNO,REGISTRATIONNO,NAME,PAIDDATE,AMOUNT)values(?,?,?,?,?)";
String teventname="",teventtype="";

PreparedStatement ps = con.prepareStatement(str);
ps.setString(1,txtrec.getText());
                     ps.setString(2,txtreg.getText());
                     ps.setString(3,txtsna.getText());
ps.setString(4,txtdt.getText());
ps.setString(5,txtamt.getText());
                     ps.executeUpdate();
Statement st = con.createStatement();
str="Update keytable set RECEIPTNO=RECEIPTNO+1";
st.executeUpdate(str);
for(int i=0;i<model1.getRowCount();i++)
{
st.executeUpdate("Update assignmenttbl set PAIDSTATUS='P' where regno='"+txtreg.getText()+"' and eventtype='"+sttbl1.getValueAt(i,0)+"' and eventname='"+sttbl1.getValueAt(i,1)+"'");
}
JOptionPane.showMessageDialog(null,"SAVED");
     try
                  {
 for(int i=0;i<model1.getRowCount();i++)
 {
                 Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
                 Statement st1=con1.createStatement();
                 ResultSet res1=st1.executeQuery("Select * from assignmenttbl where regno='"+txtreg.getText()+"'");
                 PrintWriter pw=new PrintWriter("eventtypereport.txt");
                 pw.println("Event type "+txtreg.getText()+" assigned to..");
                 pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 pw.println("Reg no   Student name        Event name      Paid Status");
                 pw.println("-----------------------------------------------------------------------");
                 while(res1.next())
                {
                    pw.printf("%-10s",res1.getString(1));
                    pw.printf("%-20s",res1.getString(2));
                    pw.printf("%-18s",res1.getString(4));
                    pw.printf("%-5s",res1.getString(5));
                    pw.printf("\n");
                }
                pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                pw.close();
                Runtime rt=Runtime.getRuntime();
                rt.exec("notepad.exe eventtypereport.txt");
 }
            }
            catch(Exception eee)
            {
                  System.out.println(eee);
            }
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

if(rbtnpa.isSelected())
{
if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0&&cbevt.getSelectedItem().toString().length()!=0)
           { 
                     try
                     {
                         Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                         String str = "insert into fundcolltbl2(RECEIPTNO,REGISTRATIONNO,NAME,PAIDDATE,AMOUNT,EVENTTYPE)values(?,?,?,?,?,?)";
    String teventname="",teventtype="";
PreparedStatement ps = con.prepareStatement(str);
    ps.setString(1,txtrec.getText());
                         ps.setString(2,txtreg.getText());
                         ps.setString(3,txtsna.getText());
    ps.setString(4,txtdt.getText());
    ps.setString(5,txtamt.getText());
ps.setString(6,""+cbevt.getSelectedItem());
                         ps.executeUpdate();
    Statement st = con.createStatement();
    str="Update keytable set RECEIPTNO=RECEIPTNO+1";
    st.executeUpdate(str);
    JOptionPane.showMessageDialog(null,"SAVED");
}                
                 catch(Exception ee)
                 {
                     System.out.println(ee);
                 }
             }
else
        JOptionPane.showMessageDialog(null,"Empty Field Cannot be Saved");

}
if(rbtsp.isSelected())
{
if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0)
           { 
                     try
                     {
                         Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                         String str = "insert into fundcolltbl2(RECEIPTNO,REGISTRATIONNO,NAME,PAIDDATE,AMOUNT,EVENTTYPE)values(?,?,?,?,?,?)";
    String teventname="",teventtype="";
PreparedStatement ps = con.prepareStatement(str);
    ps.setString(1,txtrec.getText());
                         ps.setString(2,txtreg.getText());
                         ps.setString(3,txtsna.getText());
    ps.setString(4,txtdt.getText());
    ps.setString(5,txtamt.getText());
ps.setString(6,""+cbevt.getSelectedItem());
                         ps.executeUpdate();
    Statement st = con.createStatement();
    str="Update keytable set RECEIPTNO=RECEIPTNO+1";
    st.executeUpdate(str);
    JOptionPane.showMessageDialog(null,"SAVED");
}                
                 catch(Exception ee)
                 {
                     System.out.println(ee);
                 }
             }
else
        JOptionPane.showMessageDialog(null,"Empty Field Cannot be Saved");

}
}
if(e.getSource() == btnsr)
        { 
            btned.setEnabled(true);
if(rbtpa.isSelected())
{
             try
             { 
                 Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                 Statement st = con.createStatement();
                 String tid = JOptionPane.showInputDialog(null,"Enter RECEIPT NUMBER :-");
ResultSet res = st.executeQuery("select * from fundcolltbl where receiptno='"+tid+"'");
while(res.next())
{   
        txtrec.setText(res.getString(1));
txtreg.setText(res.getString(2));
txtsna.setText(res.getString(3));
txtdt.setText(res.getString(4));
txtamt.setText(res.getString(5));
                 }
con.close();
}

catch(Exception ee)
{
  System.out.println(ee);
}
}
if(rbtnpa.isSelected()||(rbtsp.isSelected()))
{
    try
                 { 
                     Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                     Statement st = con.createStatement();
                     String tid = JOptionPane.showInputDialog(null,"Enter RECEIPT NUMBER :-");
    ResultSet res = st.executeQuery("select * from fundcolltbl2 where receiptno='"+tid+"'");
    while(res.next())
    {   
    txtrec.setText(res.getString(1));
    txtreg.setText(res.getString(2));
    txtsna.setText(res.getString(3));
    txtdt.setText(res.getString(4));
    txtamt.setText(res.getString(5));
cbevt.setSelectedItem(res.getString(6));
                     }
        con.close();
    }
    catch(Exception ee)
    {
System.out.println(ee);
    }
}
        }
if (e.getSource() == btned)
{
btned.setEnabled(false);
if(rbtpa.isSelected())
{
if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0)
   { 
     try
                  {
Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
                     Statement st1 = con1.createStatement();
                     String str="Update fundcolltbl set paiddate='"+txtdt.getText()+"',amount='"+txtamt.getText()+"',registrationno='"+txtreg.getText()+"',studentname='"+txtsna.getText()+"' where receiptid='"+txtrec.getText()+"'" ;
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
if(rbtnpa.isSelected()||(rbtsp.isSelected()))
{
  if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0&&cbevt.getSelectedItem().toString().length()!=0)
       { 
        try
                    {
    Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
                         Statement st1 = con1.createStatement();
                         String str="Update fundcolltbl2 set paiddate='"+txtdt.getText()+"',amount='"+txtamt.getText()+"',registrationno='"+txtreg.getText()+"',name='"+txtsna.getText()+"',eventtype+'"+cbevt.getSelectedItem()+"' where receiptid='"+txtrec.getText()+"'" ;
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
}
if (e.getSource() == btncn)
{
this.dispose();
}
   }
        public static void main (String args[])
{
fundcoll ob = new fundcoll();
} 
}  


/*
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import java.applet.*;
import java.util.*;
import java.io.*; 
import javax.swing.table.DefaultTableModel;
public class fundcoll extends JFrame implements ActionListener,FocusListener,ItemListener
{
JLabel lbhd = new JLabel("Fund  Collection");
JLabel lbrec = new JLabel("RECEIPT  No");
JLabel lbreg = new JLabel("REGISTRATION  NUMBER");
JLabel lbsna = new JLabel("STUDENT  NAME");
JButton btn1 = new JButton(">>");
JButton btn2 = new JButton("<<");
JLabel lbdate = new JLabel("DATE");
JLabel lbamt = new JLabel("AMOUNT");
JLabel lbevt = new JLabel("EVENT TYPE");
ButtonGroup bg =  new ButtonGroup(); 
JRadioButton rbtpa = new JRadioButton("PARTICIPANTS");
JRadioButton rbtnpa = new JRadioButton("STAFFS");
JRadioButton rbtsp = new JRadioButton("SPONSERS");
JTextField txtrec =new JTextField();
JTextField txtreg = new JTextField();
JTextField txtsna = new JTextField();
//JComboBox cbevna = new JComboBox();
//JComboBox cbevty = new JComboBox();
JComboBox cbevt = new JComboBox();
JTextField txtdt = new JTextField();
JTextField txtamt = new JTextField();
     JButton btnnew = new JButton("NEW");
JButton btnsv = new JButton("SAVE");
JButton btnsr = new JButton("SEARCH");
JButton btned = new JButton("EDIT");
JButton btncn = new JButton("CANCEL");
Dimension d1 = Toolkit.getDefaultToolkit().getScreenSize();
String[] col={"EVENT TYPE","EVENT NAME","AMOUNT"};
String evty,evna,amt;
Object [] []data ={{evty},{evna},{amt}};
DefaultTableModel model = new DefaultTableModel(col,0); 
JTable sttbl=new JTable(data,col);
JScrollPane spanel = new JScrollPane(sttbl);

String[] col1={"EVENT TYPE","EVENT NAME","AMOUNT"};
String evty1,evna1,amt1;
Object [] []data1 ={{evty1},{evna1},{amt1}};
DefaultTableModel model1 = new DefaultTableModel(col1,0); 
JTable sttbl1=new JTable(data1,col1);
JScrollPane spanel1 = new JScrollPane(sttbl1);

public fundcoll ()
     {
         setLayout(null);
setVisible(true);
int x = (int)d1.getWidth();
int y = (int)d1.getHeight();
setResizable(false);
setSize(x,y); 
lbhd.setBounds(550,40,400,40);
rbtpa.setBounds(300,100,170,20);
rbtnpa.setBounds(580,100,200,20);
rbtsp.setBounds(840,100,200,20);
lbrec.setBounds(200,140,140,20);
txtrec.setBounds(480,140,80,20);
sttbl.setModel(model);
spanel.setBounds(670,140,270,350);
add (spanel);
btn1.setBounds(950,280,50,15);
btn2.setBounds(950,310,50,15);
sttbl1.setModel(model1);
spanel1.setBounds(1020,140,270,350);
add (spanel1);
//lbevty.setBounds(400,190,140,20);
//cbevty.setBounds(680,190,120,20);
//lbevna.setBounds(400,240,140,20);
//cbevna.setBounds(680,240,150,20);
lbreg.setBounds(200,190,230,20);
txtreg.setBounds(480,190,100,20);
lbsna.setBounds(200,240,160,20);
txtsna.setBounds(480,240,130,20);
lbdate.setBounds(200,290,100,20);
txtdt.setBounds(480,290,100,20);
lbamt.setBounds(200,340,130,20);
txtamt.setBounds(480,340,100,20);
lbevt.setBounds(200,390,150,20);
cbevt.setBounds(480,390,100,20);
btnnew.setBounds(300,520,140,30);
btnsv.setBounds(460,520,140,30);
btnsr.setBounds(610,520,140,30);
btned.setBounds(760,520,140,30);
btncn.setBounds(910,520,140,30);
btnsv.setEnabled(false);
btned.setEnabled(false);
Font f1 = new Font("Monotype Corsiva",Font.BOLD,35);
Font f2 = new Font("Monotype Corsiva",Font.BOLD,18);
Font f3 = new Font("Berlin Sans FB",Font.PLAIN,16);
lbhd.setForeground(new Color(100,0,60));
lbhd.setFont(f1);
lbrec.setFont(f2);
//lbevty.setFont(f2);
//lbevna.setFont(f2);
lbreg.setFont(f2);
lbsna.setFont(f2);
lbdate.setFont(f2);
lbamt.setFont(f2);
btnnew.setFont(f2);
lbevt.setFont(f2);
btnsv.setFont(f2);
btnsr.setFont(f2);
rbtnpa.setFont(f2);
rbtpa.setFont(f2);
rbtsp.setFont(f2);
btned.setFont(f2);
btncn.setFont(f2);
txtrec.setFont(f3);
cbevt.setFont(f3);
    //txtevty.setFont(f3);
    txtreg.setFont(f3);
    txtsna.setFont(f3);
txtdt.setFont(f3);
txtamt.setFont(f3);
         //cbevna.setFont(f3);
//cbevty.setFont(f3);
//txtevna.setFont(f3);
    txtrec.setEditable(false);
txtsna.setEditable(false);
btnnew.setBackground(new Color(100,0,50));
btn1.setBackground(new Color(100,0,50));
btn2.setBackground(new Color(100,0,50));
btnsr.setBackground(new Color(100,0,50));
btnsv.setBackground(new Color(100,0,50));
btncn.setBackground(new Color(100,0,50));
btned.setBackground(new Color(100,0,50));
btnnew.setForeground(new Color(200,250,150));
btn1.setForeground(new Color(200,250,150));
btn2.setForeground(new Color(200,250,150));
btnsr.setForeground(new Color(200,250,150));
    btnsv.setForeground(new Color(200,250,150));
btned.setForeground(new Color(200,250,150));
    btncn.setForeground(new Color(200,250,150));
add (lbhd);
add (lbrec);
add (lbamt);
add (lbdate);
//add (lbevna);
//add (lbevty);
add (lbreg);
add (lbevt);
add (cbevt);
add (lbsna);
add (txtamt);
add (txtrec);
add (txtdt);
//add (cbevna);
add (rbtnpa);
add (rbtpa);
add(rbtsp);
add (txtreg);
//add (cbevty);
add (txtsna);
add (btncn);
add (btned);
add (btnnew);
add (btnsr);
add (btn1);
add (btn2);
add (btnsv);
bg.add (rbtnpa);
bg.add (rbtpa);
bg.add (rbtsp);
btnnew.setMnemonic('N');
btnsv.setMnemonic('S');
btnsr.setMnemonic('R');
btned.setMnemonic('E');
btncn.setMnemonic('C');
cbevt.addItem("--Select--");
try
        {
    Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
Statement st1 = con1.createStatement();
ResultSet res1 = st1.executeQuery("select distinct eventtype from calendar");
while(res1.next())
    {
cbevt.addItem(res1.getString(1));
    }
         con1.close(); 
   }
   catch(Exception ee)
   {
System.out.println(ee);
        }
txtreg.addFocusListener(this);
btnnew.addActionListener(this);
btn1.addActionListener(this);
btn2.addActionListener(this);
btnsr.addActionListener(this);
btnsv.addActionListener(this);
btned.addActionListener(this);
btncn.addActionListener(this);
rbtpa.addItemListener(this);
rbtnpa.addItemListener(this);
rbtsp.addItemListener(this);
repaint();
}
public void itemStateChanged(ItemEvent ie)
{
if(rbtnpa.isSelected())
{
spanel.setVisible(false);
spanel1.setVisible(false);

btn1.setVisible(false);
btn2.setVisible(false);
 lbevt.setVisible(true);
cbevt.setVisible(true);
}
if(rbtpa.isSelected())
{  
        spanel.setVisible(true);
 spanel1.setVisible(true);
  btn1.setVisible(true);
btn2.setVisible(true);
lbevt.setVisible(false);
cbevt.setVisible(false);
}
if(rbtsp.isSelected())
{
spanel.setVisible(false);
 spanel1.setVisible(false);
  btn1.setVisible(false);
btn2.setVisible(false);
 lbevt.setVisible(true);
cbevt.setVisible(true);
}

}
public void focusLost(FocusEvent fe)
{   
    
    if(fe.getSource()==txtreg)
{   txtsna.setText("");
        model.setRowCount(0);
try
{
String tevty="",tevna="";
Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
    Statement st = con.createStatement();
    Statement st1 = con.createStatement();
    
String str;

if(rbtnpa.isSelected())
{
  str="select name from teachertbl where staffid='"+txtreg.getText()+"'";
                   sttbl.setVisible(false);
                   sttbl1.setVisible(false);
  ResultSet res = st.executeQuery(str);
  while(res.next())
 {
 txtsna.setText(res.getString(1));
 }
}
if(rbtsp.isSelected())
{
str="select sponsername from sponsertbl  where sponserid='"+txtreg.getText()+"'"; 
sttbl.setVisible(false);
                  sttbl1.setVisible(false);
 ResultSet res = st.executeQuery(str);
 while(res.next())
 {
 txtsna.setText(res.getString(1));
 }
}
if(rbtpa.isSelected())
{
                  str="Select * from assignmenttbl where regno='"+txtreg.getText()+"' and paidstatus='N/A'";
                  sttbl.setVisible(true);
                  sttbl1.setVisible(true); 
				  
                  ResultSet res = st.executeQuery(str);  
 int s=0,ts=0,tst=0;
while(res.next())
{   
        tevty=res.getString(3);
        tevna=res.getString(4);
        //cbevty.addItem(tevty);
txtsna.setText(res.getString(2));
//cbevna.addItem(tevna);
Vector v = new Vector();
v.add(tevty);
v.add(tevna);

ResultSet res1 = st1.executeQuery("select eventamount,fixedamount from calendar where eventtype='"+tevty+"' and eventname='"+tevna+"'"); 
while(res1.next())
{
   
v.add(res1.getString(1));
}
model.addRow(v);
  }
for(int i=0;i<model.getRowCount();i++)
{
tst=tst+Integer.parseInt(model.getValueAt(i,2).toString());
}
ts=0;
Statement st3=con.createStatement();
ResultSet res3=st3.executeQuery("select distinct eventtype from assignmenttbl where regno='"+txtreg.getText()+"' and paidstatus='N/A'");
while(res3.next())
{
Statement st2 = con.createStatement();
ResultSet res2 = st2.executeQuery("select distinct eventtype,fixedamount from Calendar where eventtype='"+res3.getString(1)+"'");
while(res2.next())
{
ts=ts+Integer.parseInt(res2.getString(2));
}
}
s=tst+ts;
  
 JOptionPane.showMessageDialog(null,""+s);
}
con.close();
}
catch(Exception ee)
{
System.out.println(ee);
}
}
}
public void focusGained(FocusEvent fe)
{

}
public void actionPerformed(ActionEvent e)
{
if (e.getSource() == btnnew)
         {   
        model.setRowCount(0);
		model1.setRowCount(0);
        //txtevna.setText("");
//cbevna.removeAllItems();
//cbevty.removeAllItems();
        btnsv.setEnabled(true);
//txtevty.setText("");
             txtamt.setText("");
             txtdt.setText("");
             txtreg.setText("");
txtsna.setText("");
try
{
Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
Statement st = con.createStatement();
ResultSet res1 = st.executeQuery("select * from keytable");
                while(res1.next())
                 {
                      txtrec.setText("R/" + res1.getString(5));
                 }
              con.close();
			}
             catch(Exception ee)
             {
                 System.out.println(ee);
             }
}
if (e.getSource() == btn1)
{
  try
{
Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
Statement st = con.createStatement();
ResultSet res1 = st.executeQuery("select fixedamount from Calendar where eventtype='"+txtevty.getText()+"'");
                while(res1.next())
                 {
                      txtrec.setText("R/" + res1.getString(5));'
                 }
              con.close();
			}
             catch(Exception ee)
             {
                 System.out.println(ee);
             }

  Vector v=new Vector();
  
    for(int i=0;i<3;i++)
{
v.add(model.getValueAt(sttbl.getSelectedRow(),i));
}
model1.addRow(v);
int k=0;
for(int j=0;j<model1.getRowCount();j++)
{
k=k+Integer.parseInt(sttbl1.getValueAt(j,2).toString());
}
txtamt.setText(""+k);
model.removeRow(sttbl.getSelectedRow());
}
if (e.getSource() == btn2)
{
 Vector v=new Vector();
  
    for(int i=0;i<3;i++)
{
v.add(model1.getValueAt(sttbl1.getSelectedRow(),i));
}
model.addRow(v);
model1.removeRow(sttbl1.getSelectedRow());
int p=0;
for(int j=0;j<model1.getRowCount();j++)
{
p=p+Integer.parseInt(sttbl1.getValueAt(j,2).toString());
}
txtamt.setText(""+p);
}
if (e.getSource() == btnsv)
{
btnsv.setEnabled(false);
if(rbtpa.isSelected())
{
       if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0)
       { 
                 try
                 {
                     Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                     String str = "insert into fundcolltbl(RECEIPTNO,REGISTRATIONNO,NAME,PAIDDATE,AMOUNT)values(?,?,?,?,?)";
String teventname="",teventtype="";

PreparedStatement ps = con.prepareStatement(str);
ps.setString(1,txtrec.getText());
                     ps.setString(2,txtreg.getText());
                     ps.setString(3,txtsna.getText());
ps.setString(4,txtdt.getText());
ps.setString(5,txtamt.getText());
                     ps.executeUpdate();
Statement st = con.createStatement();
str="Update keytbl set RECEIPTID=RECEIPTID+1";
st.executeUpdate(str);
for(int i=0;i<model1.getRowCount();i++)
{
st.executeUpdate("Update assignmenttbl set PAIDSTATUS='P' where regno='"+txtreg.getText()+"' and eventtype='"+sttbl1.getValueAt(i,0)+"' and eventname='"+sttbl1.getValueAt(i,1)+"'");
}
JOptionPane.showMessageDialog(null,"SAVED");
     try
                  {
 for(int i=0;i<model1.getRowCount();i++)
 {
                 Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
                 Statement st1=con1.createStatement();
                 ResultSet res1=st1.executeQuery("Select * from assignmenttbl where regno='"+txtreg.getText()+"'");
                 PrintWriter pw=new PrintWriter("eventtypereport.txt");
                 pw.println("Event type "+txtreg.getText()+" assigned to..");
                 pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                 pw.println("Reg no   Student name        Event name      Paid Status");
                 pw.println("-----------------------------------------------------------------------");
                 while(res1.next())
                {
                    pw.printf("%-10s",res1.getString(1));
                    pw.printf("%-20s",res1.getString(2));
                    pw.printf("%-18s",res1.getString(4));
                    pw.printf("%-5s",res1.getString(5));
                    pw.printf("\n");
                }
                pw.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                pw.close();
                Runtime rt=Runtime.getRuntime();
                rt.exec("notepad.exe eventtypereport.txt");
 }
            }
            catch(Exception eee)
            {
                  System.out.println(eee);
            }
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

if(rbtnpa.isSelected())
{
if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0&&cbevt.getSelectedItem().toString().length()!=0)
           { 
                     try
                     {
                         Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                         String str = "insert into fundcolltbl2(RECEIPTNO,REGISTRATIONNO,NAME,PAIDDATE,AMOUNT,EVENTTYPE)values(?,?,?,?,?,?)";
    String teventname="",teventtype="";
PreparedStatement ps = con.prepareStatement(str);
    ps.setString(1,txtrec.getText());
                         ps.setString(2,txtreg.getText());
                         ps.setString(3,txtsna.getText());
    ps.setString(4,txtdt.getText());
    ps.setString(5,txtamt.getText());
ps.setString(6,""+cbevt.getSelectedItem());
                         ps.executeUpdate();
    Statement st = con.createStatement();
    str="Update keytbl set RECEIPTNO=RECEIPTNO+1";
    st.executeUpdate(str);
    JOptionPane.showMessageDialog(null,"SAVED");
}                
                 catch(Exception ee)
                 {
                     System.out.println(ee);
                 }
             }
else
        JOptionPane.showMessageDialog(null,"Empty Field Cannot be Saved");

}
if(rbtsp.isSelected())
{
if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0)
           { 
                     try
                     {
                         Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                         String str = "insert into fundcolltbl2(RECEIPTNO,REGISTRATIONNO,NAME,PAIDDATE,AMOUNT,EVENTTYPE)values(?,?,?,?,?,?)";
    String teventname="",teventtype="";
PreparedStatement ps = con.prepareStatement(str);
    ps.setString(1,txtrec.getText());
                         ps.setString(2,txtreg.getText());
                         ps.setString(3,txtsna.getText());
    ps.setString(4,txtdt.getText());
    ps.setString(5,txtamt.getText());
ps.setString(6,""+cbevt.getSelectedItem());
                         ps.executeUpdate();
    Statement st = con.createStatement();
    str="Update keytbl set RECEIPTNO=RECEIPTNO+1";
    st.executeUpdate(str);
    JOptionPane.showMessageDialog(null,"SAVED");
}                
                 catch(Exception ee)
                 {
                     System.out.println(ee);
                 }
             }
else
        JOptionPane.showMessageDialog(null,"Empty Field Cannot be Saved");

}
}
if(e.getSource() == btnsr)
        { 
            btned.setEnabled(true);
if(rbtpa.isSelected())
{
             try
             { 
                 Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                 Statement st = con.createStatement();
                 String tid = JOptionPane.showInputDialog(null,"Enter RECEIPT NUMBER :-");
ResultSet res = st.executeQuery("select * from fundcolltbl where receiptno='"+tid+"'");
while(res.next())
{   
        txtrec.setText(res.getString(1));
txtreg.setText(res.getString(2));
txtsna.setText(res.getString(3));
txtdt.setText(res.getString(4));
txtamt.setText(res.getString(5));
                 }
con.close();
}

catch(Exception ee)
{
  System.out.println(ee);
}
}
if(rbtnpa.isSelected()||(rbtsp.isSelected()))
{
    try
                 { 
                     Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
                     Statement st = con.createStatement();
                     String tid = JOptionPane.showInputDialog(null,"Enter RECEIPT NUMBER :-");
    ResultSet res = st.executeQuery("select * from fundcolltbl2 where receiptno='"+tid+"'");
    while(res.next())
    {   
txtrec.setText(res.getString(1));
    txtreg.setText(res.getString(2));
    txtsna.setText(res.getString(3));
    txtdt.setText(res.getString(4));
    txtamt.setText(res.getString(5));
cbevt.setSelectedItem(res.getString(6));
                     }
        con.close();
    }
    catch(Exception ee)
    {
System.out.println(ee);
    }
}
        }
if (e.getSource() == btned)
{
btned.setEnabled(false);
if(rbtpa.isSelected())
{
if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0)
   { 
     try
                  {
Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
                     Statement st1 = con1.createStatement();
                     String str="Update fundcolltbl set paiddate='"+txtdt.getText()+"',amount='"+txtamt.getText()+"',registrationno='"+txtreg.getText()+"',studentname='"+txtsna.getText()+"' where receiptid='"+txtrec.getText()+"'" ;
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
if(rbtnpa.isSelected()||(rbtsp.isSelected()))
{
  if(txtsna.getText().length()!=0&&txtreg.getText().length()!=0&&txtamt.getText().length()!=0&&txtdt.getText().length()!=0&&cbevt.getSelectedItem().toString().length()!=0)
       { 
        try
                    {
    Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
                         Statement st1 = con1.createStatement();
                         String str="Update fundcolltbl2 set paiddate='"+txtdt.getText()+"',amount='"+txtamt.getText()+"',registrationno='"+txtreg.getText()+"',name='"+txtsna.getText()+"',eventtype+'"+cbevt.getSelectedItem()+"' where receiptno='"+txtrec.getText()+"'" ;
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
}
if (e.getSource() == btncn)
{
this.dispose();
}
   }
        public static void main (String args[])
{
fundcoll ob = new fundcoll();
} 
}  */

