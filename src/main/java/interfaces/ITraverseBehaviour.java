package interfaces;

import Tree.TreeNode;

import java.util.ArrayList;

public interface ITraverseBehaviour<T extends TreeNode> {
    T SearchByValue(int value, T root);
    ArrayList<T> GiveNodeList(T root);
}
