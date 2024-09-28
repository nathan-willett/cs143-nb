package BabyNames;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*<pre>
 * Class        About.java
 * Description  A class that displays an "About" dialog with details about the 
 *              BabyNames application.
 * Project      Baby Name Popularity Ranking
 * Platform     jdk 1.8.0_241; NetBeans IDE 23; PC Windows 10
 * Course       CS 143
 * Hours        1 hour
 * Date         9/25/2024
 * History Log  7/18/2018, 5/7/2020
 * @author	<i>Nathan Willett</i>
 * @version 	1.0
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class About extends JDialog {

    private final JPanel contentPanel = new JPanel();

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor  About() - default constructor
     * Description  Creates an About dialog displaying program details.
     * Date         9/25/2024
     * History Log  7/18/2018, 5/7/2020
     * @author      <i>Nathan Willett</i>
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/  
    public About() {
        setTitle("About Baby Name Popularity Ranking");
        setBounds(100, 100, 450, 300);
        setLocationRelativeTo(null); // Center the dialog
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);

        JLabel titleLabel = new JLabel("Baby Name Popularity Ranking");
        titleLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        titleLabel.setBounds(80, 20, 300, 30);
        contentPanel.add(titleLabel);

        JLabel versionLabel = new JLabel("Version 1.0");
        versionLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        versionLabel.setBounds(180, 60, 100, 20);
        contentPanel.add(versionLabel);

        JLabel authorLabel = new JLabel("Author: Nathan Willett");
        authorLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        authorLabel.setBounds(140, 100, 200, 20);
        contentPanel.add(authorLabel);

        JLabel courseLabel = new JLabel("Course: CS 143");
        courseLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        courseLabel.setBounds(180, 140, 100, 20);
        contentPanel.add(courseLabel);

        JLabel dateLabel = new JLabel("Date: 9/25/2024");
        dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        dateLabel.setBounds(170, 180, 120, 20);
        contentPanel.add(dateLabel);

        // OK button to close the dialog
        JButton okButton = new JButton("OK");
        okButton.setBounds(170, 220, 80, 30);
        contentPanel.add(okButton);

        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the dialog
            }
        });

        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setModal(true); // Block interaction with other windows while open
    }

    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Method       main()
     * Description  For testing purposes, displays the About dialog.
     * Date         9/25/2024
     * @author      <i>Nathan Willett</i>
     *</pre>
    *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/  
    public static void main(String[] args) {
        try {
            About dialog = new About();
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
