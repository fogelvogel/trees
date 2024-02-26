package BTreeBehaviours;

import BTree.BTreeNode;
import interfaces.IRemovingNodeBehaviour;

public class RemoveNodeWithChildrenBehaviour implements IRemovingNodeBehaviour<BTreeNode> {
    public void removeByNode(BTreeNode nodeToRemove, BTreeNode parentNode) {
        if (parentNode.hasLeft()) {
            if (parentNode.getLeft().equals(nodeToRemove)) parentNode.removeLeft();
        } else if (parentNode.hasRight()) {
            if (parentNode.getRight().equals(nodeToRemove)) parentNode.removeRight();
        }
    }
}
