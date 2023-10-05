// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;

public class LimelightSubsystem extends SubsystemBase { 
  /** Creates a new ExampleSubsystem. */
  public LimelightSubsystem() {}

  @Override
  public void periodic() {
    LimelightHelpers.LimelightResults llresults = LimelightHelpers.getLatestResults("");
    System.out.println("Scanned for targets:");
    for (var target : llresults.targetingResults.targets_Retro) {
      System.out.println("Target X: " + target.tx);
      System.out.println("Target Y: " + target.ty);
      System.out.println("Target A: " + target.ta);
      System.out.println("Target S: " + target.ts);
    }
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
