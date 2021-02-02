package manager;

import domain.Post;

public class PostManager {


    private Post[] objects;

    public void Post(Post []objects) {
        this.objects = objects;
    }

    public void search(int ownerId, String domain, String query, int ownersOnly, int count, int offset) {

    return ;
    }

    public Post[] getObjects() {


        return objects;
    }

    public void delete(int ownerId, int post_id) {

    }
}