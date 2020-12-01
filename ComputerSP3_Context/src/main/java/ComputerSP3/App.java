package ComputerSP3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ClassPathXmlApplicationContext context =
    			new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	ASUSCarIII pvuth=context.getBean("ASUSCarIII",ASUSCarIII.class);
    	ASUSCarIII pesith=context.getBean("ASUSCarIII2",ASUSCarIII2.class);
    	
    	System.out.println(pvuth.getTechSpecs());
    	System.out.println(pesith.getTechSpecs());
    	
//    	GPU gpu=context.getBean(NVIDIAGeForceRTX2070.class); 	
//    	System.out.println(gpu);
    	
    	
    	//    	
//    	MainBoard mainBoard=context.getBean(MainBoard.class);
//    	MainBoard mainBoard2=context.getBean(MainBoard.class);
//    	System.out.println(mainBoard+"\n"+mainBoard2);
//    	ASUSCarIII pvuth=context.getBean("aSUSCarIII",ASUSCarIII.class);
//    	
//    	pvuth.setGpu(new NVIDIAGeForceRTX2060());
//    	
//    	ASUSCarIII pesith=context.getBean("aSUSCarIII60",ASUSCarIII.class);
//    	
//    	System.out.println(pvuth.getTechSpecs()+"\n"+pesith.getTechSpecs());
//    	
//    	MainBoard mainBoard=new MBG731GW();
//    	CPU cpu =new Corei9();
//    	GPU gpu =new NVIDIAGeForceRTX2070();
//    	RAM ram =new KingSton();
//    	
//    	ASUSCarIII pvuth=new ASUSCarIII(mainBoard, cpu, gpu, ram);
//    	
//    	MainBoard mainBoardp=new MBG731GW();
//    	CPU cpup =new Corei9();
//    	GPU gpup =new NVIDIAGeForceRTX2070();
//    	RAM ramp =new KingSton();
//    	ASUSCarIII pesith=new ASUSCarIII(mainBoardp, cpup, gpup, ramp);
//    	
    	
    	/*
    	 * 
    	 * Different Object but the same Parts
    	 */
    	//ASUSCarIII pesith =new ASUSCarIII(mainBoard, cpu, gpu, ram);
    	
    	/*
    	 * 
    	 * The Same Object and parts		
    	 */
    	//ASUSCarIII pesith=pvuth;
    	
//    	System.out.println("Pvuth Computer:"+pvuth);
//    	System.out.println("MainBoar:"+pvuth.getMainBoard());
//    	System.out.println(pvuth.getTechSpecs());
//    	System.out.println("-------------------");
//    	System.out.println("Pesit Computer:"+pesith);
//    	System.out.println("MainBoar:"+pesith.getMainBoard());
//    	System.out.println(pesith.getTechSpecs());
//    	
    }
}
