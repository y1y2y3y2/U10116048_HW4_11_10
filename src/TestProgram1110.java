//U10116048 資科三 楊明璋 作業11.10 TestProgram
import java.util.Scanner;
public class TestProgram1110 {

	public static void main(String[] args) {
		String str=" ";//用來存放輸入字串
		Stack a = new Stack();
		Scanner keyin =new Scanner(System.in);
		//使用者輸入
		for(int i=1;i<=5;i++){//輸入5次
			System.out.print("第"+i+"次輸入 請輸入1個字串");
			System.out.print(" --->");
			str=keyin.next();
			a.add(str);//加入ArrayList
		}
		
		//以反序印出存放資料
		System.out.println("本程式以反序印出資料:");
		a.reverseDisplay();
		
	}
	
}
