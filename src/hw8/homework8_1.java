package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class homework8_1 {
	public static void main(String[] args) {
//		Object obj = new Object();
		List<Object> Collection = new ArrayList<>();
		Collection.add(new Integer(100));
		Collection.add(new Double(3.14));
		Collection.add(new Long(21L));
		Collection.add(new Short("100"));
		Collection.add(new Double(5.1));
		Collection.add("Kitty");
		Collection.add(new Integer(100));
		Collection.add(new Object());
		Collection.add("Snoopy");
		Collection.add(new BigInteger("1000"));
		
		
		//傳統for迴圈
		System.out.println("傳統for迴圈:");
		for(int i =0;i<Collection.size();i++) {
			System.out.print(Collection.get(i)+" ");
		}
		System.out.println();
		
		//Iterator迴圈
		System.out.println("Iterator迴圈:");
		for(Iterator it = Collection.iterator(); it.hasNext();) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		//增強型for迴圈
		System.out.println("增強型for迴圈:");
		for(Object obj:Collection) {
			System.out.print(obj +" ");
		}
		System.out.println();
		
		//去除非Number元素
		System.out.println("去除非Number的元素");
		Iterator<Object> it = Collection.iterator();
		while(it.hasNext()) {
			Object ob =it.next();
			if(ob instanceof Number) {
				System.out.print(ob +" ");
			}
		}
	}

}
