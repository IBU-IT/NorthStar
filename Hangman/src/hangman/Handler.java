package hangman;

import java.awt.Graphics;
import java.util.LinkedList;

/* a class for looping trough all our objects, individually updating them and
 * rendering them to the screen
 */
public class Handler {
	
	// we will do linked lists in Datastructure next semester so just google it
	// will be useful then
	LinkedList<GameObject> object = new LinkedList<GameObject>();
	
	public void tick(){
		for(int i=0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			
			tempObject.tick();
		}
	}
	
	public void render(Graphics g){
		for(int i=0; i < object.size(); i++){
			GameObject tempObject = object.get(i);
			
			tempObject.render(g);
		}
	}
	
	// adding and removing game objects to/from the list
	
	public void addObject(GameObject object){
		this.object.add(object);
	}
	
	public void removeObject(GameObject object){
		this.object.remove(object);
	}
}
