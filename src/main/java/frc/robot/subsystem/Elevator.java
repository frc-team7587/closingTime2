package frc.robot.subsystem;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.MoveElevator;

public class Elevator extends Subsystem{

    public final SpeedController m_eleMotor = new PWMVictorSPX(2);

    @Override
    protected void initDefaultCommand() {
        //setDefaultCommand(new MoveElevator());
    }

    public void raise(){
        m_eleMotor.set(0.25);
    }

    public void rest(){
        m_eleMotor.stopMotor();
    }
    
    public void lower(){
        m_eleMotor.set(-0.25);
    }
}