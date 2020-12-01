package ComputerSP3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class ASUSCarIII2 extends ASUSCarIII {

	public ASUSCarIII2() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Autowired
	public ASUSCarIII2(MainBoard mainBoard, CPU cpu, GPU gpu, RAM ram) {
		super(mainBoard, cpu, gpu, ram);
		// TODO Auto-generated constructor stub
	}

	
}
