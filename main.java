/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewJFrame.java
 *
 * Created on May 10, 2014, 10:05:14 AM
 */
/**
 *
 * @author sumant_dev
 */

import java.sql.*;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;

public class NewJFrame extends javax.swing.JFrame {

    /** Creates new form NewJFrame */
    public NewJFrame() {
        initComponents();
    }
    static int i =0;
    static String user_ans = "";
    static String corr_ans="";
    static int score = 0;
    static int[] store = new int[11];
    static int count_time = 0;
    static int[] time_taken = new int[11];
    static int[] ques_score = new int[11];
    static int total_score = 0;
    
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        radio1 = new javax.swing.JRadioButton();
        radio2 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        radio4 = new javax.swing.JRadioButton();
        next = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        prev = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        start = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label1.setText("                                 Welcome to My Online Assesment System.");

        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });

        radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio3ActionPerformed(evt);
            }
        });

        radio4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio4ActionPerformed(evt);
            }
        });

        next.setText("Next");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        prev.setText("Prev");
        prev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevActionPerformed(evt);
            }
        });

        submit.setText("Submit and Exit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radio1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio4)
                            .addComponent(radio2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(radio3)
                                .addGap(131, 131, 131)))
                        .addGap(549, 549, 549))))
            .addGroup(layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(prev)
                .addGap(112, 112, 112)
                .addComponent(next)
                .addContainerGap(412, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addComponent(start)
                .addGap(30, 30, 30)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(submit)
                .addContainerGap(470, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(radio1)
                .addGap(18, 18, 18)
                .addComponent(radio2)
                .addGap(18, 18, 18)
                .addComponent(radio3)
                .addGap(18, 18, 18)
                .addComponent(radio4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prev)
                    .addComponent(next))
                .addGap(34, 34, 34)
                .addComponent(submit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(start)
                    .addComponent(exit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
	private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        i++;
        start.setVisible(false);
    try{
        Timer t = new Timer();
        TypeTask2 tt2 = new TypeTask2();
        t.schedule(tt2, 0, 1000);
        Class.forName("java.sql.Driver");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/assesment","root","sumant");
        Statement st = con.createStatement();
        String query = "Select * from questions where qid="+i+";";
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            String d1 = rs.getString("statement");
            String d2 = rs.getString("opt1");
            String d3 = rs.getString("opt2");
            String d4 = rs.getString("opt3");
            String d5 = rs.getString("opt4");
            String d6 = rs.getString("corr_ans");  
            String tmp_d1 = "Q"+i+". "+d1;
            label1.setText(d1);           
           //label1.setText(d1);
            radio1.setText(d2);
            radio2.setText(d3);
            radio3.setText(d4);
            radio4.setText(d5);                     
        }       
//        label2.setText("Score: "+score);
        radio1.setSelected(false);
        radio2.setSelected(false);
        radio3.setSelected(false);
        radio4.setSelected(false);             
    }
    catch(Exception e){
        
        JOptionPane.showMessageDialog(this, e);
        
    }
    }//GEN-LAST:event_startActionPerformed
	
    /*ActionListener for Next Button*/
private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
// TODO add your handling code here:
    
    i++;
    start.setVisible(false);
    if (i == 10) next.setVisible(false);
    try{
        if (count_time>=0) time_taken[i-1] = count_time;
        Class.forName("java.sql.Driver");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/assesment","root","sumant");
        Statement st = con.createStatement();
        String query = "Select * from questions where qid="+i+";";
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            String d1 = rs.getString("statement");
            String d2 = rs.getString("opt1");
            String d3 = rs.getString("opt2");
            String d4 = rs.getString("opt3");
            String d5 = rs.getString("opt4");
            String d6 = rs.getString("corr_ans");
            String tmp_d1 = "Q"+i+". "+d1;
            label1.setText(d1);           
            label1.setText(d1);
            radio1.setText(d2);
            radio2.setText(d3);
            radio3.setText(d4);
            radio4.setText(d5);                     
        }       
//        label2.setText("Score: "+score);
        radio1.setSelected(false);
        radio2.setSelected(false);
        radio3.setSelected(false);
        radio4.setSelected(false);           
    }
    catch(Exception e){
        
        JOptionPane.showMessageDialog(this, "Error in connection.");
        
    }    
}//GEN-LAST:event_nextActionPerformed

/*ActionListener for Exit Button*/
private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
System.exit(0);// TODO add your handling code here:
}//GEN-LAST:event_exitActionPerformed

