package ComputerSP3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Corei9 implements CPU {

	public String getDetail() {
		
		return "core-i9......";
	}

}
