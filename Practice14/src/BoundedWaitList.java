import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Список ожидания с ограниченной емкостью.
 *
 * @param <E> Тип элементов в списке ожидания.
 */
class BoundedWaitList<E> extends WaitList<E> {
    /**
     * Емкость списка ожидания.
     */
    private int capacity;

    /**
     * Создает новый список ожидания с ограниченной емкостью.
     *
     * @param capacity Максимальная емкость списка ожидания.
     */
    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
    }

    /**
     * Получает текущую емкость списка ожидания.
     *
     * @return Текущая емкость списка ожидания.
     */
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if (concurrentLinkedQueue.size() < capacity) {
            super.add(element);
        }
    }
    @Override
    public String toString() {
        return concurrentLinkedQueue.toString();
    }
}