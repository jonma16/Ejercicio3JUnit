import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultiploDeUnNumeroTest extends MultiploDeUnNumero {

	@Test
	void testLeerN() {
		int result = leerN();
		//Si mete el 10 tira adelante sino da error
		assertEquals(result, 10);
		
	}

	@Test
	void testLeerM() {
		int result = leerM(10);
		//La M tiene que ser mayor que la N que en este caso es 10
		assertEquals(result, 11);
	}


}
