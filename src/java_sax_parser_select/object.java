package java_sax_parser_select;

public class object {

	    // XML attribute
		private String title;
		private String link;
		private String description;
		private String language;
		private String copyright;
		private int ttl;
	    

	    public String title() {
	        return title;
	    }
	    public void set_title(String title) {
	        this.title = title;
	    }

	    public int get_ttl() {
	        return ttl;
	    }
	    public void set_ttl(int ttl) {
	        this.ttl = ttl;
	    }
	    
	    @Override
	    public String toString() {
	        return this.title + "\n" +this.link +  "\n" +this.description + "\n" + this.language + "\n" + this.copyright + "\n" ;
	    }
	    
}
