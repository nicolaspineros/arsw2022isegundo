import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public final class LinkedListPropia<E> implements List<E>, Stream<E> {

    private final Stream<E> streamV;
    public LinkedListPropia(){
        streamV = Stream.empty();
        System.out.println(streamV);
    }
    static class Node<E> {
        E valor;
        Node<E> next;

        Node(E valor) {
            this.valor = valor;
        }

        Node getNext() { return next;}
        void setNext(Node next) { this.next = next;}
        E getValor() {return valor;}
    }

    Node<E> head = new Node<E>(null);
    Node<E> tail = head;
    int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean add(E e) {
        tail = tail.next = new Node<E>(e);
        size++;
        return true;
    }

    @Override
    public E get(int index) {
        if(index < 0 || size <= index)
            throw new IndexOutOfBoundsException();

        Node<E> node = head.next;
        while(index > 0) {
            node = node.next;
            index--;
        }

        return node.valor;
    }

    @Override
    public Stream<E> filter(Predicate<? super E> predicate) {
        return streamV.filter(predicate);
    }

    @Override
    public <R> Stream<R> map(Function<? super E, ? extends R> mapper) {
        return streamV.map(mapper);
    }

    @Override
    public DoubleStream mapToDouble(ToDoubleFunction<? super E> mapper) {
        return streamV.mapToDouble(mapper);
    }

    @Override
    public E reduce(E identity, BinaryOperator<E> accumulator) {
        return streamV.reduce(identity,accumulator);
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        List.super.forEach(action);
    }

    @Override
    public boolean isParallel() {
        return false;
    }

    @Override
    public Stream<E> sequential() {
        return null;
    }

    @Override
    public Stream<E> parallel() {
        return null;
    }

    @Override
    public Stream<E> unordered() {
        return null;
    }

    @Override
    public Stream<E> onClose(Runnable closeHandler) {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public IntStream mapToInt(ToIntFunction<? super E> mapper) {
        return null;
    }

    @Override
    public LongStream mapToLong(ToLongFunction<? super E> mapper) {
        return null;
    }

    @Override
    public <R> Stream<R> flatMap(Function<? super E, ? extends Stream<? extends R>> mapper) {
        return null;
    }

    @Override
    public IntStream flatMapToInt(Function<? super E, ? extends IntStream> mapper) {
        return null;
    }

    @Override
    public LongStream flatMapToLong(Function<? super E, ? extends LongStream> mapper) {
        return null;
    }

    @Override
    public DoubleStream flatMapToDouble(Function<? super E, ? extends DoubleStream> mapper) {
        return null;
    }

    @Override
    public Stream<E> distinct() {
        return null;
    }

    @Override
    public Stream<E> sorted() {
        return null;
    }

    @Override
    public Stream<E> sorted(Comparator<? super E> comparator) {
        return null;
    }

    @Override
    public Stream<E> peek(Consumer<? super E> action) {
        return null;
    }

    @Override
    public Stream<E> limit(long maxSize) {
        return null;
    }

    @Override
    public Stream<E> skip(long n) {
        return null;
    }

    @Override
    public void forEachOrdered(Consumer<? super E> action) {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <A> A[] toArray(IntFunction<A[]> generator) {
        return null;
    }

    @Override
    public Optional<E> reduce(BinaryOperator<E> accumulator) {
        return streamV.reduce(accumulator);
    }

    @Override
    public <U> U reduce(U identity, BiFunction<U, ? super E, U> accumulator, BinaryOperator<U> combiner) {
        return streamV.reduce(identity,accumulator,combiner);
    }

    @Override
    public <R> R collect(Supplier<R> supplier, BiConsumer<R, ? super E> accumulator, BiConsumer<R, R> combiner) {
        return null;
    }

    @Override
    public <R, A> R collect(Collector<? super E, A, R> collector) {
        return null;
    }

    @Override
    public Optional<E> min(Comparator<? super E> comparator) {
        return Optional.empty();
    }

    @Override
    public Optional<E> max(Comparator<? super E> comparator) {
        return Optional.empty();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean anyMatch(Predicate<? super E> predicate) {
        return false;
    }

    @Override
    public boolean allMatch(Predicate<? super E> predicate) {
        return false;
    }

    @Override
    public boolean noneMatch(Predicate<? super E> predicate) {
        return false;
    }

    @Override
    public Optional<E> findFirst() {
        return Optional.empty();
    }

    @Override
    public Optional<E> findAny() {
        return Optional.empty();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        List.super.replaceAll(operator);
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public E remove(int index) {
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
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public Spliterator<E> spliterator() {
        return List.super.spliterator();
    }
}
