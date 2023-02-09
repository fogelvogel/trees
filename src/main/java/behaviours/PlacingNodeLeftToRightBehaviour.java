package behaviours;

import binaryTree.BTree;
import binaryTree.BTreeNode;
import interfaces.IPlacingNodeBehaviour;

class PlacingNodeLeftToRightBehaviour implements IPlacingNodeBehaviour {
    public void addNode(BTreeNode parentNode, int value) {
        if (parentNode.hasLeft()) {
            parentNode.addRightChild(value);
        }
        else parentNode.addLeftChild(value);
    }


    public void place(BTree tree, int value) {
        addNode(findNodeRecursion(tree.getRoot()), value);
    }

    private BTreeNode findNodeRecursion(BTreeNode parentNode) {
        if (parentNode.hasLeft()) {
            if (parentNode.hasRight()) {
                return findNodeRecursion(parentNode.getLeft());
            }
        }
        return parentNode;
    }
}
