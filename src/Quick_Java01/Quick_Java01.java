package Quick_Java01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quick_Java01 {

	public static void main(String[] args) {
		testclass test = new testclass();
		test.test();
		Scanner in = new Scanner(System.in);
		try{
			int n1=in.nextInt(),n2=in.nextInt();
			if(n1>=1e+3 || n2>=1e+3) throw new throw_class("�Է��Ͻ� ���ڰ� 4�ڸ��� �ѽ��ϴ�.");
			System.out.println(n1/n2);
		}catch(ArithmeticException e){
			System.out.println("0���� ���� �� �����ϴ�.");
		}catch(InputMismatchException e){
			System.out.println("���� Ÿ������ �Է����ּ���.");
		}catch (throw_class e) {
			System.out.println(e.str);
		}

	}

}
