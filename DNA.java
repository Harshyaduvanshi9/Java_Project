//DNA Sequencing
public class DNA {
	 
	  public static void main(String[] args) {
	 
	    //  -. .-.   .-. .-.   .
	    //    \   \ /   \   \ / 
	    //   / \   \   / \   \  
	    //  ~   `-~ `-`   `-~ `-
		  
		  String dna1 = "ATGCGATACGCTTGA";
		  String dna2 = "ATGCGATACGTGA";
		  String dna3 = "ATTAATATGTACTGA";
		  String dna = dna3;
		  int len = dna.length();
		  System.out.println("Length: " + len);
		  int s = dna.indexOf("ATG");
		  System.out.println("Start: " + s);
		  int e=dna.indexOf("TGA");
		  System.out.println("END : " + e);
		  if (s != -1 && e != -1 && (s - e) % 3 == 0) {
			  
			  
			  System.out.println("Condition 1 and 2  and 3 are satisfied.");
			  String protein=dna.substring(s,e+3);
			  System.out.println("protein is "+protein);
			  
			 
			}
		  else {
			  
			    System.out.println("No protein.");
			 
			}

		  
	  }
	 
	}