package	is.ru.StringCalculator;

public class StringCalculator {
	public static int Add(String numbers) {
	        if(numbers.isEmpty())
	        	return 0;
	       	else {
	       		if(numbers.contains(",")){
	       			String tiles[] = numbers.split(",");
	       			return sum(tiles);
	       		}
	       	}
	       	return 1;
	    }

	    private static int toInt(String numbers){
	       		return Integer.parseInt(numbers);
		}

		private static int sum(String [] tiles){
			int total = 0;
			for(String numbers : tiles){
				total +=toInt(numbers);
			}
			return total;
		}
}