public class StackByListNode {
    private int _top;
    private ListNode _data = new ListNode();

    StackByListNode(){
        _top = 0;
        _data = new ListNode(-1);
    }

    public void push(int data){
        _data.add(_data, new ListNode(data), ++_top);
    }

    public int pop(){
        if(_top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        int ret = _data.getValue(_data, _top);
        _data.remove(_data, _top--);
        return ret;
    }

}
