package hello;

/**
 * Created by abcd on 06/07/18.
 */
public class Greeting {

	private final long id;
	private final String content;

	public Greeting(long id, String content){

		this.id=id;
		this.content=content;
	}

	public long getId(){

		return id;
	}

	public String getContent(){

		return content;
	}
}
