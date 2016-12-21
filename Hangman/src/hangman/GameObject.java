package hangman;
/* this is for EVERY object ...
 * inheriting it's functions and such
 */
import java.awt.Graphics;

public abstract class GameObject {

	protected int x,y;
	protected ID id; // referring to the Enum
	
	// constructor for a game object to set the above variables
	public GameObject(int x, int y, ID id){
		this.x = x;
		this.y = y;
		this.id = id;
	}
	
	public abstract void tick();
	public abstract void render(Graphics g);
	
	// getters and setters to change values
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void setId(ID id){
		this.id = id;
	}
	public ID getId(){
		return id;
	}
}
