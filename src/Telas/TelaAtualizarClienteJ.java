package Telas;

import Classes.Clientes;
import Classes.PessoaJuridica;
import DatabaseConnection.DBConnection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaAtualizarClienteJ extends javax.swing.JFrame {
    
    DBConnection db = new DBConnection();
    private ArrayList<PessoaJuridica> clienteJ = new ArrayList<>();
    private ArrayList<Clientes> cliente = new ArrayList<>();

    public TelaAtualizarClienteJ() {
        initComponents();
       lbNomeFun.setText(TelaLogin.nomeFuncionario);
        lbData.setText(TelaLogin.data);
         //Ocultar opções do menu dependendo de quem está logado
        if(TelaLogin.tipoSessaoAtual.equals("Vendedor")) {
                mnoFuncionario.setVisible(false);
                mnoVeiculo.setVisible(false);
                mnoModelo.setVisible(false);
        }
        //
        
        attBD();
        preencherCBClienteJ();
    }
    
    public void attBD(){
       this.clienteJ = db.readAllPessoaJuridica();
        this.cliente = db.readAllClientesPJ(); 
    }
    
    public void atualizarCli (int id, String cep, String tel,String logradouro, String n, String bairro,String cidade,String estado,String pais){
        Clientes cli = new Clientes(id, cep, tel, logradouro, n, bairro, cidade,estado, pais );
        db.updateClientes(cli, id);
    }
    
    public void atualizarPJ(int idPJ, int idC,String nf,String rs,String cnpj,String ie,String cs){
        PessoaJuridica pj = new PessoaJuridica(idPJ, idC ,nf, rs, cnpj, ie,cs);
        db.updatePessoaJuridica(pj, idPJ);
    }
    
    private void preencherCBClienteJ() {
        
        for (int i = 0; i < clienteJ.size(); i++) {
            cbClienteJ.addItem(clienteJ.get(i).mostrarDados() + " | ID Endereço: " + clienteJ.get(i).getId_cliente());
            
        }

    }
    public void limparCampos(){
        txtTelefone.setText("");
                txtCep.setText("");
                txtLogradouro.setText("");
                txtN.setText("");
                txtBairro.setText("");
                txtCidade.setText("");
                txtEstado.setText("");
                txtPais.setText("");
                txtNomeFantasia.setText("");
                txtRazaoSocial.setText("");
                txtCnpj.setText("");
                txtInscricaoEstadual.setText("");
                txtContratoSocial.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdbCliente = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        txtRazaoSocial = new javax.swing.JTextField();
        txtInscricaoEstadual = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        txtCidade = new javax.swing.JTextField();
        txtN = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtLogradouro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
        txtCep = new javax.swing.JFormattedTextField();
        txtContratoSocial = new javax.swing.JTextField();
        cbClienteJ = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
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

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome Fantasia");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Telefone");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Inscrição Estadual");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CNPJ");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Razão Social");

        btCadastrar.setBackground(new java.awt.Color(255, 122, 0));
        btCadastrar.setText("ATUALIZAR");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CEP");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bairro");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("N°");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Logradouro");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cidade");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("País");

        txtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Estado");

        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Contrato Social (NIRE)");

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55(0##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCnpj.setText("");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtContratoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContratoSocialActionPerformed(evt);
            }
        });

        cbClienteJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteJActionPerformed(evt);
            }
        });

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Cliente");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btVoltar)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4)
                                .addComponent(txtNomeFantasia)
                                .addComponent(jLabel7)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCnpj)
                                .addComponent(txtContratoSocial)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(txtRazaoSocial)
                            .addComponent(txtInscricaoEstadual)
                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel18)
                    .addComponent(cbClienteJ, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel11)
                                    .addComponent(txtEstado)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPais, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                            .addComponent(txtCidade)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel15)
                                                    .addComponent(jLabel14))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel12)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btCadastrar))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtLogradouro)
                                .addGap(24, 24, 24)
                                .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbClienteJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(32, 32, 32))
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(6, 6, 6)))
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel5)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtContratoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btCadastrar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        mnoCadastros.setText("Cadastros");
        mnoCadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnoCadastrosActionPerformed(evt);
            }
        });

        mnoCliente.setText("Cliente");
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
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            if (txtNomeFantasia.getText().isEmpty() || txtRazaoSocial.getText().isEmpty() || txtCnpj.getText().isEmpty()
                    || txtInscricaoEstadual.getText().isEmpty() || txtContratoSocial.getText().isEmpty() || txtTelefone.getText().isEmpty() || txtCep.getText().isEmpty()
                    || txtLogradouro.getText().isEmpty() || txtN.getText().isEmpty() || txtBairro.getText().isEmpty() || txtCidade.getText().isEmpty()
                    || txtEstado.getText().isEmpty() || txtPais.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos ");
            } else {
        Clientes cli = new Clientes();
        PessoaJuridica pj = new PessoaJuridica();
       
        
        String tel = txtTelefone.getText();

        String cep = txtCep.getText();

        String logradouro = txtLogradouro.getText();

        String n = txtN.getText();

        String bairro = txtBairro.getText();

        String cidade = txtCidade.getText();

        String estado = txtEstado.getText();

        String pais = txtPais.getText();

        
        int idC = clienteJ.get(cbClienteJ.getSelectedIndex()).getId_cliente();
        
        atualizarCli(idC, cep, tel, logradouro, n, bairro, cidade,estado, pais);
        
        int idPJ = clienteJ.get(cbClienteJ.getSelectedIndex()).getId_pessoa_juridica();
       String nf = txtNomeFantasia.getText();
        String rs = txtRazaoSocial.getText();
        String cnpj = txtCnpj.getText();
        String ie = txtInscricaoEstadual.getText();
        String cs = txtContratoSocial.getText();
        atualizarPJ(idPJ,idC,nf,rs,cnpj,ie,cs);
         
        JOptionPane.showMessageDialog(rootPane, "Atualizado com sucesso");
       
        TelaListaClienteJ tlcj = new TelaListaClienteJ();
        tlcj.setVisible(true);
        setVisible(false);
                limparCampos();
            }

        } catch (Exception e) {
            System.out.println("" + e);
        }
        
        
        
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void txtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstadoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaListaClienteJ tlc = new TelaListaClienteJ();
        tlc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

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

    private void txtContratoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContratoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContratoSocialActionPerformed

    private void cbClienteJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteJActionPerformed
        txtTelefone.setText(cliente.get(cbClienteJ.getSelectedIndex()).getTelefone_cliente());
        txtCep.setText(cliente.get(cbClienteJ.getSelectedIndex()).getCep_cliente());
        txtLogradouro.setText(cliente.get(cbClienteJ.getSelectedIndex()).getLogradouro_cliente());
        txtN.setText(cliente.get(cbClienteJ.getSelectedIndex()).getNumero_casa_cliente());
        txtBairro.setText(cliente.get(cbClienteJ.getSelectedIndex()).getBairro_cliente());
        txtCidade.setText(cliente.get(cbClienteJ.getSelectedIndex()).getCidade_cliente());
        txtEstado.setText(cliente.get(cbClienteJ.getSelectedIndex()).getEstado_cliente());
        txtPais.setText(cliente.get(cbClienteJ.getSelectedIndex()).getPais_cliente());
        txtNomeFantasia.setText(clienteJ.get(cbClienteJ.getSelectedIndex()).getNome_fantasia_pessoa_juridica());
        txtRazaoSocial.setText(clienteJ.get(cbClienteJ.getSelectedIndex()).getRazao_social_pessoa_juridica());
        txtCnpj.setText(clienteJ.get(cbClienteJ.getSelectedIndex()).getCnpj_pessoa_juridica());
        txtInscricaoEstadual.setText(clienteJ.get(cbClienteJ.getSelectedIndex()).getInscricao_estadual_pessoa_juridica());
        txtContratoSocial.setText(clienteJ.get(cbClienteJ.getSelectedIndex()).getContrato_social_pessoa_juridica());
    }//GEN-LAST:event_cbClienteJActionPerformed

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
        }try {

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
            java.util.logging.Logger.getLogger(TelaAtualizarClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizarClienteJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbClienteJ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
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
    private javax.swing.ButtonGroup rdbCliente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JTextField txtContratoSocial;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
