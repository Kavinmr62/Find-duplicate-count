import java.util.*;
public class duplicatecount
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a = new int[50];
		int[] frq = new int[a.length];
		int i,j;
		
		for(i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++){
		    int num=a[i];
		    int count=1;
		    for(j=i+1;j<n;j++){
		        if(num==a[j]){
		           count++;
		           frq[j]=-1;
		        }		    
		    }
		 if(frq[i]!=-1){
		     frq[i]=count;
		 }
		}
		int dupcount=0;
		for(i=0;i<frq.length;i++){
		    if(frq[i]>1){
		        dupcount++;
		       
		    }
		}
		System.out.println(dupcount);
	}
}
