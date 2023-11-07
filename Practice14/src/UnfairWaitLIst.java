import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Нечестный список ожидания.
 *
 * @param <E> Тип элементов в списке ожидания.
 */
class UnfairWaitList<E> extends WaitList<E> {
    /**
     * Создает новый нечестный список ожидания.
     */
    public UnfairWaitList() {
        concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
    };

    /**
     * Удаляет первое вхождение указанного элемента из списка ожидания.
     *
     * @param element Элемент, который нужно удалить.
     */
    public void remove(E element) {
        concurrentLinkedQueue.remove();
    };

    /**
     * Удаляет переданный элемент и добавляет его в конец
     *
     * @param element Элемент, который нужно удалить и добавить в конец
     */
    public void moveToBack(E element) {
        if (concurrentLinkedQueue.remove(element)) {
            concurrentLinkedQueue.offer(element);
        }
    }
}