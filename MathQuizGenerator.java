/*
Name: Darren Zhao
Date: July 19, 2019
Title: Random Quiz Generator
Purpose:
 */

//Used to make a decimal formatter
import java.text.DecimalFormat;
//Used for array lists
import java.util.*;

public class U4_S3_Application extends javax.swing.JFrame {

    //Declare new decimal format
    private static final DecimalFormat df = new DecimalFormat("#.#");
    //Declare a string variable to hold the answers that will be referred to in both buttons' code
    String strAnswer;
    //Declare an int variable to count what question the user is on
    int intCount = 1;
    //Declare an int variable to count the number of correct questions
    int intCorrect = 0;
    //Declare a global array list to store the questions and answers
    ArrayList<String> results = new ArrayList();
    
    public U4_S3_Application() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        lblContentTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArLesson = new javax.swing.JTextArea();
        lblQuizTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArQuestion = new javax.swing.JTextArea();
        btnQuestion = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArWorkspace = new javax.swing.JTextArea();
        txtInput = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnResults = new javax.swing.JButton();
        lblCorrect = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblContentTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContentTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblContentTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContentTitle.setText("Content");

        txtArLesson.setEditable(false);
        txtArLesson.setColumns(20);
        txtArLesson.setLineWrap(true);
        txtArLesson.setRows(5);
        txtArLesson.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtArLesson);

        lblQuizTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblQuizTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblQuizTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuizTitle.setText("Random Quiz Generator");

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txtArQuestion.setEditable(false);
        txtArQuestion.setColumns(20);
        txtArQuestion.setLineWrap(true);
        txtArQuestion.setRows(5);
        txtArQuestion.setText("A question will appear here");
        txtArQuestion.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtArQuestion);

        btnQuestion.setText("First Question");
        btnQuestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestionActionPerformed(evt);
            }
        });

        txtArWorkspace.setColumns(20);
        txtArWorkspace.setLineWrap(true);
        txtArWorkspace.setRows(5);
        txtArWorkspace.setText("Feel free to use this space to do any rough work");
        txtArWorkspace.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtArWorkspace);

        txtInput.setText("Enter answer here");

        btnSubmit.setText("Submit");
        btnSubmit.setEnabled(false);
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnResults.setText("Results");
        btnResults.setEnabled(false);
        btnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultsActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addComponent(lblContentTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(lblQuizTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(112, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCorrect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnResults, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblContentTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQuizTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuestion)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                                .addComponent(btnResults)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReset)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSubmit)
                            .addComponent(lblCorrect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Method: Return a random integer between -20 and 20
    private static int random(){
        //Set a variable (intReturn) to a random number between 1 and 20
        int intReturn = (int)Math.ceil(Math.random()*20);
        //Set a variable (intSign) to either 1 or 2 randomly
        int intSign = (int)Math.ceil(Math.random()*2);
        //Make intReturn negative if intSign is 1
        if (intSign == 1){
            intReturn *= -1;
        }
        //Return intReturn to the method call
        return intReturn;
    }
    //Method: Return a random double between -2.0 and 2.0 that is rounded to the nearest tenth
    private static double randomDecimal(){
        //Set a variable (doubleReturn) to a random number between 1 and 20, divided by 10
        double dblReturn = (Math.ceil(Math.random()*20)) / 10;
        //Set a variable (intSign) to either 1 or 2 randomly
        int intSign = (int)Math.ceil(Math.random()*2);
        //Make dblReturn negative if intSign is 1
        if (intSign == 1){
            dblReturn *= -1;
        }
        //Return dblReturn to the method call
        return dblReturn;
    }
    //Method: Return a string with a linear equation which passes through 2 given points
    private static String answerPoints(int x1, int y1, int x2, int y2){
        //Declare the slope and assign it to delta y over delta x
        double m = (double)(y2 - y1) / (x2 - x1);
        //Declare the y-intercept and assign it to the appropriate formula
        double b = -m*x1+y1;
        //Declare a string to hold the equation of the line
        String strAnswer;
        //Create a decision structure to assign strAnswer to the equation of the line depending on the value of b
        //Answer written as y=mx+b if b is positive
        if (b > 0){
            strAnswer = "y=" + df.format(m) + "x+" + df.format(b);
        }
        //Answer written as y=mx-b if b is negative
        else if (b < 0){
            strAnswer = "y=" + df.format(m) + "x-" + df.format(b * -1);
        }
        //Answer written as y=mx if b is 0
        else{
            strAnswer = "y=" + df.format(m) + "x";
        }
        //Return strAnswer to the method call
        return strAnswer;
    }
    //Method: Return a string with a linear equation parallel a given slope that passes through a given point
    private static String answerPara(int x, int y, int m){
        //Declare the y-intercept and assign it to the appropriate formula
        double b = -m*x+y;
        //Declare a string to hold the equation of the line
        String strAnswer;
        //Create a decision structure to assign strAnswer to the equation of the line depending on the value of b
        //Answer written as y=mx+b if b is positive
        if (b > 0){
            strAnswer = "y=" + df.format(m) + "x+" + df.format(b);
        }
        //Answer written as y=mx-b if b is negative
        else if (b < 0){
            strAnswer = "y=" + df.format(m) + "x-" + df.format(b * -1);
        }
        //Answer written as y=mx if b is 0
        else{
            strAnswer = "y=" + df.format(m) + "x";
        }
        //Return strAnswer to the method call
        return strAnswer;
    }
    //Method: Return a string with a linear equation perpendicular to a given slope that paasses through a given point
    private static String answerPerp(int x, int y, double m){
        //Declare the perpendicular slope and assign it to -1 over the given slope
        double mT = (double) -1 / m;
        //Declare the y-intercept and assign it to the appropriate formula
        double b = -mT*x+y;
        //Declare a string to hold the equation of the line
        String strAnswer;
        //Create a decision structure to assign strAnswer to the equation of the line depending on the value of b
        //Answer written as y=mx+b if b is positive
        if (b > 0){
            strAnswer = "y=" + df.format(mT) + "x+" + df.format(b);
        }
        //Answer written as y=mx-b if b is negative
        else if (b < 0){
            strAnswer = "y=" + df.format(mT) + "x-" + df.format(b * -1);
        }
        //Answer written as y=mx if b is 0
        else{
            strAnswer = "y=" + df.format(mT) + "x";
        }
        //Return strAnswer to the method call
        return strAnswer;
    }
    private void btnQuestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestionActionPerformed
        /* Generate a question with random values, then calculate and store the answer, then display the question */
        //Declare a string variable to hold the question
        String strQuestion;
        //Declare a variable and assign it to a random number between 1 and 3
        int intOption = (int)Math.ceil(Math.random()*3);
        //Create a decision structure that will generate a question and calculate an answer depending on the value of intOption
        if (intOption == 1){
            //Declare variables
            int x1, y1, x2, y2;
            //Assign each of the variables a random number from -20 to 20 via a method
            x1 = random();
            y1 = random();
            x2 = random();
            y2 = random();
            //Assign the question string to a 2 points question using these values
            strQuestion = intCount + ". Determine the equation of a line that passes through points A(" + x1 + ", " + y1 + ") and B(" + x2 + ", " + y2 + ").";
            //Display the string
            txtArQuestion.setText(strQuestion);
            //Calculate the answer to the question and assign it to the global string via a method
            strAnswer = answerPoints(x1, y1, x2, y2);
        }
        else if (intOption == 2){
            //Declare variables
            int x, y, m, b;
            //Assign each of the variables a random number from -20 to 20 via a method
            x = random();
            y = random();
            m = random();
            b = Math.abs(random()); //Make b an absolute value since it doesn't affect anything and I won't have to format the question dependant on the b value
            //Assign the question string to a parallel slope question using these values
            strQuestion = intCount + ". Determine the equation of a line that is parallel to y=" + m + "x+" + b + " and passes through point (" + x + ", " + y + ").";
            //Display the string
            txtArQuestion.setText(strQuestion);
            //Calculate the answer to the question and assign it to the global string via a method
            strAnswer = answerPara(x, y, m);
        }
        else {
            //Declare variables
            int x, y, b;
            double m;
            //Assign each of the variables a random number from -20 to 20 via a method except m, which will be a random tenth value from -2.0 to 2.0 
            x = random();
            y = random();
            m = randomDecimal();
            b = Math.abs(random()); //Make b an absolute value since it doesn't affect anything and I won't have to format the question dependant on the b value
            //Assign the question string to a perpendicular slope question using these values
            strQuestion = intCount + ". Determine the equation of a line that is perpendicular to y=" + m + "x+" + b + " and passes through point (" + x + ", " + y + ").";
            //Display the string
            txtArQuestion.setText(strQuestion);
            //Calculate the answer to the question and assign it to the global string via a method
            strAnswer = answerPerp(x, y, m);
        }
        //Add the question to the array list
        results.add(strQuestion);
        //Delete the text in the other text area and field
        txtArWorkspace.setText("");
        txtInput.setText("");
        //Relabel this button
        btnQuestion.setText("Next Question");
        //Disable this button, enable the submit button
        btnQuestion.setEnabled(false);
        btnSubmit.setEnabled(true);
        //Tells me the answer for testing purposes
        System.out.println(strAnswer);
    }//GEN-LAST:event_btnQuestionActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        /* Compare the user's input to the answer, then display whether or not it was correct */
        //Record the user's input to a string variable
        String strInput = txtInput.getText();
        //Create a decision structure that will execute depending on if the user's input is equal to the answer to the question
        if (strInput.equals(strAnswer)){
            //Output correct
            lblCorrect.setText("Correct!");
            //Add 1 to the correct answer question
            intCorrect++;
            //Add this result to the array list
            results.add("\nCorrect\t");
        }
        else {
            //Output incorrect and the correct answer
            lblCorrect.setText("Incorrect! Answer: " + strAnswer);
            //Add this result to the array list
            results.add("\nIncorrect\t");
        }
        //Add the correct answer to the current question to the array list
        results.add(strAnswer + "\n\n");
        //Increase the question count by 1
        intCount++;
        //Create a decision structure that will end the quiz if it has reached 10 questions
        if (intCount <= 10){
            //Disable this button, enable the question button
            btnSubmit.setEnabled(false);
            btnQuestion.setEnabled(true);
        }
        else {
            //Disable this button, enable the results button
            btnSubmit.setEnabled(false);
            btnResults.setEnabled(true);
            //Decrease the question count by 1 so it reflects the total number of questions
            intCount--;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultsActionPerformed
        /* Display the results of the quiz and the list of questions*/
        //Declare strings to hold the results messages
        String strResult, strQuestions = "";
        //Assign the ratio of correct answers to total number of questions in sentence form to strResult
        strResult = "You got " + Integer.toString(intCorrect) + "/" + Integer.toString(intCount) + "\n";
        //Add a message to strResult depending on the ratio of correct answers to questions
        if (intCorrect == intCount){
            strResult += "You are a true master!";
        }
        else if (intCorrect >= intCount * 0.8){
            strResult += "You've done well, young padawan";
        }
        else if (intCorrect >= intCount * 0.5){
            strResult += "You have much to learn. Continue to practice";
        }
        else if (intCorrect >= intCount * 0.2){
            strResult += "Review the lesson and try again";
        }
        else {
            strResult += "Maybe math just isn't your thing";
        }
        //Add the contents of the array list to strQuestions via loop
        for (int i=0; i < results.size(); i++){
            strQuestions += results.get(i);
        }
        //Display the strings
        txtArQuestion.setText(strResult);
        txtArWorkspace.setText(strQuestions);
        txtArWorkspace.setEditable(false);
        //Clean up that label
        lblCorrect.setText("");
    }//GEN-LAST:event_btnResultsActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        /* Return everything to it's original state */
        //Reset the question counter variable and correct answer counter variable
        intCount = 1;
        intCorrect = 0;
        //Empty the array list
        results.clear();
        //Disable all buttons except for this one and the question button
        btnSubmit.setEnabled(false);
        btnResults.setEnabled(false);
        btnQuestion.setEnabled(true);
        //Revert the name of the question button
        btnQuestion.setText("First Question");
        //Empty all the text places
        txtArQuestion.setText("");
        txtArWorkspace.setText("");
        txtInput.setText("");
        lblCorrect.setText("");
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(U4_S3_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(U4_S3_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(U4_S3_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(U4_S3_Application.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new U4_S3_Application().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuestion;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResults;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblContentTitle;
    private javax.swing.JLabel lblCorrect;
    private javax.swing.JLabel lblQuizTitle;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JTextArea txtArLesson;
    private javax.swing.JTextArea txtArQuestion;
    private javax.swing.JTextArea txtArWorkspace;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
