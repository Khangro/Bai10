package baiTapTuGiaiChuong1;
import java.util.*;
public class nguyenvinhkhang_bai7_tugiaiC1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub; 
	      String a;
	      char kytu;
	      int sum=0,dem=0,space=0;
	      
          Scanner vk=new Scanner(System.in);
          System.out.println("nhập chuỗi:");
          a=vk.nextLine();
          
          char [] b=new char [a.length()];
          for(int i=0;i<a.length();i++)
          {
        	  kytu=a.charAt(i);
        	  b[i]=kytu;
          
          }
          for(int k=0;k<b.length;k++)
          {
        	  if(b[k]=='J' && b[k+1]=='a' && b[k+2]=='v' && b[k+3]=='a')
        		  sum=sum+1;
        	  
          }
          System.out.println("chuỗi vừa nhập có: "+sum+" từ Java.");
          System.out.println("---------------------------------------------");
// câu b 
          for(int q=0;q<b.length;q++)
          {
        	  if(b[q]=='J' && b[q+1]=='a' && b[q+2]=='v' && b[q+3]=='a')
        		  dem=dem+1;
        	  if(b[q]==' ') 
        		  space=space+1;
        	  if(dem==sum) {
        		  
        		  System.out.println("ký tự Java cuối cùng là từ thứ: "+(space+1));
        	  break;
        	  }
        	  }
          System.out.println("--------------------------------------------------------");
// c) thay thế Java thành java
         
          System.out.println("chuỗi vừa mới đc thay đổi là: "+a.replace("Java", "java"));
          System.out.println("------------------------------------------------------");
//d) số lượng ký tự có trong chuỗi
          System.out.println("số lượng ký tự có trong chuối là: "+a.length());
          
	}

}
