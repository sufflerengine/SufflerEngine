## 💬 Suffler Engine

Suffler Game Engine is an engine created in java using free frameworks over the internet.
Currently being developed at Eclipse, and Visual Studio Code.

**Visual Studio Code**: https://code.visualstudio.com
                  
**Eclipse**: https://www.eclipse.org

## Frameworks
**OpenGL**, OpenGL (Open Graphics Library) is a free API used in computer graphics, for the development of graphics applications, 3D environments, games, among others. Like Direct3D or Glide, it is an API (Application Programming Interface), a term used to classify a library of specific functions made available for the creation and development of applications.
https://www.opengl.org

**Box2D** is a free open source 2-dimensional physics simulator engine.
https://box2d.org

## Features
- [x] Scene management
- [x] GameObject management
- [x] Font
- [x] Textures and particles
- [x] Audio
- [x] UI
- [ ] Physics
- [ ] Editor

## Game Class Info
```java
/** 
* This Class contains all informations of the game. */

public class GameInfo {
  
  private int width, height;
  
  private String title;
  
  private long timeCreated;
  
    // Initializing the info of the game
    public void initGameInfo(int width, int height, String title) {
        this.width = width;
        this.height = height;
        this.title = title;
    }
}
```
