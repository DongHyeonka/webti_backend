package org.meotppo.webti.domain.config.mongo;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.WritingConverter;
import org.springframework.stereotype.Component;

@Component
@WritingConverter
public class LocalDateTimeToDateKstConverter implements Converter<LocalDateTime, Date> {
    @Override
    public Date convert(LocalDateTime source) {
        return Timestamp.valueOf(source.plusHours(9));
    }
}
