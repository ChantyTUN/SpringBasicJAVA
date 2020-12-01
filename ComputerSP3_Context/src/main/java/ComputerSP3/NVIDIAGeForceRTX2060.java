package ComputerSP3;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Primary
public class NVIDIAGeForceRTX2060 implements GPU {

	public String getDetail() {
		
		return "NVIDIA Ge Force RTX 2060........";
	}

}
