package api.models;

import api.models.post.PersonalInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseBody {
    private String status;
    private PersonalInfo personalInfo;
    private Request request;
}
