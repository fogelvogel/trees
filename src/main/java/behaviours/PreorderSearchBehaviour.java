package behaviours;

import binaryTree.BTree;
import binaryTree.BTreeNode;
import interfaces.ISearchBehaviour;

public class PreorderSearchBehaviour implements ISearchBehaviour<BTreeNode> {
    @Override
    public BTreeNode SearchByValue(int value, BTreeNode currentRoot) {
        if (currentRoot.getValue() == value) return currentRoot;
        else {
            if (currentRoot.hasLeft()) return SearchByValue(value, currentRoot.getLeft());
            if (currentRoot.hasRight()) return SearchByValue(value, currentRoot.getRight());
            else return null;
        }
    }
}
