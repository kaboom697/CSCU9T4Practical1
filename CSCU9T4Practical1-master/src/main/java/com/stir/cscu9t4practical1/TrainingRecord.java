// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;




import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   // look up the entry of a given day and month
   public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   // look up all the entries of a given date
   public String findAllByDate (int d, int y, int m) {
	   ListIterator<Entry> iter = tr.listIterator();
       StringBuffer entries = new StringBuffer();	// using StringBuffer to append entries.
       while (iter.hasNext()) {
           Entry current = iter.next();
           if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
        	   entries.append("\n");	// adding new line to separate entries
        	   entries.append(current.getEntry());	// adding all entries to the StringBuffer.
             }
       String allEntries = entries.toString();
	   return allEntries;	// returns all entries as a string.
   }
   
   // Count the number of entries
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearAllEntries(){
       tr.clear();
   }
   
} // TrainingRecord