public class QueueByListNode {
    private int head, tail;
    private ListNode _data = new ListNode();

    QueueByListNode(){
        tail= 1;
        _data = new ListNode(-1);
    }

    public void push(int data){
        _data.add(_data, new ListNode(data), tail++);
    }

    public int pop(){
        if(1 >= tail) {
            return -1;
        }
        int ret = _data.getValue(_data, 1);
        _data.remove(_data, 1);
        return ret;
    }
}
