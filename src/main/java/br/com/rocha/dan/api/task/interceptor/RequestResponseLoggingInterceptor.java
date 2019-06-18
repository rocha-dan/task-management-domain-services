//package br.com.rocha.dan.api.springboot.interceptor;
//
//import org.owasp.esapi.ESAPI;
//import org.owasp.esapi.Logger;
//import org.springframework.http.HttpRequest;
//import org.springframework.http.client.ClientHttpRequestExecution;
//import org.springframework.http.client.ClientHttpRequestInterceptor;
//import org.springframework.http.client.ClientHttpResponse;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StreamUtils;
//
//import java.io.IOException;
//import java.nio.charset.Charset;
//
//import static org.owasp.esapi.Logger.EVENT_UNSPECIFIED;
//
//@Component
//public class RequestResponseLoggingInterceptor implements ClientHttpRequestInterceptor {
//
//	private final Logger log = ESAPI.getLogger(getClass());
//
//    @Override
//    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException {
//        logRequest(request, body);
//        ClientHttpResponse response = execution.execute(request, body);
//        logResponse(response);
//        return response;
//    }
//
//    private void logRequest(HttpRequest request, byte[] body) throws IOException {
//
//            log.info(EVENT_UNSPECIFIED, "URI         : " + request.getURI());
//
//
//    }
//
//    private void logResponse(ClientHttpResponse response) throws IOException {
//
//            log.info(EVENT_UNSPECIFIED, "Response body: " + StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
//
//    }
//}
