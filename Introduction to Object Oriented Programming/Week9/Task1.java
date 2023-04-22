import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		GenericStack2<String> stack3 = new GenericStack2<>();
        
        while (true) {
        	System.out.print("Enter the five String: ");
        	String word = reader.nextLine();
        	
        	if (word.isEmpty()) {
        		break;
        	} else {
        		stack3.push(word);
        	}
        }
        System.out.println();
        int size = stack3.getSize();
        System.out.println("The strings in reverse order are: ");
    	for (int i = 0; i < size; i++) {
    		System.out.print(stack3.pop() + " ");
    	}
	}
}

class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<>();
	private int size = 0;
	
	public int getSize() {
		return this.size;
	}
	
	public E peek() {
		return list.get(getSize() - 1);
	}
	
	public void push(E o) {
		list.add(o);
	}
	
	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}

class GenericStack2<E> extends ArrayList<E> {
	
	public int getSize() {
		return super.size();
	}
	
	public E peak() {
		return super.get(getSize() - 1);
	}
	
	public void push(E o) {
		super.add(o);
	}

	public E pop() {
		E o = super.get(getSize() - 1);
		super.remove(super.get(getSize() - 1));
		return o;
	}
	
	public boolean isEmpty() {
        return super.isEmpty();
    }
}
