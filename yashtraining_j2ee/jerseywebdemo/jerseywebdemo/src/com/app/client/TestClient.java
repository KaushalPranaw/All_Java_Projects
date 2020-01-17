package com.app.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import com.app.exception.ErrorProps;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
		Response rs1 = client.target("http://localhost:8080/jerseywebdemo/rest/userservice/checkuser/10").request()
				.accept(MediaType.APPLICATION_XML, MediaType.TEXT_HTML).get();
		System.out.println(rs1.readEntity(String.class));

	}

}
