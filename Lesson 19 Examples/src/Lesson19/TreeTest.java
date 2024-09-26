package Lesson19;

 /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        TreeTest.java
 * Project      Testing BST
 * Description  This program tests the Tree class
 * Platform     jdk 1.8.0_251; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds College
 * Hours        1 hours and 45 minutes
 * Date         2/25/2021
 * @author	<i>Niko Culevski</i>
 * @version 	%1% %2%
 * @see         javax.swing.JFrame
 * @see         java.awt.Toolkit
 * @see         java.util.ArrayList
 *</pre>
 * 
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class TreeTest
{
    public static void main( String args[] )
    {
        Tree tree = new Tree();
        //int intVal;
        System.out.println( "Inserting the following values in order: " + 
                "20, 12, 9, 18, 15, 31, 25, 41, 35, 40, 60");
//        for ( int i = 1; i <= 10; i++ )
//        {
//            intVal = ( int ) ( Math.random() * 100 );
//            System.out.print( intVal + " " );
//            tree.insertNode( intVal );
//        }
        tree.insertNode(20);
        tree.insertNode(12);
        tree.insertNode(9);
        tree.insertNode(18);
        tree.insertNode(15);
        tree.insertNode(31);
        tree.insertNode(25);
        tree.insertNode(41);
        tree.insertNode(35);
        tree.insertNode(40);
        tree.insertNode(60);
        
        System.out.println ( "\nPreorder traversal" );
        tree.preorderTraversal();   //Node, L, R
        System.out.println ( "\n\nInorder traversal" );
        tree.inorderTraversal();    //L, Node, R
        System.out.println ( "\n\nPostorder traversal" );
        tree.postorderTraversal();  //L, R, Node
        System.out.println();
        
        System.out.println("\nRemoved leaf node " + 9);      //Case 1: remove a leaf
        tree.remove(9);        //tree.remove(intVal);
        System.out.println ( "\nInorder traversal" );
        tree.inorderTraversal();
        tree.insertNode(9);
        
        System.out.println("\n\nRemoved leaf node " + 18);      //Case 1: remove a leaf
        tree.remove(18); 
        System.out.println ( "\nInorder traversal" );
        tree.inorderTraversal();
        System.out.println("\n\nRemoved 2-children node " + 31);      //Case 3: remove a parent wiht 2 children
        tree.remove(31); 
        System.out.println ( "\nInorder traversal" );
        tree.inorderTraversal();
        
    }
}