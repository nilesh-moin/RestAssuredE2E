package com.restfulBooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetBooking {

	public static void main(String[] args) {
////		Build request
//		RequestSpecification requestSpecification = RestAssured.given().log().all();
//		requestSpecification.baseUri("https://restful-booker.herokuapp.com");
//		requestSpecification.basePath("/booking/{id}");
//		requestSpecification.pathParam("id", 10);
//		
////		Hit request and get response
//		Response response = requestSpecification.get();
//		
////		Validate response
//		ValidatableResponse validatableResponse = response.then().log().all();
//		validatableResponse.statusCode(200);
		
//		Build request
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("/booking/{id}")
				.pathParam("id", 10)
		
//		Hit request and get response
			.when()
				.get()
		
//		Validate response
			.then()
				.log()
				.all()
				.statusCode(200);

	}

}
