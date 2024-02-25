package behaviours;

import binaryTree.BTree;
import binaryTree.BTreeNode;
import interfaces.IPlacingNodeBehaviour;

class PlacingNodeLeftToRightBehaviour implements IPlacingNodeBehaviour<BTreeNode> {
    public BTreeNode addNode(BTreeNode parentNode, int value) {
        // no node will be placed
        if (parentNode == null) return null;
        if (parentNode.hasLeft()) {
            if (parentNode.hasRight()) {
                return addNode(parentNode.getLeft(), value);
            } else {
                parentNode.addRightChild(value);
                return null;
            }
        }
        parentNode.addLeftChild(value);
        return null;
    }
}
