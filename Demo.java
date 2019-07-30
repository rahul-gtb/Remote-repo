package java_codes_practice;

import java.util.Scanner;

public class Demo {
	
	public static int smallest(int i,int j,int k) {
		int res=-1;
		if(i<j) {
			if(i<k)
				res=i;
			else if(i>k)
				res=k;
		}
		else if(i>j) {
			if(j<k)
				res=j;
			else if(j>k)
				res=k;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int i,j,k,n1,n2,n3,p,count,i1,j1,k1;
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		i=0;
	
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int arr3[]=new int[n3];
		int res[]=new int[50001];
		
		while(i<n1) {
			arr1[i]=sc.nextInt();
			i++;
		}
		i=0;
		while(i<n2) {
			arr2[i]=sc.nextInt();
			i++;
		}
		i=0;
		while(i<n3) {
			arr3[i]=sc.nextInt();
			i++;
		}
		i=0;j=0;k=0;p=0;
		while(true) {
			if(i<n1&&j<n2&&arr1[i]==arr2[j]) {
				res[p]=arr1[i];
				i++;j++;p++;
			}
			if(k<n3&&j<n2&&arr3[k]==arr2[j]) {
				res[p]=arr2[j];
				k++;j++;p++;
			}
			if(i<n1&&k<n3&&arr1[i]==arr3[k]) {
				res[p]=arr1[i];
				i++;k++;p++;
			}
			
			count=0;
			i1=Integer.MAX_VALUE;
			j1=Integer.MAX_VALUE;
			k1=Integer.MAX_VALUE;
			if(i==n1)count++;
			else
				i1=arr1[i];
			if(j==n2)count++;
			else
				j1=arr2[j];
			if(k==n3)count++;
			else
				k1=arr3[k];
			if(count>1)break;
			
			int s=smallest(i1,j1,k1);
			if(s==i1)i++;
			else if(s==j1)j++;
			else if(s==k1)k++;
			
			
		}
		System.out.println(p);
		for(i=0;i<p;i++) {
			System.out.println(res[i]);
		//	System.out.println("hello");
		}
		//System.out.println("hello");
		
	}

}
