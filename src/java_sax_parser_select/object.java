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
	    public String link() {
	        return link;
	    }
	    public void set_link(String link) {
	        this.link = link;
	    }
	    public String description() {
	        return description;
	    }
	    public void set_description(String description) {
	        this.description = description;
	    }
	    public String language() {
	        return language;
	    }
	    public void set_language(String language) {
	        this.language = language;
	    }
	    public String copyright() {
	        return copyright;
	    }
	    public void set_copyright(String copyright) {
	        this.copyright = copyright;
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
