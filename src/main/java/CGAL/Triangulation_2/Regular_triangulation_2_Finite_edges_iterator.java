/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package CGAL.Triangulation_2;

  
  import java.lang.Iterable;
  import java.lang.UnsupportedOperationException;
  import java.util.Iterator;
  
public class Regular_triangulation_2_Finite_edges_iterator implements   Iterable<Regular_triangulation_2_Edge>, Iterator<Regular_triangulation_2_Edge>  {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  public Regular_triangulation_2_Finite_edges_iterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(Regular_triangulation_2_Finite_edges_iterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CGAL_Triangulation_2JNI.delete_Regular_triangulation_2_Finite_edges_iterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

    public void remove() {
      throw new UnsupportedOperationException();
    }
    
    public Iterator<Regular_triangulation_2_Edge> iterator() {
      return this;
    }
    
    //we store an object of type Regular_triangulation_2_Edge to avoid
    //creation and allocation of a java object at each iteration.
    private Regular_triangulation_2_Edge objectInstance = new Regular_triangulation_2_Edge();
    public Regular_triangulation_2_Edge next() {
      next(objectInstance);
      return objectInstance;
    }
  
  public Regular_triangulation_2_Finite_edges_iterator() {
    this(CGAL_Triangulation_2JNI.new_Regular_triangulation_2_Finite_edges_iterator(), true);
  }

  public Regular_triangulation_2_Edge slow_next() {
    return new Regular_triangulation_2_Edge(CGAL_Triangulation_2JNI.Regular_triangulation_2_Finite_edges_iterator_slow_next(swigCPtr, this), true);
  }

  public void next(Regular_triangulation_2_Edge r) {
    CGAL_Triangulation_2JNI.Regular_triangulation_2_Finite_edges_iterator_next(swigCPtr, this, Regular_triangulation_2_Edge.getCPtr(r), r);
  }

  public Regular_triangulation_2_Finite_edges_iterator clone() {
    return new Regular_triangulation_2_Finite_edges_iterator(CGAL_Triangulation_2JNI.Regular_triangulation_2_Finite_edges_iterator_clone__SWIG_0(swigCPtr, this), true);
  }

  public void clone(Regular_triangulation_2_Finite_edges_iterator other) {
    CGAL_Triangulation_2JNI.Regular_triangulation_2_Finite_edges_iterator_clone__SWIG_1(swigCPtr, this, Regular_triangulation_2_Finite_edges_iterator.getCPtr(other), other);
  }

  public boolean hasNext() {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Finite_edges_iterator_hasNext(swigCPtr, this);
  }

  public boolean equals(Regular_triangulation_2_Finite_edges_iterator p) {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Finite_edges_iterator_equals(swigCPtr, this, Regular_triangulation_2_Finite_edges_iterator.getCPtr(p), p);
  }

  public boolean not_equals(Regular_triangulation_2_Finite_edges_iterator p) {
    return CGAL_Triangulation_2JNI.Regular_triangulation_2_Finite_edges_iterator_not_equals(swigCPtr, this, Regular_triangulation_2_Finite_edges_iterator.getCPtr(p), p);
  }

}