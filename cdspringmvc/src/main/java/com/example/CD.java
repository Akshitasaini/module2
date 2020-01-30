package com.example;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class CD implements Serializable{
	
		
	private static final long serialVersionUID = 1L;
			private String type;
	       private String title;
	       private String year;
	       private LocalDate date;
	       public CD() {
	   		super();
	   	}
		
		public CD(String type, String title, String year, LocalDate date) {
			super();
			this.type = type;
			this.title = title;
			this.year = year;
			this.date = date;
		}

		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public LocalDate getDate() {
			return date;
		}
		public void setDate(LocalDate date) {
			this.date = date;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		public String getYear() {
			return year;
		}

		public void setYear(String year) {
			this.year = year;
		}
	       
}
