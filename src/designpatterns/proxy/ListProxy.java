package designpatterns.proxy;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListProxy implements List {

    private List<CreatedOrder> realList;
    private List<Long> ids;
    private Class entityClass;

    public ListProxy(Class entityClass,List ids){
       this.entityClass=entityClass;
       this.ids=ids;
    }

    @Override
    public int size() {
        return ids.size();
    }

    @Override
    public boolean isEmpty() {
        return ids.isEmpty();
    }

    void initialize(){
        realList=ids.stream().map(id->Database.getInstance().findOrder(id)).toList();
    }

    boolean isInitialized(){
        return realList!=null;
    }

    @Override
    public boolean contains(Object o) {
      if(!isInitialized()){
            initialize();
      }
      return realList.contains(o);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
