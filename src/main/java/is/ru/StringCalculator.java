package	is.ru.StringCalculator;

public class StringCalculator {
	public static int Add(String numbers) {
	        if(numbers.isEmpty()){
	        	return 0;
	       	}
	       	else if(numbers.contains(",")){
	       		String[] tiles = numbers.split(",");
	       		return Integer.parseInt(tiles[0]) + Integer.parseInt(tiles[1]);
	       	}
	       	else {
	       		return Integer.parseInt(numbers);
	       	}
	}
}