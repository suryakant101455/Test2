/**
 * 
 */
package com.dolare;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * @author suryakant
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		/*try{
			throw new ArithmeticException();
			throw new Exception();
			throw new IOException();
		}catch(ArithmeticException ex){
			ex.printStackTrace();
		}
		catch(Exception e){}
			}*/
		
		
		/*String s1 = "abc";
		String s2 = new String("abc");
		Map <String,String> map = new HashMap<String,String>();
		map.put(s1, "first");
		map.put(s2, "second");
		System.out.println("Size of map is :"+map.size());
		for(Entry entry : map.entrySet())
		{
			System.out.println("key = "+entry.getKey() + " value = "+entry.getValue());
		}*/
		
		
		Map <String,String> map = new HashMap<String,String>();
		map.put(null, "first");
		map.put("abc", "second");
		System.out.println("Size of map is :"+map.size());
		System.out.println("value at 0 is =" + map.get(null));
		
		/*String arr[] = new String[5];
		System.out.println("before insert"+arr.length);
		arr[0]="1";
		arr[1]="0";
		arr[2]="2";
		arr[3]="4";
		arr[4]=null;
		
		System.out.println("after insert"+arr.length);*/
		/*System.out.println('a',"a");*/
		/*byte b=1;
		byte b1=b+1;
		*/
		
		/*String [x] = new String[-3];*/
		/*A a = new A();
		a.m1();
		a.m1("a");*/
		
		// TODO Auto-generated method stub
		/*A a = new A();
		B b = new B();
		Interface i = new A();
		b.m3();
		a.m1();
		b.m1();
		i.m4();
		i.m5();*/
		
		/*Test t = new Test();
		System.out.println(t.perform(null, null));
		System.out.println(t.perform("Abc", null));
		System.out.println(t.perform("pw", "le"));;*/
		
		
		/*A a = new A();
		A.m6();*/
		
		/*System.out.println("Start");
		try{
			System.out.println("A");
			int i=10/0;
		}catch(Exception e){
			System.out.println("B");	
			
		}finally{
			System.out.println("c");
			throw new Exception();
			//System.out.println("c");
		}
//System.out.println("D");
	}*/

	/*public String perform(Object o1, Object o2){
		return "This is object";
	}
	*/
	/*public String perform(String s1, String s2){
		return "This is String"+s1+s2;
	}
	
	public String perform(Integer s1, Integer s2){
		return "This is String"+s1+s2;
	}*/
	
}
}
