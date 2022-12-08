package binaryTree;

import interfaces.IPlacingNodeBehaviour;

public class BTree {
    BTreeNode root;
    // strategy pattern
    IPlacingNodeBehaviour placingNodeBehaviour;

    BTree(int nodeValue, IPlacingNodeBehaviour behaviour) {
        root = new BTreeNode(nodeValue);
    }

    public void AddNode(int value) {
        BTreeNode parentNode = placingNodeBehaviour.findNodeToPlace(this, value);
        placingNodeBehaviour.place(parentNode, value);
    }

    public BTreeNode getRoot() {
        return root;
    }

    public void setRoot(BTreeNode root) {
        this.root = root;
    }
}
