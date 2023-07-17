package uk.org.openbanking.jackson;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import java.io.IOException;

/**
 * Common deserializer to parse a json value with format "dd/MM/yyyy" to {@link LocalDate}
 */
public class LocalDateTimeDeserializer  extends StdDeserializer<LocalDate> {

    public static final String LOCAL_DATE_FORMAT = "dd/MM/yyyy";
    public LocalDateTimeDeserializer() {
        this(null);
    }

    public LocalDateTimeDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
            throws IOException {
        String date = jsonParser.getText();
        return LocalDate.parse(date, DateTimeFormat.forPattern(LOCAL_DATE_FORMAT));
    }
}
