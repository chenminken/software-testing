import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

// PrintClassTest.java
public class PrintClassTest {
	@Test
	public void testPrintSome() {
		// 重定向标准输出到指定printstream中
		OutputStream os = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(os);
		System.setOut(ps);
		// 执行测试代码
		PrintClass pc = new PrintClass();
		pc.printSome();
		assertEquals("Just follow your heard"
						+ System.getProperty("line.separator"),
                os.toString());
		// 恢复重定向
		PrintStream originalOut = System.out;
    	System.setOut(originalOut);
	}
}