/* Generated By:JJTree: Do not edit this line. SimpleNode.java */
package org.apache.xpath.impl.parser;

import org.apache.xpath.expression.ExpressionFactory;
import org.apache.xpath.impl.CastOrTreatAsExprImpl;
import org.apache.xpath.impl.CastableAsExprImpl;
import org.apache.xpath.impl.ConditionalExprImpl;
import org.apache.xpath.impl.ExpressionFactoryImpl;
import org.apache.xpath.impl.ForAndQuantifiedExprImpl;
import org.apache.xpath.impl.FunctionCallImpl;
import org.apache.xpath.impl.InstanceOfExprImpl;
import org.apache.xpath.impl.KindTestImpl;
import org.apache.xpath.impl.LiteralImpl;
import org.apache.xpath.impl.NameTestImpl;
import org.apache.xpath.impl.OperatorImpl;
import org.apache.xpath.impl.PathExprImpl;
import org.apache.xpath.impl.SequenceTypeImpl;
import org.apache.xpath.impl.StepExprImpl;
import org.apache.xpath.impl.VariableImpl;


/**
 * Representation of an XPath AST node.
 */
public class SimpleNode implements Node, Cloneable
{
    public static boolean PRODUCE_RAW_TREE = false;
    
	static ExpressionFactory m_exprFact = new ExpressionFactoryImpl();

    protected Node[] m_children; // to remove
    
    protected int id; // to remove

	protected static ExpressionFactory getExpressionFactory()
	{
		return m_exprFact;
	}

	// Constructors

    protected SimpleNode()
    {
    }

    /**
     * Creates a new SimpleNode object.
     */
    public SimpleNode(int i)
    {
        id = i;
    }

    /**
     * Creates a new SimpleNode object.
     */
    public SimpleNode(XPath p, int i)
    {
        this(i);
    }

