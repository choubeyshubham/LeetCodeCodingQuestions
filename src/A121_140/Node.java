package A121_140;

import java.util.ArrayList;
import java.util.List;

public class Node {
    Node next;
    Node random;

    public int val;
    public List<Node> neighbors;

    public Node(Node next, Node random, int val, List<Node> neighbors) {
        this.next = next;
        this.random = random;
        this.val = val;
        this.neighbors = neighbors;
    }

    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }


    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }


}