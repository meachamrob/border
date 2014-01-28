/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Bordergui.java
 *
 * Created on Nov 14, 2012, 3:36:51 PM
 */
package border;

import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Calendar;

/**
 *
 * @author deboj11
 */
public class Bordergui extends javax.swing.JFrame {



    /** Creates new form Bordergui */
    public Bordergui() {
        initComponents();
    }
    mainframe fm = new mainframe();
    Vector<Double> LoldSupport=new Vector<Double>();
    Vector<Double> BoldSupport=new Vector<Double>();
    Vector<String> Bwhole = new Vector<String>();
    Vector<String> PromptedBorder = new Vector<String>();
    Vector<String> Lwhole = new Vector<String>();
    Vector<Double> Lwholesup = new Vector<Double>();
    Vector<Double> Bwholesup = new Vector<Double>();
    Vector<Double> tmpsup = new Vector<Double>();
    Vector<String> SubsetGen = new Vector<String>();
    Vector<String> LiGeneration = new Vector<String>();
    Vector<String> CandidateSet = new Vector<String>();
    Vector<String> notFrequent =new Vector<String>();
    double minsup = fm.minSup;
    String delim = " ";
    String oldtable=fm.table;
    Integer totalTransaction = 10;
    Calendar c1;
    Calendar c2;
    long diff,t1,t2;
   String dataurl="jdbc:mysql://localhost:3306/deboj11";
   String uname="root";
   String pass="";
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ARM FOR SENSOR NETWORK");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("Old Data");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("New Data");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setText("BORDER ALGORITHM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel4.setText("First Min. Support(%)");

        jButton1.setText("Run");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, 124, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setText("OUTPUT");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel6.setText("Time Required");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel7.setText("Frequent Set");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel8.setText("Border Set");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
// TODO add your handling code here:
    jComboBox3.removeAllItems();
    jComboBox4.removeAllItems();
    BordersProcess();
    for(int i=0;i<Lwhole.size();i++){
    jComboBox3.addItem(Lwhole.get(i));
    }
    for(int i=0;i<Bwhole.size();i++){
    jComboBox4.addItem(Bwhole.get(i));
    }
  
    jTextField2.setText(Long.toString(diff));
    
    
    
}//GEN-LAST:event_jButton1MouseClicked

