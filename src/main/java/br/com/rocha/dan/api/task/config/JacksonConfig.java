package br.com.rocha.dan.api.task.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonTokenId;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.TimeZone;

@Configuration
public class JacksonConfig {

    @Bean
    @Primary
    public ObjectMapper objectMapper() {
    	
    	ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
		mapper.disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE);
		mapper.setTimeZone(TimeZone.getTimeZone(ZoneId.of("Brazil/East")));
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
		
		mapper.registerModule(new JavaTimeModule());
		mapper.registerModule(new JodaModule());
		
		mapper.registerModule(getLocalDateCustomModule());
        mapper.registerModule(getOffsetDateTimeCustomModule());
        return mapper;
    }
    
    private SimpleModule getOffsetDateTimeCustomModule() {
    	
    	SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(OffsetDateTime.class, new JsonSerializer<OffsetDateTime>() {
            @Override
            public void serialize(OffsetDateTime offsetDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                jsonGenerator.writeString(DateTimeFormatter.ISO_INSTANT.format(offsetDateTime));
            }
        });
        simpleModule.addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
			
        	@Override
			public OffsetDateTime deserialize(JsonParser parser, DeserializationContext context) throws IOException {
				if (parser.hasTokenId(JsonTokenId.ID_STRING)) {
		            String string = parser.getText().trim();
		            if (string.length() == 0) {
		                return null;
		            }
	                if (string.length() > 10 && string.charAt(10) == 'T') {
	                   if (string.endsWith("Z")) {
	                       return OffsetDateTime.ofInstant(Instant.parse(string), ZoneOffset.UTC);
	                   } else {
	                       return OffsetDateTime.parse(string, DateTimeFormatter.ISO_INSTANT);
	                   }
	                }
	                return OffsetDateTime.parse(string, DateTimeFormatter.ISO_INSTANT);
		        }
				throw new DateTimeParseException("Could not deserialize dateTime. Expected string on format defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z", parser.getValueAsString(), 0);
			}

		});
        
        return simpleModule;
    }
    
    private SimpleModule getLocalDateCustomModule() {
    	
    	SimpleModule simpleModule = new SimpleModule();
    	simpleModule.addSerializer(LocalDate.class, new JsonSerializer<LocalDate>() {
			@Override
			public void serialize(LocalDate offsetDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
				jsonGenerator.writeString(DateTimeFormatter.ISO_LOCAL_DATE.format(offsetDateTime));
			}
		});

    	simpleModule.addDeserializer(LocalDate.class, new JsonDeserializer<LocalDate>() {
			@Override
			public LocalDate deserialize(JsonParser parser, DeserializationContext context) throws IOException {
				if (parser.hasTokenId(JsonTokenId.ID_STRING)) {
					String string = parser.getText().trim();
					if (string.length() == 0) {
						return null;
					}
					return LocalDate.parse(string, DateTimeFormatter.ISO_LOCAL_DATE);
				}
				throw new DateTimeParseException("Could not deserialize dateTime. Expected string on format defined by RFC 3339, section 5.6, for example, 2017-07-21T17:32:28Z", parser.getValueAsString(), 0);
			}

		});
		
		return simpleModule;
    }
}