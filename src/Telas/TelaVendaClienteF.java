package Telas;

import Classes.CompraVeiculo;
import Classes.PessoaFisica;
import Classes.Usuarios;
import Classes.Veiculos;
import ConstrutoresSelects.ConstVeicModel;
import DatabaseConnection.DBConnection;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class TelaVendaClienteF extends javax.swing.JFrame {

    DBConnection db = new DBConnection();
    private ArrayList<PessoaFisica> pfCli = new ArrayList<>();
    ArrayList<ConstVeicModel> veicModel = new ArrayList<>();
    DecimalFormat arrendondar = new DecimalFormat("0.00");
    ArrayList<Usuarios> usuarios = new ArrayList<>();

    public TelaVendaClienteF() {
        initComponents();
        lbNomeFun.setText(TelaLogin.nomeFuncionario);
        lbData.setText(TelaLogin.data);
        this.veicModel = db.readVeicModel();
        this.usuarios = db.readAllUsuarios();
        preencherCbVeiculos();

    }

    public void attStatus(int id, String status) {
        Veiculos veic = new Veiculos(id, status);
        db.updateStatusVeiculos(veic, id);

    }

    public void calcularPrest() {
        int parcela = Integer.parseInt(cbParcela.getSelectedItem().toString());
        double juros = 1.63;
        double valorJuros = (juros / 100) * Double.parseDouble(txtPreco.getText());

        if (rbParcelado.isSelected()) {
            
            if (parcela <= 12) {
                if (!"".equals(txtEntrada.getText())) {
                    double entrada = Double.parseDouble(txtEntrada.getText());
                    double prestacao = (Double.parseDouble(txtPreco.getText()) - entrada) / parcela;
                    txtParcela.setText(parcela + "x R$ " + arrendondar.format(prestacao) + " (sem juros)");
                } else {
                    double prestacao
                            = Double.parseDouble(txtPreco.getText()) / parcela;
                    txtParcela.setText(parcela + "x R$ " + arrendondar.format(prestacao) + " (sem juros)");
                }
            } else {
                if (!"".equals(txtEntrada.getText())) {
                    double entrada = Double.parseDouble(txtEntrada.getText());
                    double prestacao = (Double.parseDouble(txtPreco.getText()) - entrada) / parcela;
                    double total = prestacao + valorJuros;

                    txtParcela.setText(parcela + "x R$ " + arrendondar.format(total) + " (+" + juros + "% juros/mês)");
                } else {
                    double prestacao = Double.parseDouble(txtPreco.getText()) / parcela;
                    double total = prestacao + valorJuros;
                    txtParcela.setText(parcela + "x R$ " + arrendondar.format(total) + " (+" + juros + "% juros/mês)");
                }
            }
        } else if (rbConsorcio.isSelected()) {
            
            if (!"".equals(txtEntrada.getText())) {
                double entrada = Float.parseFloat(txtEntrada.getText());
                double prestacao = (Float.parseFloat(txtPreco.getText()) - entrada) / parcela;
                txtParcela.setText(parcela + "x R$ " + arrendondar.format(prestacao) + " (sem juros/Consórcio)");
            } else {
                double prestacao = Float.parseFloat(txtPreco.getText()) / parcela;
                txtParcela.setText(parcela + "x R$ " + arrendondar.format(prestacao) + " (sem juros/Consórcio)");
            }
        }
    }

    public void preencherCbVeiculos() {
        cbVeiculos.removeAllItems();
        for (int i = 0; i < veicModel.size(); i++) {
            cbVeiculos.addItem(veicModel.get(i).mostrarDados());
        }
    }

    public void criarComVeic(CompraVeiculo compVeic) {
        db.createCompraVeiculo(compVeic);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPagamento = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btFinalizar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        rdFisico = new javax.swing.JRadioButton();
        rdJuridico = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtSobrenome = new javax.swing.JTextField();
        txtCpfPesq = new javax.swing.JFormattedTextField();
        txtRg = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbVeiculos = new javax.swing.JComboBox<>();
        txtChassi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rbAVista = new javax.swing.JRadioButton();
        rbParcelado = new javax.swing.JRadioButton();
        rbConsorcio = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        cbParcela = new javax.swing.JComboBox<>();
        txtParcela = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        txtN = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtEntrada = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnoCadastros = new javax.swing.JMenu();
        mnoCliente = new javax.swing.JMenuItem();
        mnoRelatorio = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

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
                .addContainerGap(375, Short.MAX_VALUE)
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

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        btFinalizar.setBackground(new java.awt.Color(255, 122, 0));
        btFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btFinalizar.setText("FINALIZAR");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de cliente");

        rdFisico.setBackground(new java.awt.Color(51, 51, 51));
        rdFisico.setForeground(new java.awt.Color(255, 255, 255));
        rdFisico.setSelected(true);
        rdFisico.setText("Físico");
        rdFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFisicoActionPerformed(evt);
            }
        });

        rdJuridico.setBackground(new java.awt.Color(51, 51, 51));
        rdJuridico.setForeground(new java.awt.Color(255, 255, 255));
        rdJuridico.setText("Jurídico");
        rdJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdJuridicoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CPF");

        jButton1.setBackground(new java.awt.Color(255, 122, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PESQUISAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        try {
            txtCpfPesq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpfPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfPesqActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome ");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("RG");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CPF");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Sobrenome");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CEP");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("N°");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Veículo");

        cbVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVeiculosActionPerformed(evt);
            }
        });

        txtChassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChassiActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Chassi");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Preço");

        rbAVista.setBackground(new java.awt.Color(51, 51, 51));
        bgPagamento.add(rbAVista);
        rbAVista.setForeground(new java.awt.Color(255, 255, 255));
        rbAVista.setText("A vista");
        rbAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAVistaActionPerformed(evt);
            }
        });

        rbParcelado.setBackground(new java.awt.Color(51, 51, 51));
        bgPagamento.add(rbParcelado);
        rbParcelado.setForeground(new java.awt.Color(255, 255, 255));
        rbParcelado.setText("Parcelado");
        rbParcelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParceladoActionPerformed(evt);
            }
        });

        rbConsorcio.setBackground(new java.awt.Color(51, 51, 51));
        bgPagamento.add(rbConsorcio);
        rbConsorcio.setForeground(new java.awt.Color(255, 255, 255));
        rbConsorcio.setText("Consórcio");
        rbConsorcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsorcioActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pagamento");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prestações");

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55(0##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Telefone");

        cbParcela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60", "62", "64", "66", "68", "70", "72" }));
        cbParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParcelaActionPerformed(evt);
            }
        });

        txtParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParcelaActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Entrada");

        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Parcelas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdFisico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdJuridico))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(345, 345, 345))
                            .addComponent(cbVeiculos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(186, 186, 186)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCpfPesq, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(24, 24, 24)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel6)))
                                            .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 50, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel8))
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtParcela, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(cbParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btFinalizar)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel12)
                                                .addComponent(jLabel3))
                                            .addGap(192, 192, 192))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(213, 213, 213)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbAVista)
                                        .addGap(24, 24, 24)
                                        .addComponent(rbParcelado)
                                        .addGap(24, 24, 24)
                                        .addComponent(rbConsorcio))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdFisico)
                            .addComponent(rdJuridico)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCpfPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btFinalizar)
                            .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAVista)
                            .addComponent(rbParcelado)
                            .addComponent(rbConsorcio))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
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

        jMenuBar1.add(mnoCadastros);

        mnoRelatorio.setText("Relatório");
        mnoRelatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnoRelatorioMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnoRelatorio);

        jMenu5.setText("Opções");

        jMenuItem5.setText("Sobre");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Manual do sistema");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Logout");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuItem8.setText("Sair");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

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

    private void mnoRelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnoRelatorioMouseClicked
        TelaPerfilVendedor tp = new TelaPerfilVendedor();
        tp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoRelatorioMouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        TelaManual tm = new TelaManual();
        tm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
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
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void txtChassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChassiActionPerformed

    }//GEN-LAST:event_txtChassiActionPerformed

    private void cbVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVeiculosActionPerformed
        txtChassi.setText(veicModel.get(cbVeiculos.getSelectedIndex()).getChassi_veiculo());
        txtPreco.setText(veicModel.get(cbVeiculos.getSelectedIndex()).getPreco_veiculo() + "");
    }//GEN-LAST:event_cbVeiculosActionPerformed

    private void txtCpfPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfPesqActionPerformed

    }//GEN-LAST:event_txtCpfPesqActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String cpf = txtCpfPesq.getText();
            pfCli = db.readAllPFCli(cpf);
            pfCli.get(0);
            txtTelefone.setText(pfCli.get(0).getTelefone_cliente());
            txtCep.setText(pfCli.get(0).getCep_cliente());
            txtN.setText(pfCli.get(0).getNumero_casa_cliente());
            txtNome.setText(pfCli.get(0).getNome_pessoa_fisica());
            txtSobrenome.setText(pfCli.get(0).getSobrenome_pessoa_fisica());
            txtCpf.setText(pfCli.get(0).getCpf_pessoa_fisica());
            txtRg.setText(pfCli.get(0).getRg_pessoa_fisica());
        } catch (Exception e) {
            System.out.println("" + e);
            int resposta = JOptionPane.showConfirmDialog(null, "CPF não encontrado. Deseja cadastrar um novo cliente? ", "", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                TelaCadastroCliente tcc = new TelaCadastroCliente();
                tcc.setVisible(true);
                setVisible(false);

            } else {
                txtCpfPesq.setText("");
                
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rdJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdJuridicoActionPerformed
        TelaVendaClienteJ tvcj = new TelaVendaClienteJ();
        tvcj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_rdJuridicoActionPerformed

    private void rdFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFisicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdFisicoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaPerfilVendedor tpv = new TelaPerfilVendedor();
        tpv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed

        Random random = new Random(9);
        CompraVeiculo compVeic = new CompraVeiculo();
        int user;
        try {
            if ((rbAVista.isSelected() == false && rbParcelado.isSelected() == false && rbConsorcio.isSelected() == false) || txtTelefone.getText().isEmpty()
                    || txtCep.getText().isEmpty() || txtN.getText().isEmpty() || txtNome.getText().isEmpty() || txtSobrenome.getText().isEmpty()
                    || txtCpf.getText().isEmpty() || txtRg.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Preencha os campos obrigatórios");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Confirme seu login e senha para efetuar a venda");
                String login = JOptionPane.showInputDialog("Digite seu login:");
                String senha = JOptionPane.showInputDialog("Digite sua senha:");

                boolean usuarioValido = false;
                for (Usuarios usuario : usuarios) {
                    if (usuario.getLogin_usuario().equals(login) && usuario.getSenha_usuario().equals(senha)) {
                        usuarioValido = true;
                        user = usuario.getId_usuario();
                        compVeic.setId_usuario(user);
                        break;
                    }
                }

                if (usuarioValido == true) {

                    int id_cliente = pfCli.get(0).getId_cliente();
                    compVeic.setId_cliente(id_cliente);
                    int id_veiculo = veicModel.get(cbVeiculos.getSelectedIndex()).getId_veiculo();
                    compVeic.setId_veiculo(id_veiculo);
                    int renavamP1 = random.nextInt(000000001, 999999999);
                    int renavamP2 = random.nextInt(00, 99);
                    String renavam = renavamP1 + "" + renavamP2;
                    compVeic.setRenavam_compra_veiculo(renavam);
                    int notaFiscal = random.nextInt(000000001, 999999999);
                    String nf = notaFiscal + "";
                    compVeic.setNota_fiscal_compra_veiculo(nf);
                    int crlvP1 = random.nextInt(000000001, 999999999);
                    String crlv = "23B" + crlvP1;
                    compVeic.setCrlv_compra_veiculo(crlv);
                    String status = "Vendido";
                    attStatus(id_veiculo, status);

                    criarComVeic(compVeic);
                    JOptionPane.showMessageDialog(rootPane, "Venda efetuada!\nNota Fiscal:" + notaFiscal + "\nRenavam: " + renavam + "\nCRL-V: " + crlv);
                    TelaPerfilVendedor tpv = new TelaPerfilVendedor();
                    tpv.setVisible(true);
                    setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Login ou senha incorretos. Venda não autorizada.");
                }
            }
        } catch (Exception e) {
            System.out.println("" + e);
            JOptionPane.showMessageDialog(rootPane, "Não foi possível efetuar a venda");
        }
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void rbAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAVistaActionPerformed
        double desconto = 10;
        double valorDesconto = (desconto / 100) * Double.parseDouble(txtPreco.getText());
        double total = Double.parseDouble(txtPreco.getText()) - valorDesconto;
        txtParcela.setText("1x " + arrendondar.format(total) + " (" + desconto + "% de desconto)");
        cbParcela.setSelectedIndex(0);
        txtEntrada.setText("");
    }//GEN-LAST:event_rbAVistaActionPerformed

    private void txtParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParcelaActionPerformed

    private void cbParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParcelaActionPerformed
        calcularPrest();
    }//GEN-LAST:event_cbParcelaActionPerformed

    private void rbParceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParceladoActionPerformed
        cbParcela.setSelectedIndex(1);
    }//GEN-LAST:event_rbParceladoActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaActionPerformed

    private void rbConsorcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsorcioActionPerformed
        cbParcela.setSelectedIndex(1);

    }//GEN-LAST:event_rbConsorcioActionPerformed

    private void mnoCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoCadastrosActionPerformed

    }//GEN-LAST:event_mnoCadastrosActionPerformed

    private void mnoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoClienteActionPerformed
        TelaCadastroCliente tcc = new TelaCadastroCliente();
        tcc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoClienteActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
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
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        TelaSobre ts= new TelaSobre();
        ts.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendaClienteF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendaClienteF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendaClienteF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendaClienteF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendaClienteF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPagamento;
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbParcela;
    private javax.swing.JComboBox<String> cbVeiculos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNomeFun;
    private javax.swing.JMenu mnoCadastros;
    private javax.swing.JMenuItem mnoCliente;
    private javax.swing.JMenu mnoRelatorio;
    private javax.swing.JRadioButton rbAVista;
    private javax.swing.JRadioButton rbConsorcio;
    private javax.swing.JRadioButton rbParcelado;
    private javax.swing.JRadioButton rdFisico;
    private javax.swing.JRadioButton rdJuridico;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtCpfPesq;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtParcela;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtSobrenome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
