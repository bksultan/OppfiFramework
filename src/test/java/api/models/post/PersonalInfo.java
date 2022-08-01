package api.models.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonalInfo {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private Address address;
    private String mobilePhone;
    private String homePhone;
}
