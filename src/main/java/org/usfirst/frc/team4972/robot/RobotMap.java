/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4972.robot;

public class RobotMap {
	// Drive Base Motors
	public static int leftMotor = 0; // Şase Sol
	public static int RightMotor = 1; // Şase Sağ
	
	// Elevator Motors
	public static int AsansorLeft = 2; 
	public static int AsansorRight = 3;

	// Arm Motors & Encoder
	public static int ArmMotor = 4; // Kol Haraketi PG71
	public static int ArmEncoderChannelA = 0; // PG71 Enkoder Kanal a
	public static int ArmEncoderChannelB = 1; // PG71 Enkoder Kanal b
	public static int ArmIntakeMotorLeft = 5; // Kol Bag Motor sol
	public static int ArmIntakeMotorRight = 6; // Kol Bag Motor sağ

	// Elevator sensors and switches
	public static int AsansorEncoder = 5;
	public static int AsansorSwitch = 7;
	
	// Ultrasonic 
	public static int UltrasonicPin = 1;
	
	// Pneumatic
	public static int RobotFrontSolenoidForward = 0;
	public static int RobotFrontSolenoidReverse = 1;
	public static int RobotBackSolenoidForward = 2;
	public static int RobotBackSolenoidReverse = 3;
	

}
