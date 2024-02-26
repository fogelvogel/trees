package Tree;

public interface Tree {
    void AddNode(int value);

    void RemoveNode(TreeNode nodeToRemove,TreeNode parentNode);

    void RemoveByValue(int value);

    TreeNode SearchByValue(int value);
    TreeNode GetRoot();
}
