package hashTables;

public class HashEntry<E> {
	// HashEntry class for use by FHhashQP -----------------------
	
	   public E data;
	   public int state;
	   
	   public HashEntry( E x, int st )
	   {
	      data = x;
	      state = st;
	   }

	   public HashEntry()
	   {
	      this(null, FHhashQP.EMPTY);
	   }
}


