package src;

public class DynamicArray implements DataStructure{
	Node[] array;
	int SIZE = 10;
	
	public DynamicArray(){
		array = new Node[SIZE];
	}
	
	public Node get(int i) {
		if (i < SIZE){
			return array[i];
		}
		else{
			return null;
		}
	}

	public int search(Node n) {
		for (int i = 0; i < SIZE; i++){
			if (array[i] == n){
				return i;
			}
		}
		return -1;
	}

	public boolean insert(Node n, int i) {
		if (array[i] == null && i < SIZE){
			array[i] = n;
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public void insert(Node n){
		for (int i = 0; i < SIZE; i++){
			if (array[i] == null){
				array[i] = n;
			}
		}
		
		resize();
		array[SIZE/2] = n;
	}

	public boolean remove(Node n, int i) {
		if (array[i] == n){
			array[i] = null;
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public boolean remove(Node n){
		for (int i = 0; i < SIZE; i++){
			if (array[i] == n){
				array[i] = null;
				return true;
			}
		}
		
		return false;
	}
	
	public void resize(){
		Node[] newArray = new Node[SIZE*2];
		
		for (int i = 0; i < SIZE; i++){
			newArray[i] = array[i];
		}
		
		array = newArray;
		SIZE *= 2;
	}
	
}
