package br.com.edamatec.gui;

import br.com.edamatec.dao.ClienteDAO;
import javax.swing.JOptionPane;
import br.com.edamatec.modelo.Cliente;

public class ClienteGUI extends javax.swing.JFrame {

    public ClienteGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoCpf = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoSalvar = new javax.swing.JButton();
        campoExcluir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        campoPesquisar = new javax.swing.JTextField();
        campoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("CPF");

        campoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEmailActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("E-Mail");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Telefone");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Cadastro de Clientes");

        campoSalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoSalvar.setText("Salvar");
        campoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalvarActionPerformed(evt);
            }
        });

        campoExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoExcluir.setText("Excluir");
        campoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoExcluirActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Campo de Pesquisa");

        campoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPesquisarActionPerformed(evt);
            }
        });

        campoSair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        campoSair.setText("Sair");
        campoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(campoSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoExcluir)))
                        .addGap(140, 140, 140)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(campoSair)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoSalvar)
                    .addComponent(campoExcluir)
                    .addComponent(campoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(campoSair)
                .addGap(118, 118, 118))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEmailActionPerformed

    }//GEN-LAST:event_campoEmailActionPerformed

    private void campoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPesquisarActionPerformed

    }//GEN-LAST:event_campoPesquisarActionPerformed

    private void campoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_campoSairActionPerformed

    private void campoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoExcluirActionPerformed
        campoNome.setText("");
        campoCpf.setText("");
        campoTelefone.setText("");
        campoEmail.setText("");
    }//GEN-LAST:event_campoExcluirActionPerformed

    private void campoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalvarActionPerformed
        Cliente cliente = new Cliente();
        cliente.setNome(campoNome.getText());
        cliente.setCpf(campoCpf.getText());
        cliente.setTelefone(campoTelefone.getText());
        cliente.setEmail(campoEmail.getText());

        if ((campoNome.getText().isEmpty()) || (campoCpf.getText().isEmpty()) || (campoTelefone.getText().isEmpty()) || (campoEmail.getText().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        } else {
            ClienteDAO dao = new ClienteDao();
            dao.inserir(cliente);
            JOptionPane.showMessageDialog(null, "Cliente" + campoNome.getText() + "Inserido com sucesso!"+ campoCpf.getText() + "CPF Inserido com sucesso!" + campoTelefone.getText() + "Inserido com sucesso!" + campoEmail.getText() + "Inserido com sucesso!");
        }
        campoNome.setText("");
        campoCpf.setText("");
        campoTelefone.setText("");
        campoEmail.setText("");
    }//GEN-LAST:event_campoSalvarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoCpf;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JButton campoExcluir;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoPesquisar;
    private javax.swing.JButton campoSair;
    private javax.swing.JButton campoSalvar;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    private static class ClienteDao extends ClienteDAO {

        public ClienteDao() {
        }
    }
}
