package data;

import lombok.var;

public class SQLRequest {
    public static AuthCode getCode() {
        var authCode = "SELECT code FROM auth_codes";
        return new AuthCode(authCode);
    }
}
