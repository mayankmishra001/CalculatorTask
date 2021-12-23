package com.testing;

public class Calculator {

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else{
			String numList[] = text.split(",");
			return sum(numList);
		}
	}

	private static int sum(String[] numbers){
 	    int total = 0;
 	    String negString = "";

        for(String number : numbers){
        	if(Integer.parseInt(number) < 0){
        		if(negString.equals(""))
        			negString = number;
        		else
        			negString += ("," + number);
        	}
        	if(Integer.parseInt(number) < 1000)
		    	total += Integer.parseInt(number);
		}

		if(!negString.equals("")){
			throw new IllegalArgumentException("Negatives values not allowed: " + negString);
		}

		return total;
    }

	
	public static void main(String[] args) {
	int i =Calculator.add("2,4,5,4,5,5,3");
	
	System.out.println(i);
	}
}
