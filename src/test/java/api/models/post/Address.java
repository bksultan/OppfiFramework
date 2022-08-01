package api.models.post;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String streetAddress;
    private String city;
    private String zip;
    private String countryCode;
}
