package singleton;


import java.util.concurrent.CountDownLatch;

public class SingletonMain {

    public static CountDownLatch cdl = new CountDownLatch(100);

    public static void main(String[] args) {
        Singleton singleton1 = Singleton.SingletonFactory.getInstance();
        Singleton singleton2 = Singleton.SingletonFactory.getInstance();
        if (singleton1.equals(singleton2)){
            System.out.println("same");
        }else{
            System.out.println("different");
        }

        Person person = new Person();
        System.out.println(person.name+person.age+person.phone);

        Student student = new Student();
        System.out.println(student.name+student.age+student.phone);
    }

}