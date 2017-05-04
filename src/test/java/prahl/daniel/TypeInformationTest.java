package prahl.daniel;

import org.junit.*;

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

    @Test
    public void classImplementsInterfaceTest() {
        // given;
        ArrayList<Integer> sample = new ArrayList<>();
        String interfaceName = "java.util.List";

        //when;
        boolean testForTrue = typeInfo.classImplementsInterface(sample.getClass(), interfaceName);

        //then;
        Assert.assertTrue(testForTrue);

    }

    @Test
    public void listAllMembersTest(){
        //given;

        //when;
        String result = "";

        //then;

    }

}
