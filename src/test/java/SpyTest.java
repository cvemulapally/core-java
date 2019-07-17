import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SpyTest {

    @Spy
    List<String> spy = new ArrayList<String>();


    @Test
    public void whenNotUseSpyAnnotation_thenCorrect() {


        Mockito.doReturn(100).when(spy).size();
        assertEquals(100, spy.size());
    }


}
