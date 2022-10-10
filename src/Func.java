import java.util.ArrayList;

public class Func {
    public static ArrayList<Integer> linkedListSum(LinkedList a, LinkedList b) {
        ArrayList<Integer> list = new ArrayList<>();

        if (a.count() != b.count()) {
            return list;
        }

        Node nodeA = a.head;
        Node nodeB = b.head;

        while (nodeA != null) {
            list.add(nodeA.value + nodeB.value);

            nodeA = nodeA.next;
            nodeB = nodeB.next;
        }

        return list;
    }
}
