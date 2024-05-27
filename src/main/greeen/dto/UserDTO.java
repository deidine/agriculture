package greeen.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {

    private int id;
    private String fullName;
    private String location;
    private String phone;
    private String username;
    private String password;
    private String userType;
    private String canLoan;

    // Getters and setters...
}
