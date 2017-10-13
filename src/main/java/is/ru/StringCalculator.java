package	is.ru.StringCalculator;

public class StringCalculator {
	public static int Add(String numbers) {
	        if(numbers.isEmpty())
	        	return 0;
	       	else {
	       		if(numbers.contains(",")){
	       			numbers = ignoreNewLine(numbers);
	       			String tiles[] = numbers.split(",");
	       			String noOfNeg = "";
	       			for(String block : tiles){
	       				if(toInt(block) < 0){
	       					noOfNeg +=block + " ";
	       				}
	       			}

	       			if(!noOfNeg.equals("")){
	       				throw new IllegalArgumentException("Negatives not allowed: " + noOfNeg);
	       			}

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
				if (toInt(numbers) > 1000){
					continue;
				}
				else{
					total +=toInt(numbers);
				}
			}
			return total;
		}

		private static String ignoreNewLine(String numbers){
			numbers = numbers.replaceAll("\n", ",");
			return numbers;
		}
}