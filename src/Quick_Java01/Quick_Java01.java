package Quick_Java01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quick_Java01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1=in.nextInt(),n2=in.nextInt();
		try{
			if(n1>=1e+3 || n2>=1e+3) throw new Exception("�Է��Ͻ� ���ڰ� 4�ڸ��� �ѽ��ϴ�.");
			System.out.println(n1/n2);
		}catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(InputMismatchException e){
			System.out.println("���� Ÿ������ �Է����ּ���.");
		}catch(Exception e){
			System.err.println(e);
		}

	}

}
