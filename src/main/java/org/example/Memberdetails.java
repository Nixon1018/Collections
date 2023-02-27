package org.example;

public class Memberdetails {
    String membername;
    String memberaddress;
    int id;

    Memberdetails(String membername, String memberaddress, int id) {
        this.memberaddress = memberaddress;
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
