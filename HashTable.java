package hash;

// Name: Abhiram Ruthala
// Computing ID: kas4kj@virginia.edu
// Homework Name: HW11-HashTables
// Resources used: Claude 4.5 Sonnet

/**
 * Hash Table implementation.
 *
 * @param <K>
 * @param <V>
 */
public class HashTable<K,V> implements SimpleMap<K,V> {

    private static final int INITIAL_CAP = 5;  // a default initial capacity (set low for initial debugging)
    private int currentCapacity = INITIAL_CAP;

    /*
     * Here are some hints about how to declare your hash table.
     * If you're using an ArrayList, it might look like this:
     * 		private ArrayList<HashNode<K, V>> table;
     * Note that you cannot declare an array of generics (i.e., an array of HashNodes) like this:
     *          private LinkedList<HashNode<K,V>>[] table;
     * but see here https://programming.guide/java/generic-array-creation.html for workarounds.
     */

    /* YOU WILL LIKELY WANT MORE PRIVATE VARIABLES HERE */
    private int initialCapacity;
    private HashNode<K,V>[] table;


    public HashTable() {  // default constructor sets capacity to default value
        this(INITIAL_CAP);
    }

    public HashTable(int capacity) {  // constructor sets capacity to given value
        /* TODO: IMPLEMENT THIS METHOD */
        initialCapacity = capacity;
        this.table = (HashNode<K,V>[]) new HashNode<?,?>[initialCapacity];

        /*
         * Here are some hints about how to allocate memory for your hash table.
         * If you're using an array, it might look like this:
         * 		this.table = (HashNode<K,V>[]) new HashNode<?,?>[initialCapacity];
         * If you're using an ArrayList, it might look like this:
         * 		this.table = new ArrayList<>(capacity); // sets list's initial capacity
         */
    }

    public int getSize() { return currentCapacity; }

    // insert() adds a new key/value pair if the key is not found, otherwise it replaces
    //    the existing key's value
    @Override
    public void insert(K key, V value) {
        /* TODO: IMPLEMENT THIS METHOD */
        if(key==null || value==null) {
             new HashNode<K,V>(key,value);
        }
        if(key.hashCode() != 0) {
            int index = key.hashCode() % table.length;
            if (table[index] == null) {
                HashNode<K, V> temp = table[index];
            } else {
                V sense = table[index].getValue();
                sense = value;
            }
        }

    }

    @Override
    public V retrieve(K key) {
        /* TODO: IMPLEMENT THIS METHOD */
        if(key==null) {
            return null;
        } else {
            int index = key.hashCode() % table.length;
            if (table[index] == null) {
                return null;
            } else {
                return table[index].getValue();
            }
        }
       //key.getValue and logicalize from there??

        //I'm just super confused on how to traverse the items in the hash.HashTable and then logicalize for that...
    }

    @Override
    public boolean contains(K key) {
        /* TODO: IMPLEMENT THIS METHOD */
        if(key==null) {
            return false;
        }else {
            int index = key.hashCode() % table.length;
            if (table[index] == null) {
                return false;
            } else {
                return true;
            }
        }



        //traverse the table.


    }

    @Override
    public void remove(K key) {
        /* TODO: IMPLEMENT THIS METHOD */
        if(key==null) {
            return;
        }else {
            int index = key.hashCode() % table.length;
            if (table[index] == null) {
                return;
            } else {
                table[index] = null;
            }
        }
    }


    /*
     * OPTIONAL HELPER METHODS: The next two methods will let you print out your
     * entire hash table, or let you make sure all keys that hash to a single
     * bucket's index get stored as they should in your table. You'll need to
     * implement the second method; it depends on how you store entries and
     * handle collisions. This is NOT required, but you may find it helpful when
     * debugging and testing your code.
     */

    public void printHashTable() {
        for (int idx=0; idx < this.currentCapacity; ++idx) {
            System.out.print(idx + ": ");
            printEntriesByIndex(idx);
        }
    }

    private void printEntriesByIndex(int idx) {
        /*
         * To implement this method to help print out one bucket of your hash table, you need to determine:
         * a) If there are no key/value pairs in the bucket idx, print "no entries"
         * b) If there are key/value pairs at that bucket, use a loop to print each one.
         *    Best to use System.out.print() and not println() so they're all on one line.
         * c) At the end of that loop, do System.out.println() to print a new line.
         */
        System.out.println("Not yet implemented...");
    }

}

