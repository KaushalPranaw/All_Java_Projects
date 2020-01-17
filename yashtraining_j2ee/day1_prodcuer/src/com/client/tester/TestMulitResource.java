package com.client.tester;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import com.yash.pojos.User;

public class TestMulitResource {

	public static void main(String[] args) {
		
		ClientConfig config=new ClientConfig();
		Client client=ClientBuilder.newClient(config);
		Response response1=client.target("http://localhost:8080/day1_prodcuer/rest/service/user")
								.request().accept(MediaType.APPLICATION_XML).get();
		System.out.println(response1.readEntity(User.class));
		
		Response response2=client.target("http://localhost:8080/day1_prodcuer/rest/service/list")
				.request().get();
System.out.println(response2.readEntity(String.class));
		
	}
}
