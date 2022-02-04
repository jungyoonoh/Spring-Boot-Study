public class ListNode {
    private int _value;
    private ListNode _prev;
    private ListNode _next;

    public ListNode(){
        _value = -1;
        _prev = null;
        _next = null;
    }


    public ListNode(int i) {
        _value = i;
        _next = new ListNode();
    }

    public ListNode(int value, ListNode prev, ListNode next){
        _value = value;
        _prev = prev;
        _next = next;
    }


    public int getValue(ListNode head, int position){
        ListNode node = head;
        for(int i = 0; i < position; i++){
            if(node._next == null) return head._value;
            node = node._next;
        }
        return node._value;
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position){
        try{
            ListNode node = head;
            for(int i = 1; i < position; i++){
                if(node._next == null) {
//                    System.out.println("this position is null");
                }
                node = node._next;
            }
            nodeToAdd._prev = node;
            nodeToAdd._next = node._next;
            node._next._prev = nodeToAdd;
            node._next = nodeToAdd;

            System.out.println("add : " + node._next._value);
        }catch (NullPointerException e){
//            System.out.println("this position doesn`t exist");
        }
        return head;
    }

    public ListNode remove(ListNode head, int positionToRemove){
        try{
            ListNode node = head;
            for(int i = 0; i < positionToRemove; i++){
                if(node._next == null){
//                    System.out.println("this position is null 1");
                    return head;
                }
                node = node._next;
            }
            node._next._prev = node._prev;
            node._prev._next = node._next;
            System.out.println("remove : " + node._value);
        }catch (NullPointerException e){
//            System.out.println("this position is null");
            return head;
        }
        return head;
    }

    public boolean contains(ListNode head, ListNode nodeToCheck){
        try{
            ListNode node = head;
            while(node != null){
                if(node == nodeToCheck) {
                    System.out.println("contain : " + node._value);
                    return true;
                }
                node = node._next;
            }
            return false;
        }catch (NullPointerException e){
//            System.out.println("this Node does not exist");
            return false;
        }
    }
}
