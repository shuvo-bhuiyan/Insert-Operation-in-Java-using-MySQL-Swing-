/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudOperation;

/**
 *
 * @author Shuvo
 */
public class Person {
    private int id;
    private String name;
    private String email;
    private byte[] picture;

    public Person(int id, String name, String email, byte[] picture) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public byte[] getPicture() {
        return picture;
    }


    
}
