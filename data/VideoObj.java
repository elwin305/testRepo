package hw7.data;


/**
 * Implementation of Video interface.
 * @see Data
 */
final class VideoObj implements Video {
  private final String _title;
  private final int    _year;
  private final String _director;

  /**
   * Initialize all object attributes.
   * Title and director are "trimmed" to remove leading and final space.
   * @throws IllegalArgumentException if object invariant violated.
   */
  VideoObj(String title, int year, String director) {
    _title = title;
    _director = director;
    _year = year;
  }

  public String director() {
    // TODO
    return _director;
  }

  public String title() {
    // TODO
    return _title;
  }

  public int year() {
    // TODO
    return _year;
  }

  public boolean equals(Object thatObject) {
    // TODO
	  if(thatObject instanceof VideoObj) {
	    	
	    	VideoObj that = (VideoObj) thatObject;
	    	
	    	return(this._title.contentEquals(that.title()) && this._year == that.year()) && this._director.contentEquals(that.director());

	    	
	    	
	    	
	    }
	    return false;
	  
}

  public int hashCode() {
    // TODO
	  int hcode = 17;
	    hcode = 37 * hcode + _title.hashCode();
	    hcode = 37 * hcode + _year;
	    hcode = 37 * hcode + _director.hashCode();
	    
	    return hcode;
	  }

  public int compareTo(Video that) {
    // TODO
		VideoObj tmp = (VideoObj) that;

		  
		  if(_title.compareTo(tmp._title) != 0) {
			  return _title.compareTo(tmp._title);
			  
		  }
		  
		  if(_year - tmp._year != 0) {
			  return _year - tmp._year;
		  }
		  
		  if(_director.compareTo(tmp._director) != 0) {
			  return _director.compareTo(tmp._director);
		  }
		  
		  return 0;
	  }

  public String toString() {
    // TODO
	  return _title + " (" + Integer.toString(_year) + ") : " + _director;
  }
}
