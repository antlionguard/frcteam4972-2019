/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4972.robot.subsystems;

import org.usfirst.frc.team4972.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Add your docs here.
 */
public class ArmSubSystem extends Subsystem {
  Victor ArmMotor = new Victor(RobotMap.ArmMotor); // Pg71
  Encoder ArmEncoder;
  Victor IntakeMotor1; // Bag 1
  Victor IntakeMotor2; // Bag 2

  SpeedControllerGroup IntakeMotors;

  
  int setPoint = -50;

  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public ArmSubSystem() {
    ArmEncoder = new Encoder(RobotMap.ArmEncoderChannelA, RobotMap.ArmEncoderChannelB, true, EncodingType.k4X); // PG71 Encoder
    IntakeMotor1 = new Victor(RobotMap.ArmIntakeMotorLeft); // Bag1 Motor
    IntakeMotor2 = new Victor(RobotMap.ArmIntakeMotorRight); // Bag2 Motor
    IntakeMotor2.setInverted(true);
    IntakeMotors = new SpeedControllerGroup(IntakeMotor1, IntakeMotor2);
  }

  public void setArmMotorSpeed(double speed) {
    ArmMotor.pidWrite(speed);
  }

  public void resetEncoderValue() {
    ArmEncoder.reset();
  }

  public int getArmEncoderValue() {
    return ArmEncoder.get();
  }

  public void setArmSetPoint(int setPoint) {
    this.setPoint = setPoint;
  }

  public int getArmSetPoint() {
    return setPoint;
  }

  public void cargoIntakeSpeed(double speed){
    IntakeMotors.set(speed);
  }

  public void stopCargoIntakeMotors(){
    IntakeMotors.set(0);
  }
  
  

  public void stopArmMotor() {
    ArmMotor.set(0);
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
