import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.applet.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;
public class mainform extends JFrame implements ActionListener,MouseListener,MouseMotionListener,ItemListener
{
	JPanel pnl = new JPanel();
JMenuBar mb = new JMenuBar();
JMenu mnmast = new JMenu("MASTER");
JMenu mntran = new JMenu("TRANSACTION");
JMenu mnre = new JMenu("REPORT");
JMenu mnex = new JMenu("CANCEL");
JButton btn = new JButton();
JButton btn1 = new JButton();

JMenuItem mnmaststu = new JMenuItem("STUDENT",new ImageIcon("images/stu.jpg"));
JMenuItem mnmastspo = new JMenuItem("SPONSER",new ImageIcon("images/sponser.jpg"));
JMenuItem mnmastven = new JMenuItem("VENUE" , new ImageIcon("images/venue.jpg"));
    JMenuItem mnmasteve = new JMenuItem("EVENT CALENDER",new ImageIcon("images/calendar.jpg"));
    JMenuItem mnmateach = new JMenuItem("TEACHER");
JMenuItem mntranass = new JMenuItem("ASSIGNMENT",new ImageIcon("images/assign.png"));
JMenuItem mntranfund = new JMenuItem("FUND COLLECTION",new ImageIcon("images/fundcollection.png"));
JMenuItem mntranspass = new JMenuItem("SPONSER ASSIGNMENT");
JMenuItem mnreassreport = new JMenuItem("ASSIGNMENT REPORT");
JMenuItem mnrefundreport = new JMenuItem("FUND REPORT");
JMenuItem mnretodaycoll = new JMenuItem("TODAY COLLECTION");
JMenuItem mnexit = new JMenuItem("EXIT");
JComboBox cbev = new JComboBox();
JButton btnstu = new JButton("STUDENT");
JButton btntea = new JButton(new ImageIcon("images/teacher.jpg"));
JButton btnsp = new JButton("SPONSER");
JButton btnfund = new JButton("FUNDS");
JButton btntocoll = new JButton("TODAY COLLECTION");
JButton btnevcal = new JButton("EVENT CALENDER");
JLabel lbimg = new JLabel(new ImageIcon("images/back2.jpg"));
JPanel pn;
Dimension d1 = Toolkit.getDefaultToolkit().getScreenSize();

String[] col={"TODAY COLLECTION"};
String tcol;
    Object [] []data ={{tcol}};
    DefaultTableModel model = new DefaultTableModel(col,0); 
JTable sttbl=new JTable(data,col);
    JScrollPane spanel = new JScrollPane(sttbl);

String[] col1={"Reg.No","Name","Amount"};
String reg,name,amt;
    Object [] []data1 ={{reg},{name},{amt}};
    DefaultTableModel model1 = new DefaultTableModel(col1,0); 
JTable sttbl1=new JTable(data1,col1);
    JScrollPane spanel1 = new JScrollPane(sttbl1);
	
String[] col2={"Event Type","Event Name","Date"};
String et,en,dat;
    Object [] []data2 ={{et},{en},{dat}};
    DefaultTableModel model2 = new DefaultTableModel(col2,0); 
JTable sttbl2=new JTable(data1,col2);
    JScrollPane spanel2 = new JScrollPane(sttbl2);

public mainform()
{   

        setLayout(null);
        setVisible(true);
        int x = (int)d1.getWidth();
        int y = (int)d1.getHeight();
        setResizable(false);
        setSize(x,y);
		System.out.println("yyyyy");
        Font f1 = new Font("Californian FB",Font.BOLD,15); 
Font f2 = new Font("Californian FB",Font.BOLD,20);
mb.setBackground(new Color(191,191,191));
Font f3 = new Font("Monotype Corsiva",Font.BOLD,17);
pn=new JPanel();
lbimg.setBounds(0,-100,x,y);
pnl.setBounds(-10,-100,x,y);
btn1.setBounds(0,0,350,1000);
pn.setBounds(0,0,x,y);
btnstu.setBounds(100,50,200,70);
btntea.setBounds(100,150,200,70);
btnsp.setBounds(100,250,200,70);
btntocoll.setBounds(400,50,250,120);
btnfund.setBounds(680,50,250,120);
sttbl1.setModel(model1);
spanel1.setBounds(680,170,250,100);
add (spanel1);
btnevcal.setBounds(960,50,250,120);
sttbl2.setModel(model2);
spanel2.setBounds(960,170,250,150);
add(spanel2);
cbev.setBounds(990,170,190,20);
sttbl.setModel(model);
spanel.setBounds(400,170,250,60);
add (spanel);
//pnl.add(lbimg);
spanel.setVisible(false);
btnfund.setFont(f3);
btnstu.setFont(f3);
btntea.setFont(f3);
btnsp.setFont(f3);
btnevcal.setFont(f3);
btntocoll.setFont(f3);
mnex.setFont(f2);
mnexit.setFont(f2);
mnmast.setFont(f2);
btn.setBackground(Color.BLACK);
        mnmasteve.setFont(f1);
mnmastspo.setFont(f1);
mnmaststu.setFont(f1);
mnmastven.setFont(f1);
mnmateach.setFont(f1);
   mnre.setFont(f2);
mntran.setFont(f2);
mntranass.setFont(f1);
mntranfund.setFont(f1);
mntranspass.setFont(f1);
mnreassreport.setFont(f1);
mnrefundreport.setFont(f1);
mnretodaycoll.setFont(f1);
mnmast.add(mnmaststu);
mnmast.add(mnmastspo);
mnmast.add(mnmasteve);
mnmast.add(mnmastven);
mnmast.add (mnmateach);
mntran.add(mntranass);
mntran.add(mntranfund);
mntran.add(mntranspass);
mnre.add(mnreassreport);
mnre.add(mnrefundreport);
mnre.add(mnretodaycoll);
mnex.add(mnexit);
mb.add(mnmast);
mb.add(mntran);
mb.add(mnre);
mb.add(mnex);
btnevcal.setBackground(new Color(255,255,0));
btnfund.setBackground(new Color(255,255,0));
btnsp.setBackground(new Color(255,255,0));
btnstu.setBackground(new Color(255,255,0));
btntea.setBackground(new Color(255,255,0));
btntocoll.setBackground(new Color(255,255,0));
btnevcal.setForeground(Color.BLACK);
btnfund.setForeground(Color.BLACK);
btnsp.setForeground(Color.BLACK);
btnstu.setForeground(Color.BLACK);
btntea.setForeground(Color.BLACK);
btntocoll.setForeground(Color.BLACK);
add(cbev);
add(btnfund);
add(btnstu);
//add(btntea);
add(btnsp);
add(btntocoll);
add(btnevcal);

add (pn);

mnmasteve.addActionListener(this);
mnmastspo.addActionListener(this);
mnmaststu.addActionListener(this);
mnmastven.addActionListener(this);
mntranass.addActionListener(this);
mntranfund.addActionListener(this);
mntranspass.addActionListener(this);
mnreassreport.addActionListener(this);
mnrefundreport.addActionListener(this);
mnretodaycoll.addActionListener(this);
mnexit.addActionListener(this);
this.setJMenuBar(mb);
btnfund.addActionListener(this);
btnstu.addActionListener(this);
btntea.addActionListener(this);
btnsp.addActionListener(this);
btntocoll.addActionListener(this);
btnevcal.addActionListener(this);
mnmast.addMouseListener(this);
mnmast.addMouseMotionListener(this);
mntran.addMouseListener(this);
mntran.addMouseMotionListener(this);
mnre.addMouseListener(this);
mnre.addMouseMotionListener(this);
mnex.addMouseListener(this);
mnex.addMouseMotionListener(this);
btnstu.addMouseListener(this);
btnstu.addMouseMotionListener(this);
btnevcal.addMouseListener(this);
btnevcal.addMouseMotionListener(this);
btnsp.addMouseListener(this);
btnsp.addMouseMotionListener(this);
btnfund.addMouseListener(this);
btnfund.addMouseMotionListener(this);
btntea.addMouseListener(this);
btntea.addMouseMotionListener(this);
btntocoll.addMouseListener(this);
btntocoll.addMouseMotionListener(this);

add(lbimg);

//pn.add(lbimg);
//add(btn1);
   repaint(); 
}
public void itemStateChanged(ItemEvent ie)
{
if(ie.getSource()==cbev)
{   
        cbev.setVisible(false);
		spanel2.setVisible(true);
try
{
cbev.removeAllItems();
Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
    Statement st = con.createStatement();
ResultSet res = st.executeQuery("select * from eventscheduletbl where eventtype='"+cbev.getSelectedItem()+"'");
while(res.next())
{
Vector v= new Vector();
v.add(res.getString(1));
v.add(res.getString(2));
v.add(res.getString(5));
model2.addRow(v);
}
con.close();
}
catch(Exception ee)
{
System.out.println(ee);
}
}
}
public void mouseMoved(MouseEvent e)
{
if(e.getSource()==mnmast)
{
mnmast.setForeground(Color.WHITE);
mntran.setForeground(Color.BLACK);
mnre.setForeground(Color.BLACK);
mnex.setForeground(Color.BLACK);
}
if(e.getSource()==mntran)
{
mnmast.setForeground(Color.BLACK);
mntran.setForeground(Color.WHITE);
mnre.setForeground(Color.BLACK);
mnex.setForeground(Color.BLACK);
}
if(e.getSource()==mnre)
{
mnmast.setForeground(Color.BLACK);
mntran.setForeground(Color.BLACK);
mnre.setForeground(Color.WHITE);
mnex.setForeground(Color.BLACK);
}
if(e.getSource()==mnex)
{
mnmast.setForeground(Color.BLACK);
mntran.setForeground(Color.BLACK);
mnre.setForeground(Color.BLACK);
mnex.setForeground(Color.WHITE);
}
if(e.getSource()==btnstu)
{
btnstu.setBackground(new Color(255,255,159));
btnevcal.setBackground(new Color(255,255,0));
btnfund.setBackground(new Color(255,255,0));
btnsp.setBackground(new Color(255,255,0));
btntea.setBackground(new Color(255,255,0));
btntocoll.setBackground(new Color(255,255,0));
spanel.setVisible(false);
spanel1.setVisible(false);
spanel2.setVisible(false);
}
if(e.getSource()==btnevcal)
{
btnstu.setBackground(new Color(255,255,0));
btnevcal.setBackground(new Color(255,255,159));
btnfund.setBackground(new Color(255,255,0));
btnsp.setBackground(new Color(255,255,0));
btntea.setBackground(new Color(255,255,0));
btntocoll.setBackground(new Color(255,255,0));
spanel.setVisible(false);
spanel1.setVisible(false);
spanel2.setVisible(false);
cbev.setVisible(true);
try{
	Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
	Statement st=con.createStatement();
	ResultSet res = st.executeQuery("select distinct eventtype from Calendar");
	cbev.addItem("--Select--");
	while(res.next())
	{
		cbev.addItem(res.getString(1));
	}
	con.close();
}
catch(Exception ee)
{
	System.out.println(ee);
}
}
if(e.getSource()==btnfund)
{
String st="";
int sum=0;
btnstu.setBackground(new Color(255,255,0));
btnevcal.setBackground(new Color(255,255,0));
btnfund.setBackground(new Color(255,255,159));
btnsp.setBackground(new Color(255,255,0));
btntea.setBackground(new Color(255,255,0));
btntocoll.setBackground(new Color(255,255,0));
spanel.setVisible(false);
spanel1.setVisible(true);
spanel2.setVisible(false);
try
{
model1.setRowCount(0);
    Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
      Statement st1 = con.createStatement();
                 ResultSet res = st1.executeQuery("select * from fundcolltbl");

    while(res.next())
        {
st=(res.getString(5));
Vector v = new Vector();
v.add(res.getString(2));
v.add(res.getString(3));
v.add(st);
model1.addRow(v);
sum=sum+Integer.parseInt(st);
}
Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
      Statement st2 = con1.createStatement();
                 ResultSet res1 = st2.executeQuery("select * from fundcolltbl2");

    while(res1.next())
        {
st=(res1.getString(5));
Vector v = new Vector();
v.add(res1.getString(2));
v.add(res1.getString(3));
v.add(st);
model1.addRow(v);
sum=sum+Integer.parseInt(st);
}

Vector v1= new Vector();
v1.add("Total");
v1.add("");
        v1.add(sum);
model1.addRow(v1);
}
             catch(Exception ee)
{
System.out.println(ee);
} 
}
if(e.getSource()==btnsp)
{
btnstu.setBackground(new Color(255,255,0));
btnevcal.setBackground(new Color(255,255,0));
btnfund.setBackground(new Color(255,255,0));
btnsp.setBackground(new Color(255,255,159));
btntea.setBackground(new Color(255,255,0));
btntocoll.setBackground(new Color(255,255,0));
spanel.setVisible(false);
spanel1.setVisible(false);
spanel2.setVisible(false);
}
if(e.getSource()==btntea)
{
btnstu.setBackground(new Color(255,255,0));
btnevcal.setBackground(new Color(255,255,0));
btnfund.setBackground(new Color(255,255,0));
btnsp.setBackground(new Color(255,255,0));
btntea.setBackground(new Color(255,255,159));
btntocoll.setBackground(new Color(255,255,0));
spanel.setVisible(false);
spanel1.setVisible(false);
spanel2.setVisible(false);
}
if(e.getSource()==btntocoll)
{ 
       int sumamt=0;
btnstu.setBackground(new Color(255,255,0));
btnevcal.setBackground(new Color(255,255,0));
btnfund.setBackground(new Color(255,255,0));
btnsp.setBackground(new Color(255,255,0));
btntea.setBackground(new Color(255,255,0));
btntocoll.setBackground(new Color(255,255,159));
spanel.setVisible(true);
spanel1.setVisible(false);
spanel2.setVisible(false);
try
{
    Connection con = DriverManager.getConnection("jdbc:odbc:eventdsn");
      Statement st = con.createStatement();
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date da = new Date();

                 ResultSet res = st.executeQuery("select amount from fundcolltbl where paiddate='"+(sdf.format(da))+"'");
    while(res.next())
        {
sumamt=sumamt+Integer.parseInt(res.getString(1));
}

Connection con1 = DriverManager.getConnection("jdbc:odbc:eventdsn");
      Statement st1 = con1.createStatement();
SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Date da1 = new Date();

                 ResultSet res1 = st1.executeQuery("select amount from fundcolltbl2 where paiddate='"+(sdf1.format(da1))+"'");
    while(res1.next())
        {
sumamt=sumamt+Integer.parseInt(res1.getString(1));
}

    model.setRowCount(0);
Vector v= new Vector();
v.add(sumamt);
model.addRow(v);
}
catch(Exception ee)
{
System.out.println(ee);
}
}
}
public void mouseExited(MouseEvent e)
{

}
public void mouseEntered(MouseEvent e)
{

}
public void mousePressed(MouseEvent e)
{

}
public void mouseReleased(MouseEvent e)
{

}
public void mouseClicked(MouseEvent e)
{

}
public void mouseDragged(MouseEvent e)
{

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==mnmaststu)
{
Student ob = new Student();
}
if(e.getSource()==mnmastspo)
{
sponserTable ob = new sponserTable();
}
if(e.getSource()==mnmasteve)
{
Calendar ob = new Calendar();
}
if(e.getSource()==mnmastven)
{
Venue ob =  new Venue();
}
if(e.getSource()==mnmateach)
{
Teacher ob =  new Teacher();
} 
if(e.getSource()==mntranass)
{
Assignment ob = new Assignment();
}
if(e.getSource()==mntranfund)
{
fundcoll ob = new fundcoll();
}
if(e.getSource()==mntranspass)
{
Sponserassigned ob = new Sponserassigned();
}
if(e.getSource() == mnreassreport)
{
assignmentreport ob = new assignmentreport();
}
if(e.getSource() == mnretodaycoll)
{
todaycoll ob = new todaycoll();
}
if(e.getSource() == mnrefundreport)
{
fundreport ob = new fundreport();
}
if(e.getSource() == mnexit)
{
this.dispose();
}
if(e.getSource() == btnfund)
{
   fundreport ob = new fundreport(); 
}
if(e.getSource() == btnstu)
{
Student ob = new Student();
}
if(e.getSource() == btntea)
{
Teacher ob = new Teacher();
}
if(e.getSource() == btnsp)
{
sponserTable ob = new sponserTable();
}
if(e.getSource() == btntocoll)
{
todaycoll ob = new todaycoll();
}
if(e.getSource() == btnevcal)
{
Calendar ob = new Calendar();
}
}
    public static void main(String args[])
{
    mainform ob = new mainform();
}
}

	
	
		