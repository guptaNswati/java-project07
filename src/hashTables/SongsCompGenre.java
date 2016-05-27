package hashTables;

import java.util.ArrayList;

import cs1c.SongEntry;
/**
 * Wrapper class for a SongEntry object to compare objects based on the songs String genre field. 
 * Also to determine the number of songs in each genre.
 * @author swati
 *
 */
public class SongsCompGenre implements Comparable<String>
{
	// genre name
	private String genre;
	
	//  for all the songs in that genre
	private ArrayList<SongEntry> data;
	
	// to track no. of songs
	private int count;
	   
	   public SongsCompGenre( SongEntry e )
	   { 
		   genre = e.getGenre();		   
		   data = new ArrayList<SongEntry>();
		   count = 0;
	   }
	   
	   public String toString() { return data.toString(); }  
	   
	   // we'll use compareTo() to implement our find on key
	   public int compareTo(String key)
	   {
	      return genre.compareTo(key);
	   }

	   // let equals() preserve the equals() provided by embedded data
	   public boolean equals( SongsCompGenre rhs ) 
	   {
	      return genre.equals(rhs.genre);
	   }

	   public int hashCode()
	   { 
	      return genre.hashCode();
	   }  
	   
	// adds a song to the list of songs
		public void addSong(SongEntry e)
		{				
				data.add(e);
				count++;
		}

		public String getName() {
			return genre;
		}

		public ArrayList<SongEntry> getData() {
			return data;
		}
}

