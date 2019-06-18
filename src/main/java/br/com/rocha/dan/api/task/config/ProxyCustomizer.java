//package br.com.rocha.dan.api.springboot.config;
//
//import br.com.rocha.dan.api.springboot.interceptor.RequestResponseLoggingInterceptor;
//import org.apache.http.HttpException;
//import org.apache.http.HttpHost;
//import org.apache.http.HttpRequest;
//import org.apache.http.client.HttpClient;
//import org.apache.http.impl.client.HttpClientBuilder;
//import org.apache.http.impl.conn.DefaultProxyRoutePlanner;
//import org.apache.http.protocol.HttpContext;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.web.client.RestTemplateBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.http.client.BufferingClientHttpRequestFactory;
//import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
//import org.springframework.http.client.SimpleClientHttpRequestFactory;
//import org.springframework.web.client.RestTemplate;
//
//import static java.util.Collections.singletonList;
//
//@Configuration
//public class ProxyCustomizer {
//
//	@Value("${environment.name}")
//    private String environmentName;
//
//    @Bean
//    @Primary
//    public RestTemplate restTemplate(RestTemplateBuilder builder) {
//
//    	RestTemplate restTemplate = builder.build();
//
//    	if ("ST".equals(environmentName) || "LO".equals(environmentName) ) {
//    			restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(new SimpleClientHttpRequestFactory()));
//    			restTemplate.setInterceptors(singletonList(new RequestResponseLoggingInterceptor()));
//    	}
//
//    	if("LO".equals(environmentName)) {
//
//    		HttpHost proxy = new HttpHost("spobrproxy.serasa.intranet",3128);
//            HttpClient httpClient = HttpClientBuilder.create().setRoutePlanner(new DefaultProxyRoutePlanner(proxy) {
//
//            	@Override
//                public HttpHost determineProxy(HttpHost target, HttpRequest request, HttpContext context) throws HttpException {
//
//            		if (target.getHostName().equals("stg-br-api.experian.com")) {
//                        return super.determineProxy(target, request, context);
//                    }
//                    return null;
//                }
//            }).build();
//
//            restTemplate.setRequestFactory(new BufferingClientHttpRequestFactory(new HttpComponentsClientHttpRequestFactory(httpClient)));
//    	}
//
//    	return restTemplate;
//    }
//
//}