/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ComentarioJpaController;
import java.security.Principal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Comentario;
import persistence.PersistenceSingleton;

/**
 *
 * @author alunos
 */
public class Home extends javax.swing.JPanel {

    /**
     * Creates new form HomeAluno
     */
    public Home() {
        initComponents();
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
        tabelaComentario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputComentario = new javax.swing.JTextField();
        inputAutor = new javax.swing.JTextField();
        buttonEnviarComentario = new javax.swing.JButton();
        buttonBuscarComentario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        setPreferredSize(new java.awt.Dimension(710, 400));

        tabelaComentario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        tabelaComentario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Autor", "Comentário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaComentario);

        jLabel1.setText("Autor:");

        jLabel2.setText("Comentário:");

        inputComentario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                inputComentarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                inputComentarioFocusLost(evt);
            }
        });
        inputComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputComentarioActionPerformed(evt);
            }
        });

        inputAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputAutorActionPerformed(evt);
            }
        });

        buttonEnviarComentario.setText("Enviar");
        buttonEnviarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEnviarComentarioActionPerformed(evt);
            }
        });

        buttonBuscarComentario.setText("Buscar Comentários");
        buttonBuscarComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBuscarComentarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Deixe um comentário ou aviso para seus colegas:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/img/horário-escolar-simples - Copia.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(inputComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(buttonEnviarComentario))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buttonBuscarComentario, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(26, 26, 26)
                                    .addComponent(inputAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(253, 253, 253)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(45, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buttonBuscarComentario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputComentario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonEnviarComentario))
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputComentarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputComentarioActionPerformed

    private void inputAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputAutorActionPerformed

    private void buttonEnviarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEnviarComentarioActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tabelaComentario.getModel();
        int row = tabelaComentario.getSelectedRow();
         if(((inputAutor.getText()).equals("")) || ((inputComentario.getText()).equals("")) ){
             JOptionPane.showMessageDialog(this, "Todos os campos são de preenchimento obriagtório!");
         }else{
                 
                 EntityManagerFactory ponte = PersistenceSingleton.getInstance().getEntityManagerFactory();
                 System.out.println(ponte);
                 ComentarioJpaController cController = new ComentarioJpaController(ponte);
                 if(row == -1){
                     Comentario f1 = new Comentario();
                     f1.setAutor((inputAutor.getText()));
                     f1.setComentario((inputComentario.getText()));;
                     cController.create(f1);
                     System.out.println(f1.toString());
                     String a[] = new String[]{f1.getAutor(), f1.getComentario()};
                     dtm.addRow(a);       
                 }else{
                     
                     Comentario cNovo = new Comentario();
                     cNovo.setAutor((inputAutor.getText()));
                     cNovo.setComentario(inputComentario.getText());
                     try{
                         cController.edit(cNovo);
                     }catch(Exception e){
                         System.err.println(e);
                     }
                     System.out.println(cNovo.toString());
                 }
             } 
    }//GEN-LAST:event_buttonEnviarComentarioActionPerformed

    private void buttonBuscarComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBuscarComentarioActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) tabelaComentario.getModel();
        EntityManagerFactory ponte = PersistenceSingleton.getInstance().getEntityManagerFactory();
        ComentarioJpaController pesController = new ComentarioJpaController(ponte);
        List<Comentario> listaComentarios = pesController.findComentarioEntities();
        int tamanho = listaComentarios.size();
        if(inputAutor.getText().equals("")){
            for(int i=0; i<tamanho; i++){
                Comentario c = listaComentarios.get(i);
                String autor = c.getAutor();
                String comentario = c.getComentario();
                String a[] = new String[]{autor, comentario};
                dtm.addRow(a);
            }
        }
    }//GEN-LAST:event_buttonBuscarComentarioActionPerformed

    private void inputComentarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputComentarioFocusGained
        // TODO add your handling code here:
        inputComentario.setText("");
    }//GEN-LAST:event_inputComentarioFocusGained

    private void inputComentarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inputComentarioFocusLost
        if(inputComentario.getText().equals("Comentario")){
            inputComentario.setText("");
        }
    }//GEN-LAST:event_inputComentarioFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBuscarComentario;
    private javax.swing.JButton buttonEnviarComentario;
    private javax.swing.JTextField inputAutor;
    private javax.swing.JTextField inputComentario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaComentario;
    // End of variables declaration//GEN-END:variables
}
