package interfaces;

import Tree.TreeNode;

public interface IPlacingNodeBehaviour<T extends TreeNode> {
    T addNode(T root, int value);
}
