package com.restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateBooking {
	public static void main(String[] args) {
////		Build Request
//		RequestSpecification requestSpecification = RestAssured.given().log().all();
//		requestSpecification.baseUri("https://restful-booker.herokuapp.com");
//		requestSpecification.basePath("/booking");
//		requestSpecification.body("{\n"
//				+ "    \"firstname\" : \"N\",\n"
//				+ "    \"lastname\" : \"M\",\n"
//				+ "    \"totalprice\" : 11101,\n"
//				+ "    \"depositpaid\" : false,\n"
//				+ "    \"bookingdates\" : {\n"
//				+ "        \"checkin\" : \"2022-11-01\",\n"
//				+ "        \"checkout\" : \"2022-12-01\"\n"
//				+ "    },\n"
//				+ "    \"additionalneeds\" : \"Dinner\"\n"
//				+ "}");
////		requestSpecification.contentType("application/json");
//		requestSpecification.contentType(ContentType.JSON);
//		
////		Hit Request and get response
//		Response response = requestSpecification.post();
//		
////		Validate Response
//		ValidatableResponse validatableResponse = response.then().log().all();
//		validatableResponse.statusCode(200);
		
//		Another way of writing 
//		Build Request
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("/booking")
				.body("{\n"
					+ "    \"firstname\" : \"N\",\n"
					+ "    \"lastname\" : \"M\",\n"
					+ "    \"totalprice\" : 11101,\n"
					+ "    \"depositpaid\" : false,\n"
					+ "    \"bookingdates\" : {\n"
					+ "        \"checkin\" : \"2022-11-01\",\n"
					+ "        \"checkout\" : \"2022-12-01\"\n"
					+ "    },\n"
					+ "    \"additionalneeds\" : \"Dinner\"\n"
					+ "}")
//				.contentType("application/json");
				.contentType(ContentType.JSON)
		
//		Hit Request and get response
			.when()
				.post()
//		Validate Response
			.then()
				.log()
				.all()
				.statusCode(200);
	}

}
