package baiTapTuGiaiChuong1;
import java.util.*;
public class nguyenvinhkhang_bai6_tugiaiC1 {
 public static double can(int a) {
	 return Math.sqrt(a);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0;
        for(int i=1;i<=100;i++)
        {
         sum=sum+can(i);
        }
	System.out.println("kết quả tổng căn 1 đến căn 100 là: "+sum);
	}
	

}
