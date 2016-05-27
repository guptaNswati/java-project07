package hashTables;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import cs1c.SongEntry;

/**
 * This class creates and populate two hash tables of type FHhashQPwFind class, one for each wrapper class
 * @author swati
 */
public class TableGenerator {
	
	//tableOfSongIDs a hash table based on SongCompInt	
	private FHhashQPwFind<Integer, SongCompInt>  tableOfSongIDs;
	
	//tableOfSongGenres a hash table based on SongsCompGenre.	
	private FHhashQPwFind<String, SongsCompGenre> tableOfGenres; 
	
	// ArrayList of genre names.
	private ArrayList<String> genreNames;

	 TableGenerator()
	 {
		 tableOfSongIDs = new FHhashQPwFind< Integer, SongCompInt>();	
		 tableOfGenres = new FHhashQPwFind<String, SongsCompGenre>();	
		 genreNames = new ArrayList<String>();
	 }

	//populates the tableOfIDs hash table
	public FHhashQPwFind<Integer, SongCompInt> populateIDtable(SongEntry[] allSongs) {
		
		for(int i = 0; i < allSongs.length; i++)
		{
			tableOfSongIDs.insert(new SongCompInt(allSongs[i]));	
		}		
		return tableOfSongIDs;
	}

	// populates the tableOfGenres hash table and ArrayList of genre names.
	public FHhashQPwFind<String, SongsCompGenre> populateGenreTable(SongEntry[] allSongs) {
		
		for(int i = 0; i < allSongs.length; i++)
		{
			try
			{
				SongsCompGenre compResult  = tableOfGenres.find(allSongs[i].getGenre());
				
				if (compResult != null)
				{
					compResult.addSong(allSongs[i]);					
				}
			}
			catch (NoSuchElementException e)
			{ 
				SongsCompGenre temp = new SongsCompGenre(allSongs[i]);
				temp.addSong(allSongs[i]);
				tableOfGenres.insert(temp);
				genreNames.add(temp.getName());
			} 
		}
		return tableOfGenres;	
	}

	public ArrayList<String> getGenreNames() {
		return genreNames;
	}

}
