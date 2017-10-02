package nnxortest;

// <editor-fold defaultstate="collapsed" desc="Imports"> 
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.core.events.LearningEvent;
import org.neuroph.core.events.LearningEventListener;
import org.neuroph.nnet.MultiLayerPerceptron;
import org.neuroph.nnet.learning.BackPropagation;
import org.neuroph.nnet.learning.MomentumBackpropagation;
import org.neuroph.util.TransferFunctionType;
// </editor-fold>  
//git test 
public class NnXORtestUI extends javax.swing.JDialog
        implements LearningEventListener {

    MultiLayerPerceptron mLP;
    DataSet trainingSet;

    public NnXORtestUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        trainingSet = new DataSet(2, 1);
        trainingSet.addRow(new DataSetRow(new double[]{0, 0}, new double[]{0}));
        trainingSet.addRow(new DataSetRow(new double[]{0, 1}, new double[]{1}));
        trainingSet.addRow(new DataSetRow(new double[]{1, 0}, new double[]{1}));
        trainingSet.addRow(new DataSetRow(new double[]{1, 1}, new double[]{0}));
        logTextArea.append("Created XOR DataSet \n");

        mLP = new MultiLayerPerceptron(TransferFunctionType.TANH, 2, 3, 1);
        logTextArea.append("Created Multi Layer Perceptron \n");
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
        calculateButton = new javax.swing.JButton();
        inputTextField1 = new javax.swing.JTextField();
        inputTextField2 = new javax.swing.JTextField();
        outputTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        weghtsTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        logTextArea = new javax.swing.JTextArea();
        manInBlackButton = new javax.swing.JButton();
        learnButton = new javax.swing.JButton();
        testButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("nnXORtest");
        setFocusCycleRoot(false);
        setIconImage(null);
        setLocation(new java.awt.Point(20, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        calculateButton.setText("Calculate");
        calculateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        inputTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTextField1.setText("0");

        inputTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        inputTextField2.setText("0");

        outputTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        outputTextField.setText(" ");

        weghtsTextArea.setColumns(20);
        weghtsTextArea.setLineWrap(true);
        weghtsTextArea.setRows(5);
        jScrollPane1.setViewportView(weghtsTextArea);

        logTextArea.setColumns(20);
        logTextArea.setLineWrap(true);
        logTextArea.setRows(5);
        jScrollPane2.setViewportView(logTextArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calculateButton)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(calculateButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(outputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );

        manInBlackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mib.jpeg"))); // NOI18N
        manInBlackButton.setText("Reset");
        manInBlackButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mib_p.jpeg"))); // NOI18N
        manInBlackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manInBlackButtonActionPerformed(evt);
            }
        });

        learnButton.setText("Learn");
        learnButton.setToolTipText("");
        learnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                learnButtonActionPerformed(evt);
            }
        });

        testButton.setText("Test");
        testButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(learnButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(testButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(manInBlackButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manInBlackButton)
                        .addGap(30, 30, 30)
                        .addComponent(learnButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(testButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // <editor-fold defaultstate="collapsed" desc="Reset"> 
    private void manInBlackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manInBlackButtonActionPerformed
        mLP.reset();
        mLP.randomizeWeights();
        Double[] weights;
        weights = mLP.getWeights();
        weghtsTextArea.setText(Arrays.toString(weights));// </editor-fold>
    }//GEN-LAST:event_manInBlackButtonActionPerformed
    // <editor-fold defaultstate="collapsed" desc="Exit"> 
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);// </editor-fold>
    }//GEN-LAST:event_exitButtonActionPerformed
    // <editor-fold defaultstate="collapsed" desc="Calculate"> 
    private void calculateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculateButtonActionPerformed
        int inputValue1, inputValue2;
        inputValue1 = Integer.parseInt(inputTextField1.getText());
        inputValue2 = Integer.parseInt(inputTextField2.getText());
        mLP.setInput(inputValue1, inputValue2);
        mLP.calculate();
        double[] outputValue;
        outputValue = mLP.getOutput();
        outputTextField.setText(Arrays.toString(outputValue));
        Double[] weights;
        weights = mLP.getWeights();
        weghtsTextArea.setText(Arrays.toString(weights));// </editor-fold>
    }//GEN-LAST:event_calculateButtonActionPerformed
    // <editor-fold defaultstate="collapsed" desc="Learn"> 
    private void learnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_learnButtonActionPerformed
        MomentumBackpropagation learningRule = 
            (MomentumBackpropagation) mLP.getLearningRule();
        learningRule.addListener(this);
        learningRule.setLearningRate(0.05);
        mLP.learn(trainingSet);
        Double[] weights;
        weights = mLP.getWeights();
        weghtsTextArea.setText(Arrays.toString(weights));
        // </editor-fold>   
    }//GEN-LAST:event_learnButtonActionPerformed
    // <editor-fold defaultstate="collapsed" desc="Test"> 
    private void testButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testButtonActionPerformed
        trainingSet.getRows().stream().map((dataRow) -> {
            mLP.setInput(dataRow.getInput());
            return dataRow;
        }).map((dataRow) -> {
            mLP.calculate();
            return dataRow;
        }).forEachOrdered((dataRow) -> {
            double[] networkOutput = mLP.getOutput();
            logTextArea.append("Input: " + Arrays.toString(dataRow.getInput()));
            logTextArea.append(" Output: " + 
                    Arrays.toString(networkOutput) + "\n");

        });
        logTextArea.append("----\n");
        // </editor-fold> 
    }//GEN-LAST:event_testButtonActionPerformed
    // <editor-fold defaultstate="collapsed" desc="Save"> 
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        mLP.save("nnxortest.nnet");// </editor-fold>
    }//GEN-LAST:event_saveButtonActionPerformed

    public static void main(String args[]) {

        // create training set (logical XOR function)
        // create multi layer perceptron
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            NnXORtestUI dialog = new NnXORtestUI(new javax.swing.JFrame(),true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calculateButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField inputTextField1;
    private javax.swing.JTextField inputTextField2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton learnButton;
    private javax.swing.JTextArea logTextArea;
    private javax.swing.JButton manInBlackButton;
    private javax.swing.JTextField outputTextField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton testButton;
    private javax.swing.JTextArea weghtsTextArea;
    // End of variables declaration//GEN-END:variables

    @Override
    public void handleLearningEvent(LearningEvent event) {
        BackPropagation bp = (BackPropagation) event.getSource();
        if (event.getEventType().equals(LearningEvent.Type.LEARNING_STOPPED)) {
            double error = bp.getTotalNetworkError();
            logTextArea.append("Training completed in "
                    + bp.getCurrentIteration() + " iterations,\n");
            logTextArea.append("With total error: "
                    + formatDecimalNumber(error) + "\n----\n");
        } else {
            logTextArea.append("Iteration: " + bp.getCurrentIteration() +
                    " | Network error: " + bp.getTotalNetworkError() + "\n");
        }
    }

    //Formating decimal number to have 3 decimal places
    public String formatDecimalNumber(double number) {
        return 
            new BigDecimal(number).setScale(4, RoundingMode.HALF_UP).toString();
    }
}
