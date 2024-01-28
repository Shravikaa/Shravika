package assignment1;

public class Stringproblems {
	public String usecase1(String ip) {
		String[] arr = ip.split("");
		String[] rev=new String[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			rev[j]=arr[i];
			j++;
		}
		String out=String.join("-",rev);
		
//        for (int i = arr.length - 1; i >= 0; i--)
//        	if(arr[i]!='c') {
//            out+=(arr[i]+"-");
//        	}
//        	else {
//        		out+=(arr[i]);
//        	}
        return out;
        }
	public String usecase4(String ip){
		int maxlen=0;
		String out="";
		String arr[]=ip.split(" ");
		for(String i:arr) {
			if(i.length()>maxlen) {
				maxlen=i.length();
				out=i;
			}
			
		}
		return out;
		
	}
	
     public String usecase5(String ip) {
    	 String[] arr=ip.split(" ");
    	 String out="";
    	 for (String i :arr) {
    		 out=out+i.charAt(0);}
    	 return out;
    	 
     }
		//String out="";	
		//String[] arr=input.split("");
		//for(String i:arr) {
			// out=i+out;	
		//}
	    //return(String.join("-", ));
     public String usecase6(String ip) {
    	 String[] arr=ip.split(" ");
    	 String out="";
    	 int j=0;
    	 for (String i :arr) {
    		 out=out+i.charAt(j);
    		 j++;
    		 }
    	 return out;
    	 
     }
     public String usecase2(String ip) {
    	 
    	 StringBuilder xarr=new StringBuilder();
    	 StringBuilder arr=new StringBuilder();
    	 
    	 for(int i=0;i<ip.length();i++) {
    		 if (ip.charAt(i)=='x') {
    			 xarr.append(ip.charAt(i));
    		 }
    		 else {
    			 arr.append(ip.charAt(i));
    		 }
    	 }
    	 String out=arr.toString()+xarr.toString();
    	 
    	 return out;
     }
		
	
	public String usecase3(String input)
	{
		input="Hello world";
		String s=input.replace("d", "H");
		String s2=s.replace("H", "d");
		return s2;
		
		
		
	}

	public static void main(String[] args) {
		
		Stringproblems o=new Stringproblems();
		
		System.out.println(o.usecase1("computer"));
		System.out.println(o.usecase3("Hello world"));
		System.out.println(o.usecase5("Software Service Limited"));
		System.out.println(o.usecase6("Software Service Limited"));
		System.out.println(o.usecase2("abcxXXcxerxxXXwer"));
		System.out.println(o.usecase4("This is java String program"));

	}


	
	

}

