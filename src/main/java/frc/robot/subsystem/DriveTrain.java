/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.commands.TeleOpDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  WPI_TalonSRX talon = new WPI_TalonSRX(1);
  WPI_TalonSRX talon2 = new WPI_TalonSRX(2);
  DifferentialDrive drive = new DifferentialDrive(talon, talon2);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new TeleOpDrive());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void drive(double speed, double rotation) {
    drive.arcadeDrive(speed, rotation);
  }
}
