import java.util.*;

public class ListFrontBackCappedList<T> implements FrontBackCappedList<T> {
	
	private List<T> list;
	private int capacity;
	
	public ListFrontBackCappedList(int capacity) {
		list = new ArrayList<T>(capacity);
		this.capacity = capacity;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public boolean isFull() {
		return list.size()>=capacity;
	}
	
	public int size() {
		return list.size();
	}
	
	public void clear() {
		list.clear();
	}
	
	public String toString() {
		return "size=" + list.size() + "; capacity=" + capacity + "; \t" + list.toString();
	}
	
	public boolean addFront(T newEntry) {
		if(!isFull()) {
			list.add(0,newEntry);
		    return true;
		} return false;
	}
	
	public boolean addBack(T newEntry) {
		if(!isFull())
			return list.add(newEntry);
		return false;
	}
	
	public T removeFront() {
		if(!isEmpty())
			return list.remove(0);
		return null;
	}
	
	public T removeBack() {
		if(!isEmpty())
			return list.remove(list.size()-1);
		return null;
	}
	
	private boolean isValidPosition(int position) {
		return position>-1 && position < list.size();
	}
	
	public T getEntry(int givenPosition) {
		if(isValidPosition(givenPosition))
			return list.get(givenPosition);
		return null;
	}
	
	public int indexOf(T anEntry) {
		return list.indexOf(anEntry);
	}
	
	public int lastIndexOf(T anEntry) {
		return list.lastIndexOf(anEntry);
	}
	
	public boolean contains(T anEntry) {
		return list.contains(anEntry);
	}
}

