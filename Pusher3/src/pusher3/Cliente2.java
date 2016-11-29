package pusher3;

import java.awt.Color;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;


/**
 *
 * @author -> Editado por Marcelo Fritz
 */
public class Cliente2 extends javax.swing.JFrame {

    private Pusher pusher;
    private String usuario = "teste";
    public Cliente2() {
//        while(usuario == null || usuario.trim().length()==0){
//            usuario = JOptionPane.showInputDialog(this, "Escreva seu nome:");
//        }
 
        meuInitComponents();
        pusher = new Pusher(jEditorPane1);
        
    }
    

    private javax.swing.JButton jButton1;

    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField txMsg;
    
    private void meuInitComponents() {
    


        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        txMsg = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();//Adicionado
        jLabel3 = new javax.swing.JLabel();//Adicionado
        jTextArea2 = new javax.swing.JTextArea();//Adicionado
        jScrollPane3 = new javax.swing.JScrollPane();//Adicionado
        jLabel2 = new javax.swing.JLabel();//Adicionado

        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //setLocationRelativeTo(null);
        setTitle("");
        setResizable(false);
        
        getContentPane().setBackground(Color.DARK_GRAY);
        
        jLabel1.setForeground(Color.GREEN);
        jLabel2.setForeground(Color.GREEN);
        jLabel3.setForeground(Color.GREEN);
        

        jEditorPane1.setEditable(false);
        //jEditorPane1.setForeground(Color.red);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        txMsg.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        txMsg.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txMsgActionPerformed(evt);
            }

            
        });

        jButton1.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
                String msg = txMsg.getText();
                if(msg.trim().length()==0)return;
                txMsg.setText("");
                pusher.enviaMensaje(msg);
                //--------------------------------------------------------------
                System.out.println(".jButton1ActionPerformed()");
                System.out.println(msg);
            }
        });
//------------------------------------------------------------------------------------------
        jEditorPane1.setEditable(false);
        jEditorPane1.setContentType("text/html"); // NOI18N
        jScrollPane1.setViewportView(jEditorPane1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Aplicativo para demonstração");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Para testar acesse a página web:");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(0, 51, 255));
        jTextArea2.setRows(5);
        jTextArea2.setText("marcelofritz85.pe.hu/chat1/");
        jScrollPane3.setViewportView(jTextArea2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Sistemas Distribuídos ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }
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
            java.util.logging.Logger.getLogger(Cliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cliente2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cliente2().setVisible(true);
            }
        });
    }
        
        private void txMsgActionPerformed(ActionEvent evt) {
                String msg = txMsg.getText();
                if(msg.trim().length()==0)return;
                txMsg.setText("");
                pusher.enviaMensaje(usuario,msg ,"false");
        }
        
    }                   

    