/*ActionListener for Previous Button*/
private void prevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevActionPerformed
// TODO add your handling code here:
    i--;
    start.setVisible(false);
    if (i == 1) prev.setVisible(false);
    try{
        if (count_time>=0) time_taken[i] = count_time;
        Class.forName("java.sql.Driver");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/assesment","root","sumant");
        Statement st = con.createStatement();
        String query = "Select * from questions where qid="+i+";";
        ResultSet rs = st.executeQuery(query);
        while(rs.next())
        {
            String d1 = rs.getString("statement");
            String d2 = rs.getString("opt1");
            String d3 = rs.getString("opt2");
            String d4 = rs.getString("opt3");
            String d5 = rs.getString("opt4");
            String tmp_d1 = "Q"+i+". "+d1;
         
            label1.setText(d1);
            radio1.setText(d2);
            radio2.setText(d3);
            radio3.setText(d4);
            radio4.setText(d5);                                          
        }
//        label2.setText("Score: "+score);
        radio1.setSelected(false);
        radio2.setSelected(false);
        radio3.setSelected(false);
        radio4.setSelected(false);     
    }
        catch(Exception e){       
        JOptionPane.showMessageDialog(this, "Error in connection.");        
    }
}//GEN-LAST:event_prevActionPerformed

/*ActionListener for First Button*/
private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
radio2.setSelected(false);
radio3.setSelected(false);
radio4.setSelected(false);
user_ans = "a";

try{
    
Class.forName("java.sql.Driver");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/assesment","root","sumant");
        Statement st = con.createStatement();
        String query = "Select corr_ans from questions where qid="+i+";";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next())
        {
           corr_ans = rs.getString("corr_ans");
        } 
if (radio1.isSelected())
{
    Statement s=con.createStatement(); 
    String query1="";
    if (user_ans.equals(corr_ans))
{
 score+=10;
 store[i]=1;
 
}
    else{
        store[i]=2;      
    }
}
}
catch(Exception e){
    JOptionPane.showMessageDialog(this, "Some Error.");
    
}
// TODO add your handling code here:
}//GEN-LAST:event_radio1ActionPerformed

/*ActionListener for Second Button*/
private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
radio1.setSelected(false);
radio3.setSelected(false);
radio4.setSelected(false);

user_ans = "b";

try{
    
Class.forName("java.sql.Driver");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/assesment","root","sumant");
        Statement st = con.createStatement();
        String query = "Select corr_ans from questions where qid="+i+";";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next())
        {
           corr_ans = rs.getString("corr_ans");
        }
if (radio2.isSelected())
{
     Statement s=con.createStatement(); 
    String query1="";
    if (user_ans.equals(corr_ans))
{
 score+=10;  
 store[i]=1;
}
    else{
        store[i]=2;       
    }
}
}

catch(Exception e){
    JOptionPane.showMessageDialog(this, "Some Error.");
    
}
    // TODO add your handling code here:
}//GEN-LAST:event_radio2ActionPerformed

/*ActionListener for Third Radio Button*/
private void radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio3ActionPerformed
radio1.setSelected(false);
radio2.setSelected(false);
radio4.setSelected(false);
user_ans = "c";

try{
    
Class.forName("java.sql.Driver");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/assesment","root","sumant");
        Statement st = con.createStatement();
        String query = "Select corr_ans from questions where qid="+i+";";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next())
        {
           corr_ans = rs.getString("corr_ans");
        }
       
if (radio3.isSelected())
{
    Statement s=con.createStatement(); 
    String query1="";
    if (user_ans.equals(corr_ans))
{
 score+=10;       
 store[i]=1;
}
    else{
        store[i]=2;      
    }
}

}
catch(Exception e){
    JOptionPane.showMessageDialog(this, "Some Error.");
    
}
    // TODO add your handling code here:
}//GEN-LAST:event_radio3ActionPerformed

/*ActionListener for Fourth Radio Button*/
private void radio4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio4ActionPerformed
radio1.setSelected(false);
radio2.setSelected(false);
radio3.setSelected(false);
user_ans = "d";

try{
    
        Class.forName("java.sql.Driver");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/assesment","root","sumant");
        Statement st = con.createStatement();
        String query = "Select corr_ans from questions where qid="+i+";";
        ResultSet rs = st.executeQuery(query);
        
        while(rs.next())
        {
           corr_ans = rs.getString("corr_ans");
        }
if (radio4.isSelected())
{
    Statement s=con.createStatement(); 
    String query1="";
    if (user_ans.equals(corr_ans))
{
 score+=10;  
 store[i]=1;
}
    else{  
        store[i]=2;
    }
}
}
catch(Exception e){
    JOptionPane.showMessageDialog(this, "Some Error.");    
}
    // TODO add your handling code here:
}//GEN-LAST:event_radio4ActionPerformed

