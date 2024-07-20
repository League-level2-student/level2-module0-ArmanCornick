package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
	public static void main(String[] args) {
		boolean win = false;
		Random z = new Random();


		//2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		//3. use a for loop to initialize the robots.
		for (int i=0; i<robots.length;i++) {
			robots[i] = new Robot();
			robots[i].setX(300);
			robots[i].setY(600);
			robots[i].setSpeed(1000);
		}
		Robot.setWindowSize(1600, 1200);
		//4. make each robot start at the bottom of the screen, side by side, facing up

		//5. use another for loop to iterate through the array and make each robot move 
		//   a random amount less than 50.
		while(win==false) {
			for (int i=0; i<robots.length;i++) {
				int q = z.nextInt(6);
				robots[i].move(q*8);
				robots[i].turn(q);
				if(robots[i].getX()<=400&&robots[i].getX()>=350&&robots[i].getY()<=650&&robots[i].getY()>=550) {
					win = true;
					System.out.println("Robot " + (i+1) +  " is the winner!");
					break;
				}
			}
		}
		//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

		//7. declare that robot the winner and throw it a party!

		//8. try different races with different amounts of robots.

		//9. make the robots race around a circular track.
	}
}
