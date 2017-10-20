package bi.baiqiu.pojo.jd;

import com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase;

public class MyCamemlToUnderlineCaseStrategy extends PropertyNamingStrategyBase {
	private static final long serialVersionUID = 1L;

	@Override
	public String translate(String input) {
		if (input == null)
			return input; // garbage in, garbage out
		int length = input.length();
		StringBuilder result = new StringBuilder(length * 2);
		int resultLength = 0;
		boolean wasPrevTranslated = false;
		for (int i = 0; i < length; i++) {
			char c = input.charAt(i);
			
			if (i > 0 || c != '_') // skip first starting underscore
			{
				if (c == '_') {
					if (!wasPrevTranslated && resultLength > 0 && !Character.isUpperCase(result.charAt(resultLength - 1))) {
						if (++i < length) {
							result.append(Character.toUpperCase(input.charAt(i)));
							resultLength++;
						}
					}
					wasPrevTranslated = true;
				} else {
					wasPrevTranslated = false;
					result.append(c);
					resultLength++;
				}
			}
		}
		return resultLength > 0 ? result.toString() : input;
	}
}