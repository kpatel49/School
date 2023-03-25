package Frozen;

import java.util.List;

public interface IRecordKeeperable {
    public abstract List<String> profile(); //profile specification
    public abstract void update(List<String> savedValues); //update the list
    public abstract void add(int values);

}