private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
// TODO add your handling code here:
 
      //Just For time being later i ll change it
      jComboBox1.addItem(oldtable);
      jComboBox1.setEnabled(false);
      Connection conn=null;
      jComboBox2.removeAllItems();
      String s=Double.toString(minsup);
      jTextField1.setText(s);
      jTextField1.setEditable(false);
      
           try{
           Class.forName("com.mysql.jdbc.Driver");//Register Driver
           conn = DriverManager.getConnection(dataurl,uname,pass);//Open Database Connection
           DatabaseMetaData dbm=conn.getMetaData();
           
           /* DISPLAYING LIST OF TABLES */
           String[] types={"TABLE"};
           ResultSet rs=dbm.getTables(null, null, "%", types);
           while(rs.next()){
           String table=rs.getString("TABLE_NAME");
           jComboBox2.addItem(table);
           }
           rs.close();
           conn.close();
         
           }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(mainframe.class.getName()).log(Level.SEVERE, null, ex);
            }          
        catch(SQLException se){
           se.printStackTrace();//Handles Error For Jdbc
           }
      
  
}//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Bordergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bordergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bordergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bordergui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Bordergui().setVisible(true);
            }
        });
    }

    /***********************************************
     Method Name:BorderProcess
     *Purpose:Process all the Borders Algorithm
     *Return Type:None
     *Parameters:None
     *Other Method Used:None 
     ***********************************************/    
    private void BordersProcess(){
    Lwhole.clear();
    Bwhole.clear();
    t1=c1.getInstance().getTimeInMillis();
    CalculateSupport();
    CalculatePromptedBorder();
    CalculateFrequentWhole();
    CalculateBwhole();
    int i=1;
    while(!LiGeneration.isEmpty() || i<=PromptedBorder.size()){
    LiGeneration.clear();
    CandidatesGeneration(i+1);
    LiCalculate();
    Lwhole.addAll(LiGeneration);
    i=i+1;
    }
    t2=c2.getInstance().getTimeInMillis();
    diff=t2-t1;
    }
    
    /* METHOD PURPOSE:Find Support */
       private void Support(Vector<String> e, Vector<Double> s) {
        StringTokenizer st; //tokenizer for candidate and transaction
        boolean match; //whether the transaction has all the items in an itemset
        double count[] = new double[e.size()]; //the number of successful matches
        Connection conn = null;
        Statement stmt = null;

        double sup;

        try {
            Class.forName("com.mysql.jdbc.Driver");//Register Driver
            conn = DriverManager.getConnection(dataurl,uname,pass);//Open Database Connection
            stmt = conn.createStatement();
            String sql;

            sql = "SELECT * FROM "+jComboBox2.getSelectedItem().toString();
            ResultSet rs = stmt.executeQuery(sql);
            //For Each Transaction
            while (rs.next()) {
                //Check Each Candidate
                for (int c = 0; c < e.size(); c++) {
                    match = false;//reset match to false
                    st = new StringTokenizer(e.get(c), delim);
                    //check each item in the itemset in the transaction if it is present 
                    while (st.hasMoreTokens()) {
                        int val = rs.getInt(st.nextToken());
                        if (val == 1) {
                            match = true;
                        } else {
                            match = false;
                        }
                        if (!match) {
                            break;
                        }
                    }
                    if (match) {
                        count[c]++;
                    }//if successful match then increment the count
                }//For loop Close 
            }//While Loop Close For each transaction
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();//Handles Error For Jdbc
        } catch (Exception se) {
            se.printStackTrace();//Handles Error For class.name
        }


        for (int i = 0; i < e.size(); i++) {
            //calculate support 
            sup = (count[i]  + s.get(i))/(double) totalTransaction;
            //if the count% is larger than the minSup%, add to the candidate to the frequent candidates
            tmpsup.add(sup);

        }



    }

    /* METHOD PURPOSE:Calculate Support */
    private void CalculateSupport() {
        Support(fm.PfrequentCandidates, fm.fsup);
        LoldSupport.addAll(tmpsup);
        tmpsup.clear();
        Support(fm.BorderSet, fm.bsup);
        BoldSupport.addAll(tmpsup);
        tmpsup.clear();
    }
     /***********************************************
     Method Name:CalculatePromptedBorder()
     *Purpose:Generate Promptedborder and Border for whole database.
     *Return Type:None
     *Parameters:None
     *Other Method Used:None 
     ***********************************************/
    private void CalculatePromptedBorder() {
        for (int i = 0; i < fm.BorderSet.size(); i++) {
            if (BoldSupport.get(i) >= minsup) {
                PromptedBorder.add(fm.BorderSet.get(i).toString());
                //Bwholesup.remove(i);//remove the support it is no longer Border set.
            }
            else{Bwhole.add(fm.BorderSet.get(i));}
            
        }
    }//close CalculatePromptedBorder

    private void CalculateFrequentWhole() {
//write code here
            for (int i = 0; i < fm.PfrequentCandidates.size(); i++) {
            if (LoldSupport.get(i) >= minsup) {
                Lwhole.add(fm.PfrequentCandidates.get(i).toString());
            }
            else{notFrequent.add(fm.PfrequentCandidates.get(i));}
        }
   
        Lwhole.addAll(PromptedBorder);
    }

    /***********************************************
     Method Name:CalculateBwhole
     *Purpose:Generate Border set
     *Return Type:None
     *Parameters:None
     *Other Method Used:None 
     ***********************************************/
private void CalculateBwhole(){
Bwhole.addAll(notFrequent);
notFrequent.clear();
}

