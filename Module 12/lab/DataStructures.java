import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class DataStructures {
    // linked lists are bad at finding elements by index
    // arraylists are bad at inserting elements / reordering
    public static void main(String[] args) {
        // lists
        List<String> list = new LinkedList<>();
        list.add("John");
        list.add("Peter");
        list.add("John");
        list.add(0, "Linda");
        System.out.println(list);

        // stack - last in first out - LIFO
        // no insertions or removal
        Stack<String> stack = new Stack<>();
        // push to add element
        // pop to remove
        // peek to view
        stack.push("John");
        stack.push("Peter");
        stack.push("John");
        stack.push("Linda");
        System.out.println(stack + " " + stack.pop());

        // queue - first in first out - FIFO
        Queue<String> queue = new PriorityQueue<>();
        queue.offer("John");
        queue.offer("Peter");
        queue.offer("John");
        queue.offer("Linda");
        System.out.println(queue + " " + queue.poll());

        // sets - no duplicates
        // hash set - a way of getting to elements quickly
        // uses hash code of each element to store it
        // no concept of index in a set
        // collisions - two hash codes map to same location
        // linked hash set revises collision
        // if two elements map to same index its in a linked list
        // treesets are ordered in specified way
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Peter");
        set.add("John");
        set.add("Linda");
        System.out.println(set);

        // maps - stores key value pairs
        // find elements by key
        Map<Integer, String> map = new HashMap<>();
        // new put with same key overrides old
        map.put(1, "John");
        map.put(1, "Peter");
        map.put(3, "John");
        map.put(4, "Linda");
        System.out.println(map);
    }
}
