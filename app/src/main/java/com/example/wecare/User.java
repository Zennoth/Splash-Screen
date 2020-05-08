package com.example.wecare;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {
    private String name;
    private String gender;
    private String age;
    private String bloodtype;
    private String height;
    private String weight;
    private String complaint;

    public User(String name, String gender, String age, String bloodtype, String height, String weight, String complaint){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.bloodtype = bloodtype;
        this.height = height;
        this.weight = weight;
        this.complaint = complaint;
    }

    protected User(Parcel in) {
        name = in.readString();
        gender = in.readString();
        age = in.readString();
        bloodtype = in.readString();
        height = in.readString();
        weight = in.readString();
        complaint = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getAge() { return age; }
    public String getBloodtype() {
        return bloodtype;
    }
    public String getHeight() {
        return height;
    }
    public String getWeight() {
        return weight;
    }
    public String getComplaint() {
        return complaint;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(gender);
        dest.writeString(age);
        dest.writeString(bloodtype);
        dest.writeString(height);
        dest.writeString(weight);
        dest.writeString(complaint);
    }
}
