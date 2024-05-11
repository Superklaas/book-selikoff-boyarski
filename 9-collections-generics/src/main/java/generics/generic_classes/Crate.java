package generics.generic_classes;

class Crate<T> {

    T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

}
