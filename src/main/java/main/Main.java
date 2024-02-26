package main;

import BTree.BTree;
import BTreeBehaviours.PlacingNodeByValueBehaviour;
import BTreeBehaviours.PreorderSearchBehaviour;
import BTreeBehaviours.RemoveNodeWithChildrenBehaviour;

public class Main {
    public static void main(String[] arguments) {

        int rootValue = 5;

        PlacingNodeByValueBehaviour placingNodeByValueBehaviour
                = new PlacingNodeByValueBehaviour();
        PreorderSearchBehaviour preorderSearchBehaviour
                = new PreorderSearchBehaviour();
        RemoveNodeWithChildrenBehaviour removeNodeWithChildrenBehaviour
                = new RemoveNodeWithChildrenBehaviour();

        BTree testTree = new BTree(
                rootValue,
                placingNodeByValueBehaviour,
                removeNodeWithChildrenBehaviour,
                preorderSearchBehaviour
        );
        testTree.AddNode(7);
        testTree.AddNode(10);
        testTree.AddNode(2);
    }
}

