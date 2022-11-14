package baiTapTuGiaiChuong1;

import java.util.Scanner;

public class nguyenvinhkhang_bai1_TugiaiC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vk=new Scanner(System.in);
		int sum=0;
		for(int i=1;i<=100;i=i+2)
			sum=sum+i;
      System.out.println("tổng các số lẻ từ 1 đến 100 là: "+sum);
	}

}
