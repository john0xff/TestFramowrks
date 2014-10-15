package junit.setup;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
{ TestBasic.class }) // , TestException.class, TestTimeout.class })
public class TestSuite
{

}