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
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”‚Í"+dlib.getRx());
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”’l”÷•ª‚Í"+dlib.getDx());
		System.out.println("”÷•ªŒW”‚Æ”’l”÷•ª‚Ì‘Š‘ÎŒë·‚Í"+((dlib.getRx()-dlib.getDx())*100/dlib.getRx()));
	}
	//h=10^-11‚Ì‚Æ‚« ‘Š‘ÎŒë·8.274037099909037E-6
}
