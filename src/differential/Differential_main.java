package differential;

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Input Value a > ");
		double a = Double.parseDouble(scan.next());
		System.out.println("Input Value h > ");
		double h = Double.parseDouble(scan.next());
		
		Differential_lib dlib = new Differential_lib(a, h);
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l������"+dlib.getDx());
		System.out.println("�����W���Ɛ��l�����̑��Ό덷��"+((dlib.getRx()-dlib.getDx())*100/dlib.getRx()));
	}
	//h=10^-11�̂Ƃ� ���Ό덷8.274037099909037E-6
}
