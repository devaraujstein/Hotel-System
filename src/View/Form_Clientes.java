/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.Ctr_Clientes;
import Controler.Ctr_Funcionarios;
import Model.Clientes;
import Model.Funcionarios;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author arauj
 */
public class Form_Clientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form Form_Clientes
     */
    public Form_Clientes() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tb_listaC.getModel();
        tb_listaC.setRowSorter(new TableRowSorter(modelo));
        readTb_Lista();
    }
    
    public void readTb_Lista(){
        DefaultTableModel modelo = (DefaultTableModel)tb_listaC.getModel();
        modelo.setNumRows(0);
        Ctr_Clientes controle = new Ctr_Clientes();   
     
        for(Clientes c: controle.selecionarTodos()){
            modelo.addRow(new Object[]{      
            c.getId_cliente(),
            c.getNome(),
            c.getCpf(),
            c.getTelefone(),
            c.getEmail(),
            c.getRua(),
            c.getNumero_casa(),
            c.getBairro(),
            });
        }
    }
    
    public void buscaFeita(String busca){
        DefaultTableModel modelo = (DefaultTableModel)tb_listaC.getModel();
        modelo.setNumRows(0);
        Ctr_Clientes controle = new Ctr_Clientes();   
     
        for(Clientes c: controle.buscar(busca)){
            modelo.addRow(new Object[]{      
            c.getId_cliente(),
            c.getNome(),
            c.getCpf(),
            c.getTelefone(),
            c.getEmail(),
            c.getRua(),
            c.getNumero_casa(),
            c.getBairro(),
            });
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_cpf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_rua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_numero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_telefone = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_bairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnAtualizar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_listaC = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        txt_pesquisar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        btnGerarPDF = new javax.swing.JButton();

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Nome");

        jLabel11.setText("Cadastro de Clientes");

        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("CPF");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Rua");

        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Numero");

        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("telefone");

        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Bairro");

        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("email");

        btnAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/baseline_new_releases_black_18dp.png"))); // NOI18N
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/baseline_save_alt_black_18dp.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/baseline_cancel_black_18dp.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
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
                            .addComponent(jLabel11)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(29, 29, 29)
                                .addComponent(txt_nome))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_telefone))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(28, 28, 28)
                                .addComponent(txt_email)))
                        .addGap(203, 203, 203))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnAtualizar)
                        .addGap(48, 48, 48)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txt_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );

        tb_listaC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nome", "CPF", "Telefone", "Email", "Rua", "Numero", "Bairro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_listaC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_listaCMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tb_listaC);

        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Pesquisar");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/baseline_search_black_18dp.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/baseline_delete_black_18dp.png"))); // NOI18N
        btnApagar.setText("Apagar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/icons/baseline_exit_to_app_black_18dp.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        jLabel14.setText("Lista de Clientes");

        btnGerarPDF.setText("Gerar Relatorio");
        btnGerarPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarPDFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(10, 10, 10)
                                .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3))
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGerarPDF)
                        .addGap(187, 187, 187))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_pesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar)
                        .addComponent(btnApagar)
                        .addComponent(jLabel13))
                    .addComponent(btnSair))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        Clientes cliente = new Clientes();
        Ctr_Clientes ctrClientes = new Ctr_Clientes();

        String nome = txt_nome.getText();
        String cpf = txt_cpf.getText();
        String telefone = txt_telefone.getText();
        String email = txt_email.getText();
        String rua = txt_rua.getText();
        String numero_casa = txt_numero.getText();
        String bairro = txt_bairro.getText();
        int id_cliente = (int) tb_listaC.getValueAt(tb_listaC.getSelectedRow(),0);
        
        cliente = new Clientes(nome,cpf,telefone,email,rua,numero_casa,bairro);
        ctrClientes.editar(cliente, id_cliente);
        readTb_Lista();
        LimparCampos();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        Clientes cliente = new Clientes();
        Ctr_Clientes ctrClientes = new Ctr_Clientes();

        String nome = txt_nome.getText();
        String cpf = txt_cpf.getText();
        String telefone = txt_telefone.getText();
        String email = txt_email.getText();
        String rua = txt_rua.getText();
        String numero_casa = txt_numero.getText();
        String bairro = txt_bairro.getText();
        
        cliente = new Clientes(nome,cpf,telefone,email,rua,numero_casa,bairro);
        ctrClientes.inserir(cliente);
        readTb_Lista();
        LimparCampos();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        LimparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
          String busca = txt_pesquisar.getText();
          if(busca.isEmpty()){
            readTb_Lista();
           }else{
            buscaFeita(busca);
           }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        int id_cliente =  (int) tb_listaC.getValueAt(tb_listaC.getSelectedRow(),0);
         Ctr_Clientes Ctrclientes = new Ctr_Clientes();
         Ctrclientes.deletar(id_cliente);
         ((DefaultTableModel) tb_listaC.getModel()).removeRow(tb_listaC.getSelectedRow());
         LimparCampos();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void tb_listaCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_listaCMouseClicked
        if(tb_listaC.getSelectedRow() != -1){
            txt_nome.setText(tb_listaC.getValueAt(tb_listaC.getSelectedRow(), 1).toString());
            txt_cpf.setText(tb_listaC.getValueAt(tb_listaC.getSelectedRow(), 2).toString());
            txt_telefone.setText(tb_listaC.getValueAt(tb_listaC.getSelectedRow(), 3).toString());
            txt_email.setText(tb_listaC.getValueAt(tb_listaC.getSelectedRow(), 4).toString());
            txt_rua.setText(tb_listaC.getValueAt(tb_listaC.getSelectedRow(), 5).toString());
            txt_numero.setText(tb_listaC.getValueAt(tb_listaC.getSelectedRow(), 6).toString());
            txt_bairro.setText(tb_listaC.getValueAt(tb_listaC.getSelectedRow(), 7).toString());          
        }
    }//GEN-LAST:event_tb_listaCMouseClicked

    private void btnGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarPDFActionPerformed
        Ctr_Clientes clientes = new Ctr_Clientes();
        clientes.gerarPDF();
    }//GEN-LAST:event_btnGerarPDFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGerarPDF;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tb_listaC;
    private javax.swing.JTextField txt_bairro;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_numero;
    private javax.swing.JTextField txt_pesquisar;
    private javax.swing.JTextField txt_rua;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables

 public void LimparCampos(){
     txt_nome.setText("");
     txt_rua.setText("");
     txt_numero.setText("");
     txt_bairro.setText("");
     txt_email.setText("");
     txt_cpf.setText("");
     txt_telefone.setText("");
     txt_email.setText("");
 }

}
