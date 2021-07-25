package learningJava;

public class Char {
 public static void main(String[] args) {
	char myChar='d';
	char myUnicodeChar= '\u00A9';
	System.out.println("character 'd'=" +myChar);
	System.out.println("character 'myUnicodeChar'=" +myUnicodeChar);
	String s= "My String";
	System.out.println("My equals string is " + s +" appended string" );
	
	double dub1= 20.00d, dub2= 80.00d ;
	double mul= (dub1 + dub2)*100.00d;
	double rem= mul % 40.00d;
	System.out.println("First Double Variable= "+dub1+"\nSecond Double Variable= "+dub2+
			"\nAdding two number and multiply with 100= "+mul+"\nRemainder on modulas by 40 = "+rem);
	boolean bool;
	if (rem== 0){
	bool = true;
	}
	else 
	bool= false;
	System.out.println("Boolean Variable is " + bool);
	if(rem!= 0)
		System.out.println("Got Some Remainder");
	
}
}
