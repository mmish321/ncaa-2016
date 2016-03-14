
public class Team {
	
	private int seed;
	private int expected;
	private String region;
	public Team(int expected, String region, int seed) {
		this.seed = seed;
		this.region = region;
		this.expected = expected;
		
	}
	public String toString() {
		return (seed + " " + region +  " " + expected);
	}

}
