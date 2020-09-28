

class Program4 {
                                                
	public static void main(String[] args) {
		
		String str1 = "SWARUP,A,2,324.5";
		String str2 = "SONIA,C,23,522.05";
        	int noOfToken = 1;

        	for(int i = 0; i < str1.length(); i++) {

			if(str1.charAt(i) == ',')
			noOfToken++;
	        }

        	System.out.println("\nnoOfToken : "+noOfToken); 
    
        	for(int i = 0; i < str1.length(); i++) {
            
			if(str1.charAt(i) != ',') {

	                 	System.out.print(str1.charAt(i));

            		} else {

            			System.out.println();
        		}
		                     
        	}

	        noOfToken = 1;

		int i = 0;
        	while(i < str1.length()) {

			if(str1.charAt(i) == ',')
			noOfToken++;
			i++;        
        	}
		System.out.println();
        	System.out.println("\nnoOfToken : "+noOfToken);

        	int j = 0;     
        	while(j < str2.length()) {
            
            		if(str2.charAt(j) != ',') {

                 		System.out.print(str2.charAt(j));
	            	} else {

		            System.out.println();
        		}
        		j++;		                     
        	}
		System.out.println();
	}
}
