package java11and17features.accesscontrol;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//Top Level Class
public class AnotherDemo {
	private String message;
	// Method of Demo class
	private void privateMethod() {
		System.out.println("I am a private method");
	}

	// Inner class of Demo or Nested class
	class NestedClass {
		public void callPrivateMethod() {
			privateMethod();
		}
	}
}
