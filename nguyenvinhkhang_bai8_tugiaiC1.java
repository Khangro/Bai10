package baiTapTuGiaiChuong1;
import java.util.*;
public class nguyenvinhkhang_bai8_tugiaiC1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao 1 chuoi :");
        String s=sc.nextLine();
        s.toCharArray();
        int b = 0;
        int c = 0;
        for(int i  = 0;i<s.length();i++) {
        	if(((s.charAt(i)>='0' && s.charAt(i)<='9')||(s.charAt(i)=='+')||(s.charAt(i)=='-'))&& (s.charAt(0)!='-' && s.charAt(0)!='0' )) 
        	{
        		b++;
        	}
        	else {
        		c++;
        	}
        }
        if(b!=0 && c==0) {
        	System.out.println("la chuoi so nguyen");
        }
        else {
        	System.out.println("ko la chuoi so nguyen");
        }
        
	}
}
