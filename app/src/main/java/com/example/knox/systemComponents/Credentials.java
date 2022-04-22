package com.example.knox.systemComponents;

public class Credentials {
    private String uName;
    private String passwd;
    private String url;

    public Credentials(){ }

    /****
     * Pre-Condition: the password MUST be AES encrypted before the object is created.
     * @param name - username for credential pair
     * @param pass - ENCRYPTED password for credential pair
     * @param URL - URL for webpage associated with credentials
     */
    public Credentials(String name, String pass, String URL){
        uName = name;
        passwd = pass;
        url = URL;
    }

    public String getUName() {return uName;}
    public String getPasswd(){return passwd;}

    public void setuName(String name){uName = name;}
    public void setPasswd(String pass){passwd = pass;}
}
