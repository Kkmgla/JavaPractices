import java.io.Serializable;

class Animal {}
interface Comparable<T> {
    int compareTo(T o);
}

public class MyClass<T, V extends Animal & Serializable, K> {
    private T dataType;
    private V dataValue;
    private K dataKey;
    public MyClass(T dataType, V dataValue, K dataKey){
        this.dataType = dataType;
        this.dataValue = dataValue;
        this.dataKey = dataKey;
    }
    public MyClass(){};
    public T getDataType() {
        return dataType;
    }
    public V getDataValue() {
        return dataValue;
    }
    public K getDataKey() {
        return dataKey;
    }
    public void setDataType(T dataType) {
        this.dataType = dataType;
    }
    public void setDataValue(V dataValue) {
        this.dataValue = dataValue;
    }
    public void setDataKey(K dataKey) {
        this.dataKey = dataKey;
    }

    @Override
    public String toString() {
        return dataType + " (" + dataType.getClass() + ")\n" + dataValue + " (" + dataValue.getClass() + ")\n" + dataKey + " (" + dataKey.getClass() + ")";
    }
}
