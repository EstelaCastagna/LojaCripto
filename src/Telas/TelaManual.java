package Telas;

import ConstrutoresSelects.ConstVenda;
import DatabaseConnection.DBConnection;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class TelaManual extends javax.swing.JFrame {

    DBConnection db = new DBConnection();
    ArrayList<ConstVenda> venda = new ArrayList<>();
    
    public TelaManual() {
        initComponents();
        lbNomeFun.setText(TelaLogin.nomeFuncionario);
        lbData.setText(TelaLogin.data); 
        if (TelaLogin.tipoSessaoAtual.equals("Vendedor")) {
            mnoFuncionario.setVisible(false);
            mnoVeiculo.setVisible(false);
            mnoModelo.setVisible(false);
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbNomeFun = new javax.swing.JLabel();
        lbData = new javax.swing.JLabel();
        btVoltar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtManual = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnoCadastros = new javax.swing.JMenu();
        mnoCliente = new javax.swing.JMenuItem();
        mnoFuncionario = new javax.swing.JMenuItem();
        mnoVeiculo = new javax.swing.JMenuItem();
        mnoModelo = new javax.swing.JMenuItem();
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

        btVoltar.setBackground(new java.awt.Color(255, 122, 0));
        btVoltar.setText("Voltar");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        txtManual.setEditable(false);
        txtManual.setColumns(20);
        txtManual.setRows(5);
        txtManual.setText("MANUAL DO SISTEMA\n\nO sistema foi criado de forma que sua interface seja fácil, objetiva e intuitiva, entretanto este manual o ajudará \ncaso possua dúvida sobre alguma de suas funcionalidades ou como fazê-las.\n\nLOGIN\n\nA partir do momento que seu login e senha são verificados, o sistema exibe as telas pertinentes ao perfil do \nusuário logado.\nExistem 2 tipos de perfis: administrador e vendedor. Administradores  têm acesso a todas as funcionalidades \ndo sistema como cadastros, edições, exclusões e relatórios. \nJá o vendedor, além da tela de venda, catálogo e estoque, pode cadastrar, editar, excluir e visualizar o que \nfor relacionado a clientes. \nNo entanto, não possui as demais permissões do administrador.\n\nCADASTROS\n\nTodos os cadastros estão disponíveis no menu de cadastros no canto superior esquerdo. Administradores \ntêm permissão para cadastrar clientes (físicos e jurídicos), funcionários que terão acesso ao sistema, \nmodelos e veículos. Lembre-se de preencher todos os campos pois cada informação é importante e o \ncadastro não será efetuado se faltar algum. \n\n* Como cadastrar Clientes (Físico/Jurídico)?\n\nDentro do menu de cadastros, existe a opção \"Cliente\", após entrar, será apresentado à uma tela \nna qual deve selecionar se o cliente é físico ou jurídico. Isso mudará as informações que devem ser inseridas \ne serão salvas. Preencha todos os dados, são obrigatórios.\n\n* Como fazer cadastro de Funcionários?\n\nNa opção \"Funcionário\" é onde o administrador será direcionado para a tela em que irá selecionar qual \no perfil, login e senha, além de inserir as informações dos funcionários que terão acesso ao sistema e \nautomaticamente suas permissões. Por questões de segurança, atualizar login, senha ou tipo de perfil \nsó pode ser feito pelo administrador. Caso seja necessário, entre em contato com algum admistrador \npara fazer a alteração.\n\n* Como fazer o cadastro de um Modelo?\n\nCaso não exista o cadastro do modelo escolhido (você pode checar no relatório de modelos na tela \ninicial), um novo pode ser efetuado em \"Modelo\". Você pode cadastrar uma nova marca no botão \ncom o símbolo de \"+\" ao lado da caixa de seleção de marca, caso a mesma não esteja listada.\n\nEspecificando os dados com exemplos:\n\"Tipo\" - utilitario, esportivo, transporte;\n\"Versão\" - LTZ, LS, Si, Sport, Adventure;\n\"Espécie\" - passageiros, carga, mista;\n\"Carroceria\" - sedan, SUV, hatch;\n\"Motor\" -  2JZ-GTE, K24A, LS3;\n\"Potência\" - 245cv, 301cv, 450cv;\n\"Lotação\" - 2, 2+1, 5, 5+1.\n\n* Como fazer o cadastro de um Veículo?\n\nPara cadastrar um veículo, primeiro deve existir o modelo dele, leia o tópico anterior se necessário.\nNa opção \"Veículo\" serão cadastrados os dados específicos de um veículo. Campos como cor, ano \nfabricação, ano modelo e os demais selecionáveis (exceto status) podem ter novos itens adicionados \nse necessário ao clicar nos botões com o símbolo \"+\" ao lado das suas respectivas caixas de seleção.\n\nRELATÓRIOS\n\nOs relatórios podem ser acessados ao clicar na segunda opção do menu superior chamada \n\"Relatório\" ou na tela inicial . \nCada botão tem o nome do tipo de dado que será relatado.\nPara os administradores, é neles que existem as opções de atualizar e excluir (que serão \nexplicadas nos tópicos abaixo) e que são exibidos os dados existentes. \nPara os vendedores, os relatórios se limitam a clientes físicos e jurídicos. Porém, na mesma \nlocalização, possuem catálogo e estoque para consulta dos veículos.\n\nEDIÇÕES\n\nPara editar qualquer tipo de cadastro, você deve ir ao relatório correspondente (ou seja, para editar \num veículo, vá para o relatório de veículos), na lateral direita estará o botão de editar. Verifique na \ncaixa de seleção qual cadastro deseja alterar e selecione, desta forma os campos não selecionáveis \nirão se preencher automaticamente. Modifique as informações que desejar.\n\nEXCLUSÕES\n\nPara excluir qualquer tipo de cadastro, você deve ir ao relatório correspondente assim como na \nedição e na lateral direita estará o botão de excluir. Na caixa de diálogo que surgirá, insira o ID \ndo item que deseja deletar (o ID pode ser visualizado no relatório) e confirme se desejado.\n\nObservações:\nPor questões de segurança, veículos que já foram vendidos e clientes que já tenham efetuado \numa compra não podem ter seuscadastros deletados. Da mesma forma relatórios de vendas \ntambém não podem ser deletados ou alterados.\n\nVENDAS\n\nAssim como o administrador tem áreas que apenas ele tem acesso, os vendedores são os \núnicos que possuem uma área disponível para a venda de veículos e ela pode ser acessada \nna sua tela inicial.\nO sistema permite que os dados sobre o cliente sejam preenchidos automaticamente através \nde uma pesquisa pelo CPF ou CNPJ (selecione se o cliente é físico ou jurídico para a mudança \nde dados). Caso não possua nenhum registro,uma caixa de diálogo surgirá perguntando se há \nvontade de fazer um novo cadastro ou não.\nSemelhante ao cliente, há uma caixa de seleção de veículos que preencherá automaticamente \nos dados do veículo selecionado.\n\nSelecione a forma de pagamento.\nA Vista: O automóvel sai com 10% de desconto;\nParcelado: Até 12x sem juros, acima disso terá um acréscimo de 1.63% de juros/mês.\nConsórcio: As parcelas não possuem juros independente da quantidade.\nMarque a opção desejada e escolha a quantidade de prestações para os casos de parcelado e \nconsórcio, o cálculo éautomático. Se houver entrada, o valor será abatido.\n\nLOGOUT/SAIR\n\nPara sair do seu perfil ou fechar o sistema, vá até \"Opções\" do menu superior.\n");
        jScrollPane3.setViewportView(txtManual);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btVoltar)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 18, Short.MAX_VALUE))
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
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(TelaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaManual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaManual().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btVoltar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbNomeFun;
    private javax.swing.JMenu mnoCadastros;
    private javax.swing.JMenuItem mnoCliente;
    private javax.swing.JMenuItem mnoFuncionario;
    private javax.swing.JMenuItem mnoModelo;
    private javax.swing.JMenu mnoRelatorio;
    private javax.swing.JMenuItem mnoVeiculo;
    private javax.swing.JTextArea txtManual;
    // End of variables declaration//GEN-END:variables
}
