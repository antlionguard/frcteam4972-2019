package org.usfirst.frc.team4972.robot.commands;

import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class UltrasonicDriveCommand extends Command {
	boolean IsOk = false;
    public UltrasonicDriveCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println(Robot.UltrasonicSub.getUltrasonicValue());
    	if(Robot.UltrasonicSub.getUltrasonicValue() > 18){
    		Robot.DriveTrainSub.tankDrive(0.6, 0.6);
    		IsOk = false;
    	}else{
    		IsOk = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return IsOk;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
