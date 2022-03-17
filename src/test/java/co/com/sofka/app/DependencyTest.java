package co.com.sofka.app;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DependencyTest {

    @Mock
    private Dependency dependency;

    private SubDependency subDependency;

    @Before
    public void setupMock(){
        subDependency = mock(SubDependency.class);
        dependency = new Dependency(subDependency);
    }

    @Test
    public void testSubdependency(){
        when(subDependency.getClassName()).thenReturn("hi there 2");

        assertEquals("hi there 2", dependency.getSubdepedencyClassName());
    }

    /*DOCUMENTACION DE CODIGO DE EJEMPLOS
   /* @Before
    public void setupMock(){
        MockitoAnnotations.openMocks(this);
    }*/

   /* @Before
    public void setupMock(){
        dependency = mock(Dependency.class);
    }

    @Test
    public void testDependency(){
        when(dependency.getClassName()).thenReturn("hi there");
        assertEquals("hi there", dependency.getClassName());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException(){
        when(dependency.getClassName()).thenThrow(IllegalArgumentException.class);

        dependency.getClassName();
    }

    @Test
    public void testAddTwo(){
        when(dependency.addTwo(1)).thenReturn(5);

        assertEquals(5, dependency.addTwo(1));
        assertEquals(0, dependency.addTwo(27));
    }

    @Test
    public void testAddTwoAny(){
        when(dependency.addTwo(anyInt())).thenReturn(0);

        assertEquals(0, dependency.addTwo(3));
        assertEquals(0, dependency.addTwo(80));
    }*/

}
