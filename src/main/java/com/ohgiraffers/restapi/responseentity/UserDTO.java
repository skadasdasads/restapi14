package com.ohgiraffers.restapi.responseentity;

import java.time.LocalDate;



public class UserDTO {


    private int no;
    private String name;
    private String id;
    private String pwd;

    public UserDTO() {

    }

    public UserDTO(int no, String name, String id, String pwd) {
        this.no = no;
        this.name = name;
        this.id = id;
        this.pwd = pwd;
    }

    public UserDTO(int i, String user01, String pass03, String 너구리, LocalDate now) {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;

    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}

