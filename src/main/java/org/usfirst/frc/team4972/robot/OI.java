/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4972.robot;

import org.usfirst.frc.team4972.robot.commands.CargoIntakeCommand;
import org.usfirst.frc.team4972.robot.commands.OrtalamaCommand;
import org.usfirst.frc.team4972.robot.commands.OrtalamaCommandGroup;
import org.usfirst.frc.team4972.robot.commands.RobotBackPneumaticCommand;
import org.usfirst.frc.team4972.robot.commands.RobotFrontPneumaticCommand;
import org.usfirst.frc.team4972.robot.commands.RobotPneumaticGroupCommand;
import org.usfirst.frc.team4972.robot.commands.SetArmPositionPIDCommand;
import org.usfirst.frc.team4972.robot.commands.SetArmSetPointCommand;
import org.usfirst.frc.team4972.robot.commands.SetAsansorCommand;
import org.usfirst.frc.team4972.robot.commands.SetAsansorGroup;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


public class OI {
	// Logitech F310
	public Joystick Driver = new Joystick(0);
	// Custom DriverStation
	//public Joystick DriverStation = new Joystick(1);
	
	
	
	public OI() {
		Button ElevatorUpButton = new JoystickButton(Driver, 5);
		Button ElevatorDownButton = new JoystickButton(Driver, 6);


		Button IntakeButton = new JoystickButton(Driver, 9);
		Button OutputButton = new JoystickButton(Driver, 10);
		
		Button StartSetArmPosition = new JoystickButton(Driver, 4);
		Button SetPoint100 = new JoystickButton(Driver, 1);
		Button SetPoint200 = new JoystickButton(Driver, 3);

		Button FrontSolenoidForward = new JoystickButton(Driver, 3);
	
		Button TogetherForward = new JoystickButton(Driver, 4);
		Button BackSolenoidForward = new JoystickButton(Driver, 2);
		Button OffAll = new JoystickButton(Driver, 5);
		
		FrontSolenoidForward.whileHeld(new RobotFrontPneumaticCommand(Value.kReverse));
		TogetherForward.whileHeld(new RobotPneumaticGroupCommand(Value.kForward, Value.kForward));
		BackSolenoidForward.whileHeld(new RobotBackPneumaticCommand(Value.kReverse));
		OffAll.whileHeld(new RobotPneumaticGroupCommand(Value.kOff, Value.kOff));
		
		StartSetArmPosition.whenPressed(new SetArmPositionPIDCommand());
		SetPoint100.whileHeld(new SetArmSetPointCommand(-400));
		SetPoint200.whileHeld(new SetArmSetPointCommand(-50));
		
		IntakeButton.whileHeld(new CargoIntakeCommand(1));
		OutputButton.whileHeld(new CargoIntakeCommand(-0.5));

		
		ElevatorUpButton.whileHeld(new SetAsansorCommand(1));
		ElevatorDownButton.whileHeld(new SetAsansorCommand(-1));

		// Logitech F310 Buttons
//		Button ElevatorUpButton = new JoystickButton(Driver, 5);
//		Button ElevatorDownButton = new JoystickButton(Driver, 3);
//		Button ResetElevatorCounter = new JoystickButton(Driver, 6);
//		Button ortala = new JoystickButton(Driver, 1);
//		
//		ortala.toggleWhenPressed(new OrtalamaCommandGroup());
////		
//		// Custom DriverStation Buttons
//		Button ElevatorSet0 = new JoystickButton(DriverStation, 3);
//		Button ElevatorSet1 = new JoystickButton(DriverStation, 5);
//		Button ElevatorSet2 = new JoystickButton(DriverStation, 8);
//		Button ElevatorSet3 = new JoystickButton(DriverStation, 9);
		
		
//		// logitech f310 elevator commands
//		elevatorupbutton.whileheld(new asansoryukaricommand());
//		elevatordownbutton.whileheld(new asansorasagicommand());
//		resetelevatorcounter.whileheld(new resetcountercommand());
//		
//		// DriverStation Elevator Commands
//		ElevatorSet0.whenPressed(new SetAsansorCommands(0));
//		ElevatorSet1.whenPressed(new SetAsansorCommands(1));
//		ElevatorSet2.whenPressed(new SetAsansorCommands(2));
//		ElevatorSet3.whenPressed(new SetAsansorCommands(3));
		
	}
	
	
	
}
