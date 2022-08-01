package api.models;

import api.models.post.PersonalInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Envelope<E> {
    private String status;

    private PersonalInfo personalInfo;

}
