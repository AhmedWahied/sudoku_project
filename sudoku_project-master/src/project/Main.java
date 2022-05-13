/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Enjoy
 */
public class Main extends javax.swing.JFrame implements MouseListener {
public static Sudoku a;  // referance 
public static boolean cond=false;
int [][]sudoku ; // main array
    /**
     * Creates new form Main
     */
    public JLabel arr[][] = new JLabel[9][9];
    public JTextField arr_txt[][] = new JTextField[9][9];
    GridLayout grid_layout = new GridLayout(9, 9, 2, 2);
   
  /*  int[][] grid = {
       { 0, 0, 2, 9, 0, 0, 5, 0, 0},//
       {  3, 0, 4, 0, 0, 5, 0, 0, 8},//
       {    0, 7, 0, 8, 0, 0, 0, 6, 0},//
       {    0, 0, 7, 0, 8, 0, 9, 0, 0},//
       {    1, 0, 6, 0, 0, 2, 0, 0, 0},//
       {    8, 0, 0, 1, 0, 0, 6, 0, 7},//
       {    7, 0, 0, 2, 0, 0, 8, 0, 0},//
       {    4, 0, 0, 5, 0, 9, 0, 0, 6},//
       {    5, 0, 0, 4, 6, 0, 0, 7, 0 }};*/
    
   int[][] grid = {
       { 0, 0, 3, 6, 0, 0, 8, 0, 0},//
       {  0, 0, 9, 0, 0, 0, 0, 0, 3},//
       {    0, 7, 0, 0, 0, 0, 0, 2, 0},//
       {    0, 0, 1, 0, 0, 0, 7, 0, 4},//
       {    0, 0, 7, 0, 0, 2, 0, 0, 0},//
       {    9, 5, 0, 0, 0, 0, 0, 6, 0},//
       {    0, 0, 0, 0, 0, 1, 2, 0, 0},//
       {    8, 0, 0, 3, 0, 0, 6, 0, 0},//
       {    0, 0, 0, 7, 4, 0, 9, 0, 0 }};
    
    public Main() { 
        initComponents();
 
       // frame oraintation
        setLocationRelativeTo(null);
        setSize(530, 330);
        setResizable(false);
       new_btn.setVisible(false);
        
       Main_Panal.setLayout(grid_layout);// set layout 
       
       /**
        *insert component in gui 
        */
        for (int i = 0; i < 9; i++){
        for (int j = 0; j < 9; j++) {
            arr[i][j] = new JLabel();
            arr_txt[i][j]= new JTextField();
            arr[i][j].addMouseListener(this);
             arr_txt[i][j].setVisible(true);

            if(grid[i][j]!=0){
                arr[i][j].setText("     "+grid[i][j]+"");
            arr_txt[i][j].setEditable(false);
            Main_Panal.add(arr[i][j]);
            }
            else{
                
                Main_Panal.add(arr_txt[i][j]);
            }
        }}
        /**
         * send array to sudoku class and return solved array
         */
        a = new Sudoku();
 sudoku =a.solve(grid); 
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Main_Panal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        solve_btn = new javax.swing.JButton();
        check_btn = new javax.swing.JButton();
        new_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/mainpic.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 360, 290);

        Main_Panal.setBackground(new java.awt.Color(102, 153, 255));
        Main_Panal.setPreferredSize(new java.awt.Dimension(545, 545));

        javax.swing.GroupLayout Main_PanalLayout = new javax.swing.GroupLayout(Main_Panal);
        Main_Panal.setLayout(Main_PanalLayout);
        Main_PanalLayout.setHorizontalGroup(
            Main_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );
        Main_PanalLayout.setVerticalGroup(
            Main_PanalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        getContentPane().add(Main_Panal);
        Main_Panal.setBounds(0, 0, 360, 290);

        jPanel1.setBackground(new java.awt.Color(79, 63, 159));

        solve_btn.setText("solve");
        solve_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solve_btnActionPerformed(evt);
            }
        });

        check_btn.setText("check");
        check_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                check_btnActionPerformed(evt);
            }
        });

        new_btn.setText("new");
        new_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(solve_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(check_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(new_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(solve_btn)
                .addGap(35, 35, 35)
                .addComponent(check_btn)
                .addGap(30, 30, 30)
                .addComponent(new_btn)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(360, 0, 160, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solve_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solve_btnActionPerformed

 
 
 /**
  * write solved array in gui 
  */
       for (int i = 0; i < 9; i++){
        for (int j = 0; j < 9; j++) {

arr_txt[i][j].setText(sudoku[i][j]+"");
arr_txt[i][j].setEditable(false);
           
        }
          
       }
       /**
       * test in consol
       */
 cond=true;
        System.out.println("......................................");
 for (int a[]:sudoku){
	for (int s : a){
	   System.out.print(s+" ");
	}
System.out.println();
}
        System.out.println();
    }//GEN-LAST:event_solve_btnActionPerformed

    private void check_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_check_btnActionPerformed

       
        
 for (int i = 0; i < 9; i++){
        for (int j = 0; j < 9; j++) {
            
            if(arr_txt[i][j].getText().equals(""))
                     continue;
            
int x = Integer.parseInt(arr_txt[i][j].getText());// get data fron textfield

/**
 * view solved answer 
 */
            if(x==sudoku[i][j]){
                arr_txt[i][j].setBackground(Color.GREEN);
                arr_txt[i][j].setEditable(false);
            }else{
                 arr_txt[i][j].setBackground(Color.RED);
            }
            
           
        }
          
       }

        // TODO add your handling code here:
    }//GEN-LAST:event_check_btnActionPerformed

    private void new_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_btnActionPerformed

        /**
         * test to generate random array
         */
Random rand = new Random();
for(int i=0;i<9;i++){
    for(int j=0;j<9;j++){
        grid[i][j]=(rand.nextInt(9)-4)<0?0:(rand.nextInt(9));
        
    }
    
}
Main_Panal.removeAll();
Main_Panal.revalidate();

 Main_Panal.setLayout(grid_layout);
        for (int i = 0; i < 9; i++){
        for (int j = 0; j < 9; j++) {
            arr[i][j] = new JLabel();
            arr_txt[i][j]= new JTextField();

            arr[i][j].addMouseListener(this);
             arr_txt[i][j].setVisible(true);

            if(grid[i][j]!=0){
                arr[i][j].setText("     "+grid[i][j]+"");
            arr_txt[i][j].setEditable(false);
            Main_Panal.add(arr[i][j]);
            }
            else{
                
                Main_Panal.add(arr_txt[i][j]);
            }
        }}
//        a = new Sudoku();
 sudoku =a.solve(grid); 
        System.out.println(rand.nextInt(9));
        // TODO add your handling code here:
    }//GEN-LAST:event_new_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main_Panal;
    private static javax.swing.JButton check_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton new_btn;
    private static javax.swing.JButton solve_btn;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
//        JLabel check_label = (JLabel) e.getSource();
//        for (int i = 0; i < 81; i++) {
//            if (check_label == arr[i]) {
//                try {
//                    arr[i].setVisible(false);
//                    arr_txt[i].setVisible(true);
//                } catch (Exception ex) {}
//            }
//
//        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {
    }


}