package backend.project.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


//THIS CLASS IS FOR THE REVIEW. IT HAS THE USER AND GAME OBJECTS

@Entity
public class Review {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long reviewId;
	private String rating, comment;
	private int hours;
	
	@ManyToOne
    @JoinColumn(name = "userId")
    private User user;

	@ManyToOne
    @JoinColumn(name = "gameId")
    private Game game;
	
	
	
	public Review() {}
	
	public Review(User user, Game game,  String rating, String comment, int hours) {
		super();
		this.user = user;
		this.game = game;	
		this.rating = rating;
		this.comment = comment;
		this.hours = hours;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	

}
