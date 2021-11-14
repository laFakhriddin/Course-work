/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course.work;

import org.math.plot.Plot2DPanel;

/**
 *
 * @author Appledore
 */
public class graphic extends javax.swing.JFrame {

    Plot2DPanel graph = new Plot2DPanel();

    /**
     * Creates new form graphic
     */
    public graphic() {
        initComponents();
        graph.setBounds(660, 60, 1100, 700);
        add(graph);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        f = new javax.swing.JTextField();
        x0 = new javax.swing.JTextField();
        x1 = new javax.swing.JTextField();
        e = new javax.swing.JTextField();
        n = new javax.swing.JTextField();
        root = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        cleaner = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        insertParams = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Введите функцию и другие параметры");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Введите функция:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Введите параметры");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("[x0:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("x1]:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ошибка:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Максимум ввод:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Корен:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 490, -1, -1));

        f.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jPanel1.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 360, -1));

        x0.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jPanel1.add(x0, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 120, -1));

        x1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jPanel1.add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 120, -1));

        e.setBackground(new java.awt.Color(153, 153, 153));
        e.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        e.setText("1e-6");
        jPanel1.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 120, -1));

        n.setBackground(new java.awt.Color(153, 153, 153));
        n.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        n.setText("100");
        jPanel1.add(n, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 120, -1));

        root.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jPanel1.add(root, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 280, -1));

        calculate.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        calculate.setText("Подсчитывать");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });
        jPanel1.add(calculate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 670, -1, -1));

        cleaner.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cleaner.setText("Очищать поля");
        cleaner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanerActionPerformed(evt);
            }
        });
        jPanel1.add(cleaner, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 670, -1, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        exit.setText("Выход");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 810, -1, -1));

        insertParams.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        insertParams.setText("Обновить график");
        insertParams.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertParamsActionPerformed(evt);
            }
        });
        jPanel1.add(insertParams, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 810, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/course/work/Untitled.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1800, 900));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String def = f.getText();

        double lx0 = Double.parseDouble(x0.getText());
        double lx1 = Double.parseDouble(x1.getText());
        double le = Double.parseDouble(e.getText());
        int ln = Integer.parseInt(n.getText());
        function ff = new function(def);
        method s = new method();
        double r = s.root(ff, lx0, lx1, ln, le);
        root.setText("" + r);

        double[] x = new double[200];
        double[] y = new double[200];
        double xi = lx0 - 10;
        for (int i = 0; i < 200; i++) {
            x[i] = xi + i * 0.1;
            y[i] = ff.value(x[i]);
        }
        graph.addLegend("Course Work");
        graph.removeAllPlots();
        graph.addLinePlot(def, x, y);
    }//GEN-LAST:event_calculateActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void insertParamsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertParamsActionPerformed
        // TODO add your handling code here:
        jLabel1.setEnabled(true);
        f.setEnabled(true);
        jLabel2.setEnabled(true);
        jLabel3.setEnabled(true);
        x0.setEditable(true);
        x1.setEnabled(true);
        calculate.setEnabled(true);
        cleaner.setEnabled(true);
    }//GEN-LAST:event_insertParamsActionPerformed

    private void cleanerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanerActionPerformed
        // TODO add your handling code here:
        f.setText(" ");
        x1.setText(" ");
        x0.setText(" ");
        root.setText(" ");
    }//GEN-LAST:event_cleanerActionPerformed

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
            java.util.logging.Logger.getLogger(graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graphic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graphic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculate;
    private javax.swing.JButton cleaner;
    private javax.swing.JTextField e;
    private javax.swing.JButton exit;
    private javax.swing.JTextField f;
    private javax.swing.JButton insertParams;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField n;
    private javax.swing.JTextField root;
    private javax.swing.JTextField x0;
    private javax.swing.JTextField x1;
    // End of variables declaration//GEN-END:variables
}
