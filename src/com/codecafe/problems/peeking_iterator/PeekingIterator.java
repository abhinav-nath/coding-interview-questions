package com.codecafe.problems.peeking_iterator;

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {

  //a property called iter to store the incoming iterator obj
  private final Iterator<Integer> iter;
  //a property called next pointing to the next of the iterator obj at a given time
  private Integer next;
  //a property to keep track of whether there are further elements in the iterator obj
  private boolean noSuchElement;

  public PeekingIterator(Iterator<Integer> iterator) {
    // initialize incoming iterator with iter member
    iter = iterator;
    //invoke the advanceIterator method to update the next member to point to the next element of the iterator obj
    advanceIterator();

  }

  // T O(1)
  // Returns the next element in the iteration without advancing the iterator.
  public Integer peek() {
    return next;
  }

  // T O(1)
  // hasNext() and next() should behave the same as in the Iterator interface.
  // Override them if needed.
  @Override
  public Integer next() {
    Integer res = next; //retrieve the cached result and return
    advanceIterator(); //remember to update the next to point to next of iterator by invoking advanceIterator
    return res;
  }

  //T O(1)
  @Override
  public boolean hasNext() {
    return !noSuchElement;
  }

  //T O(1)
  private void advanceIterator() {
    //condition to check if there is a next element or not in the iter obj
    if (iter.hasNext()) {
      //if present then update next to point to it
      next = iter.next(); //caching the next of iterator to our next property
    } else {
      noSuchElement = true;
    }
  }

}