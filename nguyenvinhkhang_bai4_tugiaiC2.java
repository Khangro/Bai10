package baiTapTuGiaiChuong1;
import java.util.*;
public class nguyenvinhkhang_bai4_tugiaiC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vk=new Scanner(System.in);
	       int n;
	       System.out.println("nhập số phần tử cho mảng: ");
	       n=vk.nextInt();
	       int [] a=new int[n];
	       System.out.println("nhập giá trị cho phần tử của mảng: ");
	       for(int i=0;i<n;i++)
	       {
	    	   a[i]=vk.nextInt();
	       }
	       int min =a[0];
	       for(int k=0;k<n;k++)
	       {
	    	   if(min>=a[k])
	    		   min=a[k];
	       }
	       System.out.println("giá trị nhỏ nhất của mảng các số nguyên là: "+min);
		  for(int q=0;q<n;q++)
		  {
			 if(a[q]==min)
				 System.out.println("phần tử chứa giá trị nhỏ nhất là phần tử: a[5"+q+"]");
		  }
	}

}
