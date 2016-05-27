package hashTables;

import java.util.NoSuchElementException;

/**
 * extends class FHhashQP<E> and finds objects based on key
 * @author swati
 * @param <KeyType> objects comparison key
 * @param <E> generic object
 */

public class FHhashQPwFind<KeyType, E extends Comparable<KeyType> > extends FHhashQP<E> 
{
	/**
	 *  
	 * @param key Object key to find object in table
	 * @return found object, or throws a java.util.NoSuchElementException
	 */
	public E find( KeyType key )
	{				
		if(mArray[findPosKey(key)].state == ACTIVE)
		{	
			return mArray[findPosKey(key)].data;	
		}
		else
			throw new NoSuchElementException();	
	}
	
	/**
	 * called by find() which finds the position based on the key, not on the object
	 * @param key
	 * @return index of object having same key as object
	 */
	 public int findPosKey( KeyType key)
	 {
		 int kthOddNum = 1;
	      int index = myHashKey(key);
	      
	      while ( mArray[index].state != EMPTY &&
	          mArray[index].data.compareTo(key) != 0)
	      {
	         index += kthOddNum; // k squared = (k-1) squared + kth odd #
	         kthOddNum += 2;     // compute next odd #
	         if ( index >= mTableSize )
	            index -= mTableSize;
	      }

	      return index;		 
	 }
	 
	    /**
		 * called by findPosKey() which gets the hash value based on the key, not on the object
		 * @param key
		 * @return hashcode of key
		 */
		public int myHashKey( KeyType key)
		{
			int hashVal;

		      hashVal = key.hashCode() % mTableSize;
		      if(hashVal < 0)
		         hashVal += mTableSize;

		      return hashVal;			
		}	
}