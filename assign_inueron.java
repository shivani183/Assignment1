package first;

public class assign_inueron {

	public static void main(String[] args) {
		
		int n=13;
		for (int j = 0; j<n; j++) {
			
			for(int i = 0; i<n; i++) {
  			    
				if (i==(n-1)/2 || j==0 && i>n/4 && i<3*(n-1)/4 || j==(n-1) && i>n/4 && i<3*(n-1)/4)		
				    System.out.print("*");
				else
					System.out.print(" ");}
			
			for(int i = 0; i<n; i++) {
  			    
				if (i==0 || i==(n-1) || i==j)		
				    System.out.print("*");
				else
					System.out.print(" ");}
			
			for(int i = 0; i<n; i++) {
  			    
				if (i==n/4 && j<(n-1) || i==(n-1) && j<(n-1)|| j==(n-1) && i>n/4 && i<(n-1))		
				    System.out.print("*");
				else
					System.out.print(" ");}
			
			for(int i = 0; i<n; i++) {
  			    
				if (i==n/4 && j>0 && j<(n-1) || j==(n-1)/2 && i>n/4 || j==0 && i>n/4  || j==(n-1) && i>n/4)		
				    System.out.print("*");
				else
					System.out.print(" ");}
			
			for(int i = 0; i<n; i++) {
  			    
				if(i==n/4 && j>0 || j==0 && i>n/4 && i<(n-1) || i==(n-1) && j>0 && j<(n-1)/2 || 
						j==(n-1)/2 && i>n/4 && i<(n-1) || i-j==0 && j>(n-1)/2 && i>(n-1)/2)
		
				    System.out.print("*");
				else
					System.out.print(" ");}
			
			for(int i = 0; i<n; i++) {
  			    
				if (i==n/4 && j>0 && j<(n-1) || i==(n-1) && j>0 && j<(n-1) || j==0 && i>n/4 && i<(n-1)  || j==(n-1) && i>n/4 && i<(n-1))		
				    System.out.print("*");
				else
					System.out.print(" ");}
			
			for(int i= 0; i<n; i++) {
				
				if (i==(n-1)/4 || i==(n-1) || i==j && i>(n-1)/4 )
				    System.out.print("*");
				else
					System.out.print(" ");}
			
			
			
			System.out.println();}
						
	}

}
