//U10116048 ���T ������ �@�~11.10 TestProgram
import java.util.Scanner;
public class TestProgram1110 {

	public static void main(String[] args) {
		String str=" ";//�ΨӦs���J�r��
		Stack a = new Stack();
		Scanner keyin =new Scanner(System.in);
		//�ϥΪ̿�J
		for(int i=1;i<=5;i++){//��J5��
			System.out.print("��"+i+"����J �п�J1�Ӧr��");
			System.out.print(" --->");
			str=keyin.next();
			a.add(str);//�[�JArrayList
		}
		
		//�H�ϧǦL�X�s����
		System.out.println("���{���H�ϧǦL�X���:");
		a.reverseDisplay();
		
	}
	
}
