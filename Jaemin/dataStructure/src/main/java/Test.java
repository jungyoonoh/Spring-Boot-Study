public class Test {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(0);

        ListNode node1 = new ListNode(3);
        listNode.add(listNode, node1, 1);
        listNode.add(listNode, new ListNode(2), 2);
        listNode.add(listNode, new ListNode(5), 4);
        listNode.contains(listNode, node1);

        listNode.remove(listNode, 1);
        listNode.remove(listNode, 2);
        listNode.remove(listNode, 1);
        listNode.remove(listNode, 1);

        System.out.println("----------------------------");

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        for(int i = 0; i < 5; i++){
            System.out.println(stack.pop());
        }

        System.out.println("----------------------------");

        StackByListNode stackByListNode = new StackByListNode();
        stackByListNode.push(1);
        stackByListNode.push(2);
        stackByListNode.push(3);
        for(int i = 0; i < 5; i++){
            stackByListNode.pop();
        }

        System.out.println("----------------------------");

        Queue queue = new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        for(int i = 0; i < 5; i++){
            System.out.println(queue.pop());
        }

        System.out.println("----------------------------");

        QueueByListNode queueByListNode = new QueueByListNode();
        queueByListNode.push(1);
        queueByListNode.push(2);
        queueByListNode.push(3);
        for(int i = 0; i < 5; i++){
            System.out.println(queueByListNode.pop());
        }
    }
}