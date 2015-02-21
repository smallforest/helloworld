package jp.co.example.action;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldActionTest {

    @Test
    public void testHelloWorldAction() throws Exception {

        HelloWorldAction action = new HelloWorldAction();
        String result = action.execute();

        assertThat("Expected a success result!", result, is(ActionSupport.SUCCESS));

        assertThat("Expected the default message!", action.getMessage(), is(HelloWorldAction.MESSAGE));
    }

}
