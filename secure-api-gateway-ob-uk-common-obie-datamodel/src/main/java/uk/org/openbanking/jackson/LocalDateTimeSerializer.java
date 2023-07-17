package uk.org.openbanking.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;

import java.io.IOException;

/**
 * Common serializer to write {@link LocalDate} formatted as "dd/MM/yyyy"
 */
public class LocalDateTimeSerializer extends StdSerializer<LocalDate> {

    public static final String LOCAL_DATE_FORMAT = "dd/MM/yyyy";

    public LocalDateTimeSerializer() {
        this(null);
    }

    public LocalDateTimeSerializer(Class<LocalDate> t) {
        super(t);
    }

    @Override
    public void serialize(LocalDate localDate, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
            throws IOException {
        jsonGenerator.writeObject(DateTimeFormat.forPattern(LOCAL_DATE_FORMAT).print(localDate));
    }
}
