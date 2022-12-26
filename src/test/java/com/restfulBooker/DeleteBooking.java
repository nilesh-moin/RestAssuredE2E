package com.restfulBooker;

import io.restassured.RestAssured;

public class DeleteBooking {

	public static void main(String[] args) {
//		Build Request
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("/booking/{id}")
				.pathParam("id", 245)
				.header("Content-Type", "application/json")
				.header("Authorization", "Basic " + "YWRtaW46cGFzc3dvcmQxMjM=")
				
//		Hit Request and get response
			.when()
				.delete()
		
//		Validate Response
			.then()
				.log()
				.all()
				.assertThat()
				.statusCode(201);


	}

}
