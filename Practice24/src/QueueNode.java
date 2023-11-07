public class QueueNode {
    private QueueNode next;
    private QueueNode prev;
    private Order value;
    public QueueNode(Order value){
        this.value = value;
        this.next = null;
        this.prev = null;
    };
}