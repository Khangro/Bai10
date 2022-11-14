package baiTapTuGiaiChuong1;
import java.util.*;
public class nguyenvinhkhang_bai10_tugiaiC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String a;
       Scanner vk=new Scanner(System.in);
       System.out.println("Nhập một chuỗi: ");
       a=vk.nextLine();
       char [] b=new char[a.length()];
       for(int i=0;i<a.length();i++)
       {
    	   b[i]=a.charAt(i);
       }
       for (int k=(a.length()-1); k>=0;k--)
       {
    	   System.out.print(a.charAt(k));
       }
        
	}

}
