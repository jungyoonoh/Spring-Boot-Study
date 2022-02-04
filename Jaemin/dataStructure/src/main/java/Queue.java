public class Queue {
    private int head, tail;
    private int _data[] = new int[1000];

    Queue(){
        head = 0; tail= 0;
    }

    public void push(int data){
        _data[tail++] = data;
    }

    public int pop(){
        if(head >= tail) return -1;
        return _data[head++];
    }
}
