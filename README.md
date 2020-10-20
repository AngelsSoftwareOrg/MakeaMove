# Make a Move


[![Angels Software](https://i.imgur.com/YAHNVMc.png "Angels Software")](https://i.imgur.com/YAHNVMc.png "Angels Software")


------------


# Description

Make a move is a simple utility tool that prevents your computer being idle.
As of now, it only act as per below

  - Automate to move your mouse in a sample pixel periodically.
  - Automating to move the mouse in the Upward direction, as well as towards to Right, Bottom, and Left direction.

Future improvements that can automate something to prevent computer to idle will be followed.





# Features!

Default settings were
  - Automating to move the Mouse every 20 seconds
  - Mouse is going in upward direction
  - Mouse is hopping 1 pixel at a time

You can also:
  - Change the default settings above at your own preference.
  - Behavior that are not supported as of now can be requested and welcome at any time.

Make a Move is designed to be as lightweight as possible to run in your desktop which only requires Java Runtime Software.


# Tech

Make a move uses the following to develop and work properly:

* Java - Regular [JAVA JRE](https://www.java.com/en/ "JAVA JRE") or you may use [Open JDK](https://openjdk.java.net/ "Open JDK").
* IDE - [Eclipse](https://www.eclipse.org/downloads/ "Eclipse") Version: Photon Release (4.8.0) was used as the main IDE for the Java project.
* [Maven](https://maven.apache.org/ "Maven") - is used on the project to manage dependencies and packaging.
* Markdown - Markdown parser done right. Fast and easy to extend. Used to created this READ ME file.
* [Smart Git](https://www.syntevo.com/smartgit/ "Smart Git") - used as the Git repository admin studio to manage the source code and pushing to Github


### Installation

Make a Move requires Java JRE to run.
* Java - at least version [jre1.8.0_261](https://www.java.com/en/download/ "jre1.8.0_261")
* Download the latest released package on the [Github Release Package](https://github.com/AngelsCheeseBurgerOrg/MakeaMove/releases "Github Release Package") site

[![Release Package](https://i.imgur.com/OVIhdn6.png "Release Package")](https://i.imgur.com/OVIhdn6.png "Release Package")

* Extract the package in a temporary folder
[![Extract](https://i.imgur.com/l4TtpMb.png "Extract")](https://i.imgur.com/l4TtpMb.png "Extract")

* Edit the .bat file to see the content on the notepad
[![](https://i.imgur.com/mDQ0KB3.png)](https://i.imgur.com/mDQ0KB3.png)

* Make sure that the installation path of java is correct as per setup in your system.
After correcting the below Java path, save the file and close the notepad.
[![Java Setup Path](https://i.imgur.com/DztVblm.png "Java Setup Path")](https://i.imgur.com/DztVblm.png "Java Setup Path")

* Execute the .bat file and the following will show if the setup is success or not
[![Success](https://i.imgur.com/cWdRBpc.png "Success")](https://i.imgur.com/cWdRBpc.png "Success")


------------


### Application Parameters / Arguments

You can change the parameter inside the .bat file to suit your periodical execution of movement.

[![Parameters](https://i.imgur.com/0HFFvkz.png "Parameters")](https://i.imgur.com/0HFFvkz.png "Parameters")

| Parameter Name  | Parameter Alias |  Possible Values | 
| ------------- | ------------- |  ------------- |
| -mouse-direction  | -m-d  |  UP, DOWN, LEFT, RIGHT  |
| -execution-period  | -e  |  Express in milliseconds, 1000 (1 second), 2000 (2 seconds), 3000 (3 seconds) and so on...  |
| -mouse-hop-px  | -mpx  |  Pixel count as number. 1 (one pixel), 300 (300 pixels). Whatever the value, that's the length of pixel to jump in every execution periodically.  |


### Development

You are welcome.
Just message me here in Github...

### Todos

 - Include more automation to choose to...

License
----

CC0-1.0 License

Author
----

by: Ryan Seth Roldan

**Free Angellic Software, Yeah! **
