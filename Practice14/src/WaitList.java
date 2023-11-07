import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * Общий класс для списка ожидания.
 *
 * @param <E> Тип элементов в списке ожидания.
 */
public class WaitList<E> implements IWaitList<E> {
    /**
     * Список для хранения элементов ожидания.
     */
    protected ConcurrentLinkedQueue<E> concurrentLinkedQueue;

    /**
     * Создает новый список ожидания.
     */
    public WaitList() {
        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
    }

    /**
     * Создает новый список ожидания с заданными элементами.
     *
     * @param elements Коллекция элементов для инициализации списка ожидания.
     */
    public WaitList(Collection<E> elements) {
        concurrentLinkedQueue = new ConcurrentLinkedQueue<>(elements);
    }

    @Override
    public void add(E element) {
        concurrentLinkedQueue.offer(element);
    }

    @Override
    public E remove() {
        return concurrentLinkedQueue.poll();
    }

    @Override
    public boolean contains(E element) {
        return concurrentLinkedQueue.contains(element);
    }

    @Override
    public boolean containsAll(Collection<E> elements) {
        return concurrentLinkedQueue.containsAll(elements);
    }

    @Override
    public boolean isEmpty() {
        return concurrentLinkedQueue.isEmpty();
    }

    @Override
    public String toString() {
        return concurrentLinkedQueue.toString();
    }
}