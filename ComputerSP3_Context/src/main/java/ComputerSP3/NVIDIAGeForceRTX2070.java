package ComputerSP3;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NVIDIAGeForceRTX2070 implements GPU {

	public String getDetail() {
	
		return "NVIDIA Ge Force RTX 2070....";
	}

}
