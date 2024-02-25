package behaviours;

import binaryTree.BTree;
import binaryTree.BTreeNode;
import interfaces.IPlacingNodeBehaviour;

// this behaviour is used by binary search tree
public class PlacingNodeByValueBehaviour implements IPlacingNodeBehaviour {

    @Override
    public BTreeNode addNode(BTreeNode parentNode, int value) {
        // no node will be placed
        if (parentNode == null) return null;

    //     TODO: add exception when parentNode.getValue() < value
        if (parentNode.getValue() < value) {
            if (parentNode.hasRight()) {
                return addNode(parentNode.getRight(), value);
            } else {
                parentNode.addRightChild(value);
                return null;
            }
        }
        if (parentNode.getValue() > value) {
            if (parentNode.hasLeft()) {
                return addNode(parentNode.getLeft(), value);
            } else {
                parentNode.addLeftChild(value);
                return null;
            }
        }
        return null;
    }

//    @Override
//    public void place(BTree tree, int value) {
//        addNode(findNodeRecursion(tree.getRoot(), value), value);
//    }
//
//    private BTreeNode findNodeRecursion(BTreeNode parentNode, int value) {
//       // TODO: add exception when parentNode.getValue() < value
//        if (parentNode.getValue() < value) {
//            if (parentNode.hasRight()) {
//                return findNodeRecursion(parentNode.getRight(), value);
//            } else {
//                return parentNode;
//            }
//        }
//        if (parentNode.getValue() > value) {
//            if (parentNode.hasLeft()) {
//                return findNodeRecursion(parentNode.getLeft(), value);
//            } else {
//                return parentNode;
//            }
//        }
//        return null;
//    }
}
