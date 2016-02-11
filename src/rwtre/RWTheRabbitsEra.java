package rwtre;

import himmel.graphics.Window;

import static himmel.utils.InputKeyboard.HIMMEL_KEY_ESCAPE;

/**
 * Created by Igorek on 11-Feb-16.
 */
public class RWTheRabbitsEra {

    private Window window;
    private final int WIDTH = 600;
    private final int HEIGHT = 600;

    public RWTheRabbitsEra() {
        System.setProperty("org.lwjgl.librarypath", "res//natives//windows//x64");
        window = new Window("PerformanceTest", WIDTH, HEIGHT, Window.AntiAliasing.AA_8X, false, false);
        window.resetMousePos(WIDTH / 2.0f, HEIGHT / 2.0f);
        window.setShowCursor(false);
        window.setCullBackFaces(false);

        mainLoop();
    }

    private void mainLoop() {
        while (!window.isClosed() && !window.isKeyPressed(HIMMEL_KEY_ESCAPE)) {
            window.clear();

            window.pollEvents();
            window.swapBuffers();
        }
    }

    public static void main(String[] args) {
        new RWTheRabbitsEra();
    }
}
