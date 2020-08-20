/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 17-08-2020
 *   Time: 21:05
 *   File: Video.java
 */

package definitions;

public class Video {
    //fields
    private String videoName;
    private int rating;
    private boolean checkOut;

    public Video() {
        this.videoName = "Sooryavansham";
        this.rating = 4;
        this.checkOut = false;
    }

    public Video(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    public Video(String videoName) {
        this.videoName = videoName;
        this.rating = 3;
        this.checkOut = true;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}
