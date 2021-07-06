package com.ibrafdj.springmongodbapi;

import java.util.Objects;

public class Interest {

    private String name;
    private String priority;

    public Interest() {
    }

    public Interest(String name, String priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return this.priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Interest name(String name) {
        setName(name);
        return this;
    }

    public Interest priority(String priority) {
        setPriority(priority);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Interest)) {
            return false;
        }
        Interest interest = (Interest) o;
        return Objects.equals(name, interest.name) && Objects.equals(priority, interest.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, priority);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", priority='" + getPriority() + "'" +
            "}";
    }
}