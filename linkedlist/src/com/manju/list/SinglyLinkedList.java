package com.manju.list;

import java.util.Objects;

public class SinglyLinkedList<T extends Comparable<T>> {

	private SLNode<T> head = null;
	private int size = 0;

	public void insert(T data) {
		if (Objects.isNull(head)) {
			head = new SLNode<T>(data);
			size++;
			return;
		} else {
			SLNode<T> prev = head, tmp = head;
			while (Objects.nonNull(tmp)) {
				prev = tmp;
				tmp = tmp.getNext();
			}
			prev.setNext(new SLNode<T>(data));
			size++;
		}
	}

	public void remove(T data) {
		if (Objects.isNull(head)) {
			return;
		}
		if (Objects.nonNull(head) && head.getData().compareTo(data) == 0) {
			head = head.getNext();
			size--;
		} else {
			SLNode<T> prev = head, tmp = head;
			while (Objects.nonNull(tmp)) {
				if (tmp.getData().compareTo(data) == 0) {
					break;
				}
				prev = tmp;
				tmp = tmp.getNext();
			}
			if (tmp.getData().compareTo(data) == 0) {
				prev.setNext(tmp);
				size--;
			}
		}
	}

	public void print() {
		StringBuffer buf = new StringBuffer("[");
		if (Objects.nonNull(head)) {
			SLNode<T> tmp = head;
			int i = 1;
			while (Objects.nonNull(tmp)) {
				buf.append(tmp.getData());
				if (i < size) {
					buf.append(", ");
				}
				i++;
				tmp = tmp.getNext();
			}
		}
		buf.append("]");
		System.out.println(buf.toString());

	}

}
