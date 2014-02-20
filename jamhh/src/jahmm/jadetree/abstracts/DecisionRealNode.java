package jahmm.jadetree.abstracts;

import jahmm.jadetree.DecisionLeafImpl;
import jutlis.Idable;

/**
 *
 * @author kommusoft
 * @param <TSource> The type of elements in the tree.
 */
public interface DecisionRealNode<TSource> extends DecisionNode<TSource>, Idable {

    public abstract boolean isLeaf();

    public abstract void makeDirty();

    public abstract DecisionRealNode<TSource> nextHop(TSource source);

    public abstract DecisionLeafImpl<TSource> getMaximumExpandLeaf();

    public abstract DecisionInode<TSource> getMaximumReduceInode();

    public abstract void insert(TSource source);

}