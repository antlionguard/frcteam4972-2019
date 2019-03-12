package org.usfirst.frc.team4972.robot.subsystems;

import edu.wpi.first.wpilibj.Counter;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4972.robot.RobotMap;


/**
 *
 */
public class AsansorSubSystem extends Subsystem {
	Victor AsansorLeft, AsansorRight;
	DigitalInput altSwitch;
	DigitalInput encoder;
	Counter counter;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	public AsansorSubSystem(){
		AsansorLeft = new Victor(RobotMap.AsansorLeft);
		AsansorRight = new Victor(RobotMap.AsansorRight);
		encoder = new DigitalInput(RobotMap.AsansorEncoder);
		counter = new Counter(encoder);
		altSwitch = new DigitalInput(RobotMap.AsansorSwitch);
	}

	
	public void AsansorYukari(double speed){
		AsansorLeft.set(speed);
		AsansorRight.set(speed);
	}
	
	public void AsansorAsagi(double speed){
		AsansorLeft.set(-speed);
		AsansorRight.set(-speed);
	}

	public void SetAsansorSpeed(double speed){
		AsansorLeft.set(speed);
		AsansorRight.set(speed);
	}
	
	public void AsansorStop() {
		AsansorLeft.set(0);
		AsansorRight.set(0);
	}
	
	
	
	public boolean altSwitchStatus(){
		return altSwitch.get();
	}
	
	public int counterValue(){
		return counter.get();
	}
	public void counterReset(){
		counter.reset();
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());

    }
}

