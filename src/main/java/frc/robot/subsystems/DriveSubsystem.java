// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    public Talon L1;
    public Talon L2;
    public Talon R1;
    public Talon R2;
  }

  public DriveSubsystem() {
    L1 = new Talon(0);
    L2 = new Talon(1);
    R1 = new Talon(2);
    R1 = new Talon(3);
  }
  @Override
  public void TankDrive(double left, double right) {
    L1.set(left);
    L2.set(left);
    R1.set(right);
    R2.set(right);
  }

  @Override
  public void ArcadeDrive(double speed, double turn) {
   TankDrive(speed - turn, speed + turn);
  }
}
