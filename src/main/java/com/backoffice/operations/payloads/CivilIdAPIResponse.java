package com.backoffice.operations.payloads;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CivilIdAPIResponse {
	
	private boolean success;
    private String message;
    private ResponseData response;

    public CivilIdAPIResponse() {
        // Default constructor for Jackson
    }
    
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public ResponseData getResponse() {
		return response;
	}

	public void setResponse(ResponseData response) {
		this.response = response;
	}

	public static class ResponseData {

		private MyResult result;

		public ResponseData() {
            // Default constructor for Jackson
        }
		
		public MyResult getResult() {
			return result;
		}

		public void setResult(MyResult result) {
			this.result = result;
		}

        // getters and setters
    }

    public static class MyResult {

    	@JsonProperty("customerIO")
    	private CustomerIO customerIO;
    	
    	@JsonProperty("customerFull")
    	private CustomerFull customerFull;
    	
    	public MyResult() {
            // Default constructor for Jackson
        }

		public CustomerIO getCustomerIO() {
			return customerIO;
		}

		public void setCustomerIO(CustomerIO customerIO) {
			this.customerIO = customerIO;
		}

		public CustomerFull getCustomerFull() {
			return customerFull;
		}

		public void setCustomerFull(CustomerFull customerFull) {
			this.customerFull = customerFull;
		}
		
    }

    public static class CustomerFull {

        @JsonProperty("custno")
        private String custNo;

        public CustomerFull() {
            // Default constructor for Jackson
        }

        public String getCustNo() {
            return custNo;
        }

        public void setCustNo(String custNo) {
            this.custNo = custNo;
        }
    }

    
    public static class CustomerIO {
    	public CustomerIO() {
            // Default constructor for Jackson
        }
    }

}
