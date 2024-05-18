package Lr9;

import java.util.List;

public class Task_8_List {
    private Task_8_LinkList head = null;

    private boolean Empty() {
        return head == null;
    }

    public void creatHead(int data) {
        for (int i = 0; i <= data; i++) {
            Task_8_LinkList temp = new Task_8_LinkList(i);
            temp.next = head;
            head = temp;
        }
    }

    public void createTail(int data) {
        for (int i = data; i >= 0; i--) {
            Task_8_LinkList temp = new Task_8_LinkList(i);
            temp.next = head;
            head = temp;
        }
    }

    public void print() {
        Task_8_LinkList temp = head;

        while (temp != null) {
            System.out.print("->" + temp.data);
            temp = temp.next;
        }
    }

    public String toString() {
        String emptyHead = "";
        Task_8_LinkList temp = head;
        while (temp != null) {
            emptyHead = emptyHead + temp.data + " ";
            temp = temp.next;
        }
        return emptyHead;
    }

    public void addFirst(int data) {
        Task_8_LinkList temp = new Task_8_LinkList(data);
        temp.next = head;
        head = temp;
    }


    public void addLast(int data) {
        Task_8_LinkList temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Task_8_LinkList(data);
    }

    public void Insert(int index, int value) {
        Task_8_LinkList temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }
        // создаем промежут. звено - копию текущего
        Task_8_LinkList current = new Task_8_LinkList(temp.data);
        current.next = temp.next;
        // меняем значение текущего звена, т.е. замена на требуемое значение.
        temp.data = value;
        temp.next = current;
    }

    public void RemoveFirst() {
        head = head.next;
    }

    public void RemoveLast() {
        Task_8_LinkList prev = head;
        Task_8_LinkList temp = head.next;
        while (temp.next != null) {
            prev = prev.next;
            temp = temp.next;
        }
        prev.next = null;
    }

    public void Remove(int index) {
        Task_8_LinkList temp = head;
        for (int i = 0; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.data = temp.next.data;
        temp.next = temp.next.next;
    }

    private void createNodesHeadRecursive(Task_8_LinkList current, int data) {
        if (current.data < data) {
            Task_8_LinkList next = new Task_8_LinkList(current.data + 1);
            current.next = next;
            createNodesHeadRecursive(next, data);
        }
    }

    public void createHeadRec(int data) {
        head = new Task_8_LinkList(0);
        createNodesHeadRecursive(head, data);
    }

    private void createNodesTailRecursive(Task_8_LinkList prev, int current, int data) {
        if (current <= data) {
            Task_8_LinkList node = new Task_8_LinkList(current);
            if (head == null) {
                head = node;
            } else {
                prev.next = node;
            }
            createNodesTailRecursive(node, current + 1, data);
        }
    }

    public void createTailRec(int data) {
        createNodesTailRecursive(head, 0, data);
    }

    private String toStringRecHelper(Task_8_LinkList node) {
        if (node == null) {
            return "";
        }
        return node.data + " " + toStringRecHelper(node.next);
    }

    public String toStringRec() {
        return toStringRecHelper(head);
    }

}

