package model.entity;

import model.Enums.*;

import java.time.LocalDateTime;

public class Person {
    private Integer id;
    private Status status;
    private LocalDateTime createDate;
    private LocalDateTime updatedDate;
    private String email;
    private String fullName;
    private int age;
    private Gender gender;
    private FamilyStatus familyStatus;
    private Country country;
    private String about;
    private Zodiac zodiac;

    public Person(Integer id, Status status, LocalDateTime createDate, LocalDateTime updatedDate, String email, String fullName, int age, Gender gender, FamilyStatus familyStatus, Country country, String about, Zodiac zodiac) {
        this.id = id;
        this.status = status;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
        this.email = email;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.familyStatus = familyStatus;
        this.country = country;
        this.about = about;
        this.zodiac = zodiac;
    }

    public Person(Status status, LocalDateTime createDate, LocalDateTime updatedDate, String email, String fullName, int age, Gender gender, FamilyStatus familyStatus, Country country, String about, Zodiac zodiac) {
        this.status = status;
        this.createDate = createDate;
        this.updatedDate = updatedDate;
        this.email = email;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.familyStatus = familyStatus;
        this.country = country;
        this.about = about;
        this.zodiac = zodiac;
    }

    public Person() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public FamilyStatus getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(FamilyStatus familyStatus) {
        this.familyStatus = familyStatus;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Zodiac getZodiac() {
        return zodiac;
    }

    public void setZodiac(Zodiac zodiac) {
        this.zodiac = zodiac;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", status=" + status +
                ", createDate=" + createDate +
                ", updatedDate=" + updatedDate +
                ", email='" + email + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", genser=" + gender +
                ", famalyStatus=" + familyStatus +
                ", country=" + country +
                ", about='" + about + '\'' +
                ", zodiac=" + zodiac +
                '}';
    }
}
