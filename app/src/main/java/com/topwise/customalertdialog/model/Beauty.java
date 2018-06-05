package com.topwise.customalertdialog.model;

public class Beauty {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Beauty{" +
                "姓名='" + name + '\'' +
                ", 年龄='" + age + '\'' +
                '}';
    }
}
