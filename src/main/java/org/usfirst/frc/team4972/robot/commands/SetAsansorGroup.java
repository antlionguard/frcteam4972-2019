package org.usfirst.frc.team4972.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class SetAsansorGroup extends CommandGroup {

    public SetAsansorGroup(int Deger) {
    	// Set Elevator Zero 
    	addSequential(new SetAsansorZeroCommand());
    	// Set Elevator a Value
    	if(Deger != 0){
    		addSequential(new SetAsansorCommand(Deger));	
    	}
    	
    }
}
