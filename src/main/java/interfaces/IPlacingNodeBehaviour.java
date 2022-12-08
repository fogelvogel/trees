package interfaces;

import binaryTree.BTree;
import binaryTree.BTreeNode;

public interface IPlacingNodeBehaviour {
    void place(BTreeNode parentNode, int value);
    BTreeNode findNodeToPlace(BTree tree, int value);
}
