package com.restfulBooker;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateBookingTest {

	public static void main(String[] args) {
////	Build Request
//	RequestSpecification requestSpecification = RestAssured.given().log().all();
//	requestSpecification.baseUri("https://restful-booker.herokuapp.com");
//	requestSpecification.basePath("/booking/{id}");
//	requestSpecification.pathParam("id", 1);
//	requestSpecification.body("{\n"
//			+ "    \"firstname\" : \"N1\",\n"
//			+ "    \"lastname\" : \"M1\",\n"
//			+ "    \"totalprice\" : 111011,\n"
//			+ "    \"depositpaid\" : false,\n"
//			+ "    \"bookingdates\" : {\n"
//			+ "        \"checkin\" : \"2022-10-01\",\n"
//			+ "        \"checkout\" : \"2022-11-01\"\n"
//			+ "    },\n"
//			+ "    \"additionalneeds\" : \"Lunch\"\n"
//			+ "}");
////	requestSpecification.contentType("application/json");
////	requestSpecification.contentType(ContentType.JSON);
//	requestSpecification.header("Content-Type", "application/json");
//	requestSpecification.header("Authorization", "Basic " + "YWRtaW46cGFzc3dvcmQxMjM=");
//	
//	
////	Hit Request and get response
//	Response response = requestSpecification.put();
//	
////	Validate Response
//	ValidatableResponse validatableResponse = response.then().log().all();
//	validatableResponse.statusCode(200);
	
//	Another way of writing 
//	Build Request
	RestAssured
		.given()
			.log()
			.all()
			.baseUri("https://restful-booker.herokuapp.com")
			.basePath("/booking/{id}")
			.pathParam("id", 1)
			.body("{\n"
			+ "    \"firstname\" : \"N1\",\n"
			+ "    \"lastname\" : \"M1\",\n"
			+ "    \"totalprice\" : 111011,\n"
			+ "    \"depositpaid\" : false,\n"
			+ "    \"bookingdates\" : {\n"
			+ "        \"checkin\" : \"2022-10-01\",\n"
			+ "        \"checkout\" : \"2022-11-01\"\n"
			+ "    },\n"
			+ "    \"additionalneeds\" : \"Lunch\"\n"
			+ "}")
//			.contentType("application/json");
//			.contentType(ContentType.JSON);
			.header("Content-Type", "application/json")
			.header("Authorization", "Basic " + "YWRtaW46cGFzc3dvcmQxMjM=")
	
	
//	Hit Request and get response
		.when()
			.put()
	
//	Validate Response
		.then()
			.log()
			.all()
			.assertThat()
			.statusCode(200);
}

}
