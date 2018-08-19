package com.imooc;

import java.util.Iterator;
import java.util.Stack;

public class kaishijisuan {
	Stack<Integer> mediumstack=new Stack<Integer>();
	static int jinwei=0;
	Integer cc=0;
	int[] jieguo;
	cunfangjiashu shuju1=new cunfangjiashu();
	cunfangjiashu shuju2=new cunfangjiashu();
	boolean panduan=true;
public void kaishishuru(){
	System.out.println("请输入第一个数据：");
	shuju1.cunfangjiashu();
	System.out.println("请输入第二个数据：");
	shuju2.cunfangjiashu();	
	//输入完毕，两个数据已经存入堆栈中
	System.out.println();
	//System.out.println("存放完毕，开始输出shuju1存放的数据：");
	
	Iterator<Integer> it=shuju1.stack.iterator();
	 while(it.hasNext()){
		 int object=it.next();
		 System.out.print(object);
	  }
	 System.out.println();
	 //System.out.println("开始输出shuju2存放的数据：");
	
	 Iterator<Integer> itt=shuju2.stack.iterator();
	 while(itt.hasNext()){
		 int object=itt.next();
		 System.out.print(object);
	  }
}
public void kaishijisuan(){
	System.out.println();
	//System.out.println("开始运行kaishisuanfa行函数：");
	int length1=shuju1.stack.size();
	int length2=shuju2.stack.size();
	//System.out.println("shuju1的长度："+length1);
	//System.out.println("shuju2的长度："+length2);
	if(length1==length2)
	{
		while(!shuju1.stack.isEmpty()){
			int aa=shuju1.stack.pop();
			int bb=shuju2.stack.pop();
			Integer cc=aa+bb;
			if(jinwei==1){
				if(cc>=9){
					cc=cc+jinwei;
					 Integer gewei=cc%10;
					 mediumstack.push(gewei);
					 System.out.println();
					// System.out.println("个位为："+gewei);
					 if(shuju2.stack.isEmpty()){
						 mediumstack.push(1);
					 }
				}
				else{
					cc=cc+1;
					mediumstack.push(cc);
					jinwei=0;
				}
			}
			else if(jinwei==0){
				if(cc>=10){
					 Integer gewei=cc%10;
					 jinwei=1;
					 mediumstack.push(gewei);
					 System.out.println();
					// System.out.println("个位为："+gewei);
					 if(shuju2.stack.isEmpty()){
						 mediumstack.push(1);
					 }
				}
				else{
					mediumstack.push(cc);
				}
			}
			}
			//System.out.println("开始遍历输出结果：");
			//System.out.println("长度为："+mediumstack.size());
			for(int a=mediumstack.size();a>0;a--){
				if(mediumstack.isEmpty())
					return;
				System.out.print(mediumstack.pop());
			}	
	}
	else if(length1>length2){
		int length=length1-length2;
		Stack<Integer> shuju22=new Stack<Integer>();
		for(int i=0;i<length;i++){
			shuju22.push(0);
		}
		Stack<Integer> shaoshudeshuju=new Stack<Integer>();
		for(int i=length;i<length1;i++){
			shaoshudeshuju.push(shuju2.stack.pop());	
		}
		for(int i=length;i<length1;i++){
				shuju22.push(shaoshudeshuju.pop());
		}
		//System.out.println("开始输出shuju22的值：");
		Iterator<Integer> it=shuju22.iterator();  
        while(it.hasNext()){  
            Integer object=it.next();  
            System.out.print(object+" ");  
        }  
		//现在shuju2211代替了shuju2,shuju22和shuju2等长，可以开始计算
		while(!shuju1.stack.isEmpty()){
			int aa=shuju1.stack.pop();
			int bb=shuju22.pop();
			Integer cc=aa+bb;
			if(jinwei==1){
				if(cc>=9){
					cc=cc+1;
					 Integer gewei=cc%10;
					 mediumstack.push(gewei);
					 System.out.println();
					// System.out.println("个位为："+gewei);
					 if(shuju1.stack.isEmpty()){
						 mediumstack.push(1);
					 }
				}
				else{
					cc=cc+1;
					mediumstack.push(cc);
					jinwei=0;
				}
			}
			else if(jinwei==0){
				if(cc>=10){
					 Integer gewei=cc%10;
					 jinwei=1;
					 mediumstack.push(gewei);
					 System.out.println();
					// System.out.println("个位为："+gewei);
					 if(shuju1.stack.isEmpty()){
						 mediumstack.push(1);
					 }
				}
				else{
					mediumstack.push(cc);
				}
			}
			}
			//System.out.println("开始遍历输出结果：");
			//System.out.println("长度为："+mediumstack.size());
			for(int a=mediumstack.size();a>0;a--){
				if(mediumstack.isEmpty())
					return;
				System.out.print(mediumstack.pop());
			}		
	}
	else if(length1<length2){
		int length=length2-length1;
		Stack<Integer> shuju11=new Stack<Integer>();
		for(int i=0;i<length;i++){
			shuju11.push(0);
		}
		Stack<Integer> shaoshudeshuju=new Stack<Integer>();
		for(int i=length;i<length2;i++){
			shaoshudeshuju.push(shuju1.stack.pop());	
		}
		for(int i=length;i<length2;i++){
				shuju11.push(shaoshudeshuju.pop());
		}
		
		//现在shuju11代替了shuju1,shuju11和shuju2等长，可以开始计算
		while(!shuju2.stack.isEmpty()){
			int aa=shuju11.pop();
			int bb=shuju2.stack.pop();
			Integer cc=aa+bb;
			if(jinwei==1){
				if(cc>=9){
					cc=cc+1;
					 Integer gewei=cc%10;
					 mediumstack.push(gewei);
					 System.out.println();
					 //System.out.println("个位为："+gewei);
					 if(shuju2.stack.isEmpty()){
						 mediumstack.push(1);
					 }
				}
				else{
					cc=cc+1;
					mediumstack.push(cc);
					jinwei=0;
				}
			}
			else if(jinwei==0){
				if(cc>=10){
					 Integer gewei=cc%10;
					 jinwei=1;
					 mediumstack.push(gewei);
					 System.out.println();
					 //System.out.println("个位为："+gewei);
					 if(shuju2.stack.isEmpty()){
						 mediumstack.push(1);
					 }
				}
				else{
					mediumstack.push(cc);
				}
			}
			}
			//System.out.println("开始遍历输出结果：");
			//System.out.println("长度为："+mediumstack.size());
			for(int a=mediumstack.size();a>0;a--){
				if(mediumstack.isEmpty())
					return;
				System.out.print(mediumstack.pop());
			}	

	}
}

}
