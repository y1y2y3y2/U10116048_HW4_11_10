//U10116048 ���T ������ �@�~11.10 Stack Class
import java.util.ArrayList;
public class Stack extends ArrayList{
	//�]���ϥ��~�� �GArrayList�w�q�L��method���ΦA�w�q
	public String getElement(int i){
		String x=get(i).toString();
		return x;
	}
	public void reverseDisplay(){//�ϧǨ��X��
		int x=size();//�j�p-1�����̫���ޭ�		
		//�qArrayList���X����
		for(int i=x-1;i>=0;i--){
			System.out.print(getElement(i)+",");
		}
	}
	/*��@MyStack*/
	public boolean isEmptyStack(){
		//��@isEmpty()
		boolean x = isEmpty();//�Ӧ�java.util.ArrayList
		return x;
	}
	public Object peekStack(){
		//��@peek()		
		return (size()-1);//method�Ӧ�java.util.ArrayList
	}
	public Object pop(){
		Object x=(size()-1);//method�Ӧ�java.util.ArrayList
		remove(size()-1);
		return x;
	}
	public void push(Object x){
		add(x);//method�Ӧ�java.util.ArrayList
	}
			
		
		
	
}
