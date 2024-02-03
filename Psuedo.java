package random;

public class Psuedo {
	public static int search(int x,int[] a) {
		int i=0;
		int n=a.length;
		while(i<n && a[i]!=x) {
			i++;
		}
		if(i<n) {
			return i+1;
		}
		else {
			return -1;
		}
	}
	public static int ww(int x) {
		int v=2,u=4;
		do {
			v=u*2;
		}while(v>x);
		if(u>4) {
			return u+2;
		}
		else{
			return v+=3;
		}
	}
	public static int sumeven() {
		int sum=0;
		int count=1;
		while(count<20) {
			if(count%2==0) {
				sum+=count;
				count+=1;
			}
			else {
				count+=1;
			}
		}
		return sum;
	}
	public static void myFunction(int p) {
		int a[]= {17,4,10};
		int b[]= {2,15,20};
		int diff=1000,res1=0,res2=0,i=0,j=0,minimum=0,maximum=0;
		while (i < p && j<p) {
			minimum = Math.min(a[i], b[j]);
			maximum = Math.max(a[i], b[j]);
			if (maximum-minimum<diff) {
				res1 = i;
				res2 = j;
			}
			diff = maximum-minimum;
			if (diff == 0) {
				break;
			}
			if(a[i]==minimum) i++;
			else j++;
		}
		System.out.println(a[res1]+" "+b[res2]);
	}
	public static int pvalue() {
		int x=4,a=3,p=0;
		while(x<6) {
			x=a+2;
			a=a+1;
		}
		a=x-1;
		do{
			if(x<a) {
				a=x+a;
				x=a+2;
			}
			else {
				x=x-a;
				a=a+1;
				x=a+2;
			}
		}while(x==8);
		 return p=x+a;	
	}

	public static void main(String[] args) {
		int a[]= {11,22,33,44,55};
		System.out.println(search(55,a));
		System.out.println(ww(10));
		System.out.println(sumeven());
		myFunction(3);
		System.out.println(pvalue());
	}

}
