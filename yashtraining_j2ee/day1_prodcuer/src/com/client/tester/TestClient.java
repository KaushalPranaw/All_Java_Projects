package com.client.tester;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import com.yash.pojos.User;

public class TestClient {

	public static void main(String[] args) {
		
		ClientConfig config=new ClientConfig();
		
		Client client=ClientBuilder.newClient(config);
		
		Response response=client.target("http://localhost:8080/day1_prodcuer/rest/service/user")
								.request().accept(MediaType.APPLICATION_XML).get();
		System.out.println(response.readEntity(User.class));
	}
}
