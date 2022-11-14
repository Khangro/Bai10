package baiTapTuGiaiChuong1;
import java.time.DayOfWeek;
import java.util.*;
public class nguyenvinhkhang_bai11_tugiaiC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calendar vk=Calendar.getInstance();
    int day =vk.get(Calendar.DAY_OF_MONTH);
    int month=vk.get(Calendar.MONTH);
    int year=vk.get(Calendar.YEAR);
    System.out.print("hôm nay là ngày: "+day+" tháng: "+month +" năm: "+year);
	}

}
