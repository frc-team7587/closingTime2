package frc.robot.commands;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class MoveElevator extends Command{
    
    public Button eleUp = new JoystickButton(Robot.joy, 3);
    public Button eleDown = new JoystickButton(Robot.joy, 4);

    public MoveElevator(){
        requires(Robot.m_elevator);
    }
        
    Thread up = new Thread(){
        public void run(){
            while(true){
                if(eleUp.get()){
                    Robot.m_elevator.raise();
                }else{
                    Robot.m_elevator.rest();
                }
            }
        }    
    };
    Thread down = new Thread(){
        public void run(){
            while(true){
                if(eleDown.get()){
                    Robot.m_elevator.lower();
                }else{
                    Robot.m_elevator.rest();
                }
            }
        }
    };

    public void execute(){
        up.start();
        down.start();
    }

    @Override
    protected boolean isFinished() {
        return false;
    }

}