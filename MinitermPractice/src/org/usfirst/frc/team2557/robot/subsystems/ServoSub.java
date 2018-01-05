package org.usfirst.frc.team2557.robot.subsystems;

import org.usfirst.frc.team2557.robot.Robot;
import org.usfirst.frc.team2557.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ServoSub extends Subsystem {
	
	public static void ServoArm(){
	if(Robot.oi.a1.get()) {
		RobotMap.servo.setAngle(.7);
	}else {
	RobotMap.servo.setAngle(0);	
	}
	}

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}



