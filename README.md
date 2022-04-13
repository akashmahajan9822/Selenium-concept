# Selenium-concept

According to the TestNG dtd, the exclude element is only applicable to the following elements:

package - The package description within packages list.
methods - The list of methods to include/exclude from this test.
run - The subtag of groups used to define which groups should be run.
The elements classes and class cannot be directly excluded; however, you can exclude classes through groups:

According to the TestNG dtd, the exclude element is only applicable to the following elements:

package - The package description within packages list.
methods - The list of methods to include/exclude from this test.
run - The subtag of groups used to define which groups should be run.
The elements classes and class cannot be directly excluded; however, you can exclude classes through groups:

@Test(groups = { "ClassTest1" })
public class Test1 {

  public void testMethod1() {
  }

  public void testMethod2() {
  }

}
Then you will define the testng.xml:

<suite>
  <test>
    <groups>
      <run>
        <exclude name="ClassTest1"/>
      </run>
    </groups>
    <classes>
      <class name="Test1">
    </classes>
  </test> 
</suite>
