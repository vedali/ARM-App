package com.example.shiva.try1;

class User {
    String Displayname;
    String Email;
    long createdAt;

    public User (){};
    public User(String displayname,String email,long createdAt){
        this.Displayname=displayname;
       this.Email=email;
        this.createdAt=createdAt;
    }


    public String getDisplayname() {
        return Displayname;
    }

    public String getEmail() {
        return Email;
    }

    public long getCreatedAt() {
        return createdAt;
    }

}
