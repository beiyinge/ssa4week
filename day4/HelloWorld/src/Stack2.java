public class Stack2<T> {
    private Object[] store;
    private int len;

    public Stack2() {
        this.store = new Object[10];
        this.len = 0;
    }

    public void push(T a) {
    	this.len++;
    	//System.out.println("push, len="+len+",store.length="+store.length);
    	if (this.len > this.store.length) {
    		Object[] store2 = new Object[2 * store.length]; 
    		//System.out.println("Expand store to " + store2.length);
    		for (int i=0; i<store.length; i++) {
    			store2[i] = this.store[i];
    		}
    		store = store2;
    	}
		store[len-1] = a;
    	
    	System.out.println("push, store "+store[len-1]);
    	
     }

    public T pop() {
    	System.out.print("pop, ");
    	len--;
    	if (len>=0)
    		return (T)store[len];
    	return (T)new Integer(0);
    }

    public static void main(String[] args) {
        Stack2<String> st = new Stack2<String>();
        for (int i = 0; i < 50; i++) {
            st.push(new Integer(i).toString());
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(st.pop());
        }
    }
} 