import java.util.concurrent.ConcurrentLinkedQueue;
public class Main extends WaitList<Integer>{
    public static void main(String[] args) {
        BoundedWaitList <Integer> boundedWaitList = new BoundedWaitList<>(4);
        boundedWaitList.add(1);
        boundedWaitList.add(2);
        boundedWaitList.add(3);
        boundedWaitList.add(4);
        boundedWaitList.add(5);
        System.out.println(boundedWaitList);

    }
}