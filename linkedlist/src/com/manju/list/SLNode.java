/**
 * 
 */
package com.manju.list;

/**
 * @author pulam
 *
 */
public class SLNode<T> {

	private T data;
	private SLNode<T> next;

	SLNode(T data) {
		this(data, null);

	}

	public SLNode(T data, SLNode<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public SLNode<T> getNext() {
		return next;
	}

	public void setNext(SLNode<T> next) {
		this.next = next;
	}

}