    public static Node jjtCreate(XPath p, int id)
    {
        if (PRODUCE_RAW_TREE)
        {
            return new SimpleNode(p, id);
        }

        Node newNode;
        NodeFactory nodeFactory = p.getNodeFactory();

        switch (id)
        {
            case XPathTreeConstants.JJTNAMETEST:
                newNode = nodeFactory.createNameTestNode(id);

                if (newNode == null)
                {
                    newNode = new NameTestImpl(id);
                }

                break;

            case XPathTreeConstants.JJTPROCESSINGINSTRUCTIONTEST:
            case XPathTreeConstants.JJTCOMMENTTEST:
            case XPathTreeConstants.JJTTEXTTEST:
            case XPathTreeConstants.JJTANYKINDTEST:
                newNode = nodeFactory.createKindTestNode(id);

                if (newNode == null)
                {
                    newNode = new KindTestImpl(id);
                }

                break;

            case XPathTreeConstants.JJTSTEPEXPR:
			case XPathTreeConstants.JJTPATTERNSTEP:            
                newNode = nodeFactory.createStepNode(id);

                if (newNode == null)
                {
                    newNode = new StepExprImpl(id);
                }

                break;

            case XPathTreeConstants.JJTINTEGERLITERAL:
            case XPathTreeConstants.JJTDOUBLELITERAL:
            case XPathTreeConstants.JJTSTRINGLITERAL:
            case XPathTreeConstants.JJTDECIMALLITERAL:
                newNode = (LiteralImpl) nodeFactory.createLiteralNode(id);

                if (newNode == null)
                {
                    newNode = new LiteralImpl(id);
                }

                break;

            case XPathTreeConstants.JJTCASTABLEEXPR:
                newNode = (CastableAsExprImpl) nodeFactory.createNode(id);

                if (newNode == null)
                {
                    newNode = new CastableAsExprImpl(id);
                }

                break;

            case XPathTreeConstants.JJTINSTANCEOFEXPR:
                newNode = (InstanceOfExprImpl) nodeFactory.createNode(id);

                if (newNode == null)
                {
                    newNode = new InstanceOfExprImpl(id);
                }

                break;

            case XPathTreeConstants.JJTQUANTIFIEDEXPR:
            case XPathTreeConstants.JJTFLWREXPR:
                newNode = (ForAndQuantifiedExprImpl) nodeFactory.createNode(id);

                if (newNode == null)
                {
                    newNode = new ForAndQuantifiedExprImpl(id);
                }

                break;

            case XPathTreeConstants.JJTIFEXPR:
                newNode = (ConditionalExprImpl) nodeFactory.createNode(id);

                if (newNode == null)
                {
                    newNode = new ConditionalExprImpl(id);
                }

                break;

            case XPathTreeConstants.JJTPATHEXPR:
			case XPathTreeConstants.JJTPATHPATTERN:
                newNode = nodeFactory.createPathNode(id);

                if (newNode == null)
                {
                    newNode = new PathExprImpl(id);
                }

                break;

            case XPathTreeConstants.JJTEXPRSEQUENCE:
            case XPathTreeConstants.JJTUNARYEXPR:
            case XPathTreeConstants.JJTADDITIVEEXPR:
            case XPathTreeConstants.JJTMULTIPLICATIVEEXPR:
            case XPathTreeConstants.JJTUNIONEXPR:
            case XPathTreeConstants.JJTRANGEEXPR:
            case XPathTreeConstants.JJTOREXPR:
            case XPathTreeConstants.JJTANDEXPR:
            case XPathTreeConstants.JJTCOMPARISONEXPR:
			case XPathTreeConstants.JJTPATTERN: 
			case XPathTreeConstants.JJTINTERSECTEXCEPTEXPR:   
                newNode = nodeFactory.createOperatorNode(id);

                if (newNode == null)
                {
                    newNode = new OperatorImpl(id);
                }

                break;

            case XPathTreeConstants.JJTFUNCTIONCALL:
			case XPathTreeConstants.JJTIDKEYPATTERN:
                newNode = nodeFactory.createFunctionCallNode(id);

                if (newNode == null)
                {
                    newNode = new FunctionCallImpl(id);
                }

                break;

            case XPathTreeConstants.JJTVARNAME:
                newNode = nodeFactory.createVarNameNode(id);

                if (newNode == null)
                {
                    newNode = new VariableImpl(id);
                }

                break;

            case XPathTreeConstants.JJTSEQUENCETYPE:
            case XPathTreeConstants.JJTSINGLETYPE:
                newNode = nodeFactory.createSequenceTypeNode(id);

                if (newNode == null)
                {
                    newNode = new SequenceTypeImpl(id);
                }

                break;

            case XPathTreeConstants.JJTCASTEXPR:
                newNode = nodeFactory.createCastAsNode(id);

                if (newNode == null)
                {
                    newNode = new CastOrTreatAsExprImpl(id);
                }

                break;

            case XPathTreeConstants.JJTTREATEXPR: 
                newNode = nodeFactory.createTreatAsNode(id);

                if (newNode == null)
                {
                    newNode = new CastOrTreatAsExprImpl(id);
                }

                break;

            // The nodes belows are filtered: no customisation possible
            
            case XPathTreeConstants.JJTSTAR:
            case XPathTreeConstants.JJTNCNAMECOLONSTAR:
            case XPathTreeConstants.JJTSTARCOLONNCNAME:
			case XPathTreeConstants.JJTQNAME:    
			case XPathTreeConstants.JJTQNAMELPAR:    
				newNode = new QNameWrapper(id);
				break;
				
            case XPathTreeConstants.JJTDOTDOT:
                newNode = Singletons.DOTDOT;

                break;

            case XPathTreeConstants.JJTAT:
                newNode = Singletons.AT;

                break;

            case XPathTreeConstants.JJTPLUS:
                newNode = Singletons.PLUS;

                break;

            case XPathTreeConstants.JJTMINUS:
                newNode = Singletons.MINUS;

                break;

            case XPathTreeConstants.JJTXPATH:         
                newNode = XPathNode.m_singleton;

                break;

            case XPathTreeConstants.JJTXPATH2:
			case XPathTreeConstants.JJTMATCHPATTERN:
                newNode = XPath2Node.m_singleton;

                break;

            case XPathTreeConstants.JJTDOT:
                newNode = Singletons.DOT_KIND_TEST;

                break;

            case XPathTreeConstants.JJTSLASH:
                newNode = Singletons.SLASH;

                break;

            case XPathTreeConstants.JJTPREDICATES:
                newNode = new Predicates(id);

                // can use a singleton (but children need to be reinitialized)
                break;

            case XPathTreeConstants.JJTNODETEST:
                newNode = new SimpleNode(id); //Singletons.NODETEST; 

                // can use a singleton (but children need to be reinitialized)
                break;

            case XPathTreeConstants.JJTEMPTY:
                newNode = Singletons.EMPTY;

                break;

            case XPathTreeConstants.JJTELEMENTTYPE:
                newNode = Singletons.ELEMENT;

                break;

            case XPathTreeConstants.JJTATTRIBUTETYPE:
                newNode = Singletons.ATTRIBUTE;

                break;

            case XPathTreeConstants.JJTATOMICTYPE:
                newNode = Singletons.ATOMIC;

                break;

            case XPathTreeConstants.JJTNODE:
                newNode = Singletons.NODE;

                break;

            case XPathTreeConstants.JJTPROCESSINGINSTRUCTION:
                newNode = Singletons.PI;

                break;

            case XPathTreeConstants.JJTCOMMENT:
                newNode = Singletons.COMMENT;

                break;

            case XPathTreeConstants.JJTTEXT:
                newNode = Singletons.TEXT;

                break;

            case XPathTreeConstants.JJTDOCUMENT:
                newNode = Singletons.DOCUMENT;

                break;

            case XPathTreeConstants.JJTITEM:
                newNode = Singletons.ITEM;

                break;

            case XPathTreeConstants.JJTMULTIPLY:
                newNode = Singletons.MULTIPLY;

                break;

            case XPathTreeConstants.JJTQMARK:
                newNode = Singletons.QMARK;

                break;

            case XPathTreeConstants.JJTROOT:
                newNode = Singletons.ROOT;

                break;

            case XPathTreeConstants.JJTROOTDESCENDANTS:
                newNode = Singletons.ROOTDESCENDANT;

                break;

            case XPathTreeConstants.JJTSLASHSLASH:
                newNode = Singletons.SLASHSLASH;

                break;

            case XPathTreeConstants.JJTAXISCHILD:
                newNode = Axis.AXIS_CHILD;

                break;

            case XPathTreeConstants.JJTAXISATTRIBUTE:
                newNode = Axis.AXIS_ATTRIBUTE;

                break;

            case XPathTreeConstants.JJTAXISDESCENDANT:
                newNode = Axis.AXIS_DESCENDANT;

                break;

            case XPathTreeConstants.JJTAXISSELF:
                newNode = Axis.AXIS_SELF;

                break;

            case XPathTreeConstants.JJTAXISDESCENDANTORSELF:
                newNode = Axis.AXIS_DESCENDANTORSELF;

                break;

            case XPathTreeConstants.JJTAXISFOLLOWINGSIBLING:
                newNode = Axis.AXIS_FOLLOWINGSIBLING;

                break;

            case XPathTreeConstants.JJTAXISFOLLOWING:
                newNode = Axis.AXIS_FOLLOWING;

                break;

            case XPathTreeConstants.JJTAXISNAMESPACE:
                newNode = Axis.AXIS_NAMESPACE;

                break;

            case XPathTreeConstants.JJTAXISPARENT:
                newNode = Axis.AXIS_PARENT;

                break;

            case XPathTreeConstants.JJTAXISANCESTOR:
                newNode = Axis.AXIS_ANCESTOR;

                break;

            case XPathTreeConstants.JJTAXISPRECEDINGSIBLING:
                newNode = Axis.AXIS_PRECEDINGSIBLING;

                break;

            case XPathTreeConstants.JJTAXISPRECEDING:
                newNode = Axis.AXIS_PRECEDING;

                break;

            case XPathTreeConstants.JJTAXISANCESTORORSELF:
                newNode = Axis.AXIS_ANCESTORORSELF;

                break;

            // Below: xpath grammar unit not implemented yet
            case XPathTreeConstants.JJTVOID: //?
            case XPathTreeConstants.JJTRETURN:
            case XPathTreeConstants.JJTSOME:
            case XPathTreeConstants.JJTEVERY:
            case XPathTreeConstants.JJTIN:
            case XPathTreeConstants.JJTSATISFIES:           
            case XPathTreeConstants.JJTVALIDATEEXPR: 
            case XPathTreeConstants.JJTRBRACE: 
            
            // types..
            case XPathTreeConstants.JJTSCHEMACONTEXT: 
            case XPathTreeConstants.JJTSCHEMAGLOBALCONTEXT: 
            case XPathTreeConstants.JJTSCHEMACONTEXTSTEP: 
            case XPathTreeConstants.JJTUNTYPED:
            case XPathTreeConstants.JJTATOMICVALUE: 
            case XPathTreeConstants.JJTELEMORATTRTYPE: 
            case XPathTreeConstants.JJTSCHEMATYPE: 
            case XPathTreeConstants.JJTOFTYPE: 

            default:

                //System.err.println("case not implemented: " + XPathTreeConstants.jjtNodeName[id]);
                newNode = new SimpleNode(p, id);
        }

        return newNode;
    }

