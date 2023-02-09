package interfaces;

import binaryTree.BTree;
import binaryTree.BTreeNode;

public interface ISearchBehaviour {
    public BTreeNode SearchByValue(int value, BTreeNode tree);
}
