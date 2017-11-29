package code.practice.a01;

import java.util.List;

import code.practice.a01.DecodeMap;

public class DecodeMapTesting {
	
	public static void main(String[] args) {
		System.out.println("*** Test 1.0: Number Decoding\n");
		test("123");
		test("1234");
		test("1203");
		test("1221");
	}

	private static void test(String original) {
		System.out.println("  Original string: " + original);
		List<String> solution = DecodeMap.findAllPossibleSolutions(original);
		System.out.println("SOLUTION IS "+solution);
		
	}

}
