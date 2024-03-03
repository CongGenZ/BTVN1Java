package com.tn;

public class Student {
    public  String FullName;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.setFullName("nguyen van cong");
        System.out.println(st1.getFullName());
    }
}
