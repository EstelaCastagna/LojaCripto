package Telas;

import Classes.AnoFabricacao;
import Classes.AnoModelo;
import Classes.Cambios;
import Classes.Combustiveis;
import Classes.Cores;
import Classes.Modelos;
import Classes.Veiculos;
import ConstrutoresSelects.ConstVeicModel;
import DatabaseConnection.DBConnection;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TelaAtualizarVeiculo extends javax.swing.JFrame {

    DBConnection db = new DBConnection();
    ArrayList<Modelos> listaModelos = new ArrayList();
    ArrayList<Cores> listaCores = new ArrayList();
    ArrayList<AnoFabricacao> listaAno_Fab = new ArrayList();
    ArrayList<AnoModelo> listaAno_Modelo = new ArrayList();
    ArrayList<Combustiveis> listaCombustiveis = new ArrayList();
    ArrayList<Cambios> listaCambios = new ArrayList();
    ArrayList<ConstVeicModel> veicModel = new ArrayList<>();

    public TelaAtualizarVeiculo() {
        initComponents();
        lbNomeFun.setText(TelaLogin.nomeFuncionario);
        lbData.setText(TelaLogin.data); 
        atualizarBD();
        preencherCbVeiculos();
        preencherCbModelo();
        preencherCbCor();
        preencherCbAno_Fab();
        preencherCbAno_Modelo();
        preencherCbCombustivel();
        preencherCbCambio();

    }

    public void atualizarBD() {
        this.veicModel = db.readVeicModel();
        this.listaModelos = db.readAllModelos();
        this.listaCores = db.readAllCores();
        this.listaAno_Fab = db.readAllAnoFabricacao();
        this.listaAno_Modelo = db.readAllAnoModelo();
        this.listaCombustiveis = db.readAllCombustiveis();
        this.listaCambios = db.readAllCambios();
    }

    public void atualizarVeiculo(int id_veiculo, String chassi_veiculo, int id_modelo, int id_cor, int id_ano_fabricacao, int id_ano_modelo, int id_combustivel, int id_cambio, String status_veiculo, float preco_veiculo) {
        Veiculos veiculo = new Veiculos(id_veiculo, chassi_veiculo, id_modelo, id_cor, id_ano_fabricacao, id_ano_modelo, id_combustivel, id_cambio, status_veiculo, preco_veiculo);
        db.updateVeiculos(veiculo, id_veiculo);
    }

    public void preencherCbVeiculos() {
        cbVeiculos.removeAllItems();
        for (int i = 0; i < veicModel.size(); i++) {
            cbVeiculos.addItem(veicModel.get(i).mostrarDados() + "                       " + veicModel.get(i).getId_ano_fabricacao() + veicModel.get(i).getId_ano_modelo() + veicModel.get(i).getId_cambio() + veicModel.get(i).getId_combustivel());
        }

    }

    public void preencherCbModelo() {

        cbModelo.removeAllItems();
        for (int i = 0; i < listaModelos.size(); i++) {
            cbModelo.addItem("ID: " + listaModelos.get(i).getId_modelo() + " - " + listaModelos.get(i).getNome_modelo() + listaModelos.get(i).getVersao_modelo());
        }

    }

    public void preencherCbCor() {

        cbCor.removeAllItems();
        for (int i = 0; i < listaCores.size(); i++) {
            cbCor.addItem("ID: " + listaCores.get(i).getId_cor() + " - " + listaCores.get(i).getNome_cor());
        }

    }

    public void preencherCbAno_Fab() {
        cbFabricacao.removeAllItems();
        for (int i = 0; i < listaAno_Fab.size(); i++) {
            cbFabricacao.addItem("ID: " + listaAno_Fab.get(i).getId_ano_fabricacao() + " - " + listaAno_Fab.get(i).getAno_fabricacao());
        }

    }

    public void preencherCbAno_Modelo() {

        cbAnoModelo.removeAllItems();
        for (int i = 0; i < listaAno_Modelo.size(); i++) {
            cbAnoModelo.addItem("ID: " + listaAno_Modelo.get(i).getId_ano_modelo() + " - " + listaAno_Modelo.get(i).getAno_modelo());
        }

    }

    public void preencherCbCombustivel() {

        cbCombustivel.removeAllItems();
        for (int i = 0; i < listaCombustiveis.size(); i++) {
            cbCombustivel.addItem("ID: " + listaCombustiveis.get(i).getId_combustivel() + " - " + listaCombustiveis.get(i).getTipo_combustivel());
        }

    }

    public void preencherCbCambio() {

        cbCambio.removeAllItems();
        for (int i = 0; i < listaCambios.size(); i++) {
            cbCambio.addItem("ID: " + listaCambios.get(i).getId_cambio() + " - " + listaCambios.get(i).getTipo_cambio());
        }
    }

    public void criarVeiculo(Veiculos veiculo) {
        db.createVeiculos(veiculo);
    }

    public void limparCampos() {
        txtChassi.setText("");
        txtPreco.setText("");
        txtChassi.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtChassi = new javax.swing.JTextField();
        btAtualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cbCor = new javax.swing.JComboBox<>();
        cbAnoModelo = new javax.swing.JComboBox<>();
        cbFabricacao = new javax.swing.JComboBox<>();
        cbCombustivel = new javax.swing.JComboBox<>();
        cbCambio = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        btVoltar = new javax.swing.JButton();
        txtPreco = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cbModelo = new javax.swing.JComboBox<>();
        btAddCor = new javax.swing.JButton();
        btAddAnoModelo = new javax.swing.JButton();
        btAddAnoFab = new javax.swing.JButton();
        btAddCombustivel = new javax.swing.JButton();
        btAddCambio = new javax.swing.JButton();
        cbVeiculos = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnoCadastros = new javax.swing.JMenu();
        mnoCliente = new javax.swing.JMenuItem();
        mnoFuncionario = new javax.swing.JMenuItem();
        mnoVeiculo = new javax.swing.JMenuItem();
        mnoModelo = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();

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

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ano Modelo");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ano fabricação");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cor");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Preço");

        txtChassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChassiActionPerformed(evt);
            }
        });

        btAtualizar.setBackground(new java.awt.Color(255, 122, 0));
        btAtualizar.setText("ATUALIZAR");
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Status Atual");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cambio");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Chassi");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Combustível");

        cbCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCorActionPerformed(evt);
            }
        });

        cbAnoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAnoModeloActionPerformed(evt);
            }
        });

        cbFabricacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFabricacaoActionPerformed(evt);
            }
        });

        cbCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCombustivelActionPerformed(evt);
            }
        });

        cbCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCambioActionPerformed(evt);
            }
        });

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponível", "Em manutenção", "Vendido" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });

        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Modelo");

        cbModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbModeloActionPerformed(evt);
            }
        });

        btAddCor.setText("+");
        btAddCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCorActionPerformed(evt);
            }
        });

        btAddAnoModelo.setText("+");
        btAddAnoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAnoModeloActionPerformed(evt);
            }
        });

        btAddAnoFab.setText("+");
        btAddAnoFab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddAnoFabActionPerformed(evt);
            }
        });

        btAddCombustivel.setText("+");
        btAddCombustivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCombustivelActionPerformed(evt);
            }
        });

        btAddCambio.setText("+");
        btAddCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddCambioActionPerformed(evt);
            }
        });

        cbVeiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVeiculosActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Escolha o veículo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAtualizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(btAddCambio)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(btAddCor)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbCor, 0, 117, Short.MAX_VALUE)
                                            .addComponent(cbCambio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtChassi)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel10)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel7))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(txtPreco)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btAddAnoModelo)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbAnoModelo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cbStatus, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                            .addComponent(cbModelo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbFabricacao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btAddAnoFab))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(cbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btAddCombustivel))))
                            .addComponent(cbVeiculos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(btVoltar))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btVoltar)
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddCor))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbAnoModelo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddAnoModelo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbFabricacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddAnoFab))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCombustivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddCombustivel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddCambio))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btAtualizar)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jMenu6.setText("Relatório");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoFuncionarioActionPerformed
        TelaCadastroFuncionario tcf = new TelaCadastroFuncionario();
        tcf.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoFuncionarioActionPerformed

    private void mnoCadastrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoCadastrosActionPerformed

    }//GEN-LAST:event_mnoCadastrosActionPerformed

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

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        TelaPerfil tp = new TelaPerfil();
        tp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btVoltarActionPerformed

    private void mnoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoClienteActionPerformed
        TelaCadastroCliente tcc = new TelaCadastroCliente();
        tcc.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoClienteActionPerformed

    private void mnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoModeloActionPerformed
        TelaCadastroModelo tcm = new TelaCadastroModelo();
        tcm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_mnoModeloActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        TelaPerfil tp = new TelaPerfil();
        tp.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
        try {
            if (txtChassi.getText().isEmpty() && txtPreco.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos ");

            } else if (txtChassi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o campo Chassi! ");

            } else if (txtPreco.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha o campo Preço! ");
            } else {
                Veiculos veiculo = new Veiculos();
                int id_veiculo = veicModel.get(cbVeiculos.getSelectedIndex()).getId_veiculo();
                String chassi_veiculo = txtChassi.getText();
                int id_modelo = listaModelos.get(cbModelo.getSelectedIndex()).getId_modelo();
                int cor = listaCores.get(cbCor.getSelectedIndex()).getId_cor();
                int id_ano_fabricacao = listaAno_Fab.get(cbFabricacao.getSelectedIndex()).getId_ano_fabricacao();
                int id_ano_modelo = listaAno_Modelo.get(cbAnoModelo.getSelectedIndex()).getId_ano_modelo();
                int id_combustivel = listaCombustiveis.get(cbCombustivel.getSelectedIndex()).getId_combustivel();
                int id_cambio = listaCambios.get(cbCambio.getSelectedIndex()).getId_cambio();
                float preco_veiculo = Float.parseFloat(txtPreco.getText());
                String status_veiculo = cbStatus.getSelectedItem().toString();
                atualizarVeiculo(id_veiculo, chassi_veiculo, id_modelo, cor, id_ano_fabricacao, id_ano_modelo, id_combustivel, id_cambio, status_veiculo, preco_veiculo);

                TelaListaVeiculos tlv = new TelaListaVeiculos();
                tlv.setVisible(true);
                setVisible(false);
                JOptionPane.showMessageDialog(null, "Atualizado com sucesso");
                limparCampos();
            }
        } catch (Exception e) {
            System.out.println("" + e);

        }


    }//GEN-LAST:event_btAtualizarActionPerformed

    private void mnoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnoVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnoVeiculoActionPerformed

    private void btAddCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCorActionPerformed
        try {
            String input = JOptionPane.showInputDialog("Insira a nova cor:");
            Cores novaCor = new Cores();
            novaCor.setNome_cor(input);
            db.createCores(novaCor);
            atualizarBD();
            preencherCbCor();
        } catch (Exception e) {
            System.out.println("" + e);

        }

    }//GEN-LAST:event_btAddCorActionPerformed

    private void btAddAnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAnoModeloActionPerformed
        try {
            String input = JOptionPane.showInputDialog("Insira o ano modelo:");
            AnoModelo novoAnoModelo = new AnoModelo();
            novoAnoModelo.setAno_modelo(Integer.parseInt(input));
            db.createAnoModelo(novoAnoModelo);
            atualizarBD();
            preencherCbAno_Modelo();
        } catch (Exception e) {
            System.out.println("" + e);

        }
    }//GEN-LAST:event_btAddAnoModeloActionPerformed

    private void btAddCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCambioActionPerformed
        try {
            String input = JOptionPane.showInputDialog("Insira o tipo de câmbio:");
            Cambios novoCambio = new Cambios();
            novoCambio.setTipo_cambio(input);
            db.createCambios(novoCambio);
            atualizarBD();
            preencherCbCambio();
        } catch (Exception e) {
            System.out.println("" + e);

        }
    }//GEN-LAST:event_btAddCambioActionPerformed

    private void cbFabricacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFabricacaoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbFabricacaoActionPerformed

    private void cbCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCombustivelActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cbCombustivelActionPerformed

    private void btAddAnoFabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddAnoFabActionPerformed
        try {
            String input = JOptionPane.showInputDialog("Insira o ano de fabricação:");
            AnoFabricacao novoAF = new AnoFabricacao();
            novoAF.setAno_fabricacao(Integer.parseInt(input));
            db.createAnoFabricacao(novoAF);
            atualizarBD();
            preencherCbAno_Fab();
        } catch (Exception e) {
            System.out.println("" + e);

        }

    }//GEN-LAST:event_btAddAnoFabActionPerformed

    private void btAddCombustivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddCombustivelActionPerformed
        try {
            String input = JOptionPane.showInputDialog("Insira o tipo de combustível:");
            Combustiveis novoCombustivel = new Combustiveis();
            novoCombustivel.setTipo_combustivel(input);
            db.createCombustiveis(novoCombustivel);
            atualizarBD();
            preencherCbCombustivel();
        } catch (Exception e) {
            System.out.println("" + e);

        }

    }//GEN-LAST:event_btAddCombustivelActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void cbAnoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAnoModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAnoModeloActionPerformed

    private void cbCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCambioActionPerformed

    private void cbModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbModeloActionPerformed

    }//GEN-LAST:event_cbModeloActionPerformed

    private void cbCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCorActionPerformed

    }//GEN-LAST:event_cbCorActionPerformed

    private void txtChassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChassiActionPerformed

    }//GEN-LAST:event_txtChassiActionPerformed

    private void cbVeiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVeiculosActionPerformed

        txtChassi.setText(veicModel.get(cbVeiculos.getSelectedIndex()).getChassi_veiculo());
        txtPreco.setText(veicModel.get(cbVeiculos.getSelectedIndex()).getPreco_veiculo() + "");
        cbModelo.setSelectedItem(veicModel.get(cbVeiculos.getSelectedIndex()).getId_modelo());


    }//GEN-LAST:event_cbVeiculosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAtualizarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarVeiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizarVeiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddAnoFab;
    private javax.swing.JButton btAddAnoModelo;
    private javax.swing.JButton btAddCambio;
    private javax.swing.JButton btAddCombustivel;
    private javax.swing.JButton btAddCor;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox<String> cbAnoModelo;
    private javax.swing.JComboBox<String> cbCambio;
    private javax.swing.JComboBox<String> cbCombustivel;
    private javax.swing.JComboBox<String> cbCor;
    private javax.swing.JComboBox<String> cbFabricacao;
    private javax.swing.JComboBox<String> cbModelo;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbVeiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNomeFun;
    private javax.swing.JMenu mnoCadastros;
    private javax.swing.JMenuItem mnoCliente;
    private javax.swing.JMenuItem mnoFuncionario;
    private javax.swing.JMenuItem mnoModelo;
    private javax.swing.JMenuItem mnoVeiculo;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtPreco;
    // End of variables declaration//GEN-END:variables

}
