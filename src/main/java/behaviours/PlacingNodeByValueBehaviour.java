package behaviours;

import binaryTree.BTree;
import binaryTree.BTreeNode;
import interfaces.IPlacingNodeBehaviour;

// this behaviour is used by binary search tree
public class PlacingNodeByValueBehaviour implements IPlacingNodeBehaviour {

    @Override
    public void addNode(BTreeNode parentNode, int value) {
        // no node will be placed
        if (parentNode == null) return;
        if (parentNode.getValue() < value) {
            parentNode.addRightChild(value);
        }
        else parentNode.addLeftChild(value);
    }

    @Override
    public void place(BTree tree, int value) {
        addNode(findNodeRecursion(tree.getRoot(), value), value);
    }

    private BTreeNode findNodeRecursion(BTreeNode parentNode, int value) {
       // TODO: add exception then parentNode.getValue() < value
        if (parentNode.getValue() < value) {
            if (parentNode.hasRight()) {
                return findNodeRecursion(parentNode.getRight(), value);
            } else {
                return parentNode;
            }
        }
        if (parentNode.getValue() > value) {
            if (parentNode.hasLeft()) {
                return findNodeRecursion(parentNode.getLeft(), value);
            } else {
                return parentNode;
            }
        }
        return null;
    }
}
