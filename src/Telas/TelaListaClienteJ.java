package Telas;

import Classes.Clientes;
import DatabaseConnection.DBConnection;
import Classes.PessoaJuridica;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaListaClienteJ extends javax.swing.JFrame {

    DBConnection db = new DBConnection();
    ArrayList<PessoaJuridica> pj = new ArrayList<>();
    ArrayList<Clientes> telefonePJ = new ArrayList<>();

    public TelaListaClienteJ() {
        initComponents();
        lbNomeFun.setText(TelaLogin.nomeFuncionario);
        lbData.setText(TelaLogin.data); 
        //Ocultar opções do menu dependendo de quem está logado
        if (TelaLogin.tipoSessaoAtual.equals("Vendedor")) {
            mnoFuncionario.setVisible(false);
            mnoVeiculo.setVisible(false);
            mnoModelo.setVisible(false);
        }
        //

        this.pj = db.readAllPessoaJuridica();
        this.telefonePJ = db.readTelCEPClientesPJ();
        preencherTabela();

    }
    private void limparTabela(){
        this.pj = db.readAllPessoaJuridica();
        this.telefonePJ = db.readTelCEPClientesPJ();
        preencherTabela();
        for (int i = 0; i < 40; i++) {
            TabelaListaClienteJ.setValueAt("", i, 0);
            TabelaListaClienteJ.setValueAt("", i, 1);
            TabelaListaClienteJ.setValueAt("", i, 2);
            TabelaListaClienteJ.setValueAt("", i, 3);
            TabelaListaClienteJ.setValueAt("", i, 4);
        }

    }

    private void preencherTabela() {
        //limpar a table
        
        for (int i = 0; i < pj.size(); i++) {
            TabelaListaClienteJ.setValueAt(pj.get(i).getId_pessoa_juridica(), i, 0);
            TabelaListaClienteJ.setValueAt(pj.get(i).getNome_fantasia_pessoa_juridica(), i, 1);
            TabelaListaClienteJ.setValueAt(pj.get(i).getRazao_social_pessoa_juridica(), i, 2);
            TabelaListaClienteJ.setValueAt(pj.get(i).getCnpj_pessoa_juridica(), i, 3);
            TabelaListaClienteJ.setValueAt(telefonePJ.get(i).getTelefone_cliente(), i, 4);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListaClienteJ = new javax.swing.JTable();
        btEditar = new javax.swing.JButton();
        btDeletar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnoCadastros = new javax.swing.JMenu();
        mnoCliente = new javax.swing.JMenuItem();
        mnoFuncionario = new javax.swing.JMenuItem();
        mnoVeiculo = new javax.swing.JMenuItem();
        mnoModelo = new javax.swing.JMenuItem();
        mnoRelatorio = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        mnoSobre = new javax.swing.JMenuItem();
        mnoManual = new javax.swing.JMenuItem();
        mnoLogout = new javax.swing.JMenuItem();
        mnoSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(0, 176, 103));
        jPanel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel1.setText("Bem vindo,");

        lbNomeFun.setText("NomeFuncionario");

        lbData.setText("13/12/3000");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomeFun)
                .addGap(18, 18, 18)
                .addComponent(lbData)
                .addGap(37, 37, 37))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNomeFun)
                    .addComponent(lbData))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        TabelaListaClienteJ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome Fantasia", "Razão Social", "CNPJ", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaListaClienteJ);

        btEditar.setBackground(new java.awt.Color(255, 122, 0));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btDeletar.setBackground(new java.awt.Color(255, 122, 0));
        btDeletar.setText("Deletar");
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });

        btVoltar.setBackground(new java.awt.Color(255, 122, 0));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btVoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mnoCadastros.setText("Cadastros");
        mnoCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoCadastrosActionPerformed(evt);
            }
        });

        mnoCliente.setText("Cliente");
        mnoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoClienteActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoCliente);

        mnoFuncionario.setText("Funcionário");
        mnoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoFuncionarioActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoFuncionario);

        mnoVeiculo.setText("Veículo");
        mnoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoVeiculoActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoVeiculo);

        mnoModelo.setText("Modelo");
        mnoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoModeloActionPerformed(evt);
            }
        });
        mnoCadastros.add(mnoModelo);

        jMenuBar1.add(mnoCadastros);

        mnoRelatorio.setText("Relatório");
        mnoRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnoRelatorioMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnoRelatorio);

        jMenu5.setText("Opções");

        mnoSobre.setText("Sobre");
        mnoSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoSobreActionPerformed(evt);
            }
        });
        jMenu5.add(mnoSobre);

        mnoManual.setText("Manual do sistema");
        mnoManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoManualActionPerformed(evt);
            }
        });
        jMenu5.add(mnoManual);

        mnoLogout.setText("Logout");
        mnoLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoLogoutActionPerformed(evt);
            }
        });
        jMenu5.add(mnoLogout);

        mnoSair.setText("Sair");
        mnoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoSairActionPerformed(evt);
            }
        });
        jMenu5.add(mnoSair);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoClienteActionPerformed
        TelaCadastroCliente tcc = new TelaCadastroCliente();
        tcc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoClienteActionPerformed

    private void mnoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoFuncionarioActionPerformed
        TelaCadastroFuncionario tcf = new TelaCadastroFuncionario();
        tcf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoFuncionarioActionPerformed

    private void mnoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoVeiculoActionPerformed
        TelaCadastroVeiculo tcv = new TelaCadastroVeiculo();
        tcv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoVeiculoActionPerformed

    private void mnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoModeloActionPerformed
        TelaCadastroModelo tcm = new TelaCadastroModelo();
        tcm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoModeloActionPerformed

    private void mnoCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoCadastrosActionPerformed

    }//GEN-LAST:event_mnoCadastrosActionPerformed

    private void mnoRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnoRelatorioMouseClicked
         if (TelaLogin.tipoSessaoAtual.equals("Vendedor")) {
            TelaPerfilVendedor tpv = new TelaPerfilVendedor();
            tpv.setVisible(true);
            setVisible(false);
        } else {
            TelaPerfil tp = new TelaPerfil();
            tp.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_mnoRelatorioMouseClicked

    private void mnoManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoManualActionPerformed
        TelaManual tm = new TelaManual();
        tm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoManualActionPerformed

    private void mnoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoSairActionPerformed
        try {

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja sair do sistema? ", "", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                System.exit(0);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada");
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }

    }//GEN-LAST:event_mnoSairActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        if (TelaLogin.tipoSessaoAtual.equals("Vendedor")) {
            TelaPerfilVendedor tpv = new TelaPerfilVendedor();
            tpv.setVisible(true);
            setVisible(false);
        } else {
            TelaPerfil tp = new TelaPerfil();
            tp.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        TelaAtualizarClienteJ tacj = new TelaAtualizarClienteJ();
        tacj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btEditarActionPerformed

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        try{
        String id = JOptionPane.showInputDialog("Insira o id do cliente que deseja deletar:");
        int idInt = Integer.parseInt(id);
        int resposta = JOptionPane.showConfirmDialog(null, "Você confirma a exclusão do cliente? ", "", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {
            db.deletePessoaJuridica(idInt);
            JOptionPane.showMessageDialog(rootPane, "Excluido com sucesso");
            limparTabela();
        preencherTabela();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Exclusão cancelada");
        }
        }
        catch(Exception e){
            System.out.println(""+e);
        }
    }//GEN-LAST:event_btDeletarActionPerformed

    private void mnoLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoLogoutActionPerformed
        try {

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja encerrar sua sessão? ", "", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                TelaLogin tl = new TelaLogin();
                tl.setVisible(true);
                setVisible(false);

            } else {
                JOptionPane.showMessageDialog(rootPane, "Operação cancelada");
            }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }//GEN-LAST:event_mnoLogoutActionPerformed

    private void mnoSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoSobreActionPerformed
        TelaSobre ts= new TelaSobre();
        ts.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoSobreActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListaClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaClienteJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaListaClienteJ;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNomeFun;
    private javax.swing.JMenu mnoCadastros;
    private javax.swing.JMenuItem mnoCliente;
    private javax.swing.JMenuItem mnoFuncionario;
    private javax.swing.JMenuItem mnoLogout;
    private javax.swing.JMenuItem mnoManual;
    private javax.swing.JMenuItem mnoModelo;
    private javax.swing.JMenu mnoRelatorio;
    private javax.swing.JMenuItem mnoSair;
    private javax.swing.JMenuItem mnoSobre;
    private javax.swing.JMenuItem mnoVeiculo;
    // End of variables declaration//GEN-END:variables
}
