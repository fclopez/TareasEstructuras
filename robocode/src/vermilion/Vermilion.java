package vermilion;
import robocode.*;
import robocode.HitRobotEvent;
import java.awt.Color;
import static robocode.util.Utils.normalRelativeAngleDegrees;

// API help : http://robocode.sourceforge.net/docs/robocode/robocode/Robot.html

/**
 * Vermilion - a robot by fclopez4
 */
public class Vermilion extends Robot
{
	int metodo = 0;
	
	public void run() {
		//Color del tanque
		setBodyColor(Color.white);
		setGunColor(Color.black);
		setRadarColor(Color.red);
		setScanColor(Color.red);
		setBulletColor(Color.blue);

		// Robot main loop
		while(true) {
			//movimietos del robot
			turnGunRight(360);
			if (getOthers()<2) {
				modoDepredador();
			}
			else{
				modoFurtivo();
			}
		}
	}

	/**
	 * onScannedRobot: What to do when you see another robot
	 */
	public void onScannedRobot(ScannedRobotEvent e) {
		//angulo y posicion del enemigo
		double enemyBearing = this.getHeading() + e.getBearing();
		double enemyX = getX() + e.getDistance() * Math.sin(Math.toRadians(enemyBearing));
		double enemyY = getY() + e.getDistance() * Math.cos(Math.toRadians(enemyBearing));

		//calcula las coordenadas del enemigo
		double dx = enemyX - this.getX();
		double dy = enemyY - this.getY();
		double theta = Math.toDegrees(Math.atan2(dx, dy));
		
		// Apunta al objetivo
		turnGunRight(normalRelativeAngleDegrees(theta - getGunHeading()));
		
		if ((theta - getGunHeading())<30) {
			fire(1.25);
		}else if ((theta - getGunHeading())<120) {
			fire(1);
		}else if (((theta - getGunHeading())<150)&&(getOthers()>2)){
			fire(0.5);
		}
	}

	/**
	 * onHitByBullet: What to do when you're hit by a bullet
	 */
	public void onHitByBullet(HitByBulletEvent e) {
		turnLeft(70);
		back(50);
	}
	
	/**
	 * onHitWall: What to do when you hit a wall
	 */
	public void onHitWall(HitWallEvent e) {
		if (metodo == 1) {
			turnLeft(180);
		}
		else if (metodo == 2) {
			turnLeft(90 - e.getBearing());
		}
		ahead(60);
		
	}	
	
	public void onHitRobot(HitRobotEvent e) {
		if (e.getBearing() > -90 && e.getBearing() <= 90) {
			back(100);
			}
		else {
			ahead(100);
			}
	}
	
	public void modoDepredador(){
		metodo =1; 
		turnRadarLeft(360);
		turnLeft(60);
		ahead(100);
		turnRadarRight(360);
		turnGunRight(360);
		turnRight(80);
		back(100);
		turnGunLeft(360);
		
	}
	
	public void modoFurtivo(){
		metodo=2;
		double N = getBattleFieldHeight() - getY();  
		double S = getY();  
		double E = getBattleFieldWidth() - getX();  
		double W = getX();
		
		ahead(N);
		ahead(E);
		turnGunRight(360);
		ahead(S);
		ahead(W);
	}
	
//	private void escanearEnemigos(){
//		turnRadarRight((Math.PI * 8) * Double.POSITIVE_INFINITY);
//	}
	
}
