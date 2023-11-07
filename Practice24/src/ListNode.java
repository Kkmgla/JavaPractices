public class ListNode {
    private MenuItem value;
    private ListNode next;
    private ListNode perv;

    public ListNode(MenuItem value) {
        this.value = value;
        this.next = null;
        this.perv = null;
    }

    public MenuItem getMenuItem() {
        return value;
    }

    public void setMenuItem(MenuItem value) {
        this.value = value;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPerv() {
        return perv;
    }

    public void setPerv(ListNode perv) {
        this.perv = perv;
    }
}