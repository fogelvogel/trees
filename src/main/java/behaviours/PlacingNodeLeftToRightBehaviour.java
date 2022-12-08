package behaviours;

import binaryTree.BTree;
import binaryTree.BTreeNode;
import interfaces.IPlacingNodeBehaviour;

class PlacingNodeLeftToRightBehaviour implements IPlacingNodeBehaviour {
    public void place(BTreeNode parentNode, int value) {
        if (parentNode.hasLeft()) {
            parentNode.addRightChild(value);
        }
        else parentNode.addLeftChild(value);
    }


    public BTreeNode findNodeToPlace(BTree tree, int value) {

        //TODO place logic
        return tree.getRoot();
    }

    private BTreeNode findNodeRecurrsion(BTreeNode parentNode) {
        if (parentNode.hasLeft()) {
            if (parentNode.hasRight()) {
                return findNodeRecurrsion(parentNode.getLeft());
            }
        }
        return parentNode;
    }
}
