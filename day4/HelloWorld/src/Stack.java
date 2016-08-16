public class Stack {
    private int[] store;
    private int len;

    public Stack() {
        this.store = new int[10];
        this.len = 0;
    }

    public void push(int a) {
    	this.len++;
    	//System.out.println("push, len="+len+",store.length="+store.length);
    	if (this.len > this.store.length) {
    		int[] store2 = new int[2 * store.length]; 
    		//System.out.println("Expand store to " + store2.length);
    		for (int i=0; i<store.length; i++) {
    			store2[i] = this.store[i];
    		}
    		store = store2;
    	}
		store[len-1] = a;
    	
    	System.out.println("push, store "+store[len-1]);
    	
     }

    public int pop() {
    	System.out.print("pop, ");
    	len--;
    	if (len>=0)
    		return store[len];
    	return -1;
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        for (int i = 0; i < 50; i++) {
            st.push(i);
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(st.pop());
        }
    }
} 