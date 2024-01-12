
import javax.swing.JOptionPane;

public class MyCurrencyConverter extends javax.swing.JFrame {
    String[] currencyUnits = {"units", "US Dollar", "Canadian Dollar", "Moroccan Dirham"
            , "Algerian Dinar", "Naira", "Mexican Peso","Philippine Peso",
               "Won", "Tunisian Dinar"};
double US_Dollar = 1.19;
double Canadian_dollar = 1.48;
double Moroccan_Dirham = 10.59 ;
double Algerian_Dinar = 159.27;
double Nigerian_Naira =487.90 ;
double Mexican_Peso = 23.59 ;
double Philippine_Peso = 59.23;
double South_Korean_Won = 1358.20;
double Tunisian_Dinar = 3.30;

    
    public MyCurrencyConverter() {
        initComponents();
    }

    
                           
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Amount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FirstCountry = new javax.swing.JComboBox<>();
        SecondCountry = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ConvertedAmount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FirstCurrencyUnit = new javax.swing.JLabel();
        SecondCurrencyUnit = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(getBackground());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); 
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Currency converter");

        Amount.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText(" Amount");

        FirstCountry.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); 
        FirstCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a country", "USA", "CANADA", "MOROCCO", "ALGERIA", "NIGERIA", "MEXICO", "PHILIPPINES", "SOUTH KOREA", "TUNISIA" }));
        FirstCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FirstCountryItemStateChanged(evt);
            }
        });
        FirstCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstCountryActionPerformed(evt);
            }
        });

        SecondCountry.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); 
        SecondCountry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a country", "USA", "CANADA", "MOROCCO", "ALGERIA", "NIGERIA", "MEXICO", "PHILIPPINES", "SOUTH KOREA", "TUNISIA" }));
        SecondCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SecondCountryItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("  From");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); 
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("  To");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Converted Amount ");

        FirstCurrencyUnit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); 
        FirstCurrencyUnit.setText("                              units");

        SecondCurrencyUnit.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); 
        SecondCurrencyUnit.setText("units");

        jButton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); 
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 11)); 
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FirstCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(102, 102, 102)
                                        .addComponent(SecondCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(201, 201, 201)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ConvertedAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                            .addComponent(Amount))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(SecondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE))
                                .addGap(52, 52, 52))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel2)))
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(FirstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Amount, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(SecondCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(FirstCountry))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ConvertedAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SecondCurrencyUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }                       

    private void FirstCountryActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
    }                                            

    private void FirstCountryItemStateChanged(java.awt.event.ItemEvent evt) {                                              
        int position = FirstCountry.getSelectedIndex();
        
        
        FirstCurrencyUnit.setText(currencyUnits[position]);
        
    }                                             

    private void SecondCountryItemStateChanged(java.awt.event.ItemEvent evt) {                                               
        int position = SecondCountry.getSelectedIndex();
        
        
        SecondCurrencyUnit.setText(currencyUnits[position]);
        
    }                                              

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       
        FirstCountry.setSelectedIndex(0);
        SecondCountry.setSelectedIndex(0);
        Amount.setText(null);
        ConvertedAmount.setText(null);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //conversion of currency
        
        if(FirstCountry.getSelectedIndex()== 0 || SecondCountry.getSelectedIndex() == 0 || Amount.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"please select both countries and input the amount ."," Error message",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
             
        }
        double amountToChange = Double.parseDouble(Amount.getText());
        
        double AmountInEuro = 0.0;
        switch(FirstCountry.getSelectedItem().toString())
        {
            case "USA" : AmountInEuro = amountToChange / US_Dollar; break;
            case "CANADA" : AmountInEuro = amountToChange / Canadian_dollar; break;
            case "MOROCCO" : AmountInEuro = amountToChange / Moroccan_Dirham; break;
            case "ALGERIA" : AmountInEuro = amountToChange / Algerian_Dinar; break;
            case "NIGERIA" : AmountInEuro = amountToChange / Nigerian_Naira; break;
            case "MEXICO" : AmountInEuro = amountToChange / Mexican_Peso; break;
            case "PHILIPPINES" : AmountInEuro = amountToChange / Philippine_Peso; break;
            case "SOUTH KOREA" : AmountInEuro = amountToChange / South_Korean_Won; break;
            case "TUNISIA" : AmountInEuro = amountToChange / Tunisian_Dinar; break;
            default : AmountInEuro = 0.0;
        }
        double amountChanged = 0.0;
        
        switch(SecondCountry.getSelectedItem().toString())
        {
            case "USA" : amountChanged = AmountInEuro * US_Dollar; break;
            case "CANADA" : amountChanged = AmountInEuro * Canadian_dollar; break;
            case "MOROCCO" : amountChanged = AmountInEuro * Moroccan_Dirham; break;
            case "ALGERIA" : amountChanged = AmountInEuro * Algerian_Dinar; break;
            case "NIGERIA" :amountChanged = AmountInEuro * Nigerian_Naira; break;
            case "MEXICO" : amountChanged = AmountInEuro * Mexican_Peso; break;
            case "PHILIPPINES" : amountChanged = AmountInEuro * Philippine_Peso; break;
            case "SOUTH KOREA" : amountChanged = AmountInEuro * South_Korean_Won; break;
            case "TUNISIA" : amountChanged = AmountInEuro * Tunisian_Dinar; break;
            default : amountChanged = AmountInEuro * 0.0;
        }
        String value = String.format("%.2f", amountChanged);
        ConvertedAmount.setText(value);
    }                                        

    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCurrencyConverter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCurrencyConverter().setVisible(true);
            }
        });
    }

    // Variables declaration                     
    private javax.swing.JTextField Amount;
    private javax.swing.JTextField ConvertedAmount;
    private javax.swing.JComboBox<String> FirstCountry;
    private javax.swing.JLabel FirstCurrencyUnit;
    private javax.swing.JComboBox<String> SecondCountry;
    private javax.swing.JLabel SecondCurrencyUnit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
