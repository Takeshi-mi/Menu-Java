

package view;
import javax.swing.JOptionPane;
import model.Cidade;
import java.util.List;
import java.util.ArrayList;
 
public class FrmCadCidade extends javax.swing.JInternalFrame {
    List<Cidade> lista = new ArrayList<Cidade>();
    int contId = 1;
    int indice = 0;
    

    
    /**
     * Creates new form FrmCadCidade
     */
    public FrmCadCidade() {
        initComponents();
        txtId.setEnabled(false); //Desabilitei o botão pro usuário não editar ele. Não quero editar ID pois é chave primária
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        lblId = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblUF = new javax.swing.JLabel();
        txtCep = new javax.swing.JFormattedTextField();
        lblCep = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        cbxUF = new javax.swing.JComboBox<>();
        txtNome = new javax.swing.JTextField();
        cadCidade = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnPrimeiro = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnProximo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setBorder(javax.swing.BorderFactory.createCompoundBorder());
        setClosable(true);
        setForeground(java.awt.Color.cyan);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Cidades");
        setToolTipText("");

        lblId.setText("Id:");

        lblNome.setText("Nome:");

        lblUF.setText("Estado");

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblCep.setText("CEP:");

        txtId.setText("1");
        txtId.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtId.setCaretColor(new java.awt.Color(102, 255, 51));

        cbxUF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Selecionar--", "AC", "AL", "AP ", "AM ", "BA ", "CE ", "DF ", "ES ", "GO ", "MA ", "MT ", "MS ", "MG ", "PA ", "PB ", "PR", "PE ", "PI ", "RJ ", "RN ", "RS ", "RO ", "RR ", "SC" }));
        cbxUF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUFActionPerformed(evt);
            }
        });

        cadCidade.setBackground(new java.awt.Color(255, 255, 255));
        cadCidade.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        cadCidade.setText("Cadastro de Cidades");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnPrimeiro.setText("|<");
        btnPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrimeiroActionPerformed(evt);
            }
        });

        btnUltimo.setText(">|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnProximo.setText(">>");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblUF)
                                .addGap(15, 15, 15)
                                .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblCep)
                                .addGap(18, 18, 18)
                                .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(cadCidade))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(lblId)
                                .addGap(18, 18, 18)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnNovo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrimeiro)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProximo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUltimo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnExcluir)))
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(cadCidade)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUF)
                    .addComponent(cbxUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCep))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrimeiro)
                    .addComponent(btnUltimo)
                    .addComponent(btnAnterior)
                    .addComponent(btnProximo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo)
                    .addComponent(btnEditar))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxUFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUFActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        Cidade cidade = new Cidade();
            
        cidade.id   = Integer.parseInt(txtId.getText());
        cidade.nome = txtNome.getText();
        cidade.uf   = cbxUF.getSelectedItem().toString();
        cidade.cep  = txtCep.getText();
        
        lista.add(cidade);
        
        JOptionPane.showMessageDialog(this, "Cidade salva com sucesso!!");
        
        indice = lista.size()-1;
        mostrarDados();
       
       
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (!lista.isEmpty()){
            int recId = Integer.parseInt(txtId.getText());
        for(int i=0; i<lista.size(); i++)
        {
            if(lista.get(i).id == recId)
            {   
                int op = JOptionPane.showConfirmDialog(this,"Tem certeza que deseja excluir a cidade: "+lista.get(i).nome +"?","Exclusão",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
                if (op == 0){
                    if(!lista.isEmpty())
                    {
                    lista.remove(i);
                    JOptionPane.showMessageDialog(this,"Removido com sucesso.");
                    if(lista.isEmpty())
                    {
                        txtId.setText("");
                        txtNome.setText("");
                        cbxUF.setSelectedItem("--selecione--");
                        txtCep.setText("");
                        
                    }
                }else{
                        indice=lista.size()-1;
                        mostrarDados();
                       
                    }
                   
                }
            }
        }
    }
        else{ JOptionPane.showMessageDialog(this,"Você desistiu de excluir.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       contId++;
       txtId.setText(""+contId);
       txtNome.setText("");
       cbxUF.setSelectedItem("--Selecionar--");
       txtCep.setText("");
       
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
       //txtId.setText(""+lista.get(lista.size()-1).id);
       //txtNome.setText(lista.get(lista.size()-1).nome);
       //cbxUF.setSelectedItem(lista.get(lista.size()-1).uf);
       //txtCep.setText(lista.get(lista.size()-1).cep);
       indice = lista.size() -1;
        mostrarDados();
        btnPrimeiro.setEnabled(true);
        btnAnterior.setEnabled(true);
        btnUltimo.setEnabled(false);
        btnProximo.setEnabled(false);
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrimeiroActionPerformed

       indice=0;
       mostrarDados();
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnUltimo.setEnabled(true);
        btnProximo.setEnabled(true);

    }//GEN-LAST:event_btnPrimeiroActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed

        if (indice > 0){
            indice--;
        btnUltimo.setEnabled(true);
        btnProximo.setEnabled(true);
       }else
        {
        JOptionPane.showMessageDialog(this, "Você já está no primeiro registro.","Atenção", JOptionPane.WARNING_MESSAGE);
        btnPrimeiro.setEnabled(false);
        btnAnterior.setEnabled(false);
        btnUltimo.setEnabled(true);
        btnProximo.setEnabled(true);

        }
        mostrarDados();
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        if(indice<lista.size()-1){
            indice++;
            btnAnterior.setEnabled(true);
            btnUltimo.setEnabled(true);
        }else
        {
        JOptionPane.showMessageDialog(this, "Você já está no último registro.","Atenção", JOptionPane.WARNING_MESSAGE);
        btnUltimo.setEnabled(false);
        btnProximo.setEnabled(false);
        btnAnterior.setEnabled(true);
        btnUltimo.setEnabled(true);
        }
            
        mostrarDados();
        
    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int recId = Integer.parseInt(txtId.getText());
        for(int i=0; i<lista.size(); i++){
            if(lista.get(i).id == recId)
            {
                lista.get(i).nome = txtNome.getText();
                lista.get(i).uf = cbxUF.getSelectedItem().toString();
                lista.get(i).cep = txtCep.getText();
                JOptionPane.showMessageDialog(this, "A cidade de "+lista.get(i).nome+" foi editada com sucesso!");
            }
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPrimeiro;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnUltimo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cadCidade;
    private javax.swing.JComboBox<String> cbxUF;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblUF;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
public void mostrarDados()
{
       txtId.setText(""+lista.get(indice).id);
       txtNome.setText(lista.get(indice).nome);
       cbxUF.setSelectedItem(lista.get(indice).uf);
       txtCep.setText(lista.get(indice).cep);
}

}