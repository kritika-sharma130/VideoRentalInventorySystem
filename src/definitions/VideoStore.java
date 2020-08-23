/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 23-08-2020
 *   Time: 16:33
 *   File: VideoStore.java
 */

package definitions;

import java.util.Arrays;

public class VideoStore {
    private Video[] store;

    public VideoStore() {
        this.store = new Video[5];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Video();
        }
    }

    public Video[] getStore() {
        return store.clone();// .clone() will return a copy of the array,
        // not the array reference itself.
    }

    public void setStore(Video[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoStore that = (VideoStore) o;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

    /**
     * This method will allow us to add a new video to our store.
     *
     * @param name The name of the new video to be added to the store.
     */
    public void addVideo(String name) {
        System.out.println("\"" + name + "\" is now added to the store.");
    }
}

