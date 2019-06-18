package br.com.rocha.dan.api.task.enums.application;

import java.net.URI;
import java.net.URISyntaxException;
import java.text.MessageFormat;

public enum Endpoint {

	SHOWCASE_VALIDATE("/showcases/{0}/products/search"),
	SHOWCASE_THIRD_PARTY_PRODUCTS_SEARCH("/third-party-showcases/{0}/products/search");

	private String path;
	
	Endpoint(String path){
		this.path = path;
	}
	
	public URI getURI(String baseURI, Object... params) throws URISyntaxException {
		return new URI(baseURI + MessageFormat.format(path, params));
	}
}
