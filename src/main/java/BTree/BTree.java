package BTree;

import Tree.Tree;
import Tree.TreeNode;
import interfaces.IPlacingNodeBehaviour;
import interfaces.IRemovingNodeBehaviour;
import interfaces.ITraverseBehaviour;

import java.util.ArrayList;

public class BTree implements Tree {
    BTreeNode root;
    // strategy pattern
    IPlacingNodeBehaviour placingNodeBehaviour;
    IRemovingNodeBehaviour removingNodeBehaviour;
    ITraverseBehaviour traverseBehaviour;

    public BTree(int nodeValue,
          IPlacingNodeBehaviour placingNodeBehaviour,
          IRemovingNodeBehaviour removingNodeBehaviour,
          ITraverseBehaviour traverseBehaviour
    ) {
        root = new BTreeNode(nodeValue);
        this.placingNodeBehaviour = placingNodeBehaviour;
        this.removingNodeBehaviour = removingNodeBehaviour;
        this.traverseBehaviour = traverseBehaviour;
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

    public void Print() {
        ArrayList<BTreeNode> listOfNodes = new ArrayList<BTreeNode>();
        listOfNodes = traverseBehaviour.GiveNodeList(this.GetRoot());
        System.out.println(listOfNodes.toString());
    }

    public BTreeNode SearchByValue(int value) {

        return (BTreeNode) traverseBehaviour.SearchByValue(value, this.GetRoot());
    }

    public BTreeNode GetRoot() {
        return root;
    }

    public void SetRoot(BTreeNode root) {
        this.root = root;
    }
}
