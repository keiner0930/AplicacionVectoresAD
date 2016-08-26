/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author karrieta9
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    double v[];
    public Principal() {
        initComponents();
        cmdCrear.setEnabled(true);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAutomatico.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
        
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdLlenarManual = new javax.swing.JButton();
        cmdLlenarAutomatico = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setText("Manejo de Vectores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Iniciales"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Longitud :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        txtLongitud.setBackground(new java.awt.Color(215, 247, 247));
        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 50, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 150, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Opciones"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setBackground(new java.awt.Color(107, 240, 240));
        cmdCrear.setFont(new java.awt.Font("Monotype Corsiva", 2, 14)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 130, -1));

        cmdLlenarManual.setBackground(new java.awt.Color(107, 240, 240));
        cmdLlenarManual.setFont(new java.awt.Font("Monotype Corsiva", 2, 14)); // NOI18N
        cmdLlenarManual.setText("Llenar Manual");
        cmdLlenarManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenarManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 130, -1));

        cmdLlenarAutomatico.setBackground(new java.awt.Color(107, 240, 240));
        cmdLlenarAutomatico.setFont(new java.awt.Font("Monotype Corsiva", 2, 14)); // NOI18N
        cmdLlenarAutomatico.setText("Llenar Automatico");
        cmdLlenarAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenarAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, -1));

        cmdMostrar.setBackground(new java.awt.Color(107, 240, 240));
        cmdMostrar.setFont(new java.awt.Font("Monotype Corsiva", 2, 14)); // NOI18N
        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, -1));

        cmdBorrar.setBackground(new java.awt.Color(107, 240, 240));
        cmdBorrar.setFont(new java.awt.Font("Monotype Corsiva", 2, 14)); // NOI18N
        cmdBorrar.setText("Borrar");
        cmdBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 150, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultado"));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResultado.setEditable(false);
        txtResultado.setBackground(new java.awt.Color(215, 247, 247));
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 120));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 260, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(531, 391));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdLlenarManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarManualActionPerformed
     double n;
     int sw,res;
        for(int i=0;i<v.length;i++){
        do{
            sw=1;
        try{    
        n= Double.parseDouble(JOptionPane.showInputDialog(this,"Digite el elemento el la posicion "+i));
        v[i]= n;
        
        }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(this,"Digite un Numero Valido","Error",JOptionPane.ERROR_MESSAGE);
        sw=0;
        }catch(NullPointerException e){
        res=JOptionPane.showConfirmDialog(this,"Seguro que decias salir","Salir",JOptionPane.YES_OPTION);
        if(res==0){
        sw=1;
        i=v.length;
        }else{
        sw=0;     
        }
       
        }
        }while(sw==0);
     cmdCrear.setEnabled(false);
     cmdLlenarManual.setEnabled(false);
     cmdLlenarAutomatico.setEnabled(false);
     cmdMostrar.setEnabled(true);
     cmdBorrar.setEnabled(true);  
        
    }//GEN-LAST:event_cmdLlenarManualActionPerformed
    }
    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
    int Longitud;
        if(txtLongitud.getText().trim().isEmpty()){
        JOptionPane.showMessageDialog(this,"Digite la Longitud" ,"Error ",JOptionPane.ERROR_MESSAGE);
        txtLongitud.requestFocusInWindow();   
    }
    else if(Integer.parseInt(txtLongitud.getText().trim())==0){
    JOptionPane.showMessageDialog(this,"La logitud no puede ser cero(0)","Error",JOptionPane.ERROR_MESSAGE);
    txtLongitud.requestFocusInWindow();
    txtLongitud.selectAll();
    }
    else{
    Longitud= Integer.parseInt(txtLongitud.getText());
    v= new double[Longitud];
    JOptionPane.showMessageDialog(this,"Vector Creado Exitosamente");
    
    cmdCrear.setEnabled(false);
    cmdLlenarManual.setEnabled(true);
    cmdLlenarAutomatico.setEnabled(true);
    cmdMostrar.setEnabled(false);
    cmdBorrar.setEnabled(true);
    txtLongitud.setEditable(false);
    }
    
    
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
     char c=evt.getKeyChar(); 
     if(!Character.isDigit(c)) { 
              getToolkit().beep();  
              evt.consume();
     }   
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        for (int i = 0; i < v.length; i++) {
        txtResultado.append(v[i]+"\n");
        
        }
    cmdCrear.setEnabled(false);
     cmdLlenarManual.setEnabled(false);
     cmdLlenarAutomatico.setEnabled(false);
     cmdMostrar.setEnabled(false);
     cmdBorrar.setEnabled(true);    
       
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBorrarActionPerformed
     txtLongitud.setText("");
     txtResultado.setText("");
     v= null;
     txtLongitud.requestFocusInWindow();
     
     cmdCrear.setEnabled(true);
        cmdLlenarManual.setEnabled(false);
        cmdLlenarAutomatico.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdBorrar.setEnabled(true);
        txtLongitud.setEditable(true);
    }//GEN-LAST:event_cmdBorrarActionPerformed

    private void cmdLlenarAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarAutomaticoActionPerformed
    double n;
        for(int i=0;i<v.length;i++){
        n= (int)(Math.random()*50 + 1);
        v[i]= n;        
        }
    JOptionPane.showMessageDialog(this, "Vector Llenado Correctamente");
    cmdCrear.setEnabled(false);
     cmdLlenarManual.setEnabled(false);
     cmdLlenarAutomatico.setEnabled(false);
     cmdMostrar.setEnabled(true);
     cmdBorrar.setEnabled(true);    
        
    }//GEN-LAST:event_cmdLlenarAutomaticoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLlenarAutomatico;
    private javax.swing.JButton cmdLlenarManual;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
