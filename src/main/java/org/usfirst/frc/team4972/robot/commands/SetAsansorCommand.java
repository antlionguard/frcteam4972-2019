package org.usfirst.frc.team4972.robot.commands;

import org.usfirst.frc.team4972.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class SetAsansorCommand extends Command {
    double setPoint = 0;
    double speed = 0;
	boolean IsFinished = false;
	
    public SetAsansorCommand(double setPoint) {
        this.setPoint = setPoint;
        if(setPoint == 1){
            speed = -0.5;
        }else if(setPoint == 2){
            if(Robot.AsansorSub.AsansorKonum() > setPoint){
                Robot.AsansorSub.asansorSayac.setReverseDirection(true);
                speed = -0.5;
            }else{
                Robot.AsansorSub.asansorSayac.setReverseDirection(false);
                speed = 1;
            }
        }else if(setPoint == 3){
            Robot.AsansorSub.asansorSayac.setReverseDirection(false);
            speed = 1;
        }
       
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	 if(Robot.AsansorSub.counterValue() != Value){
    		Robot.AsansorSub.SetAsansorSpeed(speed);
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
      
        Robot.AsansorSub.AsansorStop();
    }
}