private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

    try{
        label1.setText("Thank You!!");
        radio1.setVisible(false);
        radio2.setVisible(false);
        radio3.setVisible(false);
        radio4.setVisible(false);
        next.setVisible(false);
        prev.setVisible(false);
        submit.setVisible(false);
        exit.setVisible(false);
        time_taken[i]=count_time;
        Class.forName("java.sql.Driver");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/assesment","root","sumant");
        Statement s=con.createStatement(); 
        Statement s2=con.createStatement();
        String query1="";
        String query2="";
        int[] tmp_time = new int[11];
        char[] result = new char[11];
        
        for(int j=1;j<=10;j++)
    {
        tmp_time[j] = time_taken[j] - time_taken[j-1];
        if (store[j]==1) 
        {
            query1 = "Update questions set correct=correct+1 where qid="+j+";";
//            s.executeUpdate(query1);
            result[i]='c';
        }
            
        else if (store[j]==2)
        {
            query1 = "Update questions set wrong=wrong+1 where qid="+j+";";
//            s.executeUpdate(query1);
            result[i]='w';
        }
        else
        {
            query1 = "Update questions set unattempted=unattempted+1 where qid="+j+";";
//            s.executeUpdate(query1);
            result[i]='u';
       }
    }
           query2 = "insert into students (sid,q1,q1_time,q2,q2_time,q3,q3_time,q4,q4_time,q5,q5_time,q6,q6_time,q7,q7_time,q8,q8_time,q9,q9_time,"
                   + "q10,q10_time,score) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
           //s.executeInsert(query2);
           query1="select max(sid) from students;";
           ResultSet rs = s.executeQuery(query1);
           String sid1="";
           while(rs.next())
        {
           sid1 = rs.getString(1);
        }
           int sid_tmp = Integer.parseInt(sid1);
           sid_tmp++;
           PreparedStatement pst = con.prepareStatement(query2);
           String q1 = Integer.toString(store[1]);
           String q1_time = Integer.toString(tmp_time[1]);
           String q2 = Integer.toString(store[2]);
           String q2_time = Integer.toString(tmp_time[2]);
           String q3 = Integer.toString(store[3]);
           String q3_time = Integer.toString(tmp_time[3]);
           String q4 = Integer.toString(store[4]);
           String q4_time = Integer.toString(tmp_time[4]);
           String q5 = Integer.toString(store[5]);
           String q5_time = Integer.toString(tmp_time[5]);
           String q6 = Integer.toString(store[6]);
           String q6_time = Integer.toString(tmp_time[6]);
           String q7 = Integer.toString(store[7]);
           String q7_time = Integer.toString(tmp_time[7]);
           String q8 = Integer.toString(store[8]);
           String q8_time = Integer.toString(tmp_time[8]);
           String q9 = Integer.toString(store[9]);
           String q9_time = Integer.toString(tmp_time[9]);
           String q10 = Integer.toString(store[10]);
           String q10_time = Integer.toString(tmp_time[10]);
           String score = "0";
           
           pst.setString(1, Integer.toString(sid_tmp));
           pst.setString(2, q1);
           pst.setString(3, q1_time);
           pst.setString(4, q2);
           pst.setString(5, q2_time);
           pst.setString(6, q3);
           pst.setString(7, q3_time);
           pst.setString(8, q4);
           pst.setString(9, q4_time);
           pst.setString(10, q5);
           pst.setString(11, q5_time);
           pst.setString(12, q6);
           pst.setString(13, q6_time);
           pst.setString(14, q7);
           pst.setString(15, q7_time);
           pst.setString(16, q8);
           pst.setString(17, q8_time);
           pst.setString(18, q9);
           pst.setString(19, q9_time);
           pst.setString(20, q10);
           pst.setString(21, q10_time);
           pst.setString(22, score);
           pst.execute();
//           JOptionPane.showMessageDialog(this, "Thank You for Taking the Test.\nYour score is 15\nYour rank is 7");
        //for(int j=1;j<=10;j++) JOptionPane.showMessageDialog(this, "Result for ques "+j+". is "+Integer.toString(store[j]));
           
    int c1_count=0, c2_count=0, c3_count=0, c4_count=0, c5_count=0;
        String c1_str="", c2_str="", c3_str="", c4_str="", c5_str="";
        double c1_prob=0.0,c2_prob=0.0,c3_prob=0.0,c4_prob=0.0,c5_prob=0.0;
        int[] stud_ques_class = new int[100];
         
        String p_query="";
        //Class.forName("java.sql.Driver");
        //Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost/assesment","root","sumant");
        //Statement st = con.createStatement();
        p_query = "Select count(class) from training_set where class='c1';";
        rs = s.executeQuery(p_query);
        while(rs.next())
        {
           c1_str = rs.getString("count(class)");
        }
        c1_count= Integer.parseInt(c1_str);
//        JOptionPane.showMessageDialog(this, c1_count);
         p_query = "Select count(class) from training_set where class='c2';";
        rs = s.executeQuery(p_query);
        while(rs.next())
        {
           c2_str = rs.getString("count(class)");
        }
        c2_count= Integer.parseInt(c2_str);
        
        //JOptionPane.showMessageDialog(this, c2_count);
        
        p_query = "Select count(class) from training_set where class='c3';";
        rs = s.executeQuery(p_query);
        while(rs.next())
        {
           c3_str = rs.getString("count(class)");
        }
        c3_count= Integer.parseInt(c3_str);
        
        //JOptionPane.showMessageDialog(this, c3_count);
        
        p_query = "Select count(class) from training_set where class='c4';";
        rs = s.executeQuery(p_query);
        while(rs.next())
        {
           c4_str = rs.getString("count(class)");
        }
        c4_count= Integer.parseInt(c4_str);
        
//        JOptionPane.showMessageDialog(this, c4_count);
        
        p_query = "Select count(class) from training_set where class='c5';";
        rs = s.executeQuery(p_query);
        while(rs.next())
        {
           c5_str = rs.getString("count(class)");
        }
        c5_count= Integer.parseInt(c5_str);
        
//        JOptionPane.showMessageDialog(this, c5_count);
        
        c1_prob = c1_count/72.0;
        c2_prob = c2_count/72.0;
        c3_prob = c3_count/72.0;
        c4_prob = c4_count/72.0;
        c5_prob = c5_count/72.0;
//        JOptionPane.showMessageDialog(this, c4_prob);
        String wt_str="", min_time_str="", exp_diff_str="";
        int tmp_wt=0,tmp_ans=0, tmp_min_time=0, tmp_exp_diff=0;
        String t1="",t2="",t3="",t4="";
        int t1_int=0,t2_int=0,t3_int=0,t4_int=0,max_score=0;
        String min_time_excd="";
        double[] prob_attr = new double[30];
        int[] class_count = new int[6];
        class_count[1]=c1_count;
        class_count[2]=c2_count;
        class_count[3]=c3_count;
        class_count[4]=c4_count;
        class_count[5]=c5_count;
//        JOptionPane.showMessageDialog(this, class_count[5]);
        double[] final_prob = new double[10];
        String[] class_tmp = new String[]{"x","c1","c2","c3","c4","c5"};
        
        for(int j=1;j<=10;j++)
        {
            p_query = "Select weight from questions where qid="+j+";";
            rs = s.executeQuery(p_query);
            while(rs.next())
            {
                wt_str = rs.getString("weight");
            }
            //tmp_wt = Integer.parseInt(wt_str);
//            JOptionPane.showMessageDialog(this, "Weight of ques "+j+"is "+wt_str);
            tmp_ans = store[j];
//            JOptionPane.showMessageDialog(this, "Ans of ques "+j+"is "+tmp_ans);
            p_query = "Select min_time from questions where qid="+j+";";
            rs = s.executeQuery(p_query);
            while(rs.next())
            {
                min_time_str = rs.getString("min_time");
            }
            tmp_min_time = Integer.parseInt(min_time_str);
//            JOptionPane.showMessageDialog(this, "min time of ques "+j+"is "+min_time_str);
//            JOptionPane.showMessageDialog(this, "Ans of Q"+j+". is"+store[j]);
            if (time_taken[j] > tmp_min_time)
                min_time_excd="y";
            else min_time_excd="n";
//            JOptionPane.showMessageDialog(this, "Min time excd for Q"+j+". is"+min_time_excd);
            p_query = "Select exp_diff_lev from questions where qid="+j+";";
            rs = s.executeQuery(p_query);
            while(rs.next())
            {
                exp_diff_str = rs.getString("exp_diff_lev");
            }
//            JOptionPane.showMessageDialog(this, "exp diff level of ques "+j+"is "+exp_diff_str);
            //tmp_exp_diff = Integer.parseInt(exp_diff_str);
            
            
            for(int k=1;k<=5;k++)
            {
                
                p_query = "Select count(weight) from training_set where weight='"+wt_str+"' and class='"+class_tmp[k]+"'; ";
                rs = s.executeQuery(p_query);
                while(rs.next())
                {
                    t1 = rs.getString("count(weight)");
                }
                t1_int = Integer.parseInt(t1);
//                JOptionPane.showMessageDialog(this, class_count[k]);
                
                p_query = "Select count(ans) from training_set where ans="+tmp_ans+" and class='"+class_tmp[k]+"'; ";
                rs = s.executeQuery(p_query);
                while(rs.next())
                {
                    t2 = rs.getString("count(ans)");
                }
                t2_int = Integer.parseInt(t2);
                
                p_query = "Select count(min_tim_excd) from training_set where min_tim_excd='"+min_time_excd+"' and class='"+class_tmp[k]+"'; ";
                rs = s.executeQuery(p_query);
                while(rs.next())
                {
                    t3 = rs.getString("count(min_tim_excd)");
                }
                t3_int = Integer.parseInt(t3);
                
                p_query = "Select count(exp_diff_lev) from training_set where exp_diff_lev='"+exp_diff_str+"' and class='"+class_tmp[k]+"'; ";
                rs = s.executeQuery(p_query);
                while(rs.next())
                {
                    t4 = rs.getString("count(exp_diff_lev)");
                }
                t4_int = Integer.parseInt(t4);
                
                prob_attr[k]=(double)t1_int/class_count[k];
                prob_attr[k+5]=(double)t2_int/class_count[k];
                prob_attr[k+10]=(double)t3_int/class_count[k];
                prob_attr[k+15]=(double)t4_int/class_count[k];
                 
            }
            p_query="select class from training_set where weight='"+wt_str+"' and ans=1 and min_tim_excd='y' "
                        + "and exp_diff_lev='"+exp_diff_str+"';";
                rs = s.executeQuery(p_query);
                while(rs.next())
                {
                    t4 = rs.getString("class");
                }
//                JOptionPane.showMessageDialog(this, "Max class for Q"+j+". is"+t4);
                if (t4.equals("c5")) max_score+=-1;
                else if (t4.equals("c4")) max_score+=0;
                else if (t4.equals("c3")) max_score+=1;
                else if (t4.equals("c2")) max_score+=2;
                else max_score+=3;
                 
            final_prob[1] = c1_prob*prob_attr[1]*prob_attr[6]*prob_attr[11]*prob_attr[16];
            final_prob[2] = c2_prob*prob_attr[2]*prob_attr[7]*prob_attr[12]*prob_attr[17];
            final_prob[3] = c3_prob*prob_attr[3]*prob_attr[8]*prob_attr[13]*prob_attr[18];
            final_prob[4] = c4_prob*prob_attr[4]*prob_attr[9]*prob_attr[14]*prob_attr[19];
            final_prob[5] = c5_prob*prob_attr[5]*prob_attr[10]*prob_attr[15]*prob_attr[20];
            
            double max_prob=0.0;
            int max_index=0;
            for(int k=1;k<=5;k++)
            {
                if(final_prob[k]>max_prob)
                {
                    max_prob=final_prob[k];
                    max_index=k;
                }
            }
            
            stud_ques_class[j]=max_index;
            
//            JOptionPane.showMessageDialog(this, "Class for Q."+j+" is c"+stud_ques_class[j]); 
            if (stud_ques_class[j]==5) total_score+=-1;
            else if (stud_ques_class[j]==4) total_score+=0;
            else if (stud_ques_class[j]==3) total_score+=1;
            else if (stud_ques_class[j]==2) total_score+=2;
            else ques_score[j]=total_score+=3;
        } 
//        JOptionPane.showMessageDialog(this, "Max score is "+max_score);
        JOptionPane.showMessageDialog(this, "Your total score is "+total_score+" out of "+max_score+".");
        query1="select max(sid) from students;";
            rs = s.executeQuery(query1);
           sid1="";
           while(rs.next())
        {
           sid1 = rs.getString(1);
        }
           //sid_tmp = Integer.parseInt(sid1);
//        JOptionPane.showMessageDialog(this, ""+sid_tmp); 
        query1="update students set score='"+total_score+"' where sid='"+sid1+"';";
        s.executeUpdate(query1);
           
    }
    catch(Exception e){
        
        JOptionPane.showMessageDialog(this, e);
    }
    System.exit(0);
    
    // TODO add your handling code here:
}//GEN-LAST:event_submitActionPerformed



    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel label1;
    private javax.swing.JButton next;
    private javax.swing.JButton prev;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JButton start;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

     private class TypeTask2 extends TimerTask{
        @Override
        public void run() {
            count_time++;
        }      
    }
}
