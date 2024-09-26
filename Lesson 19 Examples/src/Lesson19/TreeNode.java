package Lesson19;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        TreeNode.java
 * Project      Binary Search Trees
 * Description  A self-refential class representing a binary tree node.      
 * Platform     PC Windows 10; jdk 1.8.0_251; NetBeans IDE 11.3; 
 * Course       CS 142, Edmonds College
 * Hours        1 hours and 45 minutes
 * Date         2/25/2021
 * @author	<i>Niko Culevski</i>
 * @version 	%1% %2%

 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class TreeNode
{
    // package access members
    TreeNode left;  // left node
    int data;       // data item
    TreeNode right; // right node
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor     TreeNode()--constructor
     * Description     Initialize data to d and make this a leaf node.
     * @param          d int
     * @author         <i>Niko Culevski</i>
     * Date            2/25/2021
     * History Log     2/25/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public TreeNode( int d )
    {
        data = d;
        left = right = null; // this node has no children
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method           insert()
     * Description      Recursive method to insert a TreeNode into a Tree that
     *                  contains nodes
     * @param           d int
     * @author          <i>Niko Culevski</i>
     * Date             2/25/2021
     * History Log      2/25/2021         
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public synchronized void insert( int d )
    {
        if ( d < data )
        {
            if ( left == null )
                left = new TreeNode( d );
            else
                left.insert( d );
        }
        else
            if ( d >= data )
            {
                if ( right == null )
                    right = new TreeNode( d );
                else
                    right.insert( d );
            }
    }
}