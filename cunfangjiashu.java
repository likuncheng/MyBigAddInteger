package com.imooc;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;
public class cunfangjiashu {
Stack<Integer> stack=new Stack<Integer>();
public void cunfangjiashu(){
	//System.out.println("�����óɹ�����ʼ�洢��������ݣ�����");
	//System.out.println("�뿪ʼ���룺");
//	Stack s=new Stack();
	Scanner scanner=new Scanner(System.in);
	String result=scanner.next();
 for(int i=0;i<result.length();i++){
	 String t=result.substring(i, i+1);
	 Integer tt=Integer.parseInt(t);
	 stack.push(tt);
 }
 //System.out.println(stack.firstElement());
 System.out.println();
// System.out.println(stack.size());
 Iterator<Integer> it=stack.iterator();
 while(it.hasNext()){
	 int object=it.next();
	 System.out.print(object);
  }
}
}
