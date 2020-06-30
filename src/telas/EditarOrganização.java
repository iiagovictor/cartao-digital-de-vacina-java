package telas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Organizacao;
import model.dao.BuscarOrganizacaoDataBase;
import valida.CNPJ;

public class EditarOrganização extends javax.swing.JFrame {

    Organizacao organizacao;
    int identificador;
    String situacao, razao_social, tipoDeEstabelecimento, cep, logradouro, complemento, bairro, cidade, uf, telefone, cnpj, numero;

    public EditarOrganização() {
        initComponents();
    }

    public EditarOrganização(Organizacao organizacao, int id) {
        initComponents();
        this.identificador = id;
        this.organizacao = organizacao;
        insertSituacao.setSelectedItem(organizacao.getSituacao());
        insertRazaoSocial.setText(organizacao.getRazao_social());
        insertCnpj.setText(organizacao.getCnpj());
        insertTelefone.setText(organizacao.getTelefone());
        insertTipoDeEstabelecimento.setSelectedItem(organizacao.getTipo_de_estabelecimento());
        insertCEP.setText(organizacao.getCEP());
        insertLogradouro.setText(organizacao.getLogradouro());
        insertNumero.setText(organizacao.getNumero());
        insertComplemento.setText(organizacao.getComplemento());
        insertBairro.setText(organizacao.getBairro());
        insertCidade.setText(organizacao.getCidade());
        insertUf.setSelectedItem(organizacao.getUf());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        voltarTelaAdmin = new javax.swing.JButton();
        botaoBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        insertRazaoSocial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        insertCnpj = new javax.swing.JFormattedTextField();
        insertTelefone = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        insertTipoDeEstabelecimento = new javax.swing.JComboBox<>();
        pesquisarCNPJ = new javax.swing.JFormattedTextField();
        insertCEP = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        insertLogradouro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        insertNumero = new javax.swing.JTextField();
        insertComplemento = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        insertBairro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        insertCidade = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        insertUf = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        insertSituacao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Consultar uma Organização");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Pesquisar por CNPJ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Razão Social");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("CNPJ");

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        voltarTelaAdmin.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        voltarTelaAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        voltarTelaAdmin.setText("Voltar");
        voltarTelaAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarTelaAdminActionPerformed(evt);
            }
        });

        botaoBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        botaoBuscar.setText("Buscar");
        botaoBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoBuscarActionPerformed(evt);
            }
        });

        insertRazaoSocial.setEnabled(false);
        insertRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRazaoSocialActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Telefone");

        insertCnpj.setEditable(false);
        try {
            insertCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        insertCnpj.setEnabled(false);

        try {
            insertTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("55(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de estabelecimento");

        insertTipoDeEstabelecimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Farmácia", "Hospital", "Unidade de Saúde" }));
        insertTipoDeEstabelecimento.setEnabled(false);
        insertTipoDeEstabelecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertTipoDeEstabelecimentoActionPerformed(evt);
            }
        });

        try {
            pesquisarCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            insertCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        insertCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCEPActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("CEP");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Logradouro");

        insertLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertLogradouroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Número");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Complemento");

        insertBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBairroActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("Bairro");

        insertCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCidadeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Cidade");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("UF");

        insertUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Paraná", "Paraíba", "Pará", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondonia", "Roraima", "Santa Catarina", "Sergipe", "São Paulo", "Tocantins" }));

        jLabel16.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel16.setText("Situação");

        insertSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));
        insertSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertSituacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(683, 683, 683)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(voltarTelaAdmin))
                            .addComponent(botaoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pesquisarCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertTipoDeEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(insertCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertLogradouro)
                                    .addComponent(insertNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertBairro, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                                    .addComponent(insertCidade)
                                    .addComponent(insertUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pesquisarCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botaoBuscar)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(insertSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(insertRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(insertCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(insertTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(insertTipoDeEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(jLabel13))
                            .addComponent(insertCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(insertLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insertNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(insertComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(insertBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(insertCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(voltarTelaAdmin)))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoBuscarActionPerformed
        String cnpj = pesquisarCNPJ.getText();
        BuscarOrganizacaoDataBase busca = new BuscarOrganizacaoDataBase();
        try {
            busca.buscar(cnpj);
            dispose();

        } catch (SQLException ex) {
            Logger.getLogger(Busca.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botaoBuscarActionPerformed

    private void insertRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertRazaoSocialActionPerformed

    private void insertTipoDeEstabelecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertTipoDeEstabelecimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertTipoDeEstabelecimentoActionPerformed

    private void insertCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertCEPActionPerformed

    private void insertLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertLogradouroActionPerformed

    private void insertBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertBairroActionPerformed

    private void insertCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertCidadeActionPerformed

    private void voltarTelaAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarTelaAdminActionPerformed
        EditarOrganização.this.dispose();
        TelaAdmin nomeVariavel = new TelaAdmin();
        nomeVariavel.setVisible(true);
    }//GEN-LAST:event_voltarTelaAdminActionPerformed

    private void insertSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertSituacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertSituacaoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.situacao = (String) insertSituacao.getSelectedItem();
        this.telefone = insertTelefone.getText();
        this.cep = insertCEP.getText();
        this.logradouro = insertLogradouro.getText();
        this.numero = insertNumero.getText();
        this.complemento = insertComplemento.getText();
        this.bairro = insertBairro.getText();
        this.cidade = insertCidade.getText();
        this.uf = (String) insertUf.getSelectedItem();

        Organizacao u = new Organizacao(identificador, situacao, telefone, cep, logradouro, numero, complemento, bairro, cidade, uf);
        BuscarOrganizacaoDataBase dao = new BuscarOrganizacaoDataBase();
        try {
            dao.edit(u);
        } catch (SQLException ex) {
            Logger.getLogger(EditarOrganização.class.getName()).log(Level.SEVERE, null, ex);
        }

        dispose();
        new TelaAdmin().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(EditarOrganização.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarOrganização.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarOrganização.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarOrganização.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EditarOrganização().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoBuscar;
    private javax.swing.JTextField insertBairro;
    private javax.swing.JFormattedTextField insertCEP;
    private javax.swing.JTextField insertCidade;
    private javax.swing.JFormattedTextField insertCnpj;
    private javax.swing.JTextField insertComplemento;
    private javax.swing.JTextField insertLogradouro;
    private javax.swing.JTextField insertNumero;
    private javax.swing.JTextField insertRazaoSocial;
    private javax.swing.JComboBox<String> insertSituacao;
    private javax.swing.JFormattedTextField insertTelefone;
    private javax.swing.JComboBox<String> insertTipoDeEstabelecimento;
    private javax.swing.JComboBox<String> insertUf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField pesquisarCNPJ;
    private javax.swing.JButton voltarTelaAdmin;
    // End of variables declaration//GEN-END:variables
}
