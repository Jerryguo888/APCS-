import java.util.*;
public class APCS�׸ɳ��X {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		
		int total=0;
		if(arr[0]==0) {
			total=total+arr[1];
		}
		if(arr[a-1]==0) {
			total=total+arr[a-2];
		}
		for(int i=1;i<a-1;i++) {
			
			if(arr[i]==0) {
				if(arr[i-1]>arr[i+1]) {
					total+=arr[i+1];
				}
				else {
					total+=arr[i-1];
				}
			}
			
				
		}
		System.out.println(total);
		
	}

}
