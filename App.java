package test_case.codes;
package demo;
import java.net.MalformedURLException;
public class App {
    public void getGreeting() throws InterruptedException, MalformedURLException {
      //  TestCases tests = new TestCases(); // Initialize your test class
        //TODO: call your test case functions one after other here
    Linkedin in=new Linkedin();
        
    in.testcase01();
        //END Tests
       //  in.endTest(); // End your test by clearning connections and closing browser
        CountHyperlinks count=new CountHyperlinks();
        count.testcase03();
        count.endTest();
    }
    public static void main(String[] args) throws InterruptedException, MalformedURLException {
        new App().getGreeting();
    }
}