package de.telran.calendar.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TestController {
//    @GetMapping("/")
    @RequestMapping("/t")
    public List<MyUser> getEvent(){
        List<MyUser> myUsers = new ArrayList<>();
        MyUser myUser1 = new MyUser("Ivanov", "Ivan", 33);
        MyUser myUser2 = new MyUser("Petrov", "Petr", 62);
        MyUser myUser3 = new MyUser("Sidorova", "Marya", 19);
        myUsers.add(myUser1);
        myUsers.add(myUser2);
        myUsers.add(myUser3);
        return myUsers;
    }

    @RequestMapping("/ty/{k}")
    public String getEvent(@PathVariable("k") int someInt){
        return "hello";
    }

    @GetMapping("/g/{val1}/{val2}") // .../g/world
    public String doubleGreet(
            @PathVariable("val1") String value1,
            @PathVariable("val2") int value2) {
        return "Hello " + value1 + " " + value2;
//        return "hello";
    }

//    @RequestMapping("/")
//    public String getEvent(HttpServletRequest rec){
//        return "<h1>Empty!!</h1>" + rec.getParameter("a");
//    }

//        @GetMapping("/")

//    @RequestMapping("/")
//    public String getEvent(@RequestParam(value = "id3", required = false) Integer id,
//                           @RequestParam(value = "ttt") String ttt) {
//        if(id != null){
//            return "<h1>ID =</h1>" + id + " " + ttt;
//        }
//        else return "<h1>ID =</h1>" + ttt;
//    }

//    @GetMapping("/event/{id}")
//    public String getEvent(@PathVariable long id) {
//        return "<h1>HellO!!</h1><br>" + id;
//    }
//
//    @GetMapping("/event/")
//    public String getEvent(@RequestParam(value = "someWord") String someWord) {
//        return "<h1>HellO!!</h1> <br>" + someWord;
//    }

//    @GetMapping("/event")
//    public Object getEvent(@RequestParam LocalDate date){
//        return null;
//    }
//
//    @GetMapping("/event")
//    public List<Object> getEvent(@RequestParam  String name){
//        return null;
//    }

    private class MyUser{
        private String firstName;
        private String lastName;
        private int age;

        public MyUser(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

//        @Override
//        public String toString() {
//            return "firstName=" + firstName + "\n" +
//                    "lastName='" + lastName + "\n" +
//                    "age=" + age +
//                    "\n\n";
//        }
    }

}




