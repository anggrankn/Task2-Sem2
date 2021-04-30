package ru.vsu.cs;

import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void test1GetQuantityOfMaxAndMin() throws Exception {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.addLast(10);
        list.addLast(12);
        list.addLast(11);
        list.addLast(12);
        list.addLast(10);
        list.addLast(15);
        int resultOfLocalMax = list.getQuantityOfMax();
        int resultOfLocalMin = list.getQuantityOfMin();
        int quantityOfMax = 3;
        int quantityOfMin = 3;
        Assert.assertEquals(quantityOfMax, resultOfLocalMax);
        Assert.assertEquals(quantityOfMin, resultOfLocalMin);
    }

    @Test
    public void test2GetQuantityOfMaxAndMin() throws Exception {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        list.addLast(2);
        int resultOfLocalMax = list.getQuantityOfMax();
        int resultOfLocalMin = list.getQuantityOfMin();
        int quantityOfMax = 0;
        int quantityOfMin = 0;
        Assert.assertEquals(quantityOfMax, resultOfLocalMax);
        Assert.assertEquals(quantityOfMin, resultOfLocalMin);
    }

    @Test
    public void test3GetQuantityOfMaxAndMin() throws Exception {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.addLast(5);
        list.addLast(12);
        list.addLast(1);
        list.addLast(12);
        list.addLast(1);
        list.addLast(19);
        int resultOfLocalMax = list.getQuantityOfMax();
        int resultOfLocalMin = list.getQuantityOfMin();
        int quantityOfMax = 3;
        int quantityOfMin = 3;
        Assert.assertEquals(quantityOfMax, resultOfLocalMax);
        Assert.assertEquals(quantityOfMin, resultOfLocalMin);
    }

    @Test
    public void test4GetQuantityOfMaxAndMin() throws Exception {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.addLast(10);
        list.addLast(12);
        list.addLast(11);
        list.addLast(12);
        list.addLast(10);
        list.addLast(1);
        int resultOfLocalMax = list.getQuantityOfMax();
        int resultOfLocalMin = list.getQuantityOfMin();
        int quantityOfMax = 2;
        int quantityOfMin = 3;
        Assert.assertEquals(quantityOfMax, resultOfLocalMax);
        Assert.assertEquals(quantityOfMin, resultOfLocalMin);
    }

    @Test
    public void test5GetQuantityOfMaxAndMin() throws Exception {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.addLast(100);
        list.addLast(99);
        list.addLast(98);
        list.addLast(97);
        list.addLast(96);
        list.addLast(95);
        int resultOfLocalMax = list.getQuantityOfMax();
        int resultOfLocalMin = list.getQuantityOfMin();
        int quantityOfMax = 1;
        int quantityOfMin = 1;
        Assert.assertEquals(quantityOfMax, resultOfLocalMax);
        Assert.assertEquals(quantityOfMin, resultOfLocalMin);
    }

    @Test
    public void test6GetQuantityOfMaxAndMin() throws Exception {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        int resultOfLocalMax = list.getQuantityOfMax();
        int resultOfLocalMin = list.getQuantityOfMin();
        int quantityOfMax = 1;
        int quantityOfMin = 1;
        Assert.assertEquals(quantityOfMax, resultOfLocalMax);
        Assert.assertEquals(quantityOfMin, resultOfLocalMin);
    }
}
