
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Random;
import javax.swing.JOptionPane;


public class Generator extends javax.swing.JFrame {
    private static final String symbolsString ="@#$%€£";
    private static final String numbersString ="0123456789" ;
    private static final String upperCaseString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String lowerCaseString ="abcdefghijklmnopqrstuvwxyz";
    int pLength;
    String elements;
    String[] newPassword;
    boolean numberStatus = true;
    boolean checkSymbols= false;
    boolean checkNumbers= false;
    boolean checkUpperCase = false;
    boolean checkLowerCase = false;
    private Random random = new Random();
 ;
    public Generator() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createdPassword = new javax.swing.JLabel();
        includeSymbols = new javax.swing.JCheckBox();
        includeNumbers = new javax.swing.JCheckBox();
        includeUpperCase = new javax.swing.JCheckBox();
        passwordLength = new javax.swing.JTextField();
        generatePassword = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        includeLowerCase = new javax.swing.JCheckBox();
        copyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createdPassword.setBackground(new java.awt.Color(0, 0, 255));
        createdPassword.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        createdPassword.setForeground(new java.awt.Color(0, 0, 255));

        includeSymbols.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        includeSymbols.setText("Symbols: @#$%€£");
        includeSymbols.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        includeSymbols.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                includeSymbolsActionPerformed(evt);
            }
        });

        includeNumbers.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        includeNumbers.setText("Numbers: 0123456789");
        includeNumbers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                includeNumbersActionPerformed(evt);
            }
        });

        includeUpperCase.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        includeUpperCase.setText("UpperCase: ABC");

        passwordLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordLengthActionPerformed(evt);
            }
        });

        generatePassword.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        generatePassword.setText("Generate");
        generatePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("Length:");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("Password:");

        includeLowerCase.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        includeLowerCase.setText("LowerCase: abc");

        copyButton.setText("Copy");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(includeNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(includeUpperCase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(includeSymbols, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordLength, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(113, 113, 113)
                        .addComponent(generatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(includeLowerCase)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(copyButton)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(createdPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(copyButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(includeSymbols, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(generatePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(includeNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(includeUpperCase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(includeLowerCase, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void includeSymbolsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_includeSymbolsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_includeSymbolsActionPerformed

    private void includeNumbersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_includeNumbersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_includeNumbersActionPerformed

    private void passwordLengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordLengthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordLengthActionPerformed

    private void generatePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePasswordActionPerformed
        createdPassword.setText(""); //generated password label cleared
        
        if(passwordLength.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Please enter a length.");
        }else{
            try {
                pLength = Integer.valueOf(passwordLength.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter numbers only!");
                passwordLength.setText("");
                return;
            }
            
           pLength = Integer.parseInt(passwordLength.getText());
        if(pLength > 20 ){
            JOptionPane.showMessageDialog(this, "Please enter the length from 1 to 20 !");
        }else{
        
            if (includeSymbols.isSelected() && includeLowerCase.isSelected() && includeUpperCase.isSelected() && includeNumbers.isSelected()) {
            // Tüm seçenekler seçildi
                //pLength = Integer.parseInt(passwordLength.getText());
                if(pLength < 4 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 4 !"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                
                elements += numbersString + symbolsString + upperCaseString + lowerCaseString; 
            
                /*for (int i = 0; i <pLength ; i++) {
                int index = random.nextInt(pLength);
                String choosenElements = String.valueOf(elements.charAt(random.nextInt(elements.length())));
                
                if(newPassword[index] == null){
                    newPassword[index] = choosenElements;
                }else{
                    i--;
                }
            }*/
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkLowerCase==false || checkNumbers==false || checkSymbols==false || checkUpperCase==false){
                if(checkLowerCase==false){
                    newPassword = addLowerCase(newPassword,pLength);
                }else if(checkNumbers==false){
                    newPassword = addNumber(newPassword,pLength);
                }else if(checkSymbols==false){
                    newPassword = addSymbol(newPassword,pLength);
                }else if(checkUpperCase==false){
                    newPassword = addUpperCase(newPassword,pLength);
                }
            }
            passwordPrinter();
            /*elements ="";
            for (int i = 0; i < newPassword.length; i++) {
                
                elements += newPassword[i];
            }
            createdPassword.setText(elements);*/
                }    
        } else if (includeSymbols.isSelected() && includeLowerCase.isSelected() && includeUpperCase.isSelected()) {
            // Sadece semboller, küçük harfler ve büyük harfler seçildi
                
                if(pLength < 3 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 3 !"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                
                elements += symbolsString + upperCaseString + lowerCaseString; 
            
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkLowerCase==false || checkSymbols==false || checkUpperCase==false){
                if(checkLowerCase==false){
                    newPassword = addLowerCase(newPassword,pLength);
                }else if(checkSymbols==false){
                    newPassword = addSymbol(newPassword,pLength);
                }else if(checkUpperCase==false){
                    newPassword = addUpperCase(newPassword,pLength);
                }
            }
            
            passwordPrinter();
                }
        } else if (includeSymbols.isSelected() && includeLowerCase.isSelected() && includeNumbers.isSelected()) {
            // Sadece semboller, küçük harfler ve rakamlar seçildi
            
                if(pLength < 3 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 3 !"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += numbersString + symbolsString + lowerCaseString;
                
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkLowerCase==false || checkSymbols==false || checkNumbers==false){
                if(checkLowerCase==false){
                    newPassword = addLowerCase(newPassword,pLength);
                }else if(checkSymbols==false){
                    newPassword = addSymbol(newPassword,pLength);
                }else if(checkNumbers==false){
                    newPassword = addNumber(newPassword,pLength);
                }
            }
            
            passwordPrinter();
                }

        } else if (includeSymbols.isSelected() && includeUpperCase.isSelected() && includeNumbers.isSelected()) {
            // Sadece semboller, büyük harfler ve rakamlar seçildi
            
            
                if(pLength < 3 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 3 !"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += numbersString + symbolsString + upperCaseString;
                
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkUpperCase==false || checkSymbols==false || checkNumbers==false){
                if(checkUpperCase==false){
                    newPassword = addUpperCase(newPassword,pLength);
                }else if(checkSymbols==false){
                    newPassword = addSymbol(newPassword,pLength);
                }else if(checkNumbers==false){
                    newPassword = addNumber(newPassword,pLength);
                }
            }
            
            elements ="";
            
            passwordPrinter();
                }
        } else if (includeLowerCase.isSelected() && includeUpperCase.isSelected() && includeNumbers.isSelected()) {
            // Sadece küçük harfler, büyük harfler ve rakamlar seçildi
            
            
                if(pLength < 3 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 3 !"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += numbersString + upperCaseString + lowerCaseString;
                
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkUpperCase==false || checkLowerCase==false || checkNumbers==false){
                if(checkUpperCase==false){
                    newPassword = addUpperCase(newPassword,pLength);
                }else if(checkLowerCase==false){
                    newPassword = addLowerCase(newPassword,pLength);
                }else if(checkNumbers==false){
                    newPassword = addNumber(newPassword,pLength);
                }
            }
            
            elements ="";
            
            passwordPrinter();
                }
        } else if (includeSymbols.isSelected() && includeLowerCase.isSelected()) {
            // Sadece semboller ve küçük harfler seçildi
            
            
                if(pLength < 2 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 2!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += symbolsString + lowerCaseString;
                
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkSymbols==false || checkLowerCase==false){
                if(checkSymbols==false){
                    newPassword = addSymbol(newPassword,pLength);
                }else if(checkLowerCase==false){
                    newPassword = addLowerCase(newPassword,pLength);
                }
            }
            
            elements ="";
            
            passwordPrinter();
                }
        } else if (includeSymbols.isSelected() && includeUpperCase.isSelected()) {
            // Sadece semboller ve büyük harfler seçildi
            
            
                if(pLength < 2 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 2!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements +=  symbolsString + upperCaseString;
                
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkSymbols==false || checkUpperCase==false){
                if(checkSymbols==false){
                    newPassword = addSymbol(newPassword,pLength);
                }else if(checkUpperCase==false){
                    newPassword = addUpperCase(newPassword,pLength);
                }
            }
            
            elements ="";
            
            passwordPrinter();
                }
        } else if (includeSymbols.isSelected() && includeNumbers.isSelected()) {
            // Sadece semboller ve rakamlar seçildi
            
            
                if(pLength < 2 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 2!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += numbersString + symbolsString ;
                
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkSymbols==false || checkNumbers==false){
                if(checkSymbols==false){
                    newPassword = addSymbol(newPassword,pLength);
                }else if(checkNumbers==false){
                    newPassword = addNumber(newPassword,pLength);
                }
            }
            
            elements ="";
            
            passwordPrinter();
                }
        } else if (includeLowerCase.isSelected() && includeUpperCase.isSelected()) {
            // Sadece küçük harfler ve büyük harfler seçildi
            
            
                if(pLength < 2 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 2!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements +=  upperCaseString + lowerCaseString;
                
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkLowerCase==false || checkUpperCase==false){
                if(checkLowerCase==false){
                    newPassword = addLowerCase(newPassword,pLength);
                }else if(checkUpperCase==false){
                    newPassword = addUpperCase(newPassword,pLength);
                }
            }
            
            elements ="";
            
            passwordPrinter();
                }
        } else if (includeLowerCase.isSelected() && includeNumbers.isSelected()) {
            // Sadece küçük harfler ve rakamlar seçildi
            
            
                if(pLength < 2 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 2!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += numbersString + lowerCaseString;
                
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkLowerCase==false || checkNumbers==false){
                if(checkLowerCase==false){
                    newPassword = addLowerCase(newPassword,pLength);
                }else if(checkNumbers==false){
                    newPassword = addNumber(newPassword,pLength);
                }
            }
            
            elements ="";
            
            passwordPrinter();
                }
        } else if (includeUpperCase.isSelected() && includeNumbers.isSelected()) {
            // Sadece büyük harfler ve rakamlar seçildi
            
            
                if(pLength < 2 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 2!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += numbersString  + upperCaseString ;
                
                newPassword = passwordCreator();
                checkConditions(newPassword);
                
            while(checkUpperCase==false || checkNumbers==false){
                if(checkUpperCase==false){
                    newPassword = addUpperCase(newPassword,pLength);
                }else if(checkNumbers==false){
                    newPassword = addNumber(newPassword,pLength);
                }
            }
            
            elements ="";
            
            passwordPrinter();
                }
        } else if (includeSymbols.isSelected()) {
            // Sadece semboller seçildi
            
            
                if(pLength < 1 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 1!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements = symbolsString;
                
                newPassword = passwordCreator();
                elements= "";
                
            passwordPrinter();
                }
        } else if (includeLowerCase.isSelected()) {
            // Sadece küçük harfler seçildi
            
            
                if(pLength < 1 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 1!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += lowerCaseString;
                
                newPassword = passwordCreator();
            
                elements= "";
                
            passwordPrinter();
                }
        } else if (includeUpperCase.isSelected()) {
            // Sadece büyük harfler seçildi
            
            
                if(pLength < 1 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 1!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += upperCaseString ;
                
               newPassword = passwordCreator();
            
                elements= "";
                
            passwordPrinter();
                }
        } else if (includeNumbers.isSelected()) {
            // Sadece rakamlar seçildi
            
            
                if(pLength < 1 ){
                   JOptionPane.showMessageDialog(this, "Please enter minumum 1!"); 
                }else{
                newPassword = new String[pLength];
                elements = "";
                elements += numbersString ;
                
                newPassword = passwordCreator();
            
                elements= "";
                
            passwordPrinter();
                }
        } else {
        JOptionPane.showMessageDialog(this, "Please select minimum 1 condition");
        }
        }
        }
    }//GEN-LAST:event_generatePasswordActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        String text = createdPassword.getText();
        StringSelection selection = new StringSelection(text);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        JOptionPane.showMessageDialog(this, "Password copied !");
    }//GEN-LAST:event_copyButtonActionPerformed

    public void passwordPrinter(){
        elements ="";
            for (int i = 0; i < newPassword.length; i++) {
                
                elements += newPassword[i];
            }
            createdPassword.setText(elements);
    }
    
    public String[] passwordCreator(){
        for (int i = 0; i <pLength ; i++) {
                int index = random.nextInt(pLength);
                String choosenElements = String.valueOf(elements.charAt(random.nextInt(elements.length())));
                
                if(newPassword[index] == null){
                    newPassword[index] = choosenElements;
                }else{
                    i--;
                }
            }
            return newPassword;
    }
    
    public void checkConditions(String[] newPassword){
        checkSymbols= false;
        checkNumbers= false;
        checkUpperCase = false;
        checkLowerCase = false;
        for (int i = 0; i < newPassword.length; i++) {
            if(numbersString.contains(newPassword[i])){
                    checkNumbers = true;
            }else if(symbolsString.contains(newPassword[i])){
                    checkSymbols = true;
            }else if(upperCaseString.contains(newPassword[i])){
                    checkUpperCase = true;
            }else if(lowerCaseString.contains(newPassword[i])){
                    checkLowerCase = true;
            }
        }
        
    }
    
    public String[] addNumber(String[] newPassword,int pLength){
        int index = random.nextInt(pLength);
        String choosenElements = String.valueOf(numbersString.charAt(random.nextInt(numbersString.length())));
        newPassword[index] = choosenElements;
        checkConditions(newPassword);
        return newPassword;
    }
    public String[] addSymbol(String[] newPassword,int pLength){
        int index = random.nextInt(pLength);
        String choosenElements = String.valueOf(symbolsString.charAt(random.nextInt(symbolsString.length())));
        newPassword[index] = choosenElements;
        checkConditions(newPassword);
        return newPassword;
    }
    public String[] addUpperCase(String[] newPassword,int pLength){
        int index = random.nextInt(pLength);
        String choosenElements = String.valueOf(upperCaseString.charAt(random.nextInt(upperCaseString.length())));
        newPassword[index] = choosenElements;
        checkConditions(newPassword);
        return newPassword;
    }
    public String[] addLowerCase(String[] newPassword,int pLength){
        int index = random.nextInt(pLength);
        String choosenElements = String.valueOf(lowerCaseString.charAt(random.nextInt(lowerCaseString.length())));
        newPassword[index] = choosenElements;
        checkConditions(newPassword);
        return newPassword;
    }
    
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
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Generator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton copyButton;
    private javax.swing.JLabel createdPassword;
    private javax.swing.JButton generatePassword;
    private javax.swing.JCheckBox includeLowerCase;
    private javax.swing.JCheckBox includeNumbers;
    private javax.swing.JCheckBox includeSymbols;
    private javax.swing.JCheckBox includeUpperCase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField passwordLength;
    // End of variables declaration//GEN-END:variables
}
