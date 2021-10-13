public class Buffer{
    private final int BUFFER_SIZE = 10;
    
    private int[] data;
    private int head;
    private int count; 

    public Buffer(){
        this.data = new int[BUFFER_SIZE];
        this.head = 0;
        this.count = 0;
    }

    public synchronized int get(){
        if(isEmpty()){
            throw new RuntimeException("Buffer underflow!");
        }else{
            int result = data[this.head];
            this.count--;
            this.head = (this.head + 1)%BUFFER_SIZE;
            return result;
        }
    }
    public synchronized void put(int value){
        if(isFull()){
            throw new RuntimeException("Buffer overflow!");
        }else{
            int nextPos = (this.head + this.count)%BUFFER_SIZE;
            this.data[nextPos] = value;
            this.count++;
        }
    }
    public synchronized boolean isEmpty(){
        return (this.count == 0);
    }
    public synchronized boolean isFull(){
        return (this.count == BUFFER_SIZE);
    }
}
