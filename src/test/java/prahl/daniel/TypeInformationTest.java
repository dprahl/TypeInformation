package prahl.daniel;

import org.junit.*;

import javax.management.AttributeList;
import java.util.*;

/**
 * Created by danielprahl on 5/4/17.
 */
public class TypeInformationTest {

    TypeInformation typeInfo;
    @Before
    public void setup(){
         typeInfo = new TypeInformation();
    }

    //@Test
    public void classImplementsInterfaceTest() {
        // given;
        ArrayList<Integer> sample = new ArrayList<>();
        String interfaceName = "List";

        //when;
        boolean testForTrue = typeInfo.classImplementsInterface(sample.getClass(), interfaceName);

        //then;
        Assert.assertTrue(testForTrue);

    }

    //@Test
    public void listAllMembersTest(){
        //given;
        Integer sample = new Integer(5);
        String expected = ""; // manually describe what should display

        //when;
        String actual = typeInfo.listAllMembers(sample);

        //then;
        Assert.assertTrue(expected.equals(actual));

    }

    //@Test
    public void getClassHierarchyTest(){
        //given;
        //Integer sample = new Integer(5);
        AttributeList sample = new AttributeList();


        //when;
        typeInfo.getClassHierarchy(sample);

        //then;
        // not sure how to check results printed to console

    }

    @Test
    public void instantiateClassHierarchyTest(){
        //given;
        Integer sample = new Integer(5);
        ArrayList<Object> expected = new ArrayList<>();
        expected.add(new Integer(5).getClass());
        expected.add(new Integer(5).getClass().getSuperclass());
        expected.add(new Object());

        //when;
        ArrayList<Object> results;
        results = (ArrayList) typeInfo.instantiateClassHierarchy(sample);

        //then;
        for (Object e: expected) {System.out.println(e.toString());}
        for (Object e: results) {System.out.println(e.toString());}
        Assert.assertTrue(results.get(2) != expected.get(2));
    }

}
