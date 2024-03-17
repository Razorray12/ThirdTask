package com.example.firsttask;

import android.os.Parcel;
import android.os.Parcelable;


public class Data implements Parcelable {

    private final String name;
    private final int age;
    private String email;
    private String password;
    public Data(String name, int age,String email,String password) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    protected Data(Parcel in) {
        name = in.readString();
        age = in.readInt();
        email = in.readString();
        password = in.readString();
    }

    public static final Creator<Data> CREATOR = new Creator<Data>() {
        @Override
        public Data createFromParcel(Parcel in) {
            return new Data(in);
        }

        @Override
        public Data[] newArray(int size) {
            return new Data[size];
        }
    };

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
        dest.writeString(email);
        dest.writeString(password);
    }
}
