/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Eva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person("Eva Bilal", LocalDate.of(2000, Month.NOVEMBER, 14));
        
        System.out.println(person.getName() + " " + person.getAye());
    }
    
}
