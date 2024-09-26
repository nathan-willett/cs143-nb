package BabyNames;
import java.awt.Color;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
 * Class        BabyNamesGUI.java
 * Description  A class representing the GUI used in the Baby Name Popularity 
 *              Ranking.
 * Project      Baby Name Popularity Ranking
 * Platform     jdk 1.8.0_241; NetBeans IDE 23; PC Windows 10
 * Course       CS 143
 * Hourse       3 hours and 22 minutes
 * Date         
  History Log   7/18/2018, 5/7/2020
 * @author	<i>Nathan Willett</i>
 * @version 	%1% %2%
 * @see     	javax.swing.JFrame
 * @see         java.awt.Toolkit 
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class BabyNamesGUI extends javax.swing.JFrame
{
    private final int YEARS = 10;
    private Map<String, Integer>[] mapForBoy = new HashMap[YEARS];
    private Map<String, Integer>[] mapForGirl = new HashMap[YEARS];
    private Color white = Color.WHITE;      // Default background color for input textfield
    private Color pink = Color.PINK;        // Background color for bad input textfield
    
     /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  BabyNamesGUI()-default constructor
     * Description  Create an instance of the GUI form, set the default
     *              JButton to be findJButton, set icon image, and center form.
     * Date         9/25/2024
     * History Log  7/18/2018, 5/7/2020
     * @author      <i>Nathan Willett</i>
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/    
    public BabyNamesGUI()
    {
        initComponents();
        //set the display JButton as the default key as ENTER:
        this.getRootPane().setDefaultButton(findJButton);
        //set a icon picture in the Title--done with custom code
        //this.setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/BabyPenkaSmall.jpg"));        
        this.setLocationRelativeTo(null);   //center form
        nameJTextField.requestFocus();
        readNames();        // Read the data files on baby names and genders
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       readNames
     * Description  Reads rankings of names from files and create HashMaps.  
     * Date         4/5/2021
     * History Log  7/18/2018, 5/7/2020
     * @author      <i>Nathan Willett</i>
     * @param       fileName String
     * @see         java.io.File
     * @see         java.util.Scanner
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void readNames() {
        try {
            String genderFile = "src/Data/Genders.txt";
            Scanner input = new Scanner(System.in);
            String fileName = "";
            for (int i = 0; i < YEARS; i++) {
                if (i == 9)
                    fileName = "src/Data/Babynamesranking2010.txt";
                else
                    fileName = "src/Data/Babynamesranking200" + (i + 1) + ".txt";
                
                input = new Scanner(new File(fileName));
                
               // Create HashMaps for each year from data files
               mapForBoy[i] = new HashMap<String, Integer>();
               mapForGirl[i] = new HashMap<String, Integer>();
               while (input.hasNext()) {
                   int ranking = input.nextInt();       // get ranking
                   String boyname = input.next();       // read boy's name
                   input.nextInt();                     // skip the number of boys names (not assigned to anything)
                   String girlname = input.next();      // read girl's name
                   input.nextInt();                     // skip the number of girls names (not assigned to anything)
                   
                   // add each boy and girl name to their respective map
                   mapForBoy[i].put(boyname, ranking);
                   mapForGirl[i].put(girlname, ranking);
               }
            }
            // fill in genderJComboBox with gender types from genderFile
            input = new Scanner(new File(genderFile));
            genderJComboBox.removeAllItems();
            String gender = "";
            while (input.hasNext()) {
                gender = input.nextLine(); // get gender
            }
        }
        catch(FileNotFoundException exp) {
            JOptionPane.showMessageDialog(null, "Required files do not exist",
                    "File Input Error", JOptionPane.WARNING_MESSAGE);
            // Utilize JFileChooser to select file in current dir
            JFileChooser chooser = new JFileChooser("src/Data");
            // Filter results to show only .txt files
            
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

        titelJLabel = new javax.swing.JLabel();
        dataJPanel = new javax.swing.JPanel();
        yearJLabel = new javax.swing.JLabel();
        yearJComboBox = new javax.swing.JComboBox<>();
        genderJLabel = new javax.swing.JLabel();
        genderJComboBox = new javax.swing.JComboBox<>();
        nameJLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        findJButton = new javax.swing.JButton();
        quitButton = new javax.swing.JButton();
        resultJLabel = new javax.swing.JLabel();
        babiesJMenuBar = new javax.swing.JMenuBar();
        fileJMenu = new javax.swing.JMenu();
        clearJMenuItem = new javax.swing.JMenuItem();
        printJMenuItem = new javax.swing.JMenuItem();
        fileJSeparator = new javax.swing.JPopupMenu.Separator();
        quitJMenuItem = new javax.swing.JMenuItem();
        helpJMenu = new javax.swing.JMenu();
        aboutJMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Baby Names Popularity Ranking");
        setIconImage(Toolkit.getDefaultToolkit().getImage("src/Images/BabyPenkaSmall.jpg"));
        setResizable(false);

        titelJLabel.setFont(new java.awt.Font("Tempus Sans ITC", 2, 36)); // NOI18N
        titelJLabel.setForeground(new java.awt.Color(0, 102, 102));
        titelJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titelJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BabyPenkaSmall.jpg"))); // NOI18N
        titelJLabel.setText("Baby Names");

        dataJPanel.setLayout(new java.awt.GridLayout(4, 2, 5, 0));

        yearJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yearJLabel.setText("Select a Year:");
        dataJPanel.add(yearJLabel);

        yearJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yearJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));
        dataJPanel.add(yearJComboBox);

        genderJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        genderJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        genderJLabel.setText("Gender:");
        dataJPanel.add(genderJLabel);

        genderJComboBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dataJPanel.add(genderJComboBox);

        nameJLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameJLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nameJLabel.setText("Enter a Name:");
        dataJPanel.add(nameJLabel);

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameJTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nameJTextField.setToolTipText("Enter name of baby");
        nameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameJTextFieldFocusLost(evt);
            }
        });
        dataJPanel.add(nameJTextField);

        findJButton.setBackground(new java.awt.Color(0, 153, 153));
        findJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        findJButton.setMnemonic('R');
        findJButton.setText("Find Ranking");
        findJButton.setToolTipText("Click on button to find ranking for name");
        findJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findJButtonActionPerformed(evt);
            }
        });
        dataJPanel.add(findJButton);

        quitButton.setBackground(new java.awt.Color(0, 153, 153));
        quitButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        quitButton.setMnemonic('Q');
        quitButton.setText("Quit");
        quitButton.setToolTipText("Quit the application");
        quitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitButtonActionPerformed(evt);
            }
        });
        dataJPanel.add(quitButton);

        resultJLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        resultJLabel.setForeground(new java.awt.Color(102, 0, 0));
        resultJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultJLabel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fileJMenu.setMnemonic('F');
        fileJMenu.setText("File");

        clearJMenuItem.setMnemonic('C');
        clearJMenuItem.setText("Clear");
        clearJMenuItem.setToolTipText("Clear player, start a new quiz");
        clearJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(clearJMenuItem);

        printJMenuItem.setMnemonic('P');
        printJMenuItem.setText("Print Form");
        printJMenuItem.setToolTipText("Print Form as GUI");
        printJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(printJMenuItem);
        fileJMenu.add(fileJSeparator);

        quitJMenuItem.setMnemonic('Q');
        quitJMenuItem.setText("Quit");
        quitJMenuItem.setToolTipText("End application");
        quitJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitJMenuItemActionPerformed(evt);
            }
        });
        fileJMenu.add(quitJMenuItem);

        babiesJMenuBar.add(fileJMenu);

        helpJMenu.setText("Help");

        aboutJMenuItem.setMnemonic('A');
        aboutJMenuItem.setText("About");
        aboutJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutJMenuItemActionPerformed(evt);
            }
        });
        helpJMenu.add(aboutJMenuItem);

        babiesJMenuBar.add(helpJMenu);

        setJMenuBar(babiesJMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(dataJPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(titelJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(titelJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dataJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(resultJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       clearJMenuItemActionPerformed()
     * Description  Event handler to clear the form and start anew. 
     * @author      <i>Nathan Willett</i>
     * Date         4/3/2020
     * History Log  7/18/2018     
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void clearJMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_clearJMenuItemActionPerformed
    {//GEN-HEADEREND:event_clearJMenuItemActionPerformed

    }//GEN-LAST:event_clearJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       printJMenuItemActionPerformed()
     * Description  Event handler to print the for as a GUI. Calls the
     *              PrintUtilities class printComponent method.
     * @author      <i>Nathan Willett</i>
     * Date         4/5/2021
     * History Log  7/18/2018, 4/3/2020
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void printJMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_printJMenuItemActionPerformed
    {//GEN-HEADEREND:event_printJMenuItemActionPerformed
        PrintUtilities.printComponent(this);
    }//GEN-LAST:event_printJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       quitJMenuItemActionPerformed()
     * Description  Event handler to end the application. Calls quitButton
     *              doClick() method.
     * @author      <i>Nathan Willett</i>
     * Date         4/3/2020
     * History Log  7/18/2018     
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quitJMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quitJMenuItemActionPerformed
    {//GEN-HEADEREND:event_quitJMenuItemActionPerformed
        quitButton.doClick();
    }//GEN-LAST:event_quitJMenuItemActionPerformed

    private void aboutJMenuItemActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aboutJMenuItemActionPerformed
    {//GEN-HEADEREND:event_aboutJMenuItemActionPerformed
//        About aboutWindow = new About(this, true);
//        aboutWindow.setVisible(true);
    }//GEN-LAST:event_aboutJMenuItemActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       quitButtonActionPerformed()
     * Description  Event handler to end the application.
     * @author      <i>Nathan Willett</i>
     * Date         4/5/2021
     * History Log  7/18/2018, 4/5/2021    
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void quitButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_quitButtonActionPerformed
    {//GEN-HEADEREND:event_quitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_quitButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       findJButtonActionPerformed()
     * Description  Main handler to find ranking of name. Examines the HashMaps
     *              created when the files are read for key (name typed by user)
     *              and finds corresponding value (ranking) if it is in the
     *              HashMap for the selected year.
     * @author      <i>Nathan Willett</i>
     * Date         4/5/2021
     * History Log  7/18/2018, 4/5/2021    
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void findJButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_findJButtonActionPerformed
    {//GEN-HEADEREND:event_findJButtonActionPerformed
        
    }//GEN-LAST:event_findJButtonActionPerformed
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       nameJTextFieldFocusLost()
     * Description  Event handler to change background color of JTextField if 
     *              input is illegal; otherwise reset to default white.
     * @author      <i>Nathan Willett</i>
     * Date         4/5/2021
     * History Log  7/18/2018, 4/5/2021    
    *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void nameJTextFieldFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_nameJTextFieldFocusLost
    {//GEN-HEADEREND:event_nameJTextFieldFocusLost
  
    }//GEN-LAST:event_nameJTextFieldFocusLost

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    *<pre>
     * Method       main()
     * Description  Displays splash screen and the main GUI form.
     * Date         4/5/2021    
     * History log  7/18/2018, 4/3/2020
     * @param       args are the command line strings
     * @author      <i>Nathan Willett</i>
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public static void main(String args[])
    {
        // Show splash screen
//        Splash mySplash = new Splash(4000);     // duration = 5 seconds
//        mySplash.showSplash();                  // show splash screen        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(BabyNamesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(BabyNamesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(BabyNamesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(BabyNamesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new BabyNamesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutJMenuItem;
    private javax.swing.JMenuBar babiesJMenuBar;
    private javax.swing.JMenuItem clearJMenuItem;
    private javax.swing.JPanel dataJPanel;
    private javax.swing.JMenu fileJMenu;
    private javax.swing.JPopupMenu.Separator fileJSeparator;
    private javax.swing.JButton findJButton;
    private javax.swing.JComboBox<String> genderJComboBox;
    private javax.swing.JLabel genderJLabel;
    private javax.swing.JMenu helpJMenu;
    private javax.swing.JLabel nameJLabel;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JMenuItem printJMenuItem;
    private javax.swing.JButton quitButton;
    private javax.swing.JMenuItem quitJMenuItem;
    private javax.swing.JLabel resultJLabel;
    private javax.swing.JLabel titelJLabel;
    private javax.swing.JComboBox<String> yearJComboBox;
    private javax.swing.JLabel yearJLabel;
    // End of variables declaration//GEN-END:variables
}
