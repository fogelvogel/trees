package BTreeBehaviours;

import BTree.BTreeNode;
import interfaces.ITraverseBehaviour;

import java.util.ArrayList;

public class PreorderTraverseBehaviour implements ITraverseBehaviour<BTreeNode> {
    public BTreeNode SearchByValue(int value, BTreeNode currentRoot) {
        if (currentRoot.getValue() == value) return currentRoot;
        else {
            if (currentRoot.hasLeft()) return SearchByValue(value, currentRoot.getLeft());
            if (currentRoot.hasRight()) return SearchByValue(value, currentRoot.getRight());
            else return null;
        }
    }
    public ArrayList<BTreeNode> GiveNodeList(BTreeNode currentRoot) {
        ArrayList<BTreeNode> listOfNodes = new ArrayList<BTreeNode>();
        TraverseRecursion(currentRoot, listOfNodes);
        return listOfNodes;
    }

    private ArrayList<BTreeNode> TraverseRecursion(BTreeNode currentRoot, ArrayList<BTreeNode> listOfNodes) {
        listOfNodes.add(currentRoot);
        if (currentRoot.hasLeft()) {
            TraverseRecursion(currentRoot.getLeft(), listOfNodes);
        }
        if (currentRoot.hasRight()) {
            TraverseRecursion(currentRoot.getRight(), listOfNodes);
        }
        return listOfNodes;
    }
}
