package p0626;

import java.text.SimpleDateFormat;
import java.util.*;

public class Car {
	//serialNo 자동생성
	
	static int count = 0;{
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yy");
		this.serialNo = "S"+sdf.format(d)+String.format("%03d", (count++)+1);
	}
	
	Car(){} //기본생성자
	
	Car(String color,int door) {
		this.color = color;
		this.door = door;
	}
	
	
	String serialNo;
	String color;
	int door;
	


	String getserialNo(){
		return serialNo;
	}

	void setserialNo(String serialNo) {
		this.serialNo = serialNo;
	}
}