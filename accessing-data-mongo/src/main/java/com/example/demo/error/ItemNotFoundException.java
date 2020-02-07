package com.example.demo.error;
@SuppressWarnings("serial")


	public class ItemNotFoundException extends RuntimeException {
		
		private String message;

		public ItemNotFoundException(String message) {
			super();
			this.message = message;
		}

		public String getMessage() {
			return message;
		}
		
		

	}

