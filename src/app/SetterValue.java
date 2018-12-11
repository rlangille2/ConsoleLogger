package app;

public class SetterValue {

	private Object value;

	public void setValue(Object _value) {
		if (isZeroLengthString(_value)) {
			value = null;
		} else {
			value = _value;
		}
	}

	public Object getValue() {
		return value;
	}
	
	public Boolean isZeroLengthString(Object _value) {
		return (_value.equals(""));
	}
	
	public void printValue() {
		System.out.println(value);
	}

}
