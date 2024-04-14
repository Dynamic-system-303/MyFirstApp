package Lr9;

public class Task4_Test {
    public static void main(String[] args) {
        Task4_Node node0 = new Task4_Node(0,null);
        Task4_Node node1 = new Task4_Node(1,null);
        Task4_Node node2 = new Task4_Node(2,null);
        Task4_Node node3 = new Task4_Node(3,null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        Task4_Node ref = node0;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
