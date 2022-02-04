public class Stack {
    private int _top;
    private int[] _data = new int[1000];

    public Stack(){
        _top = 0;
        _data[0] = -1;
    }

    public void push(int data){
        _data[++_top] = data;
    }

    public int pop(){
        if(_top == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return _data[_top--];
    }

}
