package br.com.rocha.dan.api.task.repository.impl;

import org.owasp.esapi.ESAPI;
import org.owasp.esapi.Logger;

public abstract class AbstractRestRepository {

	private final Logger logger = ESAPI.getLogger(getClass());
	
//	@Autowired
//	protected SecurityService securityService;
//
//	@Autowired
//	protected RestTemplate restTemplate;
//
//	protected HttpHeaders getHeaders(final String authorization) {
//
//        if (isBlank(authorization)) {
//            logger.error(EVENT_FAILURE, "Invalid Authorization");
//            throw new UnauthorizedException("Invalid Authorization");
//        }
//
//        HttpHeaders headers = getHeaders();
//        headers.set(AUTHORIZATION, authorization);
//
//        return headers;
//    }
//
//	protected HttpHeaders getAuthorizationHeader() {
//		return getHeaders(securityService.getAuthentication().getAuthorizationHeader());
//    }
//
//    protected HttpHeaders getHeaders() {
//
//        HttpHeaders headers = new HttpHeaders();
//        headers.set(CONTENT_TYPE, APPLICATION_JSON_UTF8_VALUE);
//
//        return headers;
//    }
//
//    protected Optional<RuntimeException> getHttpStatusCodeException(HttpStatus status) {
//        return getHttpStatusCodeException(status, singleError(status));
//    }
//
//    protected Optional<RuntimeException> getHttpStatusCodeException(HttpStatus status, Map<HttpStatus, String> messageMap) {
//        String message = nonNull(messageMap) && messageMap.containsKey(status) ? messageMap.get(status) : singleError(status);
//        return getHttpStatusCodeException(status, message);
//    }
//
//    protected Optional<RuntimeException> getHttpStatusCodeException(HttpClientErrorException e){
//    	return getHttpStatusCodeException(e.getStatusCode(), e.getResponseBodyAsString());
//    }
//
//    private Optional<RuntimeException> getHttpStatusCodeException(HttpStatus status, String message) {
//
//    	logger.error(EVENT_FAILURE, String.format("Status code response %s: %s", status, message));
//
//    	switch (status) {
////    	case BAD_REQUEST:
////    		return Optional.of(new InvalidParametersException(message));
////    	case UNAUTHORIZED:
////    		return Optional.of(new UnauthorizedException(message));
////    	case FORBIDDEN:
////    		return Optional.of(new ForbiddenException(message));
////    	case NOT_FOUND:
////    		return Optional.of(new ContentNotFoundException());
////    	case CONFLICT:
////    		return Optional.of(new ConflictException(message));
////    	case PRECONDITION_FAILED:
////    		return Optional.of(new PreconditionException(message));
////    	case UNPROCESSABLE_ENTITY:
////    		return Optional.of(new UnprocessableEntityException(message));
//    	default:
//    		return Optional.empty();
//    	}
//    }
//
//    protected Logger getLogger() {
//        return logger;
//    }
    
}
