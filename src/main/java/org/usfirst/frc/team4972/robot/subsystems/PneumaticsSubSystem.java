package org.usfirst.frc.team4972.robot.subsystems;

import org.usfirst.frc.team4972.robot.RobotMap;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
/**
 *
 */
public class PneumaticsSubSystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DoubleSolenoid FrontSolenoid;
	DoubleSolenoid BackSolenoid;
	Compressor Compressor;
	public PneumaticsSubSystem(){
		Compressor = new Compressor();
		FrontSolenoid = new DoubleSolenoid(RobotMap.RobotFrontSolenoidForward, RobotMap.RobotFrontSolenoidReverse);
		BackSolenoid = new DoubleSolenoid(RobotMap.RobotBackSolenoidForward, RobotMap.RobotBackSolenoidReverse);
		
	}
	
	public void RobotFront(Value ForwardOrReverse){
		FrontSolenoid.set(ForwardOrReverse);
	}
	
	public void RobotBack(Value ForwardOrReverse){
		BackSolenoid.set(ForwardOrReverse);
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

