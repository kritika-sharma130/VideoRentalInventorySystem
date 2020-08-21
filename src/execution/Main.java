/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 17-08-2020
 *   Time: 20:53
 *   File: Main.java
 */

package execution;

import definitions.Video;

public class Main {
    public static void main(String[] args) {
        Video video = new Video("Bahubali:The Beginning");
        System.out.println("Video Name:" + video.getVideoName() + ", " + "Video Rating:" + video.getRating() + ", " +
                "Is video available:" + video.isCheckOut() + ".");
        Video video1 = new Video();
        System.out.println("Video Name:" + video1.getVideoName() + ", " + "Video Rating:" + video1.getRating() + ", " +
                "Is video available:" + video1.isCheckOut() + ".");
        System.out.println(video);


    }
}
