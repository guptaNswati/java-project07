package hashTables;

import java.util.NoSuchElementException;

public class FHhashQPwFind<KeyType, E extends Comparable<KeyType> > extends FHhashQP<E> 
{
	/**
	 *  returns the found object, or throws a java.util.NoSuchElementException
	 * @param key
	 * @return
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
	 * @return
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
		 * @return
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