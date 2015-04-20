//U10116048 資科三 楊明璋 作業11.10 Stack Class
import java.util.ArrayList;
public class Stack extends ArrayList{
	//因為使用繼承 故ArrayList定義過的method不用再定義
	public String getElement(int i){
		String x=get(i).toString();
		return x;
	}
	public void reverseDisplay(){//反序取出值
		int x=size();//大小-1極為最後索引值		
		//從ArrayList取出項目
		for(int i=x-1;i>=0;i--){
			System.out.print(getElement(i)+",");
		}
	}
	/*實作MyStack*/
	public boolean isEmptyStack(){
		//實作isEmpty()
		boolean x = isEmpty();//來自java.util.ArrayList
		return x;
	}
	public Object peekStack(){
		//實作peek()		
		return (size()-1);//method來自java.util.ArrayList
	}
	public Object pop(){
		Object x=(size()-1);//method來自java.util.ArrayList
		remove(size()-1);
		return x;
	}
	public void push(Object x){
		add(x);//method來自java.util.ArrayList
	}
			
		
		
	
}
