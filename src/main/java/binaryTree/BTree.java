package binaryTree;

import interfaces.IPlacingNodeBehaviour;
import interfaces.IRemovingNodeBehaviour;
import interfaces.ISearchBehaviour;

public class BTree {
    BTreeNode root;
    // strategy pattern
    IPlacingNodeBehaviour placingNodeBehaviour;
    IRemovingNodeBehaviour removingNodeBehaviour;
    ISearchBehaviour searchBehaviour;

    BTree(int nodeValue,
          IPlacingNodeBehaviour placingNodeBehaviour,
          IRemovingNodeBehaviour removingNodeBehaviour,
          ISearchBehaviour searchBehaviour
    ) {
        root = new BTreeNode(nodeValue);
        this.placingNodeBehaviour = placingNodeBehaviour;
        this.removingNodeBehaviour = removingNodeBehaviour;
        this.searchBehaviour = searchBehaviour;
    }

    public void AddNode(int value) {
        //BTreeNode parentNode = placingNodeBehaviour.findNodeToPlace(this, value);
        placingNodeBehaviour.addNode(this.getRoot(), value);
    }

    public void RemoveNode(BTreeNode nodeToRemove, BTreeNode parentNode) {
        removingNodeBehaviour.removeNode(nodeToRemove, parentNode);
    }

    public void SearchByValue(int value) {
        //todo simple search
        BTreeNode rootNode = this.getRoot();
        searchBehaviour.SearchByValue(value, rootNode);
    }

    public BTreeNode getRoot() {
        return root;
    }

    public void setRoot(BTreeNode root) {
        this.root = root;
    }
}
