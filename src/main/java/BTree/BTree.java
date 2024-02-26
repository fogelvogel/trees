package BTree;

import Tree.Tree;
import Tree.TreeNode;
import interfaces.IPlacingNodeBehaviour;
import interfaces.IRemovingNodeBehaviour;
import interfaces.ISearchBehaviour;

public class BTree implements Tree {
    BTreeNode root;
    // strategy pattern
    IPlacingNodeBehaviour placingNodeBehaviour;
    IRemovingNodeBehaviour removingNodeBehaviour;
    ISearchBehaviour searchBehaviour;

    public BTree(int nodeValue,
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
        placingNodeBehaviour.addNode(this.GetRoot(), value);
    }
    public void RemoveNode(TreeNode nodeToRemove, TreeNode parentNode) {
        removingNodeBehaviour.removeByNode(nodeToRemove, parentNode);
    }

    public void RemoveByValue(int value) {
        RemoveNode(SearchByValue(value), this.GetRoot());
    }

    public BTreeNode SearchByValue(int value) {

        return (BTreeNode) searchBehaviour.SearchByValue(value, this.GetRoot());
    }

    public BTreeNode GetRoot() {
        return root;
    }

    public void SetRoot(BTreeNode root) {
        this.root = root;
    }
}
