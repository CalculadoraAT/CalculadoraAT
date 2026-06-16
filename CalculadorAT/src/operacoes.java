public class operacoes extends javax.swing.JFrame {

    
    
    public operacoes() {
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNum1 = new javax.swing.JTextField();
        txtNum2 = new javax.swing.JTextField();
        btnSomar = new javax.swing.JButton();
        btnDiminuir = new javax.swing.JButton();
        btnMultiplicar = new javax.swing.JButton();
        btnDividir = new javax.swing.JButton();
        lblNum1 = new javax.swing.JLabel();
        lblNum2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("CALCULADORA AT");

        btnSomar.setText("Somar");
        btnSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSomarActionPerformed(evt);
            }
        });

        btnDiminuir.setText("Diminuir");
        btnDiminuir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiminuirActionPerformed(evt);
            }
        });

        btnMultiplicar.setText("Multiplicar");

        btnDividir.setText("Dividir");

        lblNum1.setText("1ª Número :");

        lblNum2.setText("2ª Número:");

        lblResultado.setText("Resultado:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnMultiplicar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDividir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(290, 290, 290))
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnSomar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDiminuir)
                    .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNum1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNum2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSomar)
                    .addComponent(btnDiminuir)
                    .addComponent(btnMultiplicar)
                    .addComponent(btnDividir))
                .addGap(30, 30, 30)
                .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSomarActionPerformed
             int Num1 = Integer.valueOf(txtNum1.getText());
             int Num2 = Integer.valueOf(txtNum2.getText());
             
             int Resultado = Num1+Num2;
             
             lblResultado.setText(Integer.toString(Resultado));

    }//GEN-LAST:event_btnSomarActionPerformed

    private void btnDiminuirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiminuirActionPerformed
        int Num1 = Integer.valueOf(txtNum1.getText());
        int Num2 = Integer.valueOf(txtNum2.getText());
             
        int Resultado = Num1-Num2;
             
        lblResultado.setText(Integer.toString(Resultado));        // TODO add your handling code here:
    }//GEN-LAST:event_btnDiminuirActionPerformed
       
    public static void main(String args[]) {

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new operacoes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDiminuir;
    private javax.swing.JButton btnDividir;
    private javax.swing.JButton btnMultiplicar;
    private javax.swing.JButton btnSomar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblNum1;
    private javax.swing.JLabel lblNum2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtNum1;
    private javax.swing.JTextField txtNum2;
    // End of variables declaration//GEN-END:variables
}
