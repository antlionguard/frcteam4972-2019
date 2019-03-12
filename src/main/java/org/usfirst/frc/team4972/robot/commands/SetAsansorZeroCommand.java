package org.usfirst.frc.team4972.robot.commands;

import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetAsansorZeroCommand extends Command {
	
	boolean IsFinished = false;

    public SetAsansorZeroCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(Robot.AsansorSub.altSwitchStatus() != true){
    		Robot.AsansorSub.AsansorAsagi(0.5);
    	}else{
    		IsFinished = true;
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return IsFinished;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.AsansorSub.AsansorStop();
    	Robot.AsansorSub.counterReset();
    	IsFinished = false;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
