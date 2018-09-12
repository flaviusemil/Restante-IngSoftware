package ro.emanuel.simulare.universitate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ro.emanuel.simulare.universitate.utils.Profesor;

@AllArgsConstructor
@Getter
@Setter
public class Request {
    private Profesor profesor;
    private String mesaj;
}