    /**
     * DOCUMENT ME!
     *
     * @param id DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public static Node jjtCreate(int id)
    {
        // When this one is called?
        return new SimpleNode(id);
    }

    /**
     * DOCUMENT ME!
     */
    public void jjtOpen()
    {
    }

    /**
     * DOCUMENT ME!
     */
    public void jjtClose()
    {
    }

    /**
     * DOCUMENT ME!
     *
     * @param n DOCUMENT ME!
     */
    public void jjtSetParent(Node n)
    {
       // nothing
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Node jjtGetParent()
    {
        return null;
    }

    /**
     * DOCUMENT ME!
     *
     * @param n DOCUMENT ME!
     * @param i DOCUMENT ME!
     */
    public void jjtAddChild(Node n, int i)
    {
        if (m_children == null)
        {
            m_children = new Node[i + 1];
        }
        else if (i >= m_children.length)
        {
            Node[] c = new Node[i + 1];
            System.arraycopy(m_children, 0, c, 0, m_children.length);
            m_children = c;
        }

        m_children[i] = n;
    }

    /**
     * Insert child at the first position
     *
     * @param n DOCUMENT ME!
     */
    public void jjtInsertChild(Node n)
    {
        if (m_children == null)
        {
            m_children = new Node[1];
        }
        else
        {
            Node[] c = new Node[m_children.length + 1];
            System.arraycopy(m_children, 0, c, 1, m_children.length);
            m_children = c;
        }

        m_children[0] = n;
    }

    /**
     * Insert children of the given node at the first position
     *
     * @param sn DOCUMENT ME!
     */
    public void jjtInsertNodeChildren(Node sn)
    {
        Node[] n = ((SimpleNode) sn).m_children;

        if (n != null)
        {
            if (m_children == null)
            {
                m_children = new Node[n.length];
            }
            else
            {
                Node[] c = new Node[m_children.length + n.length];
                System.arraycopy(m_children, 0, c, n.length, m_children.length);
                m_children = c;
            }

            System.arraycopy(n, 0, m_children, 0, n.length);
        }
    }

    /**
     * Remove the given node form the list of children
     *
     * @param child DOCUMENT ME!
     *
     * @return The node that has been removed or null whether the given node
     *         doesn't belong to the child list
     */
    protected Node jjtRemoveChild(Node child)
    {
        if ((m_children == null) || (m_children.length == 0))
        {
            return null;
        }

        for (int i = 0; i < m_children.length; i++)
        {
            if (m_children[i] == child)
            {
                // remove
                Node[] c = new Node[m_children.length - 1];
                if ( i > 0 )
                {
                	System.arraycopy(m_children, 0, c, 0, i);
                }
                if ( i < m_children.length )
                {
                	System.arraycopy(m_children, i + 1, c, i, m_children.length - i - 1);
                }
                m_children = c;

                return child;
            }
        }

        return null;
    }

    /**
     * DOCUMENT ME!
     *
     * @param i DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Node jjtGetChild(int i)
    {
        return m_children[i];
    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public int jjtGetNumChildren()
    {
        return (m_children == null) ? 0 : m_children.length;
    }

    /**
     * Accept the visitor.
     *
     * @param visitor DOCUMENT ME!
     * @param data DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Object jjtAccept(XPathVisitor visitor, Object data)
    {
        return visitor.visit(this, data);
    }

    /**
     * Accept the visitor.
     *
     * @param visitor DOCUMENT ME!
     * @param data DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Object childrenAccept(XPathVisitor visitor, Object data)
    {
        for (int i = 0; i < jjtGetNumChildren(); ++i)
        {
            jjtGetChild(i).jjtAccept(visitor, data);
        }

        return data;
    }

    /**
     * @see org.apache.xpath.impl.parser.Node#getId()
     */
    public int getId()
    {
        return id;
    }

    /**
     * Method processToken.
     *
     * @param token
     */
    public void processToken(Token token)
    {
    }

    /**
                         *
                         */
    public boolean canBeReduced()
    {
        return false;
    }

    /* You can override these two methods in subclasses of SimpleNode to
       customize the way the node appears when the tree is dumped.  If
       your output uses more than one line you should override
       toString(String), otherwise overriding toString() is probably all
       you need to do. */
    public String toString()
    {
        return XPathTreeConstants.jjtNodeName[id] + " classname=" + getClass();
    }

    /**
     * DOCUMENT ME!
     *
     * @param prefix DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String toString(String prefix)
    {
        return prefix + toString();
    }

    /**
     * DOCUMENT ME!
     *
     * @param prefix DOCUMENT ME!
     */
    public void dump(String prefix)
    {
        dump(prefix, System.out);
    }

    /* Override this method if you want to customize how the node dumps
       out its children. */
    public void dump(String prefix, java.io.PrintStream out)
    {
        out.println(toString(prefix));

        for (int i = 0; i < jjtGetNumChildren(); ++i)
        {
            SimpleNode n = (SimpleNode) jjtGetChild(i);

            if (n != null)
            {
                n.dump(prefix + " ", out);
            }
        }
    }

    /**
     * Gets the node as an string
     *
     * @param expr DOCUMENT ME!
     * @param abbreviate DOCUMENT ME!
     */
    public void getString(StringBuffer expr, boolean abbreviate)
    {
    }
    
}
