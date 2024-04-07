package org.example;

import java.util.List;

class User {
    private String name;
    private Number age;

    public void setAge(Number age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Number getAge() {
        return age;
    }
}


public class ListExample {
    public void main(String[] args) {
        List<User> users = this.userGenerator();

        for (User user : users) {
            System.out.println("Name: " + user.getName() + " Age: " + user.getAge());
        }
    }

    public List<User> userGenerator() {
        User userOne = new User();
        userOne.setAge(23);
        userOne.setName("Özgür");

        User userTwo = new User();
        userTwo.setAge(24);
        userTwo.setName("");

        return List.of(userOne, userTwo);
    }
}
