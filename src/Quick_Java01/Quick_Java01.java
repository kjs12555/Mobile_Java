package Quick_Java01;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quick_Java01 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n1=in.nextInt(),n2=in.nextInt();
		try{
			if(n1>=1e+3 || n2>=1e+3) throw new Exception("입력하신 숫자가 4자리를 넘습니다.");
			System.out.println(n1/n2);
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException e){
			System.out.println("정수 타입으로 입력해주세요.");
		}catch(Exception e){
			System.err.println(e);
		}

	}

}
