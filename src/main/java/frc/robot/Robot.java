/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.subsystem.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  public static DriveTrain m_train = new DriveTrain();
  public static Elevator m_elev = new Elevator();
  public static Joystick joy = new Joystick(0);
  public static OI m_oi = new OI();
  Button button = new JoystickButton(joy, 1);
  WPI_TalonSRX talon = new WPI_TalonSRX(1); //0 bad, 1 good
  // WPI_TalonSRX talon2 = new WPI_TalonSRX(2);
  WPI_TalonSRX cargoTalon = new WPI_TalonSRX(0);
  // DifferentialDrive drive = new DifferentialDrive(talon, talon2);
  // Encoder code = new Encoder(0,1,false,EncodingType.k4X);
  /**
   * This function is run when the robot is first started up and should be used
   * for any initialization code.
   */
  @Override
  public void robotInit() {
    // drive.arcadeDrive(0, 0);
  }

  @Override
  public void autonomousInit() {
  }

  @Override
  public void autonomousPeriodic() {
  }

  @Override
  public void teleopInit() {
    // code.reset();
    // code.setMinRate(4.0);
    // code.setMaxPeriod(0.25);
    // code.setDistancePerPulse(4.0);
  }

  @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }
//cargoTalon.set(ControlMode.PercentOutput, -0.1);
  @Override
  public void testInit() {
  }

  @Override
  public void testPeriodic() {
  }

  public void log(){
    // System.out.println("Encoder count: " + code.get());
    // System.out.println("Encoder rate: " + code.getRate());
    // System.out.println("Distance traveled: " + code.getDistance());
    // System.out.println("Distance per pulse: " + code.getDistancePerPulse());

    
  }
}
