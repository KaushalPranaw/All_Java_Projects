package utils;

import java.util.Date;
import static com.app.core.Customer.*;
public class ValidateUtils {

	public static Date validateDate(String date) throws Exception
	{
		return sdf.parse(date);
	}
}
