import java.util.Random;

public class JamesBond {
int findCode(Vualt x){
	for (int i = 0; i < 1000000; i++) {
		if(x.tryCode(i) == true){
			System.out.println(i);
			return i;
		}
	}
	System.out.println("garbage");
	return 0;
}
public static void main(String[] args) {
	Random r = new Random();
	JamesBond eli2 = new JamesBond();
	Vualt eli = new Vualt(r.nextInt(1000000));
	eli2.findCode(eli);
}
}
