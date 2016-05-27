project folder:
guptaNswati-prject04

Brief description of submitted files:

cs1c/MillionSongDataSubset.java
    - One object of class MillionSongDataSubset parses a JSON data set and stores each entry in an array.

cs1c/SongEntry.java
    - One object of class SongEntry stores a simplified version of the genre data set from the Million Song Dataset.

cs1c/TimeConverter.java
    - Converts duration into a string representation.
    
hashTables/FHhashQP.java
    class that inserts, removes and hash objects in hashtable based on objects hashkey.

hashTables/FHhashQPwFind.java
    - extends FHhashQP.java to find objects based on object key and not object. 

hashTables/HashEntry.java
    - used by FHhashQP.java to check table's state at a particular index

hashTables/SongsCompInt.java
    - A wrapper class for a SongEntry object to compare objects based on the songs int id field.

hashTables/SongsCompGenre.java
    - A wrapper class for a SongEntry object to compare objects based on the songs String genre field. 
    - Also to determine the number of songs in each genre.

hashTables/TableGenerator.java
    - creates and populate two hash tables of type FHhashQPwFind class, one for each wrapper class

hashTables/MyTunes.java  
    - Tests the functionality of FHhashQPwFind.java.
    - Specifically checks for implementation of find() function to return an object associated with a given key input.
    - Uses MillionSongDataSubset to read all songs from data file.


lib/json-simple-1.1.1.jar
    - Java toolkit for JSON (JavaScript Object Notation) used to encode or decode JSON text.
    - https://code.google.com/p/json-simple/downloads/list
       
resources/findGenres.txt
   - contains list of genres 

resources/findIDs.txt
   - contains song ids

resources/genres_test_case.txt   
   - contains genres with incorrect spelling to test implementation
   
resources/ids_test_case.txt   
   - contains a big numbers for testing thoroughly
 
resources/music_genre_subset.json
   - contains songs in json format  

resources/RUN.txt
   - console output of MyTunes.java

README.txt
   - description of submitted files
    
    