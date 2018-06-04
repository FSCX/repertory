package com.topwise.customalertdialog;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * 1.把自定义的对象通过Intent传出去（一般的Intent对象没法直接传对象）需要把对象序列化
 * 2.在FirstActivity中创建一个实例Person传出去。具体操作
 *  PersonParcelable mPerson = new PersonParcelable();
 *  mPerson.setName("Tom");
 *  mPerson.setAge(20);
 *  Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
 *  intent.putExtra("person_data",mPerson);
 *  startActivity(intent);
 * 3.接下来在SecondActivity中接收 Person mPerson = (Person)getIntent().getParcelableExtra("person_data");
 *
 * 注意：Serializable和Parcelable都能实现对象序列化。相比Serializable，Parcelable效率高一些。所以更推荐使用
 */
public class PersonParcelable implements Parcelable{
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);//写出name
        dest.writeInt(mAge);//写出age

    }
    public static final Parcelable.Creator<PersonParcelable> CREATOR = new Parcelable.Creator<PersonParcelable>(){

        @Override
        public PersonParcelable createFromParcel(Parcel source) {
            PersonParcelable mPersonParcelable = new PersonParcelable();
            mPersonParcelable.mName = source.readString();//读取name
            mPersonParcelable.mAge = source.readInt();//读取age

            return mPersonParcelable;
        }

        @Override
        public PersonParcelable[] newArray(int size) {
            return new PersonParcelable[size];
        }
    };
}
