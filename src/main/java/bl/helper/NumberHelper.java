package bl.helper;

public class NumberHelper {
	
	public Float round(float number){
		return (float)Math.round((number * 100) / 100.0);
	}
}
