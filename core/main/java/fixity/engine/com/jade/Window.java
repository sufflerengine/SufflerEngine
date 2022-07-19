package fixity.engine.com.jade;

import fixity.engine.com.input.Keyboard;
import fixity.engine.com.input.Mouse;
import org.lwjgl.Version;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.opengl.GL;

import static org.lwjgl.glfw.Callbacks.glfwFreeCallbacks;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11C.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11C.glClear;
import static org.lwjgl.system.MemoryUtil.NULL;

public class Window {

    int width, height;
    String title;
    private long glfwWindow;

    private static Window window;

    private float r, g, b, a;
    private boolean fadeToBlack = false;
    private Window() {
        this.width = 1280;
        this.height = 720;

        this.title = "Suffler Engine";
        r = 1;
        g = 1;
        b = 1;
        a = 1;
    }

    public static Window get() {
        if (Window.window == null) {
            Window.window = new Window();
        }
        return Window.window;
    }

    public void run() {
        System.out.println("Hello LWJGL " + Version.getVersion());

        init();
        loop();

        // Free the Memory
        glfwFreeCallbacks(glfwWindow);
        glfwDestroyWindow(glfwWindow);

        // Terminate GLFW and the free the error callback
        glfwTerminate();
        glfwSetErrorCallback(null).free();
    }

    public void init() {
        // Setup an error callback
        GLFWErrorCallback.createPrint(System.err).set();

        // Initialize GLFW
        if (!glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }
            // Configure GFLW
            glfwDefaultWindowHints();

            glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
            glfwWindowHint(GLFW_RESIZABLE, GLFW_TRUE);
            glfwWindowHint(GLFW_MAXIMIZED, GLFW_TRUE);

            // Create the window
            glfwWindow = glfwCreateWindow(this.width, this.height, this.title, NULL, NULL);

            if (glfwWindow == NULL) {
                throw new IllegalStateException("Failed to create the Window");
            }

            glfwSetCursorPosCallback(glfwWindow, Mouse::mousePosCallback);
            glfwSetMouseButtonCallback(glfwWindow, Mouse::mouseButtonCallback);
            glfwSetScrollCallback(glfwWindow, Mouse::mouseScrollCallback);
            glfwSetKeyCallback(glfwWindow, Keyboard::keyCallback);

            glfwMakeContextCurrent(glfwWindow);

            glfwSwapInterval(1);

            // Make the window visible
            glfwShowWindow(glfwWindow);

            GL.createCapabilities();

        }

    public void loop() {
        while (!glfwWindowShouldClose(glfwWindow)) {


            glfwPollEvents();

            glClearColor(r, g, b, a);
            glClear(GL_COLOR_BUFFER_BIT);

            if (fadeToBlack) {
                r = Math.max(r - 0.01f, 0);
                g = Math.max(g - 0.01f, 0);
                b = Math.max(b - 0.01f, 0);
            }
            if (Keyboard.isKeyPressed(GLFW_KEY_SPACE)) {
                fadeToBlack = true;
            }

            glfwSwapBuffers(GL_COLOR_BUFFER_BIT);

        }
    }

}
