
/**
 * A persona.
 * @author Brendan Woods - A00549501
 */
public class Persona {

	private int id;
	private String playerId;
	private String gamerTag;
	private String platform;
	
	
	
	/**
	 * Default constructor.
	 */
	public Persona() {
		
		}
	
	public Persona(int id, String playerId, String gamerTag, String platform){
		setId(id);
		setPlayerId(playerId);
		setGamerTag(gamerTag);
		setPlatform(platform);
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the playerId
	 */
	public String getPlayerId() {
		return playerId;
	}

	/**
	 * @param playerId the playerId to set
	 */
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	/**
	 * @return the gamerTag
	 */
	public String getGamerTag() {
		return gamerTag;
	}

	/**
	 * @param gamerTag the gamerTag to set
	 */
	public void setGamerTag(String gamerTag) {
		this.gamerTag = gamerTag;
	}

	/**
	 * @return the platform
	 */
	public String getPlatform(){
		return platform;
	}
	
	/**
	 * @param _platform sets the platform.
	 */
	public void setPlatform(String platform){
		this.platform = platform;
	}
	
	/**
	 * Print the details for the Persona to the console. 
	 */
	public void printInfo(){
		System.out.println(id);
		System.out.println(playerId);
		System.out.println(gamerTag);
		System.out.println(platform);
	}
}
