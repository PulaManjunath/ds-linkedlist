/**
 * 
 */
package com.manju.list;

/**
 * @author pulam
 *
 */
public class DLNode<T> {

	private T data;
	private DLNode<T> next;
	private DLNode<T> prev;

	DLNode(T data) {
		this(data, null, null);

	}

	public DLNode(T data, DLNode<T> next, DLNode<T> prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public DLNode<T> getNext() {
		return next;
	}

	public void setNext(DLNode<T> next) {
		this.next = next;
	}

	public DLNode<T> getPrev() {
		return prev;
	}

	public void setPrev(DLNode<T> prev) {
		this.prev = prev;
	}

}
