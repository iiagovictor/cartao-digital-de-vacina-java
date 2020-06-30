package telas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.beam.Organizacao;
import model.dao.OrganizacaoDataBase;
import valida.CNPJ;

public class CriarOrganização extends javax.swing.JFrame {

    String situacao, razao_social, tipoDeEstabelecimento, cep, logradouro, complemento, bairro, cidade, uf, telefone, cnpj, numero;

    public CriarOrganização() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        insertRazaoSocial = new javax.swing.JTextField();
        insertLogradouro = new javax.swing.JTextField();
        botaoCriarOrganizacao = new javax.swing.JButton();
        botaoVoltar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        insertNumero = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        insertComplemento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        insertBairro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        insertCidade = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        insertTipoDeEstabelecimento = new javax.swing.JComboBox<>();
        insertUf = new javax.swing.JComboBox<>();
        insertCnpj = new javax.swing.JFormattedTextField();
        insertCEP = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        insertTelefone = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Organização");

        nome.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nome.setText("Razão Social*");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("CNPJ*");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Telefone*");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Tipo de estabelecimento*");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Logradouro");

        insertRazaoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertRazaoSocialActionPerformed(evt);
            }
        });

        insertLogradouro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertLogradouroActionPerformed(evt);
            }
        });

        botaoCriarOrganizacao.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoCriarOrganizacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        botaoCriarOrganizacao.setText("Cadastrar");
        botaoCriarOrganizacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoCriarOrganizacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCriarOrganizacaoActionPerformed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botaoVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Número*");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Complemento");

        insertBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBairroActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel10.setText("Bairro*");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel11.setText("Cidade*");

        insertCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCidadeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel12.setText("UF*");

        insertTipoDeEstabelecimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Farmácia", "Hospital", "Unidade de Saúde" }));
        insertTipoDeEstabelecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertTipoDeEstabelecimentoActionPerformed(evt);
            }
        });

        insertUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Paraná", "Paraíba", "Pará", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondonia", "Roraima", "Santa Catarina", "Sergipe", "São Paulo", "Tocantins" }));
        insertUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertUfActionPerformed(evt);
            }
        });

        try {
            insertCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
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
        jLabel13.setText("CEP*");

        try {
            insertTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("55(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        insertTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertTelefoneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(nome)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(insertCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                                    .addComponent(insertBairro)
                                    .addComponent(insertUf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(141, 141, 141))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(insertNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(insertCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(insertTipoDeEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoCriarOrganizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botaoVoltar)))
                        .addContainerGap(442, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(insertRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(insertTelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(insertCnpj, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(insertRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(insertCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(insertTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(insertTipoDeEstabelecimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(insertCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(insertLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(insertComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(insertBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(insertUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCriarOrganizacao)
                    .addComponent(botaoVoltar))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertLogradouroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertLogradouroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertLogradouroActionPerformed

    private void insertBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertBairroActionPerformed

    private void insertCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertCidadeActionPerformed

    private void insertRazaoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertRazaoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertRazaoSocialActionPerformed

    private void botaoCriarOrganizacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCriarOrganizacaoActionPerformed

        this.situacao = "Ativo";
        
        this.razao_social = insertRazaoSocial.getText();
        
        if (razao_social.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe uma razão social");
        } 

        this.cnpj = insertCnpj.getText();
        CNPJ objetoCNPJ = new CNPJ(cnpj);
        if (objetoCNPJ.isCNPJ()) {
            this.cnpj = insertCnpj.getText();
        } else {
            JOptionPane.showMessageDialog(null, "CNPJ inválido");
            new CriarOrganização().setVisible(true);
            System.exit(0);

        }

        this.telefone = insertTelefone.getText();
        if (telefone.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um telefone");
        }

        this.tipoDeEstabelecimento = (String) insertTipoDeEstabelecimento.getSelectedItem();
        if (tipoDeEstabelecimento.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Selecione um tipo de estabelecimento");
        }

        this.cep = insertCEP.getText();
        if (cep.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um CEP");
        }

        this.logradouro = insertLogradouro.getText();
        if (logradouro.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um logradouro");
        }

        this.complemento = insertComplemento.getText();

        this.numero = insertNumero.getText();
        if (numero.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um número");
        }

        this.bairro = insertBairro.getText();
        if (bairro.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um bairro");
        }

        this.cidade = insertCidade.getText();
        if (cidade.equals("")) {
            JOptionPane.showMessageDialog(null, "Informe uma cidade");
        }

        this.uf = (String) insertUf.getSelectedItem();
        if (uf.equals("Selecione")) {
            JOptionPane.showMessageDialog(null, "Selecione um estado");
        }
        
        

        Organizacao organizacao = new Organizacao(situacao, razao_social, cnpj, cep, logradouro, numero, complemento, bairro, cidade, uf, tipoDeEstabelecimento, telefone);
        OrganizacaoDataBase dataBase = new OrganizacaoDataBase();
        try {
            dataBase.create(organizacao);
        } catch (SQLException ex) {
            Logger.getLogger(CriarOrganização.class.getName()).log(Level.SEVERE, null, ex);
        }

        new CriarOrganização().setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCriarOrganizacaoActionPerformed

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        CriarOrganização.this.dispose();
        TelaAdmin nomeVariavel = new TelaAdmin();
        nomeVariavel.setVisible(true);

    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void insertTipoDeEstabelecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertTipoDeEstabelecimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertTipoDeEstabelecimentoActionPerformed

    private void insertUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertUfActionPerformed

    private void insertCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCEPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertCEPActionPerformed

    private void insertTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_insertTelefoneActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(CriarOrganização.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CriarOrganização.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CriarOrganização.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CriarOrganização.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            //new CriarOrganização().setVisible(true);
            new Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCriarOrganizacao;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JTextField insertBairro;
    private javax.swing.JFormattedTextField insertCEP;
    private javax.swing.JTextField insertCidade;
    private javax.swing.JFormattedTextField insertCnpj;
    private javax.swing.JTextField insertComplemento;
    private javax.swing.JTextField insertLogradouro;
    private javax.swing.JTextField insertNumero;
    private javax.swing.JTextField insertRazaoSocial;
    private javax.swing.JFormattedTextField insertTelefone;
    private javax.swing.JComboBox<String> insertTipoDeEstabelecimento;
    private javax.swing.JComboBox<String> insertUf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel nome;
    // End of variables declaration//GEN-END:variables
}
