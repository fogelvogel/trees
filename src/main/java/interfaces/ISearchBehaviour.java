package interfaces;

import Tree.TreeNode;

public interface ISearchBehaviour<T extends TreeNode> {
    T SearchByValue(int value, T root);
}
