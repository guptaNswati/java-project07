package hashTables;

import cs1c.SongEntry;

/**
 * Wrapper class for a SongEntry object to compare objects based on the songs int id field.
 * @author swati
 *
 */
public class SongCompInt implements Comparable<Integer>
{
	   private SongEntry data;
	   public SongCompInt(SongEntry e){ data = e; }
	   public String toString() { return data.toString(); }  
	   
	   // for finding object based on its comparison key 
	   public int compareTo(Integer key)
	   {
	      return data.getID() - key;	      
	   }
	   
	   // let equals() preserve the equals() provided by embedded data
	   public boolean equals( SongCompInt rhs ) 
	   {
		   
	      return data.equals(rhs.data);
	   }

	   public int hashCode()
	   { 
	      return data.getID();
	   }  
	}

