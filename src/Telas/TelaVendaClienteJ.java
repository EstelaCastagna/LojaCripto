package Telas;

import Classes.CompraVeiculo;
import Classes.PessoaFisica;
import Classes.PessoaJuridica;
import Classes.Usuarios;
import Classes.Veiculos;
import ConstrutoresSelects.ConstVeicModel;
import DatabaseConnection.DBConnection;
import java.util.ArrayList;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JOptionPane;

public class TelaVendaClienteJ extends javax.swing.JFrame {

    DBConnection db = new DBConnection();

    private ArrayList<PessoaJuridica> pjCli = new ArrayList<>();
    ArrayList<ConstVeicModel> veicModel = new ArrayList<>();
    DecimalFormat arrendondar = new DecimalFormat("0.00");
    ArrayList<Usuarios> usuarios = new ArrayList<>();

    public TelaVendaClienteJ() {
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

        bgPag = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btVoltar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        rdFisico = new javax.swing.JRadioButton();
        rdJuridico = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtCep = new javax.swing.JFormattedTextField();
        txtN = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbVeiculos = new javax.swing.JComboBox<>();
        txtTelefone = new javax.swing.JFormattedTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCnpjPesq = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtInscricaoEstadual = new javax.swing.JTextField();
        txtChassi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rbAVista = new javax.swing.JRadioButton();
        rbParcelado = new javax.swing.JRadioButton();
        cbParcela = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        rbConsorcio = new javax.swing.JRadioButton();
        txtParcela = new javax.swing.JTextField();
        txtEntrada = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btFinalizar1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtContratoSocial = new javax.swing.JTextField();
        txtCnpj = new javax.swing.JFormattedTextField();
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
        rdFisico.setText("Físico");
        rdFisico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFisicoActionPerformed(evt);
            }
        });

        rdJuridico.setBackground(new java.awt.Color(51, 51, 51));
        rdJuridico.setForeground(new java.awt.Color(255, 255, 255));
        rdJuridico.setSelected(true);
        rdJuridico.setText("Jurídico");
        rdJuridico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdJuridicoActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CNPJ");

        jButton1.setBackground(new java.awt.Color(255, 122, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("PESQUISAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNActionPerformed(evt);
            }
        });

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

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55(0##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Telefone");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nome Fantasia");

        try {
            txtCnpjPesq.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CNPJ");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Razão Social");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Inscrição Estadual");

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
        bgPag.add(rbAVista);
        rbAVista.setForeground(new java.awt.Color(255, 255, 255));
        rbAVista.setText("A vista");
        rbAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAVistaActionPerformed(evt);
            }
        });

        rbParcelado.setBackground(new java.awt.Color(51, 51, 51));
        bgPag.add(rbParcelado);
        rbParcelado.setForeground(new java.awt.Color(255, 255, 255));
        rbParcelado.setText("Parcelado");
        rbParcelado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbParceladoActionPerformed(evt);
            }
        });

        cbParcela.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28", "30", "32", "34", "36", "38", "40", "42", "44", "46", "48", "50", "52", "54", "56", "58", "60", "62", "64", "66", "68", "70", "72" }));
        cbParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParcelaActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Entrada");

        rbConsorcio.setBackground(new java.awt.Color(51, 51, 51));
        bgPag.add(rbConsorcio);
        rbConsorcio.setForeground(new java.awt.Color(255, 255, 255));
        rbConsorcio.setText("Consórcio");
        rbConsorcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbConsorcioActionPerformed(evt);
            }
        });

        txtParcela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtParcelaActionPerformed(evt);
            }
        });

        txtEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntradaActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pagamento");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Parcelas");

        btFinalizar1.setBackground(new java.awt.Color(255, 122, 0));
        btFinalizar1.setForeground(new java.awt.Color(255, 255, 255));
        btFinalizar1.setText("FINALIZAR");
        btFinalizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizar1ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prestações");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Contrato Social (NIRE)");

        txtContratoSocial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContratoSocialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rdFisico)
                                .addGap(24, 24, 24)
                                .addComponent(rdJuridico))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel9))
                            .addComponent(jLabel1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cbVeiculos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addGap(205, 205, 205))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(24, 24, 24)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCnpjPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jButton1))
                            .addComponent(txtContratoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtNomeFantasia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                .addComponent(txtCnpj, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(24, 24, 24))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addGap(27, 27, 27)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6)
                                        .addComponent(txtRazaoSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(txtInscricaoEstadual)
                                        .addComponent(jLabel8)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btFinalizar1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(rbAVista)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbParcelado)
                                            .addGap(18, 18, 18)
                                            .addComponent(rbConsorcio))
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel17))
                                    .addGap(7, 7, 7))
                                .addComponent(txtParcela)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(txtEntrada)
                                            .addGap(24, 24, 24))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addGap(100, 100, 100)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(cbParcela, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAVista)
                            .addComponent(rbParcelado)
                            .addComponent(rbConsorcio))
                        .addGap(122, 122, 122)
                        .addComponent(btFinalizar1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel3)
                                        .addGap(133, 133, 133))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addComponent(txtCnpjPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(jLabel16)
                                                            .addComponent(jLabel5))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                            .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(cbParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel15))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(txtContratoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtParcela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2)))
                                .addComponent(jLabel11)
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
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

    private void mnoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoClienteActionPerformed
        TelaCadastroCliente tcc = new TelaCadastroCliente();
        tcc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoClienteActionPerformed

    private void mnoCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoCadastrosActionPerformed

    }//GEN-LAST:event_mnoCadastrosActionPerformed

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

    private void rdJuridicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdJuridicoActionPerformed
        TelaVendaClienteJ tccj = new TelaVendaClienteJ();
        tccj.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_rdJuridicoActionPerformed

    private void rdFisicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFisicoActionPerformed
        TelaVendaClienteF tccf = new TelaVendaClienteF();
        tccf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_rdFisicoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaPerfilVendedor tpv = new TelaPerfilVendedor();
        tpv.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtChassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChassiActionPerformed

    }//GEN-LAST:event_txtChassiActionPerformed

    private void rbAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAVistaActionPerformed
        double desconto = 10;
        double valorDesconto = (desconto / 100) * Double.parseDouble(txtPreco.getText());
        double total = Double.parseDouble(txtPreco.getText()) - valorDesconto;
        txtParcela.setText("1x " + arrendondar.format(total) + " (" + desconto + "% de desconto)");
        cbParcela.setSelectedIndex(0);
        txtEntrada.setText("");
    }//GEN-LAST:event_rbAVistaActionPerformed

    private void rbParceladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbParceladoActionPerformed
        cbParcela.setSelectedIndex(1);
    }//GEN-LAST:event_rbParceladoActionPerformed

    private void cbParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParcelaActionPerformed
        calcularPrest();
    }//GEN-LAST:event_cbParcelaActionPerformed

    private void rbConsorcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbConsorcioActionPerformed
        cbParcela.setSelectedIndex(1);
    }//GEN-LAST:event_rbConsorcioActionPerformed

    private void txtParcelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtParcelaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtParcelaActionPerformed

    private void txtEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntradaActionPerformed

    private void btFinalizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizar1ActionPerformed
        Random random = new Random(9);
        CompraVeiculo compVeic = new CompraVeiculo();
        int user;
        try {
            if ((rbAVista.isSelected() == false && rbParcelado.isSelected() == false && rbConsorcio.isSelected() == false) || txtTelefone.getText().isEmpty()
                    || txtCep.getText().isEmpty() || txtN.getText().isEmpty() || txtNomeFantasia.getText().isEmpty() || txtRazaoSocial.getText().isEmpty()
                    || txtContratoSocial.getText().isEmpty() || txtInscricaoEstadual.getText().isEmpty()) {
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

                    int id_cliente = pjCli.get(0).getId_cliente();
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
    }//GEN-LAST:event_btFinalizar1ActionPerformed

    private void cbVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVeiculosActionPerformed
        txtChassi.setText(veicModel.get(cbVeiculos.getSelectedIndex()).getChassi_veiculo());
        txtPreco.setText(veicModel.get(cbVeiculos.getSelectedIndex()).getPreco_veiculo() + "");
    }//GEN-LAST:event_cbVeiculosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String cnpj = txtCnpjPesq.getText();
            pjCli = db.readAllPJCli(cnpj);
            pjCli.get(0);
            txtTelefone.setText(pjCli.get(0).getTelefone_cliente());
            txtCep.setText(pjCli.get(0).getCep_cliente());
            txtN.setText(pjCli.get(0).getNumero_casa_cliente());
            txtNomeFantasia.setText(pjCli.get(0).getNome_fantasia_pessoa_juridica());
            txtRazaoSocial.setText(pjCli.get(0).getRazao_social_pessoa_juridica());
            txtCnpj.setText(pjCli.get(0).getCnpj_pessoa_juridica());
            txtInscricaoEstadual.setText(pjCli.get(0).getInscricao_estadual_pessoa_juridica());
            txtContratoSocial.setText(pjCli.get(0).getContrato_social_pessoa_juridica());
        } catch (Exception e) {
            System.out.println("" + e);
            int resposta = JOptionPane.showConfirmDialog(null, "CNPJ não encontrado. Deseja cadastrar um novo cliente? ", "", JOptionPane.YES_NO_OPTION);

            if (resposta == JOptionPane.YES_OPTION) {
                TelaCadastroClienteJ tccj = new TelaCadastroClienteJ();
                tccj.setVisible(true);
                setVisible(false);

            } else {
                txtCnpjPesq.setText("");

            }

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtContratoSocialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContratoSocialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContratoSocialActionPerformed

    private void txtNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVendaClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVendaClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVendaClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVendaClienteJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVendaClienteJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPag;
    private javax.swing.JButton btFinalizar1;
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
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JFormattedTextField txtCnpj;
    private javax.swing.JFormattedTextField txtCnpjPesq;
    private javax.swing.JTextField txtContratoSocial;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtInscricaoEstadual;
    private javax.swing.JTextField txtN;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtParcela;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
