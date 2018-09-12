package ro.emanuel.simulare.universitate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private String name;
    private String specializare;

    @Override
    public String toString() {
        return name + ": " + specializare;
    }
}
