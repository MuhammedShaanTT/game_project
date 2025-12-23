package game;

import com.jme3.app.SimpleApplication;
import com.jme3.light.DirectionalLight;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import com.jme3.system.AppSettings;

public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();

        AppSettings settings = new AppSettings(true);
        settings.setTitle("3D Game - Visual Test");
        settings.setResolution(1280, 720);

        app.setSettings(settings);
        app.start();
    }

    @Override
    public void simpleInitApp() {

        flyCam.setMoveSpeed(10);

        // Cube
        Box box = new Box(1, 1, 1);
        Geometry cube = new Geometry("Cube", box);

        Material mat = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");
        mat.setColor("Color", ColorRGBA.Blue);

        cube.setMaterial(mat);
        cube.setLocalTranslation(0, 0, -5);

        rootNode.attachChild(cube);

        // Ground (visual only)
        Box groundBox = new Box(20, 0.1f, 20);
        Geometry ground = new Geometry("Ground", groundBox);

        Material groundMat = new Material(assetManager,
                "Common/MatDefs/Misc/Unshaded.j3md");
        groundMat.setColor("Color", ColorRGBA.Gray);

        ground.setMaterial(groundMat);
        ground.setLocalTranslation(0, -2, 0);

        rootNode.attachChild(ground);

        // Light
        DirectionalLight sun = new DirectionalLight();
        sun.setDirection(new Vector3f(-1, -1, -1));
        sun.setColor(ColorRGBA.White);

        rootNode.addLight(sun);
    }
}
