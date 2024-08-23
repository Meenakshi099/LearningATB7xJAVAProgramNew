package ex_04082024.aug04class.mutlipleInheritance;

public class chilld1 extends mother {
    void c() {
//        home(); // child cannot get from both becox both have same function name
//        money();// and JVM will get confused to use which one
    }
}