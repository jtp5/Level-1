
public class Vualt {
int secretCode;
	Vualt(int secretCode){
		this.secretCode= secretCode;
	}
	boolean tryCode(int x){
		if(x == secretCode){
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		Vualt eli = new Vualt(9);
		eli.tryCode(9);
	}
}
