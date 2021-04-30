package ru.vsu.cs;

import java.util.Iterator;

public class SimpleLinkedList<T extends Comparable<T>> implements Iterable<T> {

    private static class ListNode<T> {
        public T value;
        public ListNode<T> next;

        public ListNode(T value, ListNode<T> next) {
            this.value = value;
            this.next = next;
        }
        public ListNode(T value) {
            this(value, null);
        }
        public ListNode() {
            this(null);
        }
    }

    private ListNode<T> head = null;
    private ListNode<T> tail = null;

    private int count = 0;

    public void addFirst(T value) {
        head = new ListNode<>(value, head);
        if (count == 0) {
            tail = head;
        }
        count++;
    }

    public void addLast(T value) {
        ListNode<T> newNode = new ListNode<>(value);
        if (count > 0) {
            tail.next = newNode;
        } else {
            head = newNode;
        }
        tail = newNode;
        count++;
    }

    private void emptyError() throws Exception {
        if (count == 0) {
            throw new Exception("List is empty");
        }
    }

    public T getFirst() throws Exception {
        emptyError();
        return head.value;
    }

    public T getLast() throws Exception {
        emptyError();
        return tail.value;
    }

    private ListNode<T> getNode(int index) throws Exception {
        if (index < 0 || index >= count) {
            throw new Exception("Wrong index");
        }
        ListNode<T> curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        return curr;
    }

    public T get(int index) throws Exception {
        return getNode(index).value;
    }

    public void removeFirst() throws Exception {
        emptyError();
        head = head.next;
        count--;
        if (count == 0) {
            tail = null;
        }
    }

    public void removeLast() throws Exception {
        emptyError();
        count--;
        if (count == 0) {
            head = tail = null;
        } else {
            tail = getNode(count - 1);
            tail.next = null;
        }
    }

    public void clear() {
        head = tail = null;
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public int getQuantityOfMax() throws Exception {
        if (count == 0) {
            return 0;
        }
        if (count == 1) {
            return 1;
        }
        int maxQuantity = 0;
        ListNode<T> current = head.next;
        ListNode<T> next = current.next;
        ListNode<T> prev = head;

        if (prev.value.compareTo(current.value) > 0) {
            maxQuantity++;
        }
        for (int i = 1; i < count - 1; i++) {
            if ((prev.value.compareTo(current.value) < 0) && (current.value.compareTo(next.value) > 0)) {
                maxQuantity++;
            }
            current = current.next;
            next = next.next;
            prev = prev.next;
        }
        if (current.value.compareTo(prev.value) > 0) {
            maxQuantity++;
        }
        return maxQuantity;
    }

    public int getQuantityOfMin() throws Exception {
        if (count == 0) {
            return 0;
        }
        if (count == 1) {
            return 1;
        }
        int minQuantity = 0;
        ListNode<T> current = head.next;
        ListNode<T> next = current.next;
        ListNode<T> prev = head;

        if (prev.value.compareTo(current.value) < 0) {
            minQuantity++;
        }
        for (int i = 1; i < count - 1; i++) {
            if ((prev.value.compareTo(current.value) > 0) && (current.value.compareTo(next.value) < 0)) {
                minQuantity++;
            }
            current = current.next;
            next = next.next;
            prev = prev.next;
        }
        if (current.value.compareTo(prev.value) < 0) {
            minQuantity++;
        }
        return minQuantity;
    }



        @Override
    public Iterator<T> iterator() {
        class LinkedListIterator implements Iterator<T> {
            ListNode<T> curr;

            public LinkedListIterator(ListNode<T> head) {
                curr = head;
            }

            @Override
            public boolean hasNext() {
                return curr != null;
            }

            @Override
            public T next() {
                T result = curr.value;
                curr = curr.next;
                return result;
            }
        }

        return new LinkedListIterator(head);
    }
}
