package org.example;

public class Memberdetails {
    String membername;
    String memberaddress;
    int id;

    Memberdetails(String membername, String memberaddress, int id) {
        this.memberaddress = memberaddress;
        this.id = id;
    }

    public int hashCode() {
        return this.id;
    }
}
