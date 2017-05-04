package prahl.daniel;


/**
 * Created by danielprahl on 5/4/17.
 */
public class TypeInformation {


    public boolean classImplementsInterface(Class<?> clazz, String interfaceName) {
        Class<?>[] classes = clazz.getInterfaces();
        for (Class<?> e: classes) {
            if( interfaceName.equalsIgnoreCase(e.getName()) ) {return true;}
        }
        return false;

    }

    public String listAllMembers(Object obj){

        return new String("");
    }


}
