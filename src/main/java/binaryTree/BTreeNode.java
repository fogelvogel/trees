package binaryTree;

import Tree.TreeNode;

public class BTreeNode implements TreeNode {
    int value;
    BTreeNode left;
    BTreeNode right;

    BTreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void addRightChild(int value) {
        this.right = new BTreeNode(value);
    }

    public void addLeftChild(int value) {
        this.left = new BTreeNode(value);
    }

    public void removeLeft() { this.left = null; }

    public void removeRight() { this.right = null; }

    public boolean hasLeft() {
        if (this.left == null) return true;
        else return false;
    }

    public boolean hasRight() {
        if (this.right == null) return true;
        else return false;
    }

    public BTreeNode getLeft() {
        return left;
    }

    public BTreeNode getRight() {
        return right;
    }
}
