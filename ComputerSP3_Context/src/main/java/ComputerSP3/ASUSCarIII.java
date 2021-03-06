package ComputerSP3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ASUSCarIII implements Computer {

	public MainBoard getMainBoard() {
		return mainBoard;
	}

	public void setMainBoard(MainBoard mainBoard) {
		this.mainBoard = mainBoard;
	}

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public GPU getGpu() {
		return gpu;
	}

	public void setGpu(GPU gpu) {
		this.gpu = gpu;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	private MainBoard mainBoard;
	private CPU cpu;
	private GPU gpu;
	private RAM ram;
	 
	public ASUSCarIII() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	public ASUSCarIII(MainBoard mainBoard, CPU cpu,@Qualifier("NVIDIAGeForceRTX2070") GPU gpu, RAM ram) {
		super();
		this.mainBoard = mainBoard;
		this.cpu = cpu;
		this.gpu = gpu;
		this.ram = ram;
	}

	public String getTechSpecs() {
		
		return "MainBoard"+mainBoard.getDetail()+"\n"+
				"CPU"+cpu.getDetail()+"\n"+
				"GPU"+gpu.getDetail()+"\n"+
				"RAM"+ram.getDetail()+"\n";
	}

}
