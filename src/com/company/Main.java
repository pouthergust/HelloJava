package com.company;

import java.util.Date;
import java.time.*;

public class Main {

    public static void main(String[] args) {
    	ZoneId defaultZoneId = ZoneId.systemDefault();
    	LocalDate localDate = LocalDate.of(2021,5,10);
    	Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
	    Paciente paciente = new Paciente("Juan","Perez","12345", date);

	    try {
	    	paciente.darAlta(paciente.dataAlta);
	    } catch (Exception e) {
	    	System.out.println("Malz ae " + e.getMessage());
	    } finally {
	    	System.out.println("Aoba");
	    }
    }
}
