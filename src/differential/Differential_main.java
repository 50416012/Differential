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
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
		System.out.println("f(x)=x^2のx="+a+"における数値微分は"+dlib.getDx());
		System.out.println("微分係数と数値微分の相対誤差は"+((dlib.getRx()-dlib.getDx())*100/dlib.getRx()));
	}
	//h=10^-11のとき 相対誤差8.274037099909037E-6
}
