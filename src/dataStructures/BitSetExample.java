package dataStructures;

import java.util.BitSet;

import org.openjdk.jol.info.ClassLayout;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitSetExample {

	private static final Logger logger = LoggerFactory.getLogger(BitSetExample.class);

	public static void main(String[] args) {

		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);

		for (int i = 0; i < 16; i++) {
			if ((i % 2) == 0) {
				bits1.set(i);
			}
			if ((i % 5) != 0) {
				bits2.set(i);
			}
		}

		System.out.println("Initial pattern in bits1: ");
		System.out.println(bits1);
		System.out.println("\nInitial pattern in bits2: ");
		System.out.println(bits2);

		bits1.and(bits2);
		System.out.println();

		boolean[] boolBits = new boolean[1024];
		System.out.println(ClassLayout.parseInstance(boolBits).toPrintable());

	}

}
