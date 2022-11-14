package baiTapTuGiaiChuong1;

import java.util.*;

public class nguyenvinhkhang_bai2_tugiaiC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
       Scanner vk=new Scanner(System.in);
       System.out.println("nhập số phần tử của mảng: ");
       n=vk.nextInt();
		int [] a= new int[n];
		int i=0;
		for(;i<n;i++)
		{
			a[i]=vk.nextInt();
		}
		int k=0;
		for(;k<n;k++)
		{
			int max=a[k];
			for(int q=k;q<n;q++)
			{
				if (max<=a[q]) 
				{
					int b=max;
					max=a[q];
					a[q]=b;
				}
			}
		  System.out.println(max+" ");
		}
       }
}
