package main;

import BTree.BTree;
import BTreeBehaviours.PlacingNodeByValueBehaviour;
import BTreeBehaviours.PreorderTraverseBehaviour;
import BTreeBehaviours.RemoveNodeWithChildrenBehaviour;

public class Main {
    public static void main(String[] arguments) {

        int rootValue = 5;

        PlacingNodeByValueBehaviour placingNodeByValueBehaviour
                = new PlacingNodeByValueBehaviour();
        PreorderTraverseBehaviour preorderTraverseBehaviour
                = new PreorderTraverseBehaviour();
        RemoveNodeWithChildrenBehaviour removeNodeWithChildrenBehaviour
                = new RemoveNodeWithChildrenBehaviour();

        BTree testTree = new BTree(
                rootValue,
                placingNodeByValueBehaviour,
                removeNodeWithChildrenBehaviour,
                preorderTraverseBehaviour
        );
        testTree.AddNode(7);
        testTree.AddNode(10);
        testTree.AddNode(2);
        testTree.Print();
    }
}

