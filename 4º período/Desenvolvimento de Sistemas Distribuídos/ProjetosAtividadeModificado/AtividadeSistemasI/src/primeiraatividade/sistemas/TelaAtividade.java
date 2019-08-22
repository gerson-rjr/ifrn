package primeiraatividade.sistemas;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;


public class TelaAtividade extends javax.swing.JFrame {

    public TelaAtividade() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEnv = new javax.swing.JTextField();
        btnEnv = new javax.swing.JButton();
        lblImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Insira a imagem desejada: ");

        txtEnv.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtEnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnvActionPerformed(evt);
            }
        });

        btnEnv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEnv.setText("Enviar");
        btnEnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblImg, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtEnv))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnEnv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImg, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnvActionPerformed

    }//GEN-LAST:event_txtEnvActionPerformed

    private void btnEnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnvActionPerformed
        Cliente c = new Cliente();
        try{
            InetAddress ia = InetAddress.getByName("www.nbc.com");
            Socket s = new Socket(ia.getHostAddress(), 80);
            byte[] b = new byte[100];
            InputStream is = s.getInputStream();
            is.read(b);
            is.close();
            String str = new String(b);
            lblImg.setText(str);
            }catch(UnknownHostException uhe){
            uhe.printStackTrace();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }   
    }//GEN-LAST:event_btnEnvActionPerformed
    
    public static class Cliente{
                
        public Cliente(){        
            
        }
               
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtividade().setVisible(true);
            }
        });
//                Cliente c = new Cliente();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImg;
    private javax.swing.JTextField txtEnv;
    // End of variables declaration//GEN-END:variables
}
