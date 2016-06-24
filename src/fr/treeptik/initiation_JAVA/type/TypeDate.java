package fr.treeptik.initiation_JAVA.type;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TypeDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(dateFormat.format(date));
		
		//Gérer une erreur eventuelle
		
		Date date2 = null;
		try {
			date2 = dateFormat.parse("27/03/1981");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(date2);
		
		//Callendar
		Calendar cal = Calendar.getInstance();
		cal.setTime(date2);
		cal.add(Calendar.DAY_OF_MONTH, 55);
		System.out.println(date2 = cal.getTime());
		
	}

}
