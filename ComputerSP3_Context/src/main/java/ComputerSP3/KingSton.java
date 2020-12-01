package ComputerSP3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class KingSton implements RAM {

	public String getDetail() {
		
		return "Up to 32GB RAM....";
	}

}
