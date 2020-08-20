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
        Video video = new Video();
        System.out.println("Video Name:" + video.getVideoName() + ", " + "Video Rating:" + video.getRating() + ", " +
                "Is video available:" + video.isCheckOut() + ".");

    }
}
