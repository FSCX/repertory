package com.topwise.customalertdialog;

import java.io.Serializable;

/**
 * 1.把自定义的对象通过Intent传出去（一般的Intent对象没法直接传对象）需要把对象序列化
 * 2.在FirstActivity中创建一个实例Person传出去。具体操作
 *  Person mPerson = new Person();
 *  mPerson.setName("Tom");
 *  mPerson.setAge(20);
 *  Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
 *  intent.putExtra("person_data",mPerson);
 *  startActivity(intent);
 * 3.接下来在SecondActivity中接收 Person mPerson = (Person)getIntent().getSerializableExtra("person_data");
 */
public class Person implements Serializable{
    private String mName;
    private int mAge;

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmAge() {
        return mAge;
    }

    public void setmAge(int mAge) {
        this.mAge = mAge;
    }
}
