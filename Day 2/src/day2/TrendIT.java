package day2;

public class TrendIT {
	
	
	    public static void main(String arg[])
	    {
	        MensTeam men[] = new MensTeam[11];
	        
	        men[0] = new Batsmen("Sachin", 250, 11324, 100, 125);
	        men[1] = new WicketKeeperMen("Dhoni", 153, 6021, 120, 67);
	        men[2] = new Batsmen("Shewag", 110, 4341, 22, 40);
	        men[3] = new Batsmen("Yuvraj", 105, 6533, 15, 46);
	        men[4] = new Batsmen("Kohli", 75, 4003, 25, 60);
	        men[5] = new Batsmen("Raina", 34, 2600, 12, 19);
	        men[6] = new Batsmen("Rohit", 25, 1500, 5, 9);
	        men[7] = new BowlerMen("Harbhajan", 189, 1500, 320, 4);
	        men[8] = new BowlerMen("Zaheer", 150, 900, 220, 4);
	        men[9] = new BowlerMen("Umesh", 25, 150, 105, 2);
	        men[10] = new BowlerMen("Aswin", 15, 200, 60, 2);
	        
	        WomensTeam women[]=new WomensTeam[11];
	        
	        women[0] = new Batswomen("Sachin", 250, 11324, 100, 125);
	        women[1] = new WicketKeeperWomen("Dhoni", 153, 6021, 120, 67);
	        women[2] = new Batswomen("Shewag", 110, 4341, 22, 40);
	        women[3] = new Batswomen("Yuvraj", 105, 6533, 15, 46);
	        women[4] = new Batswomen("Kohli", 75, 4003, 25, 60);
	        women[5] = new Batswomen("Raina", 34, 2600, 12, 19);
	        women[6] = new Batswomen("Rohit", 25, 1500, 5, 9);
	        women[7] = new BowlerWomen("Harbhajan", 189, 1500, 320, 4);
	        women[8] = new BowlerWomen("Zaheer", 150, 900, 220, 4);
	        women[9] = new BowlerWomen("Umesh", 25, 150, 105, 2);
	        women[10] = new BowlerWomen("Aswin", 15, 200, 60, 2);
	        
	        
	}

}
