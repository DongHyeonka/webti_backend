package org.meotppo.webti.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "success")
@JsonSubTypes({
        @JsonSubTypes.Type(value = SuccessResponseBody.class, name = "true"),
        @JsonSubTypes.Type(value = FailedResponseBody.class, name = "false")
})
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public sealed abstract class ResponseBody<T> permits SuccessResponseBody, FailedResponseBody {
    private String code;
}
