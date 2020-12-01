package ComputerSP3;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")

public class MBG731GW implements MainBoard {

	public String getDetail() {
		
		return "G731GW/G7131GV/G71GU (17 inch)";
	}

}
