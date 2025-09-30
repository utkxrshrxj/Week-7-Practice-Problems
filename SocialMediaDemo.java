class SocialMediaPost {
    protected String content;
    protected String author;
    public SocialMediaPost(String content, String author) {
        this.content = content;
        this.author = author;
    }
    public void share() {
        System.out.println("Sharing: " + content + " by " + author);
    }
}

class InstagramPost extends SocialMediaPost {
    private int likes;
    public InstagramPost(String content, String author, int likes) {
        super(content, author);
        this.likes = likes;
    }
    @Override
    public void share() {
        System.out.println("Instagram: " + content + " by @" + author + " - " + likes + " likes");
    }
}

class TwitterPost extends SocialMediaPost {
    private int retweets;
    public TwitterPost(String content, String author, int retweets) {
        super(content, author);
        this.retweets = retweets;
    }
    @Override
    public void share() {
        System.out.println("Tweet: " + content + " by @" + author + " - " + retweets + " retweets");
    }
}

public class SocialMediaDemo {
    public static void main(String[] args) {
        SocialMediaPost[] posts = {
            new InstagramPost("Sunset vibes!", "john_doe", 245),
            new TwitterPost("Java is awesome!", "code_ninja", 89),
            new SocialMediaPost("Hello world!", "beginner")
        };
        for (SocialMediaPost p : posts) {
            p.share();
        }
    }
}
