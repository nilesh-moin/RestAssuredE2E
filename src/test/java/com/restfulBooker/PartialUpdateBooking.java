package com.restfulBooker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PartialUpdateBooking {
	public static void main(String[] args) {
////	Build Request
//	RequestSpecification requestSpecification = RestAssured.given().log().all();
//	requestSpecification.baseUri("https://restful-booker.herokuapp.com");
//	requestSpecification.basePath("/booking/{id}");
//	requestSpecification.pathParam("id", 1);
//	requestSpecification.body("{\n"
//			+ "    \"firstname\" : \"N123\",\n"
//			+ "    \"lastname\" : \"M123\"\n"
//			+ "}");
////	requestSpecification.contentType("application/json");
////	requestSpecification.contentType(ContentType.JSON);
//	requestSpecification.header("Content-Type", "application/json");
//	requestSpecification.header("Authorization", "Basic " + "YWRtaW46cGFzc3dvcmQxMjM=");
//	
//	
////	Hit Request and get response
//	Response response = requestSpecification.patch();
//	
////	Validate Response
//	ValidatableResponse validatableResponse = response.then().log().all();
//	validatableResponse.statusCode(200);
	
//	Another way of writing 
//		Build Request
		RestAssured
			.given()
				.log()
				.all()
				.baseUri("https://restful-booker.herokuapp.com")
				.basePath("/booking/{id}")
				.pathParam("id", 1)
				.body("{\n"
					+ "    \"firstname\" : \"N123\",\n"
					+ "    \"lastname\" : \"M123\"\n"
					+ "}")
//				.contentType("application/json");
//				.contentType(ContentType.JSON);
				.header("Content-Type", "application/json")
				.header("Authorization", "Basic " + "YWRtaW46cGFzc3dvcmQxMjM=")
		
		
//		Hit Request and get response
			.when()
				.patch()
		
//		Validate Response
			.then()
				.log()
				.all()
				.assertThat()
				.statusCode(200);

	}

}
