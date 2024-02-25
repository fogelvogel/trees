package interfaces;

import Tree.TreeNode;


public interface IRemovingNodeBehaviour<T extends TreeNode> {
    void removeByNode(T nodeToRemove, T root);
}
