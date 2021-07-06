package com.ibrafdj.springmongodbapi;
import java.util.List;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private int age;
    private List<Interest> interest;


    public User() {
    }

    public User(String id, String first_name, String last_name, String email, int age, List<Interest> interest) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.age = age;
        this.interest = interest;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Interest> getInterest() {
        return this.interest;
    }

    public void setInterest(List<Interest> interest) {
        this.interest = interest;
    }

    public User id(String id) {
        setId(id);
        return this;
    }

    public User first_name(String first_name) {
        setFirst_name(first_name);
        return this;
    }

    public User last_name(String last_name) {
        setLast_name(last_name);
        return this;
    }

    public User email(String email) {
        setEmail(email);
        return this;
    }

    public User age(int age) {
        setAge(age);
        return this;
    }

    public User interest(List<Interest> interest) {
        setInterest(interest);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(first_name, user.first_name) && Objects.equals(last_name, user.last_name) && Objects.equals(email, user.email) && age == user.age && Objects.equals(interest, user.interest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, email, age, interest);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", first_name='" + getFirst_name() + "'" +
            ", last_name='" + getLast_name() + "'" +
            ", email='" + getEmail() + "'" +
            ", age='" + getAge() + "'" +
            ", interest='" + getInterest() + "'" +
            "}";
    }
}