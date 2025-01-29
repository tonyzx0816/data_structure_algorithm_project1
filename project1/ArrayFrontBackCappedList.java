
public class ArrayFrontBackCappedList<T> implements FrontBackCappedList<T> {
	
	private T[] list;
	private int numberOfElements;
	
	public ArrayFrontBackCappedList(int capacity){
		list = (T[]) new Object[capacity];
		numberOfElements = 0;
	}
	
	public String toString() {
		String s = "[";
		if(!isEmpty()) {
			s += list[0];
			for(int i =1; i<numberOfElements; i++) {
				s += ", " + list[i];
			}
		}
		s += "]";
		return "size=" + numberOfElements + "; capacity=" + list.length + "; \t" + s;
	}
	
	public boolean isEmpty() {
		return numberOfElements == 0;
	}
	
	public boolean isFull() {
		return numberOfElements >= list.length;
	}
	
	public int size() {
		return numberOfElements;
	}
	
	public T getEntry(int position) {
		if(isValidPosition(position))
			return list[position];
		return null;
	}
	
	public void clear() {
		for(int i=0; i<numberOfElements; i++) {
			list[i] = null;
		}
		numberOfElements = 0;
	}
	
	private boolean isValidPosition(int position) {
		return position > -1 && position < numberOfElements;
	}
	
	public boolean addFront(T newEntry) {
		if(!isFull()) {
			if(isEmpty()) {
				list[0] = newEntry;
				numberOfElements++;
				return true;
			} else {
				moveBack();
				list[0] = newEntry;
				return true;
			}
		} return false; 
	}
	
	private void moveBack() {
		for(int i=lastPosition(); i>=0; i--) {
			list[i+1] = list[i];
		}
		numberOfElements++;
	}
	
	public boolean addBack(T newEntry) {
		if(!isFull()) {
			list[numberOfElements] = newEntry;
			numberOfElements++;
			return true;
		} return false; 
	}
	
	public T removeFront() {
		if(!isEmpty()) {
			T obj = list[0];
			moveUp();
			return obj;
		} return null; 
	}
	
	private void moveUp() {
		for(int i=0; i < lastPosition(); i++) {
			list[i] = list[i+1];
		}
		numberOfElements--;
	}
	
	private int lastPosition() {
		return numberOfElements-1;
	}
	
	public T removeBack() {
		if(!isEmpty()) {
			T obj = list[lastPosition()];
			list[lastPosition()] = null;
			numberOfElements--;
			return obj;
		} return null;
	}
	
	public int indexOf(T anEntry) {
		int index = -1;
		for(int i=0; i<numberOfElements; i++) {
			if(list[i].equals(anEntry)) {
				index = i;
				return index;
			}
		} return index;
	}
	
	public int lastIndexOf(T anEntry) {
		int index = -1;
		for(int i=0; i<numberOfElements; i++) {
			if(list[i].equals(anEntry))
				index = i;
		} return index;
	}
	
	public boolean contains(T anEntry) {
		for(int i=0; i<numberOfElements; i++) {
			if(list[i].equals(anEntry))
				return true;
		} return false;
	}
}
