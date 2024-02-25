package Tree;

public interface Tree {
    void AddNode(int value);

    void RemoveNode(TreeNode nodeToRemove,TreeNode parentNode);

    TreeNode SearchByValue(int value);
    TreeNode getRoot();
}
