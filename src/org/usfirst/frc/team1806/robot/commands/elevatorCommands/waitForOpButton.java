package org.usfirst.frc.team1806.robot.commands.elevatorCommands;

import org.usfirst.frc.team1806.robot.OI;
import org.usfirst.frc.team1806.robot.Robot;
import org.usfirst.frc.team1806.robot.States;
import org.usfirst.frc.team1806.robot.XboxController;
import org.usfirst.frc.team1806.robot.States.robotMode;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class waitForOpButton extends Command {

    public waitForOpButton() {
        requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if(Robot.statesObj.getElevatorCommand() == States.elevatorCommand.MOVETONEXT){
    		return true;
    	}else{
    		return false;
    	}
    }

    // Called once after isFinished returns true
    protected void end() {
    	System.out.println("Got button A");
    	Robot.statesObj.setElevatorCommandWaiting();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
