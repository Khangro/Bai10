package baiTapTuGiaiChuong1;
import java.util.*;

public class nguyenvinhkhang_bai5_tugiaiC1 {
public static int max(int a,int b, int c) {
	int max=a;
	if(max<=b)
		max=b;
	if(max<=c) max=c;
	return max;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
      Scanner vk=new Scanner(System.in);
      System.out.println(" nhập a: ");
      a=vk.nextInt();
      System.out.println(" nhập b: ");
      b=vk.nextInt();
      System.out.println(" nhập c: ");
      c=vk.nextInt();
         int kq= max(a,b,c);
        System.out.println("số lớn nhất trong 3 số là: "+kq);
	}

}
