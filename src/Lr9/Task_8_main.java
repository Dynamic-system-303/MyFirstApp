
package Lr9;

public class Task_8_main {
    public static void main(String[] args) {
        Task_8_List createHead = new Task_8_List();
        createHead.creatHead(10);
        System.out.println(createHead);

        Task_8_List createTail = new Task_8_List();
        createTail.createTail(10);
        System.out.println(createTail);

        createHead.addFirst(12);
        System.out.println(createHead.toString());

        createHead.addLast(-3);
        System.out.println(createHead.toString());

        createTail.Insert(5,221);
        System.out.println(createTail.toString());

        createTail.RemoveFirst();
        System.out.println(createTail.toString());

        createTail.RemoveLast();
        System.out.println(createTail.toString());

        createTail.Remove(4);
        System.out.println(createTail.toString());

        Task_8_List CreateHeadRec = new Task_8_List();
        CreateHeadRec.createHeadRec(10);
        System.out.println(CreateHeadRec.toStringRec());

        Task_8_List CreateTailRec = new Task_8_List();
        CreateTailRec.createTailRec(10);
        System.out.println(CreateTailRec.toStringRec());

        System.out.println(CreateTailRec.toStringRec());

    }
}
