
import com.jme3.app.SideScrollGame;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;


public class JGame extends SideScrollGame{

	public static void main(String[] args){
        JGame app = new JGame();
        app.start(); // start the game
    }
    
    @Override
    public void simpleInitApp() {
    	flyCam.setMoveSpeed(10);
    	flyCam.setRotationSpeed(2);
    	
        Box b = new Box(1, 1, 1);
        Geometry geom = new Geometry("Box", b);

        Material mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);
        geom.setMaterial(mat);

        rootNode.attachChild(geom);
    }
    
    @Override
    public void simpleUpdate(float tpf) {
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
