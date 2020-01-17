package com.yash.tester;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

public class TestClient {
	public static void main(String[] args) {
		ClientConfig config=new ClientConfig();
		Client client=ClientBuilder.newClient(config);
		Response response=client.target("").request().accept(MediaType.APPLICATION_JSON).get();
		System.out.println(response.readEntity(String.class));
	}
}