/***********************************************
Method Name:SubsetGeneration
*Purpose:Generate Subset
*Return Type:None
*Parameters:Non Frequent item String
*Other Method Used:None 
***********************************************/        
   private void SubsetGeneration(String s){
   Vector<String> tmpsubset1=new Vector<String>();
   Vector<String> tmpsubset2=new Vector<String>();
   String substr1,substr2,str;
   int len;
   StringTokenizer subtoken,subtokenst1,subtokenst2;
   len=s.split(" ").length;
   /* if String length is==2 it will run 1 pass and add chars in vector if length is 3 it will run 2 times */
for(int i=1;i<len;i++){
     if(i==1){
     subtoken=new StringTokenizer(s,delim);
     while(subtoken.hasMoreTokens()){
         str=subtoken.nextToken();
         SubsetGen.add(str);
         tmpsubset1.add(str);
        }//While Loop Close
     tmpsubset2.clear();
     tmpsubset2=new Vector(tmpsubset1);
     }//if length is 1
     else if(i==2){
         tmpsubset1.clear();
         //add each itemset from the previous frequent itemsets together
            for(int k=0; k<tmpsubset2.size();k++)
            {
                subtokenst1 = new StringTokenizer(tmpsubset2.get(k));
                substr1 = subtokenst1.nextToken();
                for(int l=k+1; l<tmpsubset2.size();l++)          {
                    subtokenst2 = new StringTokenizer(tmpsubset2.get(l));
                    substr2 = subtokenst2.nextToken();
                    tmpsubset1.add(substr1+substr2);
                    SubsetGen.add(substr1+" "+substr2);
                }
            }
         tmpsubset2.clear();
         tmpsubset2=new Vector(tmpsubset1);
     }//IF length==2 close
     else{
         tmpsubset1.clear();
                //for each itemset
            for(int m=0; m<tmpsubset2.size();m++)
            {
                //compare to the next itemset
                for(int n=m+1; n<tmpsubset2.size();n++)
                {
                    //create the strigns
                    substr1 = new String();
                    substr2 = new String();
                    //create the tokenizers
                    subtokenst1 = new StringTokenizer(tmpsubset2.get(m));
                    subtokenst2 = new StringTokenizer(tmpsubset2.get(n));

                    //make a string of the first n-2 tokens of the strings
                    for(int p=0; p<len-2; p++)
                    {
                        substr1 = substr1 + " " + subtokenst1.nextToken();
                        substr2 = substr2 + " " + subtokenst2.nextToken();
                    }

                    //if they have the same n-2 tokens, add them together
                    if(substr2.compareToIgnoreCase(substr1)==0){
                        String tmpstring;
                        tmpstring=(substr1 + subtokenst1.nextToken() + subtokenst2.nextToken()).trim();
                       tmpsubset1.add(tmpstring);
                       SubsetGen.add(tmpstring);
                    }
                }
            }
            tmpsubset2.clear();
            tmpsubset2=new Vector(tmpsubset1);
            
     }//else close
}//For Loop Close
     
}
    /***********************************************
    Method Name:CandidatesGeneration
     *Purpose:Generate candidate set
     *Return Type:None
     *Parameters:None
     *Other Method Used:None 
     ***********************************************/
    private void CandidatesGeneration(int n) {
        String fstr;
     
 
            for (int i = 0; i < PromptedBorder.size(); i++) {
                for (int j = 0; j < Lwhole.size(); j++) {
                    if(!(PromptedBorder.get(i).equals(Lwhole.get(j)))){
                    fstr=PromptedBorder.get(i)+" "+Lwhole.get(j);
                    if(fstr.split(" +").length == n){
                    CandidateSet.add(fstr);
                    }
                    }
                }
            }
        
    }

    /***********************************************
    Method Name:CalculateSupport
     *Purpose:Calculate Support
     *Return Type:double
     *Parameters:Li item. Algorithm line 17,table name
     *Other Method Used:None 
     ***********************************************/
    private double CalculateCount(String xstr, String table) {


        StringTokenizer st; //tokenizer for candidate and transaction
        boolean match; //whether the transaction has all the items in an itemset
        double count = 0; //the number of successful matches
        Connection conn = null;
        Statement stmt = null;





        try {
            Class.forName("com.mysql.jdbc.Driver");//Register Driver
            conn = DriverManager.getConnection(dataurl,uname,pass);//Open Database Connection
            stmt = conn.createStatement();
            String sql;

            sql = "SELECT * FROM " + table;
            ResultSet rs = stmt.executeQuery(sql);
            //For Each Transaction
            while (rs.next()) {
                match = false;//reset match to false
                st = new StringTokenizer(xstr, delim);//Tokenize each item in itemset
                //check each item in the itemset in the transaction if it is present 
                while (st.hasMoreTokens()) {
                    int val = rs.getInt(st.nextToken());
                    if (val == 1) {
                        match = true;
                    } else {
                        match = false;
                    }
                    if (!match) {
                        break;
                    }
                }
                if (match) {
                    count++;
                }//if successful match then increment the count

            }//While Loop Close For each transaction
            rs.close();
            conn.close();
        } catch (SQLException se) {
            se.printStackTrace();//Handles Error For Jdbc
        } catch (Exception e) {
            e.printStackTrace();//Handles Error For class.name
        }



        return count;
    }

    /***********************************************
    Method Name:LiCalculationb
     *Purpose:Generate Li sets of Algorithm line 17
     *Return Type:None
     *Parameters:None
     *Other Method Used:None 
     ***********************************************/
    private void LiCalculate() {
        double ncount;
        double numtransaction = 10;
        for (int i = 0; i < CandidateSet.size(); i++) {
            ncount = CalculateCount(CandidateSet.get(i), "t_new") + CalculateCount(CandidateSet.get(i), "t_old");
            if (ncount / numtransaction >= minsup) {
                LiGeneration.add(CandidateSet.get(i));
            }
            else{
               Bwhole.add(CandidateSet.get(i));
            }
        }
      
       
        CandidateSet.clear();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
