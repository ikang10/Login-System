import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("World", "java");
        logininfo.put("123", "PASSWORD");
        logininfo.put("java", "123");
    }

    protected HashMap getLoginInfo(){

        return logininfo;
    }
}
