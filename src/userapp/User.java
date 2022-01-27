package userapp;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor // User(int id, String username, ....)
@Data // Getter, Setter, toString
public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private String created;
    private String updated;
}
