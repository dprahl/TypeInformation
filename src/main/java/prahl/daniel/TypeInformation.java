package prahl.daniel;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danielprahl on 5/4/17.
 */
public class TypeInformation {


    public boolean classImplementsInterface(Class<?> clazz, String interfaceName) {
        Class<?>[] classes = clazz.getInterfaces();
        for (Class<?> e: classes) {
            if( interfaceName.equalsIgnoreCase(e.getSimpleName()) ) {return true;}
        }
        return false;

    }

    /*
    listAllMembers() - Take an object and list all declared members (Fields, Constructors,
     and Methods) of its class, as well as those of each superclass, all the way to Object.
    This method should return a string containing each declared member listed on a separate
    line as follows: The member name, preceded with the name of the declaring class, and
    any modifiers (static, private etc.) Within each class, members should be listed in the
     order: Fields, Constructors, Methods   Each group of members (fields, constructors,
     or methods) should be listed alphabetically
    The first line should start with the members declared by the given object type; the last line should be the last method defined by Object
    */
    // UNFINISHED
    public String listAllMembers(Object obj){
        StringBuilder str = new StringBuilder();

        return new String("");
    }

    public void getClassHierarchy(Object obj) {
        ArrayList<Class> classes = new ArrayList<>();
        Class currentClass = obj.getClass();
        classes.add(currentClass);
        while (currentClass.getSuperclass() != null) {
            currentClass = currentClass.getSuperclass();
            classes.add(currentClass);
        }
        int indents = 0;
        for (int i = classes.size(); i > 0; i--) {
            for (int j = 0; j < indents; j++) {
                System.out.print("  ");
            }
            System.out.println(classes.get(i - 1).getName());
            indents++;
        }
    }

    public List<Object> instantiateClassHierarchy(Object obj){
        List<Object> results = new ArrayList<>(); //create empty list
        Class<?> c = obj.getClass(); // c is the class representing the initial object passed in
        while(c != null){  // iterate through loop if c actually refers to a class
            if (getNoArgsConstructor(c) != null) { // check if there is a no-arg constructor
                try {
                    results.add(c.newInstance()); //if so, use it and put instance in list
                } catch (Exception e) {
                    results.add(c); // if so but cannot be instantiated, just put class object in list
                }
            }else{
                results.add(c); // if not, just put the class object in its place in list
            }
            c = c.getSuperclass(); // done with the object now, assign class to it's parent
        } // end of while loop
        return results;
    }

    private Constructor<?> getNoArgsConstructor(Class<?> c){
        Constructor<?> result = null;
        Constructor<?>[] constructors = c.getConstructors();
        for (Constructor e: constructors) {
            if(e.getParameterCount() == 0){
                result = e;
                return result;
            }
        }
        return result;
    }

}
