package lk.tech.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

//    ==========================================================================
//    USE @Autowired for field injection & setter injection
//    Constructor injection has it by default
//    Field injection is NOT RECOMMENDED
//    ==========================================================================

    @Autowired
    @Qualifier("laptop")  //name of the bean but with the first letter simple //Use Qualifier if @Primary is not used on top of a bean
    private Computer comp;

    //@Autowired //field injection
//    private Laptop laptop;


    //constructor injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }


    //setter injection
//    @Autowired
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build(){

        comp.compile();
        System.out.println("Working on an Awesome project");
    }
}
