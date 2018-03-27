package trabalhoMD;

public class Conectivos {

	public boolean and(boolean p, boolean q) {
		boolean result;
		if(p == true && q == true) result = true;
		else result = false;
		return result;
	}
	
	public boolean or(boolean p, boolean q) {
		boolean result;
		if(p == true || q == true) result = true;
		else result = false;
		return result;
	}
	
	public boolean exclusiveOr(boolean p, boolean q) {
		boolean result;
		if(p == q)result = false;
		else result = true;
		return result;
	}
	
	public boolean negative(boolean p) {
		boolean result;
		if(p == true) result = false;
		else result = true;
		return result;
	}
	
	public boolean ifThen(boolean p, boolean q) {
		boolean result;
		if(p == true && q == false) result = false;
		else result = true;
		return result;
	}
	
	public boolean equivalence(boolean p, boolean q) {
		boolean result;
		if(p == q) result = true;
		else result = false;
		return result;
	}
	
}
