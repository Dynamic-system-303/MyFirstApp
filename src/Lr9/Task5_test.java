package Lr9;

public class Task5_test {
    public static void main(String[] args) {
        Task4_Node head = null;

        for (int i = 9; i >= 0; i--){
            head = new Task4_Node(i, head);
        }
        Task4_Node ref = head;

        while (ref != null){
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
