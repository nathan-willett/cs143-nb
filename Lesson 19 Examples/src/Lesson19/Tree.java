package Lesson19;

/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *<pre>
 * Class        Tree.java
 * Project      Binary Search Trees
 * Description  A definition for Tree class with multitude of methods for 
 *              operations on trees     
 * Platform     jdk 1.8.0_241; NetBeans IDE 11.3; Windows 10
 * Course       CS 142, Edmonds College
 * Hours        1 hours and 45 minutes
 * Date         2/25/2021
 * @author	<i>Niko Culevski</i>
 * @version 	%1% %2%
 *</pre>
 *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
public class Tree
{
    private TreeNode root;
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     *<pre>
     * Constructor     TreeNode()-- deafault constructor
     * Description     Construct a null Tree of integers.
     * @author         <i>Niko Culevski</i>
     * Date            2/25/2021
     * History Log     2/25/2021
     *</pre>
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public Tree()
    {
        root = null;
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method           InsertNode()
     * Description      Insert a new node in the binary search tree. If the root 
     *                  node is null, create the root node here. Otherwise, call
     *                  the insert method from the class TreeNode
     * @author          <i>Niko Culevski</i>
     * Date             2/25/2021
     * History Log      2/25/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public synchronized void insertNode( int d )
    {
    if ( root == null )
        root = new TreeNode( d );
    else
        root.insert( d );
    }
    
    public void remove(int d)
    {
	root = remove(d, root);
    }
    private TreeNode remove( int d, TreeNode node )
    {
	if( node == null )
	    return node;                        // Item not found; do nothing
	if(d < node.data)
	    node.left = remove(d, node.left);
	else if(d > node.data)
	    node.right = remove( d, node.right );
	else if( node.left != null && node.right != null ) // Two children
        {
	    node.data = findMin( node.right ).data; //or node.data = findMax(node.left).data
	    node.right = remove( node.data, node.right );
	}
	else    //Case 1 & case 2: remove leaf node & single child
	    node = ( node.left != null ) ? node.left : node.right;
	return node;
    }
    public int findMin()
    {
        return findMin(root).data;
    }
    private TreeNode findMin( TreeNode node )
    {
	if( node == null )
	    return null;
	else if( node.left == null )
	    return node;
	return findMin( node.left );
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method           preorderTraversal()
     * Description      Display data of nodes in preorder: Node, Left, Right, Calls
     *                  recursive preorderHelper method to do the real display.
     * @author          <i>Niko Culevski</i>
     * Date             2/25/2021
     * History Log      2/25/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public synchronized void preorderTraversal()
    {
        preorderHelper( root );
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method           preorderHelper()
     * Description      Display data of nodes id preorder: Node, Left, Right
     * @author          <i>Niko Culevski</i>
     * Date             2/25/2021
     * History Log      2/25/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void preorderHelper( TreeNode node )
    {
        if ( node == null )
            return;
        System.out.print( node.data + " " );
        preorderHelper( node.left );
        preorderHelper( node.right );
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method           inorderTraversal()
     * Description      Display data of nodes in preorder: Left, Node, Right. Calls
     *                  recursive inorderHelper method to do the real display
     * @author          <i>Niko Culevski</i>
     * Date             2/25/2021
     * History Log      2/25/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public synchronized void inorderTraversal()
    {
        inorderHelper( root );
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method           inorderHelper()
     * Description      Display data of nodes in preoredr: left, Node, Right.
     * @author          <i>Niko Culevski</i>
     * Date             2/25/2021
     * History Log      2/25/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void inorderHelper( TreeNode node )
    {
        if ( node == null )
            return;
        inorderHelper( node.left );
        System.out.print( node.data + " " );
        inorderHelper( node.right );
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method           postorderTraversal()
     * Description      Display data of nodes in preorder: Left, Right, Node. Calls
     *                  recursive postorderHelper method to do the real display
     * @author          <i>Niko Culevski</i>
     * Date             2/25/2021
     * History Log      2/25/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    public synchronized void postorderTraversal()
    {
        postorderHelper( root );
    }
    /**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
     * <pre>
     * Method           postorderHelper()
     * Description      Display data of nodes in preorder: left, Right, Node.
     * @author          <i>Niko Culevski</i>
     * Date             2/25/2021
     * History Log      2/25/2021
     *</pre>   
     *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    private void postorderHelper( TreeNode node )
    {
        if ( node == null )
            return;
        postorderHelper( node.left );
        postorderHelper( node.right );
        System.out.print( node.data + " " );
    }
}