package ir.co.bayan.simorq.zal.extractor.process;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * Capitalizes each input string.
 * @author Taha Ghasemi <taha.ghasemi@gmail.com>
 * 
 */
public class Capitalize extends StringProcessor {

	@Override
	protected String process(String item) {
		return StringUtils.capitalize(item);
	}
}
