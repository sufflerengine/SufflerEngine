## 💬 Suffler Engine


![stars](https://img.shields.io/github/stars/sufflerengine/SufflerEngine)
![license](https://img.shields.io/github/license/sufflerengine/SufflerEngine)
 <a href="https://discord.gg/BsMwRBc2gr">
        <img src="https://img.shields.io/discord/308323056592486420?logo=discord"
            alt="chat on Discord"></a>

[![forthebadge](https://forthebadge.com/images/badges/built-by-developers.svg)](http://forthebadge.com)

Suffler Game Engine is an engine created in java using OpenGL to Graphics.
Currently being developed at Eclipse, and Visual Studio Code.


**Visual Studio Code**: https://code.visualstudio.com
                  
**Eclipse**: https://www.eclipse.org

## :video_game: Main Features

* Basic Game Infrastructure (GameLoop, Configuration, Resource Management, Logging, ...)
* 2D Render Engine (GUI Components, Spritesheet Animations, Ambient Lighting, Particle System, ...)
* 2D Sound Engine (support for .wav, .mp3 and .ogg)
* 2D Physics Engine
* Support for Tile Maps in .tmx format (e.g. made with [Tiled Editor](http://www.mapeditor.org/))
* Player Input via Gamepad/Keyboard/Mouse
* Entity Framework
* Shader Creation (GLSL File)


## :elephant: Frameworks
**OpenGL**, OpenGL (Open Graphics Library) is a free API used in computer graphics, for the development of graphics applications, 3D environments, games, among others. Like Direct3D or Glide, it is an API (Application Programming Interface), a term used to classify a library of specific functions made available for the creation and development of applications.
https://www.opengl.org

**Box2D** is a free open source 2-dimensional physics simulator engine.
https://box2d.org

## ➕ Features 
- [x] Scene management (Game Scene, Map Scene...)
- [x] GameObject management 
- [x] Font 
- [x] Textures and particles
- [x] Audio
- [x] UI
- [ ] Physics
- [ ] Editor
- [ ] Shapes

## :coffee: GameInfo Class
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
## :video_game: Gamepad Integration

It's not new to anyone that one of the best ways to play electronic games is by using a Controller/Gamepad, and thinking about it we made a great update that was the implementation that supports video game controls.

* Here is a list of controls/gamepads that can be used.
- [x] PS2 (Sony)
- [x] Ipega (All versions)
- [x] DualShock 

* List of controls/gamepads that are under development for support.
- :video_game: Logitech 
- :video_game: PS3

## Supported Platforms

![Nintendo - Switch](https://img.shields.io/badge/Nintendo-Switch-2ea44f?style=for-the-badge&logo=https%3A%2F%2Fimgur.com%2Fgallery%2F4WbTn)
![Windows - 10](https://img.shields.io/badge/Windows-10-000fff?style=for-the-badge&logo=https%3A%2F%2Fimgur.com%2Fgallery%2F4WbTn)
![Linux - X](https://img.shields.io/badge/Linux-X-fff000?style=for-the-badge&logo=https%3A%2F%2Fimgur.com%2Fgallery%2F4WbTn)
![Mac - OS](https://img.shields.io/badge/Mac-OS-5fff44?style=for-the-badge&logo=https%3A%2F%2Fimgur.com%2Fgallery%2F4WbTn)
![Sony - PSP](https://img.shields.io/badge/Sony-PSP-654fff?style=for-the-badge&logo=https%3A%2F%2Fimgur.com%2Fgallery%2F4WbTn)
![Sony - PSVITA](https://img.shields.io/badge/Sony-PSVITA-654f43?style=for-the-badge&logo=https%3A%2F%2Fimgur.com%2Fgallery%2F4WbTn)
![ANDROID - X](https://img.shields.io/badge/ANDROID-X-ff11ff?style=for-the-badge&logo=https%3A%2F%2Fimgur.com%2Fgallery%2F4WbTn)
