package interfaces;

import binaryTree.BTree;
import binaryTree.BTreeNode;

public interface IPlacingNodeBehaviour {
    void addNode(BTreeNode parentNode, int value);
    void place(BTree tree, int value);
}
