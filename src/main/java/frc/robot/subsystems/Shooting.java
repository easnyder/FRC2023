// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.AutoConstants;

public class Shooting extends SubsystemBase {
  /** Creates a new Shooting. */
  private PWMTalonSRX m_ShooterTop = new PWMTalonSRX(AutoConstants.shooter);//change port later- RR 1/11/22
  public Shooting() {}
  //methods written by RR on 1/11/22
  public void shootTop(double strength) {
    m_ShooterTop.set(strength);
  }

  public void stop() {
    m_ShooterTop.set(0);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
