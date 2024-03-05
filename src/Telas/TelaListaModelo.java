
package Telas;

import ConstrutoresSelects.ConstMarcasAlf;
import ConstrutoresSelects.ConstModelosAlf;
import DatabaseConnection.DBConnection;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TelaListaModelo extends javax.swing.JFrame {

    DBConnection db = new DBConnection();
    ArrayList<ConstMarcasAlf> marcasAlf = new ArrayList<>();
    ArrayList<ConstModelosAlf> modelosAlf = new ArrayList<>();
    ArrayList<ConstModelosAlf> modelosDisp = new ArrayList<>();
    ArrayList<ConstModelosAlf> modelosVend = new ArrayList<>();
    ArrayList<ConstModelosAlf> modelosMan = new ArrayList<>();
    
    public TelaListaModelo() {
        initComponents();
        lbNomeFun.setText(TelaLogin.nomeFuncionario);
        lbData.setText(TelaLogin.data); 
        this.marcasAlf = db.readMarcasAlf();
        this.modelosAlf = db.readModelosAlf();
        this.modelosDisp = db.readModelosDisp();
        this.modelosVend = db.readModelosVend();
        this.modelosMan = db.readModelosMan();
        preencherModelosAlf();
       
    }
    public void limpartabela(){
        for (int i = 0; i < 40; i++) {
            
            TabelaListaVeiculos.setValueAt("", i, 0);
            TabelaListaVeiculos.setValueAt("", i, 1);
            TabelaListaVeiculos.setValueAt("", i, 2);
            TabelaListaVeiculos.setValueAt("", i, 3);
            TabelaListaVeiculos.setValueAt("", i, 4);
            
        }
    }
    
    public void preencherMarcasAlf(){
        for (int i = 0; i < marcasAlf.size(); i++) {
            TabelaListaVeiculos.setValueAt(marcasAlf.get(i).getId_marca(),i,0);
            TabelaListaVeiculos.setValueAt(marcasAlf.get(i).getNome_marca(),i,1);
            TabelaListaVeiculos.setValueAt(marcasAlf.get(i).getNome_modelo(),i,2);
            TabelaListaVeiculos.setValueAt(marcasAlf.get(i).getVersao_modelo(),i,3);
            TabelaListaVeiculos.setValueAt(marcasAlf.get(i).getStatus_veiculo(),i,4);
        }
  
    }
    
    public void preencherModelosAlf(){
        
        for (int i = 0; i < modelosAlf.size(); i++) {
            TabelaListaVeiculos.setValueAt(modelosAlf.get(i).getId_modelo(),i,0);
            TabelaListaVeiculos.setValueAt(modelosAlf.get(i).getNome_marca(),i,1);
            TabelaListaVeiculos.setValueAt(modelosAlf.get(i).getNome_modelo(),i,2);
            TabelaListaVeiculos.setValueAt(modelosAlf.get(i).getVersao_modelo(),i,3);
            TabelaListaVeiculos.setValueAt(modelosAlf.get(i).getStatus_veiculo(),i,4);
        }
  
    }
    
    public void preencherModelosDisp(){
        
        for (int i = 0; i < modelosDisp.size(); i++) {
            TabelaListaVeiculos.setValueAt(modelosDisp.get(i).getId_modelo(),i,0);
            TabelaListaVeiculos.setValueAt(modelosDisp.get(i).getNome_marca(),i,1);
            TabelaListaVeiculos.setValueAt(modelosDisp.get(i).getNome_modelo(),i,2);
            TabelaListaVeiculos.setValueAt(modelosDisp.get(i).getVersao_modelo(),i,3);
            TabelaListaVeiculos.setValueAt(modelosDisp.get(i).getStatus_veiculo(),i,4);
        }
  
    }
    
    public void preencherModelosVend(){
        
        for (int i = 0; i < modelosVend.size(); i++) {
            TabelaListaVeiculos.setValueAt(modelosVend.get(i).getId_modelo(),i,0);
            TabelaListaVeiculos.setValueAt(modelosVend.get(i).getNome_marca(),i,1);
            TabelaListaVeiculos.setValueAt(modelosVend.get(i).getNome_modelo(),i,2);
            TabelaListaVeiculos.setValueAt(modelosVend.get(i).getVersao_modelo(),i,3);
            TabelaListaVeiculos.setValueAt(modelosVend.get(i).getStatus_veiculo(),i,4);
        }
  
    }
    
    public void preencherModelosMan(){
        
        for (int i = 0; i < modelosMan.size(); i++) {
            TabelaListaVeiculos.setValueAt(modelosMan.get(i).getId_modelo(),i,0);
            TabelaListaVeiculos.setValueAt(modelosMan.get(i).getNome_marca(),i,1);
            TabelaListaVeiculos.setValueAt(modelosMan.get(i).getNome_modelo(),i,2);
            TabelaListaVeiculos.setValueAt(modelosMan.get(i).getVersao_modelo(),i,3);
            TabelaListaVeiculos.setValueAt(modelosMan.get(i).getStatus_veiculo(),i,4);
        }
  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListaVeiculos = new javax.swing.JTable();
        btVoltar = new javax.swing.JButton();
        rbMarca = new javax.swing.JRadioButton();
        rbModelo = new javax.swing.JRadioButton();
        rbDisponiveis = new javax.swing.JRadioButton();
        rbVendidos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbManutencao = new javax.swing.JRadioButton();
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

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(0, 176, 103));
        jPanel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N

        jLabel10.setText("Bem vindo,");

        lbNomeFun.setText("NomeFuncionario");

        lbData.setText("13/12/3000");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomeFun)
                .addGap(18, 18, 18)
                .addComponent(lbData)
                .addGap(37, 37, 37))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lbNomeFun)
                    .addComponent(lbData))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        TabelaListaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Marca", "Modelo", "Versão", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaListaVeiculos);

        btVoltar.setBackground(new java.awt.Color(255, 122, 0));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        rbMarca.setForeground(new java.awt.Color(0, 0, 0));
        rbMarca.setText("Marca");
        rbMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMarcaActionPerformed(evt);
            }
        });

        rbModelo.setForeground(new java.awt.Color(0, 0, 0));
        rbModelo.setText("Modelo");
        rbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbModeloActionPerformed(evt);
            }
        });

        rbDisponiveis.setForeground(new java.awt.Color(0, 0, 0));
        rbDisponiveis.setText("Disponíveis");
        rbDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbDisponiveisActionPerformed(evt);
            }
        });

        rbVendidos.setForeground(new java.awt.Color(0, 0, 0));
        rbVendidos.setText("Vendidos");
        rbVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbVendidosActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ordernar por:");

        rbManutencao.setForeground(new java.awt.Color(0, 0, 0));
        rbManutencao.setText("Manutenção");
        rbManutencao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbManutencaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(rbMarca)
                        .addGap(18, 18, 18)
                        .addComponent(rbModelo)
                        .addGap(18, 18, 18)
                        .addComponent(rbDisponiveis)
                        .addGap(18, 18, 18)
                        .addComponent(rbVendidos)
                        .addGap(18, 18, 18)
                        .addComponent(rbManutencao))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbMarca)
                    .addComponent(rbModelo)
                    .addComponent(rbDisponiveis)
                    .addComponent(rbVendidos)
                    .addComponent(jLabel1)
                    .addComponent(rbManutencao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btVoltar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoClienteActionPerformed
        TelaCadastroCliente tcc= new TelaCadastroCliente();
        tcc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoClienteActionPerformed

    private void mnoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoFuncionarioActionPerformed
        TelaCadastroFuncionario tcf= new TelaCadastroFuncionario();
        tcf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoFuncionarioActionPerformed

    private void mnoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoVeiculoActionPerformed
        TelaCadastroVeiculo tcv= new TelaCadastroVeiculo();
        tcv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoVeiculoActionPerformed

    private void mnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoModeloActionPerformed
        TelaCadastroModelo tcm= new TelaCadastroModelo();
        tcm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoModeloActionPerformed

    private void mnoCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoCadastrosActionPerformed

    }//GEN-LAST:event_mnoCadastrosActionPerformed

    private void mnoRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnoRelatorioMouseClicked
        TelaPerfil tp = new TelaPerfil();
        tp.setVisible(true);
        setVisible(false);
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
        TelaPerfil tp=new TelaPerfil();
        tp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void rbManutencaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbManutencaoActionPerformed
        if(rbManutencao.isSelected()){
         rbModelo.setSelected(false);
         rbMarca.setSelected(false);
         rbDisponiveis.setSelected(false);
         rbVendidos.setSelected(false);
         limpartabela();
          preencherModelosMan();
        }   
        
    }//GEN-LAST:event_rbManutencaoActionPerformed

    private void rbMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMarcaActionPerformed
        if(rbMarca.isSelected()){
         rbModelo.setSelected(false);
         rbManutencao.setSelected(false);
         rbDisponiveis.setSelected(false);
         rbVendidos.setSelected(false);
         limpartabela();
          preencherMarcasAlf();       
        }
        else{
        for (int i = 0; i <40; i++) {
            
            TabelaListaVeiculos.setValueAt("", i, 0);
            TabelaListaVeiculos.setValueAt("", i, 1);
            TabelaListaVeiculos.setValueAt("", i, 2);
            TabelaListaVeiculos.setValueAt("", i, 3);
            TabelaListaVeiculos.setValueAt("", i, 4);
        }    
        
        }

    }//GEN-LAST:event_rbMarcaActionPerformed

    private void rbDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbDisponiveisActionPerformed
       if(rbDisponiveis.isSelected()){
         rbModelo.setSelected(false);
         rbManutencao.setSelected(false);
         rbMarca.setSelected(false);
         rbVendidos.setSelected(false);
         limpartabela();
         preencherModelosDisp();
        }   
        else{
           for (int i = 0; i <40; i++) {
            
            TabelaListaVeiculos.setValueAt("", i, 0);
            TabelaListaVeiculos.setValueAt("", i, 1);
            TabelaListaVeiculos.setValueAt("", i, 2);
            TabelaListaVeiculos.setValueAt("", i, 3);
            TabelaListaVeiculos.setValueAt("", i, 4);
       }
       }
    }//GEN-LAST:event_rbDisponiveisActionPerformed

    private void rbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbModeloActionPerformed
       if(rbModelo.isSelected()){
         rbMarca.setSelected(false);
         rbManutencao.setSelected(false);
         rbDisponiveis.setSelected(false);
         rbVendidos.setSelected(false);
         limpartabela();
          preencherModelosAlf();
        }  
        else{
           for (int i = 0; i <40; i++) {
            
            TabelaListaVeiculos.setValueAt("", i, 0);
            TabelaListaVeiculos.setValueAt("", i, 1);
            TabelaListaVeiculos.setValueAt("", i, 2);
            TabelaListaVeiculos.setValueAt("", i, 3);
            TabelaListaVeiculos.setValueAt("", i, 4);
        
        }
       }
    }//GEN-LAST:event_rbModeloActionPerformed

    private void rbVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbVendidosActionPerformed
        if(rbVendidos.isSelected()){
         rbModelo.setSelected(false);
         rbManutencao.setSelected(false);
         rbDisponiveis.setSelected(false);
         rbMarca.setSelected(false);
         limpartabela();
          preencherModelosVend();
        }  
         else{
            for (int i = 0; i <40; i++) {
            
            TabelaListaVeiculos.setValueAt("", i, 0);
            TabelaListaVeiculos.setValueAt("", i, 1);
            TabelaListaVeiculos.setValueAt("", i, 2);
            TabelaListaVeiculos.setValueAt("", i, 3);
            TabelaListaVeiculos.setValueAt("", i, 4);
       }
        
        }

    }//GEN-LAST:event_rbVendidosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaModelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaModelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaListaVeiculos;
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
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
    private javax.swing.JRadioButton rbDisponiveis;
    private javax.swing.JRadioButton rbManutencao;
    private javax.swing.JRadioButton rbMarca;
    private javax.swing.JRadioButton rbModelo;
    private javax.swing.JRadioButton rbVendidos;
    // End of variables declaration//GEN-END:variables
}
